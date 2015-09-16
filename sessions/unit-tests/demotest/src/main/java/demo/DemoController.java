package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Copyright (C) Ethode LLC. - All Rights Reserved Unauthorized copying of this file, via any medium is strictly
 * prohibited Proprietary and confidential
 *
 * @author Nick Artman<nick@addosolutions.com>
 * @created 9/9/15 : 11:17 AM
 */

@Controller
public class DemoController {

	@RequestMapping("/")
	public ModelAndView index(){
		return new ModelAndView("test");
	}

}
