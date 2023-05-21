package com.example.week3project3.EcomServies;

import com.example.week3project3.model.Category;
import com.example.week3project3.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProudectServies {
    static ArrayList<Product> proudects=new ArrayList<>();

public ArrayList<Product>getProudect(){
    return proudects;
}


public void addProudect(Product product){

    proudects.add(product);
}
    public static boolean updateproduct(int id, Category catogory){
        for (int i=0; i<proudects.size();i++){
            if(proudects.get(i).getId()==id){
               proudects.set(i, catogory);
                return true;
            }



        }
        return false;


    }
    public  boolean deleteproduct(int id){
        for(int i=0;i<proudects.size();i++){
            if(proudects.get(i).getId()==id){
                proudects.remove(i);
                return true;
            }
        }
        return false;
    }


}
