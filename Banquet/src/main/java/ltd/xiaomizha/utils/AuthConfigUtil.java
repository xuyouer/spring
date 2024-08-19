package ltd.xiaomizha.utils;

import ltd.xiaomizha.oauth.AuthConfigs;
import org.springframework.core.io.ClassPathResource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class AuthConfigUtil {

    public static AuthConfigs readAuthConfigsFromXml(String classPath) {
        try {
            // 创建一个ClassPathResource对象, 用于访问类路径中的资源
            ClassPathResource resource = new ClassPathResource(classPath);
            // 通过ClassPathResource获取输入流
            InputStream is = resource.getInputStream();
            // 创建JAXBContext实例, 它提供了一个上下文, 用于将XML数据与Java类进行绑定
            JAXBContext jaxbContext = JAXBContext.newInstance(AuthConfigs.class);
            // 创建Unmarshaller实例, 用于解码XML文档到Java内容树
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            // 使用Unmarshaller将XML数据转换为Java对象
            return (AuthConfigs) jaxbUnmarshaller.unmarshal(is);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
