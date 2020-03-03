package com.custom.router_api.callback;

import com.custom.router_api.core.Postcard;

/**
 * Created by: Ysw on 2020/3/3.
 */
public interface NavigationCallback {
    void onFound(Postcard postcard);

    void onLost(Postcard postcard);

    void onArrival(Postcard postcard);
}
