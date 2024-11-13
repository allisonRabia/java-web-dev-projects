package org.launchcode.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Annotation
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //to make it a request handler add annotation
    //Handles request at /hello
//    @GetMapping("hello")//path you want the handler to live at (moved the handler method  from root to hello
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }
    //now lives at /hello/goodbye
    @GetMapping("goodbye")//path you want the handler to live at (moved the handler method  from root to hello
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //create handler that handles requests of the form /hello?name=LaunchCode
    //accepts only get requests
    //lives at /hello/hello
   @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    //dynamic handler accepts data
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";//dynamic response
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    //hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //tells to submit request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
//both hello and goodbye accept only get requests