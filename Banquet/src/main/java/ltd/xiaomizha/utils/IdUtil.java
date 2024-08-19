package ltd.xiaomizha.utils;

import java.util.Date;

public class IdUtil {
    public static String uuid() {
        return String.format("%s-%s", DateUtil.format(new Date(), "yyyyMMddHHmm"), cn.hutool.core.util.IdUtil.randomUUID());
    }

    public static String simpleUUID() {
        return String.format("%s-%s", DateUtil.format(new Date(), "yyyyMMddHHmm"), cn.hutool.core.util.IdUtil.simpleUUID());
    }
}
