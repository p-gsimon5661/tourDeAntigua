package com.example.android.tourdeantigua;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Custom> {
    private int bgColorResourceId;
    Context context;

    public CustomAdapter(Activity context, ArrayList<Custom> custom, int bgColorResourceId) {
        super(context, 0, custom);
        this.bgColorResourceId = bgColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.items, parent, false);
        }

        final Custom customElement = getItem(position);

        TextView descTextView = listItemView.findViewById(R.id.description);
        descTextView.setText(customElement.getDescription());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (customElement.hasImage()) {
            imageView.setImageResource(customElement.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else
            imageView.setVisibility(View.GONE);

        Button navBtn = listItemView.findViewById(R.id.nav_button);
        // Set a click listener on that button
        navBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = customElement.getGeo();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                if (intent.resolveActivity(getContext().getPackageManager()) != null)
                    getContext().startActivity(intent);
            }
        });

        Button moreInfoBtn = listItemView.findViewById(R.id.info_button);
        // Set a click listener on that button
        moreInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = customElement.getUrl();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                if (intent.resolveActivity(getContext().getPackageManager()) != null)
                    getContext().startActivity(intent);
            }
        });

        View textContianer = listItemView.findViewById(R.id.text_contianer);
        int color = ContextCompat.getColor(getContext(), bgColorResourceId);
        textContianer.setBackgroundColor(color);

        return listItemView;
    }
}
