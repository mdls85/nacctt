package com.example.mdls8.nacctt.models;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.ArrayList;
import java.util.List;

public class User {

    public String uid;
    public int rep;
    public List<String> toilets = new ArrayList<>();

    public User(){
        // required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String uid){
        this.uid = uid;
        this.rep = 0;
    }
}
