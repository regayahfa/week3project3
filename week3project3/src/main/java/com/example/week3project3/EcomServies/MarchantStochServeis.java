package com.example.week3project3.EcomServies;

import com.example.week3project3.model.Merchant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MarchantStochServeis {
    static ArrayList<Merchant> marchantStochServeis=new ArrayList<>();

    public static ArrayList<Merchant> getmarSrock() {
        return null;
    }
    public ArrayList<Merchant> getmaStock(){
        return marchantStochServeis;
    }


    public static void addmaStock(Merchant metchantStock){

        marchantStochServeis.add(metchantStock);
    }
    public static boolean updatemaStock(int id, Merchant merchant){
        for (int i=0; i<marchantStochServeis.size();i++){
            if(marchantStochServeis.get(i).getId()==id){
                marchantStochServeis.set(i, merchant);
                return true;
            }



        }
        return false;


    }
    public static boolean deletemaStock(int id){
        for(int i=0;i<marchantStochServeis.size();i++){
            if(marchantStochServeis.get(i).getId()==0){
                marchantStochServeis.remove(i);
                return true;
            }
        }
        return false;
    }


}

