package com.example.android.joburgtourguide;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> Attraction ){
        super(context,0,Attraction);
    }

    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listView = convertView;
        if(listView == null) {

            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        final Attraction currentAttraction = getItem(position);

        TextView attractionName = (TextView) listView.findViewById(R.id.attraction_name_text_view);
        attractionName.setText(currentAttraction.getmAttractionName());

        final TextView website = (TextView) listView.findViewById(R.id.website_text_view);
        website.setText(currentAttraction.getmWebsite());
        //TODO: make the link clickable
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://" + currentAttraction.getmWebsite()));
                view.getContext().startActivity(intent);
            }
        });

        ImageView attractionImage = (ImageView) listView.findViewById(R.id.attractionImage);
        attractionImage.setImageResource(currentAttraction.getmImageResourceId());



        return listView;
    }
    private void setonClick(final TextView tv, final String link){
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(link));
                view.getContext().startActivity(intent);
            }
        });
    }
}
