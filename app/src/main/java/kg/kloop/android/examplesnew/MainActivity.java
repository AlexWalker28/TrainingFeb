package kg.kloop.android.examplesnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Flat> flatsArrayList;
    CustomArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.flats_list_view);
        flatsArrayList = new ArrayList<>();

        Flat flat1 = new Flat("Ogonbaeva 222", "$1 000 000", "100m^2");
        Flat flat2 = new Flat("Mars", "$600 000 000", "1000m^2");

        flatsArrayList.add(flat1);
        flatsArrayList.add(flat2);

        adapter = new CustomArrayAdapter(getApplicationContext()
                , R.layout.list_view_item
                , flatsArrayList);
        listView.setAdapter(adapter);


    }

}
