package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExchangeImpl implements iExchange {
	
	private static final String API_ENDPOINT = "https://bittrex.com/api/v1.1";
    private static final String API_ENDPOINT_V2 = "https://bittrex.com/Api/v2.0";
    private static final String API_GET_CURRENCIES = "/public/getcurrencies";
    private static final String API_GET_MARKETSUMMARIES = "/public/getmarketsummaries";
    private static final String API_GET_MARKETSUMMARY = "/public/getmarketsummary";
    private static final String API_GET_TICKS = "/pub/market/GetTicks";
	
	
	public String getCurrencies() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(API_ENDPOINT + API_GET_CURRENCIES, String.class);
	}
	
	public String getMarkets() {
		return null;
	}

}
