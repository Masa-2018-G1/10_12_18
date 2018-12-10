package com.sheygam.masa_2018_g1_10_12_18_part2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
//        Person p = new Person("Vasya",23);
//        p = new Person();
////        p.setAge(23);
//        p.setName("Petya");
//        String json = gson.toJson(p);
//        Log.d("MY_TAG", json);
//
//        json = "{\"full_name\":\"Sofa\",\"age\":45,\"salary\":200}";
//        json = "{\"salary\":200}";
//        p = gson.fromJson(json, Person.class);
//        Log.d("MY_TAG", "onCreate: " + p.toString());

        Person p = new Person("Vasya",23,1000.0, new Address("Ashdod",24));
        String json = gson.toJson(p);
        Log.d("MY_TAG", json);
    }
}
