package spring.boot.restapilog;

public class Log {

    private final long applicationId;
    private final long traceId;
    private final String severity;
    // Start simple
    private final String timestamp;
    private final String message;
    private String componentName;
    private long requestId;

    public Log(long applicationId, long traceId, String severity, String timestamp, String message) {
        this.applicationId = applicationId;
        this.traceId = traceId;
        this.severity = severity;
        this.timestamp = timestamp;
        this.message = message;
    }

    public Log(long applicationId, long traceId, String severity, String timestamp, String message, long requestId) {
        this.applicationId = applicationId;
        this.traceId = traceId;
        this.severity = severity;
        this.timestamp = timestamp;
        this.message = message;
        this.requestId = requestId;
    }

    public Log(long applicationId, long traceId, String severity, String timestamp, String message, String componentName) {
        this.applicationId = applicationId;
        this.traceId = traceId;
        this.severity = severity;
        this.timestamp = timestamp;
        this.message = message;
        this.componentName = componentName;
    }

    public Log(long applicationId, long traceId, String severity, String timestamp, String message, String componentName, long requestId) {
        this.applicationId = applicationId;
        this.traceId = traceId;
        this.severity = severity;
        this.timestamp = timestamp;
        this.message = message;
        this.componentName = componentName;
        this.requestId = requestId;
    }

    public long getApplicationId() {
        return applicationId;
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
