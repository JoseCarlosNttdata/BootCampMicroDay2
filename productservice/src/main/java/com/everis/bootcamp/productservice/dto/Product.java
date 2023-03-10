package com.everis.bootcamp.productservice.dto;

import io.github.resilience4j.retry.annotation.Retry;

@Retry(name = "price-service", fallbackMethod = "fallBack")
//@Override
public class Product {
	private String productId;

	private String channel;

	private String serverPort;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

}
