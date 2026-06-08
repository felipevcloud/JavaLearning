public class LogLine {

    String line;
    
    public LogLine(String logLine) {
        this.line = logLine;
    }

    public LogLevel getLogLevel() {
        String log = line.substring(1, 4);
        switch(log){
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        String message = line.substring(7, line.length());
        switch(level){
            case TRACE:
                return "1:" + message;
            case DEBUG:
                return "2:" + message;
            case INFO:
                return "4:" + message;
            case WARNING:
                return "5:" + message;
            case ERROR:
                return "6:" + message;
            case FATAL:
                return "42:" + message;
            default:
                return "0:" + message;
        }
    }
}
