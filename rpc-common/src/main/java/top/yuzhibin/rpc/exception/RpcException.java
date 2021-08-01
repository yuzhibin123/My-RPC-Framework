package top.yuzhibin.rpc.exception;

import top.yuzhibin.rpc.enumeration.RpcError;

/**
 * RPC调用异常
 *
 * @author yuzhibin
 */
public class RpcException extends RuntimeException {

    public RpcException(RpcError error, String detail) {
        super(error.getMessage() + ": " + detail);
    }

    public RpcException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcException(RpcError error) {
        super(error.getMessage());
    }

}
