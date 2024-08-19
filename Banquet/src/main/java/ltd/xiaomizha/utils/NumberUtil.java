package ltd.xiaomizha.utils;

import java.text.DecimalFormat;

public class NumberUtil {

    public static String formatNumber(int number) {
        double value;
        if (number >= 100000000) {
            value = number / 100000000.0;
            return formatValue(value, "#.00亿");
        } else if (number >= 10000) {
            value = number / 10000.0;
            return formatValue(value, "#.00万");
        } else {
            return String.valueOf(number);
        }
    }

    private static String formatValue(double value, String pattern) {
        // 创建并配置DecimalFormat实例
        DecimalFormat formatter = new DecimalFormat(pattern);
        // 禁用分隔符
        formatter.setGroupingUsed(false);
        return formatter.format(value);
    }
}
