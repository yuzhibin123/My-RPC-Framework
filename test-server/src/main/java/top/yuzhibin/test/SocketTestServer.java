package top.yuzhibin.test;

import top.yuzhibin.rpc.annotation.ServiceScan;
import top.yuzhibin.rpc.serializer.CommonSerializer;
import top.yuzhibin.rpc.transport.RpcServer;
import top.yuzhibin.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 * @author yuzhibin
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
