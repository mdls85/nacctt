package com.example.mdls8.nacctt.helpers;

import android.support.annotation.NonNull;

import com.example.mdls8.nacctt.models.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DbHelper {

    private DatabaseReference mDatabase;

    public DbHelper(){
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    // [BEGIN USER RELATED FUNCTIONS]

    public void writeNewUser(final String uid){
        mDatabase.child("users").child(uid).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (!dataSnapshot.exists()){
                    // user does not yet exists so add them
                    User user = new User(uid);
                    mDatabase.child("users").child(uid).setValue(user);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    // [END USER RELATED FUNCTIONS]

}
