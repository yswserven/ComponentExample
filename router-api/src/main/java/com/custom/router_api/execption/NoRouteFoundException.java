package com.custom.router_api.execption;

/**
 * Created by: Ysw on 2020/3/3.
 */
public class NoRouteFoundException extends RuntimeException {
    public NoRouteFoundException(String detailMessage) {
        super(detailMessage);
    }
}
