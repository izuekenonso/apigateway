package com.example.apigateway.payment;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("paymentservice_route")
public class CustomRoute {

	@Bean
	public RouteLocator paymentRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
			.route("path_route", r -> r.path("/payment/**")
				.uri("http://localhost:9091"))
			.build();
	}

}
