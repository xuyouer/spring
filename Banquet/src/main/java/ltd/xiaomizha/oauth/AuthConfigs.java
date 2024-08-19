package ltd.xiaomizha.oauth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "authConfigs")
public class AuthConfigs {

    @XmlElement(name = "config")
    private List<AuthConfig> configs;

    @Override
    public String toString() {
        return "AuthConfigs{" +
                "configs=" + configs +
                '}';
    }

    public List<AuthConfig> getConfigs() {
        return configs;
    }

    public void setConfigs(List<AuthConfig> configs) {
        this.configs = configs;
    }
}
