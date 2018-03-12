package com.kriti.patialatourguide;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kriti.patialatourguide.Location;
import com.kriti.patialatourguide.LocationAdapter;
import com.kriti.patialatourguide.R;

import java.util.ArrayList;
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_sights, container, false);

        ArrayList<Location> infoList = new ArrayList<Location>();
        infoList.add(new Location(getString(R.string.sightName1),getString(R.string.sightAdd1)));
        infoList.add(new Location(getString(R.string.sightName2),getString(R.string.sightAdd2)));

        ListView list = v.findViewById(R.id.dine_and_rest);
        LocationAdapter adapter = new LocationAdapter(v.getContext(),infoList);
        list.setAdapter(adapter);

        return v;
    }
}
