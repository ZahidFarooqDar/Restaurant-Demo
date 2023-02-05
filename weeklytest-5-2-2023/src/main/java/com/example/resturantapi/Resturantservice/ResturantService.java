package com.example.resturantapi.Resturantservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.example.resturantapi.ResturantModel.Resturant;

@Service
public class ResturantService {
    private List<Resturant> resturants = new ArrayList<>(Arrays.asList(new Resturant("Hotel UK","UK","1","mango Juice","200","5"),
    new Resturant("Hotel Taj","India","2","biryani","100","5"),
    new Resturant("Hotel Kashmir","Kashmir","3","Wazwan","50","4")
    
    
    ));

    public List<Resturant> getAllResturant(){
        return resturants;
    }

    public Resturant getResturant(String Rname){
        return resturants.stream().filter(t -> t.getRname().equals(Rname)).findFirst().get();
    }

    public void addResturant(Resturant resturant){
        resturants.add(resturant);
    }

    //For future use
//    public static void deleteRest(String rnumber) {
//        Predicate<? super Resturant> predicate = resturants -> resturants.getRnumber() == rnumber;
//        resturants.removeIf(predicate);
//    }
    
}
