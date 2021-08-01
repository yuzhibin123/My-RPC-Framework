package top.yuzhibin.test;

import top.yuzhibin.rpc.annotation.ServiceScan;
import top.yuzhibin.rpc.serializer.CommonSerializer;
import top.yuzhibin.rpc.transport.RpcServer;
import top.yuzhibin.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 * @author yuzhibin
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
