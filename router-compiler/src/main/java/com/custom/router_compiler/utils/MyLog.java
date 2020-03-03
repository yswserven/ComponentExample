package com.custom.router_compiler.utils;

import javax.annotation.processing.Messager;
import javax.tools.Diagnostic;

/**
 * Created by: Ysw on 2020/3/3.
 */
public class MyLog {
    private Messager messager;

    private MyLog(Messager messager) {
        this.messager = messager;
    }

    public static MyLog newLog(Messager messager) {
        return new MyLog(messager);
    }

    public void i(String msg) {
        messager.printMessage(Diagnostic.Kind.NOTE, msg);
    }

}
