package edu.uic.dporte7.carapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends BaseAdapter {
    private static final int PADDING = 0;
    private Context mContext;
    private ArrayList<Integer> mThumbCarPics;
    private List<Integer> mBigPics;
    private final String[] mCarNames;

    public ImageAdapter(Context c, CarClass newCar) {
        mContext = c;
        mThumbCarPics = newCar.mThumbPicsArray;
        mBigPics = newCar.mCarPicsArray;
        mCarNames = newCar.mCarText;
    }

    @Override
    public int getCount() {
        return mCarNames.length;
    }

    // Return the data item at position
    @Override
    public Object getItem(int position) {
        return mBigPics.get(position);
    }


    @Override
    public long getItemId(int position) {
        return mBigPics.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridPic = convertView;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridPic = inflater.inflate(R.layout.grid_item, null);
            ImageView imageView = (ImageView) gridPic.findViewById(R.id.image);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(PADDING, PADDING, PADDING, PADDING);
        }
        TextView tv = (TextView) gridPic.findViewById(R.id.text);
        tv.setText(mCarNames[position]);
        ImageView imageView = (ImageView) gridPic.findViewById(R.id.image);
        imageView.setImageResource(mThumbCarPics.get(position));

        return gridPic;
    }
}
