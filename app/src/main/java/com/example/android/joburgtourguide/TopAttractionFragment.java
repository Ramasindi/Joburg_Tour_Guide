package com.example.android.joburgtourguide;

import android.content.Context;
import android.net.Uri;
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
public class TopAttractionFragment extends Fragment {

    public TopAttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        ArrayList<Attraction> topAttractions = new ArrayList<>();

        topAttractions.add(new Attraction("Gold Reef City", "www.tsogosun.com/gold-reef-city-casino", R.drawable.gold_reef_city));
        topAttractions.add(new Attraction("Apartheid Museum", "www.apartheidmuseum.org", R.drawable.apartheid_museum));
        topAttractions.add(new Attraction("Constitution Hill", "www.constitutionhill.org.za", R.drawable.constitution_hill));
        topAttractions.add(new Attraction("Soweto & The Mandela Museum", "www.viator.com", R.drawable.soweto_and_the_mandela));
        topAttractions.add(new Attraction("The Maboneng Precinct", "www.planetwire.com", R.drawable.maboneng_precinct));
        topAttractions.add(new Attraction("Lion & Safari Park Day Trip", "www.lionandsafaripark.com", R.drawable.lion_and_safari));
        topAttractions.add(new Attraction("The Cradle of Humankind Day Trip", "www.viotor.com", R.drawable.cradle_of_human_kind));
        topAttractions.add(new Attraction("Pilanesberg National Park", "www.pilanesburg.org", R.drawable.pilanesburg_national_park));
        topAttractions.add(new Attraction("Day Trip to Pretoria", "www.viotor.com", R.drawable.trip_to_pretoria));
        topAttractions.add(new Attraction("Walter Sisulu National Botanical Gardens", "www.sanbi.org/gardens/walter-sisulu", R.drawable.walter_sisulu_botanical_gardens));
        topAttractions.add(new Attraction("The Landfield Victorian Museum", "www.landfield.wix.com", R.drawable.landfield));
        topAttractions.add(new Attraction("Museum of Military History", "www.ditsong.org.za/militaryhistory", R.drawable.military_history_museum));
        topAttractions.add(new Attraction("Wits Art Museum", "www.wits.co.za", R.drawable.wits_art));
        topAttractions.add(new Attraction("Market Theatre", "www.markettheatre.co.za", R.drawable.market_theatre));
        topAttractions.add(new Attraction("Montecasino", "www.montecasino.org.za", R.drawable.montecasino));
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), topAttractions);

        ListView listView = rootView.findViewById(R.id.list);


        listView.setAdapter(itemsAdapter);
        return rootView;
    }


}
