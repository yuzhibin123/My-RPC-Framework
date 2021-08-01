package top.yuzhibin.rpc.transport;

import top.yuzhibin.rpc.entity.RpcRequest;
import top.yuzhibin.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 * @author yuzhibin
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
