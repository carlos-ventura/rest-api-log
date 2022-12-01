package spring.boot.restapilog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Log {

    private @Id @GeneratedValue Long applicationId;
    private long traceId;
    private String severity;
    // Start simple
    private String timestamp;
    private String message;
    private String componentName;
    private long requestId;

    public Log() {}

    public Log(long traceId, String severity, String timestamp, String message) {
        this.traceId = traceId;
        this.severity = severity;
        this.timestamp = timestamp;
        this.message = message;
    }

    public Log(long traceId, String severity, String timestamp, String message, long requestId) {
        this(traceId, severity, timestamp, message);
        this.requestId = requestId;
    }

    public Log(long traceId, String severity, String timestamp, String message, String componentName) {
        this(traceId, severity, timestamp, message);
        this.componentName = componentName;
    }

    public Log(long traceId, String severity, String timestamp, String message, String componentName, long requestId) {
        this(traceId, severity, timestamp, message);
        this.componentName = componentName;
        this.requestId = requestId;
    }

    public long getTraceId() {
        return traceId;
    }

    public String getSeverity() {
        return severity;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getComponentName() {
        return componentName;
    }

    public long getRequestId() {
        return requestId;
    }
}
