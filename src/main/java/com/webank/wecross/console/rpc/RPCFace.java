package com.webank.wecross.console.rpc;

import com.webank.wecross.console.common.WeCrossServers;
import com.webank.wecrosssdk.rpc.WeCrossRPC;
import java.util.List;
import java.util.Map;
import org.apache.commons.math3.util.Pair;

public interface RPCFace {
    void setWeCrossServers(WeCrossServers weCrossServers);

    void setCurrentServer(Pair<String, String> currentServer);

    void setWeCrossRPC(WeCrossRPC weCrossRPC);

    Boolean switchServer(String[] params);

    void listResources(String[] params) throws Exception;

    void getResourceStatus(String[] params, Map<String, String> pathMaps) throws Exception;

    void getData(String[] params, Map<String, String> pathMaps) throws Exception;

    void setData(String[] params, Map<String, String> pathMaps) throws Exception;

    void call(String[] params, Map<String, String> pathMaps) throws Exception;

    void callInt(String[] params, Map<String, String> pathMaps) throws Exception;

    void callIntArray(String[] params, Map<String, String> pathMaps) throws Exception;

    void callString(String[] params, Map<String, String> pathMaps) throws Exception;

    void callStringArray(String[] params, Map<String, String> pathMaps) throws Exception;

    void sendTransaction(String[] params, Map<String, String> pathMaps) throws Exception;

    void sendTransactionInt(String[] params, Map<String, String> pathMaps) throws Exception;

    void sendTransactionIntArray(String[] params, Map<String, String> pathMaps) throws Exception;

    void sendTransactionString(String[] params, Map<String, String> pathMaps) throws Exception;

    void sendTransactionStringArray(String[] params, Map<String, String> pathMaps) throws Exception;

    List<String> getPaths();
}
