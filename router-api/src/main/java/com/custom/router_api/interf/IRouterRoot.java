package com.custom.router_api.interf;

import java.util.Map;

/**
 * Created by: Ysw on 2020/3/3.
 */
public interface IRouterRoot {
    void loadInto(Map<String, Class<? extends IRouterGroup>> routes);
}
