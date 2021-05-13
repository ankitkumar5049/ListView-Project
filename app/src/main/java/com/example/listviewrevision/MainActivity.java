package com.example.listviewrevision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = findViewById(R.id.myListView);

        ArrayList<String> myFriends = new ArrayList<>();

        myFriends.add("Ankit");
        myFriends.add("rahul");
        myFriends.add("aniket");
        myFriends.add("sahil");
        myFriends.add("bhoko");
        myFriends.add("lodu");
        myFriends.add("lahsan");
        myFriends.add("chutiya"); myFriends.add("rounak");
        myFriends.add("prakhar");
        myFriends.add("ayush"); myFriends.add("ajay");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFriends);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Person is Selected "+myFriends.get(position),
                        Toast.LENGTH_LONG).show();
            }
        });





    }
}