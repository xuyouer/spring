package ltd.xiaomizha.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

@Controller
@RequestMapping("/QRCode/")
@ResponseBody
public class QRCodeController {

    private static final String CHARSET_UTF8 = "UTF-8";
    private static final String IMAGE_FORMAT_PNG = "PNG";
    private static final String DEFAULT_DATA = "Hello";
    private static final int DEFAULT_SIZE = 200;

    @GetMapping(value = "generate", produces = MediaType.IMAGE_PNG_VALUE)
    public void generateQRCode(HttpServletResponse response,
                               @RequestParam(required = false) String data,
                               @RequestParam(required = false) Integer width,
                               @RequestParam(required = false) Integer height,
                               @RequestParam(required = false) Boolean download) throws IOException, WriterException {
        // 设置响应头
        setResponseHeader(response, download);

        // 设置默认值
        data = (data != null) ? data : DEFAULT_DATA;
        width = (width != null) ? width : DEFAULT_SIZE;
        height = (height != null) ? height : DEFAULT_SIZE;

        // 设置二维码参数
        Map<EncodeHintType, Object> hints = new EnumMap<>(EncodeHintType.class);
        hints.put(EncodeHintType.CHARACTER_SET, CHARSET_UTF8);
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.MARGIN, 1);

        // 创建二维码写入器
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        // 生成二维码矩阵
        BitMatrix bitMatrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, width, height, hints);

        // 将二维码矩阵转换为BufferedImage
        BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);

        // 输出图像到响应流
        ImageIO.write(image, IMAGE_FORMAT_PNG, response.getOutputStream());
    }

    private void setResponseHeader(HttpServletResponse response, Boolean download) throws IOException {
        response.setCharacterEncoding(CHARSET_UTF8);
        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        if (download != null && download) {
            response.setHeader("Content-Disposition", "attachment; filename=QRCode.png");
        } else {
            response.setHeader("Content-Disposition", "inline; filename=QRCode.png");
        }
    }
}
