package com.example;

import java.util.Map;

import org.jscience.physics.model.RelativisticModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class Main {

  @Autowired
  UserOperation userDao;

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }

  @RequestMapping("/")
  String index() {
    return "index";
  }
  
  @RequestMapping(value = { "/myservice", ""},method = RequestMethod.GET, produces = {"application/json"})
  public String getJson(Map<String, Object> model) {
	 RelativisticModel.select();
	 model.put("message", userDao.getCount());
	 return "myservice";
  }
}
