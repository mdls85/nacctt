package com.example.mdls8.nacctt.helpers;

import com.example.mdls8.nacctt.models.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DbHelper {

    private DatabaseReference mDatabase;

    public DbHelper(){
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    // [BEGIN USER RELATED FUNCTIONS]
    private boolean userExists(String uid){
        return false;
    }

    public void writeNewUser(String uid){
        if(!userExists(uid)){
            User user = new User(uid);
            mDatabase.child("users").child(uid).setValue(user);
        }
    }

    // [END USER RELATED FUNCTIONS]

}
