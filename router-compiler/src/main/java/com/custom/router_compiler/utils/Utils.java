package com.custom.router_compiler.utils;

import java.util.Collection;
import java.util.Map;

/**
 * Created by: Ysw on 2020/3/3.
 */
public class Utils {
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isEmpty(Collection<?> coll) {
        return coll == null || coll.isEmpty();
    }

    public static boolean isEmpty(final Map<?, ?> map) {
        return map == null || map.isEmpty();
    }
}
