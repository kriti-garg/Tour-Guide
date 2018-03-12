package com.kriti.patialatourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class InstitutesFragment extends Fragment {

    public InstitutesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_institutes, container, false);

        ArrayList<Location> infoList = new ArrayList<>();
        infoList.add(new Location(getString(R.string.instituteName1), getString(R.string.instituteAdd1)));
        infoList.add(new Location(getString(R.string.instituteName2), getString(R.string.instituteAdd2)));

        ListView list = v.findViewById(R.id.institutes);
        LocationAdapter adapter = new LocationAdapter(v.getContext(), infoList);
        list.setAdapter(adapter);

        return v;
    }
}
