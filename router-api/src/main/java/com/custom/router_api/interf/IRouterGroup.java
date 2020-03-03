package com.custom.router_api.interf;

import com.custom.router_annotation.model.RouteMeta;

import java.util.Map;

/**
 * Created by: Ysw on 2020/3/3.
 */
public interface IRouterGroup {
    void loadInto(Map<String, RouteMeta> atlas);
}
