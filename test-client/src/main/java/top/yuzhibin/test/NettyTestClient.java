package top.yuzhibin.test;

import top.yuzhibin.rpc.api.ByeService;
import top.yuzhibin.rpc.api.HelloObject;
import top.yuzhibin.rpc.api.HelloService;
import top.yuzhibin.rpc.serializer.CommonSerializer;
import top.yuzhibin.rpc.transport.RpcClient;
import top.yuzhibin.rpc.transport.RpcClientProxy;
import top.yuzhibin.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 * @author yuzhibin
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
