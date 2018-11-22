package works.hop.rest.tools.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ApiRes<T> implements Serializable {

    private static final long serialVersionUID = 5742436875626069669L;
    private Integer statusCode;
    private String statusDescr;
    private String protocol;
    private Map<String, String> headers = new HashMap<>();
    private T responseBody;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescr() {
        return statusDescr;
    }

    public void setStatusDescr(String statusDescr) {
        this.statusDescr = statusDescr;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public T getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(T responseBody) {
        this.responseBody = responseBody;
    }

	@Override
	public String toString() {
		return "ApiRes [statusCode=" + statusCode + ", statusDescr=" + statusDescr + ", protocol=" + protocol
				+ ", headers=" + headers + ", responseBody=" + responseBody + ", getStatusCode()=" + getStatusCode()
				+ ", getStatusDescr()=" + getStatusDescr() + ", getProtocol()=" + getProtocol() + ", getHeaders()="
				+ getHeaders() + ", getResponseBody()=" + getResponseBody() + "]";
	}
}
