package com.example.android.joburgtourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        ArrayList<Attraction> topAttractions = new ArrayList<>();

        topAttractions.add(new Attraction("Fusionista Restaurant", "www.fusion.com", R.drawable.fusionista_res));
        topAttractions.add(new Attraction("Nikos Sandton Alice", "www.nikossandton.com", R.drawable.nikos_sandton_res));
        topAttractions.add(new Attraction("Saigon Suzy Parkwood", "www.saigonpark.com", R.drawable.saigon_suzy));
        topAttractions.add(new Attraction("Lucky Bean Restaurant", "www.luckybeanres.com", R.drawable.lucky_bean));
        topAttractions.add(new Attraction("Marble Restaurant", "www.marble.com", R.drawable.marble_res));
        topAttractions.add(new Attraction("View", "www.view.com", R.drawable.view_res));
        topAttractions.add(new Attraction("Pablo Eggs-Go-Bar", "www.pabloeggsobar.co.za", R.drawable.pablo_eggs));
        topAttractions.add(new Attraction("Mazepoli Restaurant Melrose Arch", "www.mazepoliresmelrose.co.za", R.drawable.mazepoli_res));
        topAttractions.add(new Attraction("Little Addis Cafe", "www.littleaddis.com", R.drawable.little_addis));
        topAttractions.add(new Attraction("Jamie's Italian", "www.jsmieitsliano.org", R.drawable.jamies_italian));
        topAttractions.add(new Attraction("Level Four Restaurant", "www.levelfourres.co.za", R.drawable.level_four_res));
        topAttractions.add(new Attraction("Flames", "www.flamesgrillo.com", R.drawable.flames));
        topAttractions.add(new Attraction("Olives and Plates", "www.olivesplates.com", R.drawable.olives_plates));
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), topAttractions);

        ListView listView = rootView.findViewById(R.id.list);


        listView.setAdapter(itemsAdapter);
        return rootView;
    }


}
