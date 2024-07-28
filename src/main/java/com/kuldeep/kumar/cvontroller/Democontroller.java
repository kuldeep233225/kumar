package com.kuldeep.kumar.cvontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Democontroller {
@GetMapping("/kuldeep")
public String demo () 
{
	return "Hello9 the sprinnggg";
}
  


@GetMapping(path = "/hi")
public String sayHello()
{
	return "Hellooo spring";
}



@GetMapping(path = "/user")
public DemoUser getUser()
{
	DemoUser user = new DemoUser();
	return user;
}


}
