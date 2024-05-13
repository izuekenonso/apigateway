package com.example.apigateway.account;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("accountservice_route")
public class CustomRoute {
	
	@Bean
	public RouteLocator accountRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
			.route("path_route", r -> r.path("/account/**")
				.uri("http://localhost:9093"))
			.build();
	}
}
