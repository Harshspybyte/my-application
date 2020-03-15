package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class DataActivity extends AppCompatActivity {
    ListView listView;
    DataListAdapter dataListAdapter;
    ArrayList<Card> arrayList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);




        listView =findViewById(R.id.listViewData);

        arrayList = new ArrayList<>();

        Intent intent = getIntent();
        int position = intent.getIntExtra("position",0);
        switch(position) {
            case 0:
                setTitle("Anger");
                arrayList.add(new Card("Love is blind",0));
                arrayList.add(new Card("Animalshhghg harsh rupa fs,re obivan skywalkwer yoda , luke leiya han solo vedar spiderman batman catwomen and solar saiyan of the team tara rumpum tara tata mam hhghjghhhhhhhhhhhhh",0));
                arrayList.add(new Card("Attracti",0));
                arrayList.add(new Card("Attractio",0));
                arrayList.add(new Card("Attraction0",0));
                arrayList.add(new Card("Attraction1",0));
                break;
                case 1:
                    arrayList.add(new Card("Dogs Are",0));
                    break;
            case 2:


            break ;
        }

        dataListAdapter = new DataListAdapter(this,arrayList);

        listView.setAdapter(dataListAdapter);

    }
}
