package com.dudu;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    public static void main(String[] args) throws Exception {
        LoginServiceInterface proxy = RPC.getProxy(LoginServiceInterface.class, 1L, new InetSocketAddress
                ("127.0.0.1", 10001), new Configuration());
        String result = proxy.hello("Boy", "happy Day!");
        logger.info("result : {}", result);
    }

}
