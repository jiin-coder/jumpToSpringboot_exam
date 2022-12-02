package com.kja.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller 에노테이션
 * - HelloController 클래스가 컨트롤러의 기능을 수행한다는 의미
 * - 이 에노테이션으로 스프링부트 프레임워크가 컨트롤러로 인식
 */
@Controller
public class HelloController {
	
	/**
	 * @RequestMapping("/hello") 어노테이션
	 * - http://localhost:8080/hello URL 요청이 발생하면 hello 메서드가 실행됨
	 * - /hello URL과 hello 메서드를 매핑하는 역할 */
	/**
	 * @ResponseBody 에노테이션
	 * - hello 메서드의 응답 결과가 문자열 그 자체임을 나타냄
	 * - "Hello World" 라는 문자열을 리턴하므로 출력으로 "Hello World" 문자열이 노출됨
	 */
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World. jiae!";
	}

}
