package com.kriti.patialatourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_historical, container, false);

        ArrayList<Location> infoList = new ArrayList<>();
        infoList.add(new Location(getString(R.string.historicalName1), getString(R.string.historicalAdd1)));
        infoList.add(new Location(getString(R.string.historicalName2), getString(R.string.historicalAdd2)));


        ListView list = v.findViewById(R.id.Historical);
        LocationAdapter adapter = new LocationAdapter(v.getContext(), infoList);
        list.setAdapter(adapter);

        return v;
    }
}
