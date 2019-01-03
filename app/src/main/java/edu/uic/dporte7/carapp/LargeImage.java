package edu.uic.dporte7.carapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
/**
 * Created by Dporter1 on 10/3/17.
 */

public class LargeImage extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        final String website = extras.getString("website");
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(extras.getInt(GridLayoutActivity.EXTRA_RES_ID, 0));

        setContentView(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(website));
                startActivity(intent);
            }
        });
    }
}
