package ltd.xiaomizha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/captcha/")
public class CaptchaController {
    @GetMapping("generate")
    public void generateCaptcha(HttpServletResponse response, HttpServletRequest request,
                                @RequestParam(value = "width", defaultValue = "140") Integer width,
                                @RequestParam(value = "height", defaultValue = "40") Integer height,
                                @RequestParam(value = "codeCount", defaultValue = "6") Integer codeCount,
                                @RequestParam(value = "lineCount", defaultValue = "10") Integer lineCount) throws IOException {
        // 设置请求对象和响应对象的字符编码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("image/png");
        // 设置不缓存
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);

        // 创建BufferedImage对象
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 创建Graphics对象
        Graphics graphics = image.getGraphics();
        // 设置背景色
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);
        // 设置字体样式
        graphics.setFont(new Font("华文细黑", Font.BOLD, 24));

        // 随机干扰线
        addRandomLines(image, lineCount);

        // 生成随机动态验证码字符串
        String captcha = generateRandomString(codeCount);
        // 设置绘制验证码文本的字体颜色和位置
        for (int i = 0; i < captcha.length(); i++) {
            char c = captcha.charAt(i);
            graphics.setColor(generateRandomColor());
            // 因字体大小, 随机的Y坐标最大值不能设置为整满的验证码图片高度
            graphics.drawString(String.valueOf(c), i * 20 + 10, generateRandomInt(height - 5, height / 2));
        }

        // 将验证码存储到session中
        HttpSession session = request.getSession();
        session.setAttribute("captcha", captcha.toUpperCase());

        // 释放资源
        graphics.dispose();
        // 将验证码图片写入响应输出流
        ImageIO.write(image, "PNG", response.getOutputStream());
    }

    @PostMapping("verify")
    @ResponseBody
    public Map<String, Object> verifyCaptcha(@RequestParam("captcha") String captcha, HttpServletRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        // 从session中获取存储的验证码
        HttpSession session = request.getSession(false);
        if (session != null) {
            String serverCaptcha = (String) session.getAttribute("captcha");
            if (serverCaptcha != null && serverCaptcha.equalsIgnoreCase(captcha)) {
                resultMap.put("success", true);
                resultMap.put("message", "验证码验证通过");
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "验证码错误, 请重试");
            }
            session.removeAttribute("captcha");
        } else {
            resultMap.put("success", false);
            resultMap.put("message", "会话已失效, 请重新获取验证码");
        }
        return resultMap;
    }

    // 随机字符串
    private String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    // 随机整数
    private int generateRandomInt(int max, int min) {
        return new Random().nextInt(max - min + 1) + min;
    }

    // 随机颜色
    private Color generateRandomColor() {
        Random random = new Random();
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    // 随机干扰线
    private void addRandomLines(BufferedImage image, int lineCount) {
        Random rand = new Random();

        for (int i = 0; i < lineCount; i++) {
            // 随机颜色
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            // 随机起点和终点坐标
            int startX = rand.nextInt(image.getWidth());
            int startY = rand.nextInt(image.getHeight());
            int endX = rand.nextInt(image.getWidth());
            int endY = rand.nextInt(image.getHeight());

            Graphics2D g2d = image.createGraphics();
            g2d.setColor(randomColor);

            // 绘制干扰线
            g2d.drawLine(startX, startY, endX, endY);

            // 清理图形上下文资源
            g2d.dispose();
        }
    }
}
