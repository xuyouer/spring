package ltd.xiaomizha.utils;

import org.mindrot.jbcrypt.BCrypt;

public class HashUtil {
    /**
     * 生成一个随机的盐，并使用 BCrypt 进行哈希
     *
     * @param password
     * @return
     */
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    /**
     * 验证提供的密码与哈希后的密码是否匹配
     *
     * @param password
     * @param hashedPassword
     * @return
     */
    public static boolean verifyPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
