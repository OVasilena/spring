package de.telran.hellowebservlett.controller;

import de.telran.hellowebservlett.JsonName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(value = "/hello-mvc/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name, Model model) {
        model.addAttribute("helloText", "Hello " + name);
        return "hello-mvc";
    }

    @RequestMapping(value = "/hello-simple/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String helloSimpletext(@PathVariable String name) {
        return "Hello Simple:" + name;
    }

    @GetMapping(value = "/hello-json/{name}")
    @ResponseBody
    public JsonName helloSimpleJson(@PathVariable String name) {
        JsonName jName = new JsonName(name);
        return jName;
    }

    // added secondToken
    @PostMapping(value = "/hello-json")
    @ResponseBody
    public JsonName helloPostJson(@RequestBody JsonName incomingData) {
        incomingData.token = "Hello , " + incomingData.token;
        incomingData.secondToken = "Пока, " + incomingData.secondToken;
        return incomingData;
    }

    @PutMapping(value = "/hello-json")
    @ResponseBody
    public JsonName helloPutJson(@RequestBody JsonName incomingData) {
        incomingData.token = incomingData.token + " updated";
        return incomingData;
    }

    @DeleteMapping(value = "/hello-json/{name}")
    @ResponseBody
    public String helloDelJson(@PathVariable String name) {
        // todo implements delete data
        //
        return "delData: " + name;
    }
}
