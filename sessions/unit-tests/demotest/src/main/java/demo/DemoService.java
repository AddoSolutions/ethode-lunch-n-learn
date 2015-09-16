package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Copyright (C) Ethode LLC. - All Rights Reserved Unauthorized copying of this file, via any medium is strictly
 * prohibited Proprietary and confidential
 *
 * @author Nick Artman<nick@addosolutions.com>
 * @created 9/9/15 : 10:59 AM
 */

@Service
public class DemoService {

	@Value("${app.myvalue}")
	private String myValue;

	public boolean isNumeric(String test){
		return test.matches("-?\\d+(\\.\\d+)?");
	}

	public String getMyValue(){
		return myValue;
	}


}
