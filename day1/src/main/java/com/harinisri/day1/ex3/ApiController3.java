package com.harinisri.day1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {
   private String yourFavColor="Green";
   @GetMapping("get")
   public String getMyFav()
   {
	   return "My favourite color is "+yourFavColor;
   }
}
