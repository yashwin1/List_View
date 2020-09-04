package com.example.list_view;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      We can't directly convert a string (of java) into a list item so we use Adapter.

        String[] foods = {"Bacon", "Ham", "Tuna", "Candy", "Meatball", "Potato"};
        ListAdapter yashwinAdapter = new CustomAdapter(this, foods);
        ListView yashwinListView = (ListView) findViewById(R.id.yashwinListView);
        yashwinListView.setAdapter(yashwinAdapter);     //Convert yashwinAdapter to List items

        yashwinListView.setOnItemClickListener(
            new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String food = String.valueOf(parent.getItemAtPosition(position));
                    Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
                }
            }
        );

    }

}
