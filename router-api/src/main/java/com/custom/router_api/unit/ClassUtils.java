package com.custom.router_api.unit;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;

import com.custom.router_api.thread.DefaultPoolExecutor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;

import androidx.annotation.RequiresApi;
import dalvik.system.DexFile;

public class ClassUtils {

    /**
     * 生成路由表
     *
     * @author Ysw created at 2020/3/3 18:55
     */
    public static Set<String> getFileNameByPackageName(Application context, final String packageName) throws Exception {
        final Set<String> classNames = new HashSet<>();
        List<String> paths = getSourcePaths(context);
        /**
         * CountDownLatch 可以起到阻塞主线程的作用
         * 扫描所有的包需要时间
         * 使用同步计数器判断均处理完成
         * @author Ysw created at 2020/3/3 19:01
         */
        final CountDownLatch parserCtl = new CountDownLatch(paths.size());
        ThreadPoolExecutor threadPoolExecutor = DefaultPoolExecutor.newDefaultPoolExecutor(paths.size());
        for (final String path : paths) {
            threadPoolExecutor.execute(() -> {
                DexFile dexfile = null;
                try {
                    //加载 apk中的dex 并遍历 获得所有包名为 {packageName} 的类
                    dexfile = new DexFile(path);
                    Enumeration<String> dexEntries = dexfile.entries();
                    while (dexEntries.hasMoreElements()) {
                        String className = dexEntries.nextElement();
                        if (className.startsWith(packageName)) {
                            classNames.add(className);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (null != dexfile) {
                        try {
                            dexfile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    //释放1个
                    parserCtl.countDown();
                }
            });
        }
        //等待执行完成
        parserCtl.await();
        return classNames;
    }


    /**
     * 获得程序所有的apk(instant run会产生很多split apk)
     *
     * @author Ysw created at 2020/3/3 18:55
     */
    private static List<String> getSourcePaths(Context context) throws Exception {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        List<String> sourcePaths = new ArrayList<>();
        sourcePaths.add(applicationInfo.sourceDir);
        // TODO: Create by Ysw 2020/3/3 需要进行版本处理，低于 SDK 21 会出问题
        if (null != applicationInfo.splitSourceDirs) {
            sourcePaths.addAll(Arrays.asList(applicationInfo.splitSourceDirs));
        }
        return sourcePaths;
    }
}
