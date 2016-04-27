package sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sample.service.HelloService;

@Controller
public class HelloController {

//	依存するクラスを外から注入(DI) = newしなくても外部のクラスを使える。
	@Autowired
	HelloService helloService;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	@ResponseBody
	public String hello() {

		return helloService.hello();
	}
}