package com.custom.router_api.core;

import com.custom.router_annotation.model.RouteMeta;
import com.custom.router_api.interf.IRouterGroup;
import com.custom.router_api.service.IService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: Ysw on 2020/3/3.
 */
public class Warehouse {
    // root 映射表 保存分组信息
    static Map<String, Class<? extends IRouterGroup>> groupsIndex = new HashMap<>();

    // group 映射表 保存组中的所有数据
    static Map<String, RouteMeta> routes = new HashMap<>();

    // group 映射表 保存组中的所有数据
    static Map<Class, IService> services = new HashMap<>();
}
