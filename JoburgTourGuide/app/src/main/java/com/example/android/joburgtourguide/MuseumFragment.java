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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        ArrayList<Attraction> topAttractions = new ArrayList<>();

        topAttractions.add(new Attraction("Apartheid Museum", "www.apartheidmuseum.org", R.drawable.apartheid_museum));
        topAttractions.add(new Attraction("Soweto & The Mandela Museum", "www.viator.com", R.drawable.soweto_and_the_mandela));
        topAttractions.add(new Attraction("The Landfield Victorian Museum", "www.landfield.wix.com", R.drawable.landfield));
        topAttractions.add(new Attraction("Museum of Military History", "www.ditsong.org.za/militaryhistory", R.drawable.military_history_museum));
        topAttractions.add(new Attraction("Wits Art Museum", "www.wits.co.za", R.drawable.wits_art));
        topAttractions.add(new Attraction("The Cradle of Humankind Day Trip", "www.viotor.com", R.drawable.cradle_of_human_kind));
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), topAttractions);

        ListView listView = rootView.findViewById(R.id.list);


        listView.setAdapter(itemsAdapter);

        return rootView;
    }


}
