package top.yuzhibin.rpc.exception;

/**
 * 序列化异常
 *
 * @author yuzhibin
 */
public class SerializeException extends RuntimeException {
    public SerializeException(String msg) {
        super(msg);
    }
}
