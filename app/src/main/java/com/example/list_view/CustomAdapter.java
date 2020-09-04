package com.example.list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater yashwinInflator = LayoutInflater.from(getContext());
        View customView = yashwinInflator.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView yashwinText = (TextView) customView.findViewById(R.id.yashwinText);
        ImageView yashwinImage = (ImageView) customView.findViewById(R.id.yashwinImage);

        yashwinText.setText(singleFoodItem);
        yashwinImage.setImageResource(R.drawable.yashwin);
        return customView;
    }
}
