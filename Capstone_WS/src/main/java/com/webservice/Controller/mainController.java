/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice.Controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author albert
 */

@RestController
@RequestMapping(value="/service")
public class mainController {
    
    @RequestMapping(value = "/Hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String getAllAssets(){
        mainImpl obj = new mainImpl();
        
        return obj.Hello();
}
    
    
}
