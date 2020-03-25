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
public class ParkFragment extends Fragment {

    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        ArrayList<Attraction> topAttractions = new ArrayList<>();

        topAttractions.add(new Attraction("Gold Reef City", "www.goldreefcity.co.za", R.drawable.goldreef));
        topAttractions.add(new Attraction("Lion & Safari Park Day Trip", "www.lionandsafari.co.za", R.drawable.lion_and_safari));
        topAttractions.add(new Attraction("Pilanesberg National Park", "www.pilanesberg.com", R.drawable.pilanesburg_national_park));
        topAttractions.add(new Attraction("Joubert Park", "www.joburgcityparks.co.za", R.drawable.joubert_park));
        topAttractions.add(new Attraction("End Street North Park", "www.joburgcityparks.co.za", R.drawable.end_street_park));
        topAttractions.add(new Attraction("The Wilds Municipal Nature Reserve", "www.joburgcityparks.co.za", R.drawable.wilds_municipal));
        topAttractions.add(new Attraction("Bezuidenhout Park", "www.joburgcityparks.co.za", R.drawable.bezuiden_park));
        topAttractions.add(new Attraction("Ernest Oppenheimer Park", "www.joburgcityparks.co.za", R.drawable.ernest_oppenheimer_park));
        topAttractions.add(new Attraction("Rhodes", "www.joburgcityparks.co.za", R.drawable.rhodes));
        topAttractions.add(new Attraction("David Webster Park", "www.joburgcityparks.co.za", R.drawable.david_webstar_park));
        topAttractions.add(new Attraction("James & Ethel Gray Park", "www.joburgcityparks.co.za", R.drawable.james_and_ethel_park));
        topAttractions.add(new Attraction("Lovers Park", "www.joburgcityparks.co.za", R.drawable.lovers_park));
        topAttractions.add(new Attraction("Zoo Lake", "www.joburgcityparks.co.za", R.drawable.zoolake));
        AttractionAdapter itemsAdapter = new AttractionAdapter(getActivity(), topAttractions);

        ListView listView = rootView.findViewById(R.id.list);


        listView.setAdapter(itemsAdapter);
        return rootView;
    }


}