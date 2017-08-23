package com.dudu;

import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Builder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Server {
	private static Logger logger = LoggerFactory.getLogger(Server.class);

	public static void main(String[] args) throws HadoopIllegalArgumentException, IOException {
		logger.info("RPC Server start...");
		Builder builder = new Builder(new Configuration());
		builder.setBindAddress("127.0.0.1").setPort(10001).setProtocol(LoginServiceInterface.class).setInstance(new LoginServiceImpl());
		RPC.Server server = builder.build();
		server.start();
		logger.info("RPC Server start success...");
	}
	
}


