package com.custom.router_api.callback;

import com.custom.router_api.core.Postcard;

/**
 * Created by: Ysw on 2020/3/3.
 */
public interface NavigationCallback {

    /* 路由准确找到 @author Ysw created 2020/3/4 */
    void onFound(Postcard postcard);

    /* 路由没有找到 @author Ysw created 2020/3/4 */
    void onLost(Postcard postcard);

    /* 跳转成功 @author Ysw created 2020/3/4 */
    void onArrival(Postcard postcard);
}
