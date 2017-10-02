package com.example.tdanng.mcmarket;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    String[] items={"Clothes","Fruits","Shoes","Vegetables"};
    String[] item1={"Clothes","Fruits","Shoes","Vegetables"};

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=MainActivity.this;


        int configuration=getResources().getConfiguration().orientation;
        if(configuration== Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.portrait);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rl1= (RelativeLayout) findViewById(R.id.c);
                RelativeLayout rl2= (RelativeLayout) findViewById(R.id.f);
                RelativeLayout rl3 = (RelativeLayout) findViewById(R.id.s);
                RelativeLayout rl4 = (RelativeLayout) findViewById(R.id.v);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "Clothes":

                            rl1.setVisibility(View.VISIBLE);
                            rl2.setVisibility(View.INVISIBLE);
                            rl3.setVisibility(view.INVISIBLE);
                            rl4.setVisibility(view.INVISIBLE);

                            break;
                        case "Fruits":

                            rl1.setVisibility(View.INVISIBLE);
                            rl2.setVisibility(View.VISIBLE);
                            rl3.setVisibility(view.INVISIBLE);
                            rl4.setVisibility(view.INVISIBLE);
                            break;
                        case "Shoes":

                            rl1.setVisibility(View.INVISIBLE);
                            rl2.setVisibility(View.INVISIBLE);
                            rl3.setVisibility(view.VISIBLE);
                            rl4.setVisibility(view.INVISIBLE);
                            break;
                        case "Vegetables":

                            rl1.setVisibility(View.INVISIBLE);
                            rl2.setVisibility(View.INVISIBLE);
                            rl3.setVisibility(view.INVISIBLE);
                            rl4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });

        }
        else if(configuration== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,item1);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rl1= (RelativeLayout) findViewById(R.id.c);
                RelativeLayout rl2= (RelativeLayout) findViewById(R.id.f);
                RelativeLayout rl3 = (RelativeLayout) findViewById(R.id.s);
                RelativeLayout rl4 = (RelativeLayout) findViewById(R.id.v);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "Clothes":

                            rl1.setVisibility(View.VISIBLE);
                            rl2.setVisibility(View.INVISIBLE);
                            rl3.setVisibility(view.INVISIBLE);
                            rl4.setVisibility(view.INVISIBLE);

                            break;
                        case "Fruits":

                            rl1.setVisibility(View.INVISIBLE);
                            rl2.setVisibility(View.VISIBLE);
                            rl3.setVisibility(view.INVISIBLE);
                            rl4.setVisibility(view.INVISIBLE);
                            break;
                        case "Shoes":

                            rl1.setVisibility(View.INVISIBLE);
                            rl2.setVisibility(View.INVISIBLE);
                            rl3.setVisibility(view.VISIBLE);
                            rl4.setVisibility(view.INVISIBLE);
                            break;
                        case "Vegetables":

                            rl1.setVisibility(View.INVISIBLE);
                            rl2.setVisibility(View.INVISIBLE);
                            rl3.setVisibility(view.INVISIBLE);
                            rl4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });
        }
    }
}
