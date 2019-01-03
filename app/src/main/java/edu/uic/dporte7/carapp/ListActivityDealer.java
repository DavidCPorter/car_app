package edu.uic.dporte7.carapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.net.URI;
import java.util.List;

/**
 * Created by Dporter1 on 10/9/17.
 */

public class ListActivityDealer extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        final Bundle extras = getIntent().getExtras();

        setListAdapter(new ArrayAdapter<String>(this, R.layout.dealer_view, extras.getStringArray("dealer_contact")));
        ListView lv = getListView();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri mapLocation = Uri.parse("geo:0,0?q="+ Uri.encode(extras.getStringArray("dealer_contact")[position]));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapLocation);
                startActivity(mapIntent);
            }
        });
    }

}
