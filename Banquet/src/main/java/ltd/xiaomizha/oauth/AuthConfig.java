package ltd.xiaomizha.oauth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AuthConfig {
    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "clientId")
    private String clientId;

    @XmlElement(name = "clientSecret")
    private String clientSecret;

    @XmlElement(name = "redirectUri")
    private String redirectUri;

    @XmlElement(name = "alipayPublicKey")
    private String alipayPublicKey;

    @Override
    public String toString() {
        return "AuthConfig{" +
                "id='" + id + '\'' +
                ", clientId='" + clientId + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                ", redirectUri='" + redirectUri + '\'' +
                ", alipayPublicKey='" + alipayPublicKey + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }
}
