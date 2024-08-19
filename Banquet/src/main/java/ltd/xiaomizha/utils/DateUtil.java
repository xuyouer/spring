package ltd.xiaomizha.utils;

import java.util.Date;

public class DateUtil {
    public static String format(Date date, String format) {
        return cn.hutool.core.date.DateUtil.format(date, format);
    }
}
