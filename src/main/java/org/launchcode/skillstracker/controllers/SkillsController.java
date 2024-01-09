package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String first() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String coder, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<h1>"+coder+"</h1>"+
                "<h3>"+"<ol>"+
                "<li>" +first+"</li>"+
                "<li>" +second+"</li>"+
                "<li>" +third+"</li>"+
                "</ol>"+"</h3>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form method='post' action='/hello'>" +
                "<label>Name:</br><input type = 'text' name = 'coder' /></label></br>" +
                "<label>My favorite language:</label></br>" +
                "<select name='first'>" +
//                        "<option value=''>Select one</option>"+
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "</select></br>" +
                "<label>My second favorite language:</label></br>" +
                "<select name='second'>" +
//                "<option value=''>Select one</option>"+
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "</select></br>" +
                "<label>My third favorite language:</label></br>" +
                "<select name='third'>" +
//                "<option value=''>Select one</option>"+
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "</select>" +
                "</br><input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
