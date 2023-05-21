package com.example.week3project3.EcomServies;

import com.example.week3project3.model.Product;
import com.example.week3project3.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServies {
    ArrayList<User> users=new ArrayList<>();

    public static ArrayList<User> getUser() {
        return null;
    }

    public static void addUser(User user) {
    }

    public static boolean updateUser(int id, User user) {
        return updateUser(id,user);
    }

    public ArrayList<User>getuser(){
        return users;
    }
    public void adduser(User user){

        users.add(user);
    }
    public  boolean updateproduct(int id,User user){
        for (int i=0; i<users.size();i++){
            if(users.get(i).getId()==id){
                users.set(i,user);
                return true;
            }



        }
        return false;


    }
    public  boolean deleteuser(int id){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getId()==id){
                users.remove(i);
                return true;
            }
        }
        return false;
    }

}
