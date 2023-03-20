package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TestRequestBodyDTO;
//import com.example.demo.dto.TestRequestBodyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")//리소스
public class TestController {

  //  @GetMapping()
    //public String test(){
     //   return "Hello World, 신지현";
    //}


    @GetMapping("/testGetMapping")
        public String testController(){
            return "Hello World, 신지현";
    }

    @GetMapping("/{id}")
    public String testControllerWithPathVariables(@PathVariable(required = false) int id) {
        return "Hello World! 신지현, id:"+id;
    }

    @GetMapping("/testResquestParam")
    public String testControllerRequestParam(@RequestParam (required = false) int id){
        return "HelloWorld! 신지현 id:"+id;
    }
    @GetMapping("/testResquestBody")
    public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO){
        return "HelloWorld! 신지현, id:"+testRequestBodyDTO.getId()+" message: "+testRequestBodyDTO.getMessage();
    }
    @GetMapping("/testResponseBody")
    public ResponseDTO<String> testControllerResponseBody(){
        List<String> list = new ArrayList<>();
        list.add("sjh");
        list.add("sjh2");
        list.add("sjh3");

        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return response;
    }

    @GetMapping("/testResponseEntity")
    public ResponseEntity<?> testControllerResponseEntity(){
        List<String> list = new ArrayList<>();
        list.add("sjh");
        list.add("sjh2");
        list.add("sjh3");

        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return ResponseEntity.ok().body(response);
        //return ResponseEntity.badRequest().body(response);
    }
}
