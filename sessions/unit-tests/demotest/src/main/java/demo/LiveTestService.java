package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Copyright (C) Ethode LLC. - All Rights Reserved Unauthorized copying of this file, via any medium is strictly
 * prohibited Proprietary and confidential
 *
 * @author Nick Artman<nick@addosolutions.com>
 * @created 9/16/15 : 2:19 PM
 */

@Service
public class LiveTestService {

	@Value("${app.ethode}")
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public int multiply(int a, int b){
		return a*b;
	}

	public int add(int a, int b){
		return a+b;
	}


}
