package com.example.resturantapi.ResturantController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.resturantapi.ResturantModel.Resturant;
import com.example.resturantapi.Resturantservice.ResturantService;

@RestController
@RequestMapping("api/v1/app")
public class Resturantcontrol {
@Autowired
 private ResturantService resturantservice;
  
 @RequestMapping("/find-all")
  public List<Resturant> getAllresturants(){
    return resturantservice.getAllResturant();
  }

 @PostMapping("/add")
 public void addResturant(@RequestBody Resturant resturant){
    resturantservice.addResturant(resturant);
 }

 //For Future Use --> not simplified
// @GetMapping("/update-rest/rname/{Rname}")
//  public Resturant gResturant(@PathVariable String Rname){
//    return resturantservice.getResturant(Rname);
//  }

//    @DeleteMapping("delete-rest/rnumber/{rnumber}")
//    public void deleteTodo(@PathVariable String rnumber) {
//        ResturantService.deleteRest(rnumber);
//    }
}
