package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        mListView = (ListView) findViewById(R.id.listView);

                mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(MainActivity.this,DataActivity.class);
                        intent.putExtra("position",position);
                        startActivity(intent);

                    }
                });
        ArrayList<Card> list = new ArrayList<Card>();

        list.add(new Card("Anger", R.drawable.anger));
        list.add(new Card("Animals", R.drawable.animals1));
        list.add(new Card("Attraction", R.drawable.attraction));
        list.add(new Card( "Biological Facts", R.drawable.biological));
        list.add(new Card("Body Language", R.drawable.body_language));
        list.add(new Card("Children", R.drawable.children));
        list.add(new Card("Colour", R.drawable.color));
        list.add(new Card("Dating", R.drawable.dating));
        list.add(new Card("Depression", R.drawable.depression));
        list.add(new Card("Dream", R.drawable.dream));
        list.add(new Card("Extroverts", R.drawable.extroverts));
        list.add(new Card("Fear Of Phobias", R.drawable.fobia));
        list.add(new Card("Female", R.drawable.women));
        list.add(new Card("Friendship", R.drawable.friends));
        list.add(new Card("Happiness", R.drawable.happyness));
        list.add(new Card("Health", R.drawable.health));
        list.add(new Card("Human Behaviours", R.drawable.bc));
        list.add(new Card("Human Emotions", R.drawable.emotions));
        list.add(new Card("Hunger And Food", R.drawable.hunger_and_food));
        list.add(new Card("Human Mind", R.drawable.mind));
        list.add(new Card("Introverts", R.drawable.introvert));
        list.add(new Card("Jealousy", R.drawable.jelaucy));
        list.add(new Card("Laughter", R.drawable.laughter));
        list.add(new Card("Laziness", R.drawable.laziness));
        list.add(new Card("Left Handed People", R.drawable.left_handed));
        list.add(new Card("Love", R.drawable.love));
        list.add(new Card("Male", R.drawable.man));
        list.add(new Card("Music", R.drawable.music));
        list.add(new Card("OCD", R.drawable.ocd));
        list.add(new Card("People", R.drawable.people));
        list.add(new Card("Personality", R.drawable.personality));
        list.add(new Card("Sixth Sense", R.drawable.sixth_sense));
        list.add(new Card("Sleep", R.drawable.sleep));
        list.add(new Card("Social Media Life", R.drawable.social_media));
        list.add(new Card("Teenagers", R.drawable.teenagers));
        list.add(new Card("Writing", R.drawable.writing));




        CustomListAdapter adapter;
        adapter = new CustomListAdapter(this, list);

        mListView.setAdapter(adapter);

    }
}

