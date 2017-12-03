package com.darkblue.rpcimpl.loadbalance;

import com.darkblue.rpcimpl.commons.HostAndPort;
import com.darkblue.rpcimpl.protocol.MethodInvokeMetaWrap;

import java.util.List;
import java.util.Random;

public class RandomLoadBalancer implements LoadBalancer {
    public HostAndPort select(List<HostAndPort> hostAndPorts, MethodInvokeMetaWrap methodInvokeMetaWrap) {
        int i = new Random().nextInt(hostAndPorts.size());

        return hostAndPorts.get(i);
    }
}
