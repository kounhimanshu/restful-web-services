package com.learingspringboot.restfulwebservices.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// REST API
@RestController
public class HelloWorldController {

    // when do to localhost:8080/hello-world
    // return "Hello World"

//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping( "/hello-world")
    public String helloWorld(){
        return "Hello Himanshu to the world of Springboot";
    }

    @GetMapping( "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Spring Bean");
    }

    // Path Parameter
    //  /user/{id},todos/{id} => user/2/todos/102
    // hello-world/path-variable/Himanshu

    @GetMapping( "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(
                String.format("Hello World, %s", name));
    }

}
