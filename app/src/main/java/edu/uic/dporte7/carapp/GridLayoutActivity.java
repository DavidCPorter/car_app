package edu.uic.dporte7.carapp;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Dporter1 on 10/3/17.
 */

public class GridLayoutActivity extends Activity {

    protected static final String EXTRA_RES_ID = "POS";
    public int itemID;
    public int itemPos;
    final private CarClass newCar = new CarClass();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this, newCar));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent intent = new Intent(GridLayoutActivity.this,
                        LargeImage.class);

                intent.putExtra(EXTRA_RES_ID, (int) id);
                intent.putExtra("website", newCar.mCarWebsite[position]);

                startActivity(intent);
            }
        });
        registerForContextMenu(gridview);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        AdapterView.AdapterContextMenuInfo itemData = (AdapterView.AdapterContextMenuInfo) menuInfo;
        itemID = (int)itemData.id;
        itemPos = (int)itemData.position;

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.show_pic:
                Intent intent = new Intent(GridLayoutActivity.this,
                        LargeImage.class);

                intent.putExtra(EXTRA_RES_ID, (int) itemID);
                startActivity(intent);
                return true;

            case R.id.website:
                String site = newCar.mCarWebsite[itemPos];
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(site));
                startActivity(intent);
                return true;

            case R.id.contact_dealer:
                String[] dealer = newCar.mDealers[itemPos];
                intent = new Intent(this, ListActivityDealer.class);
                intent.putExtra("dealer_contact", dealer);
                startActivity(intent);
                return true;
            default:
                return false;
        }
    }
}