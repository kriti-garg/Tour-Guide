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
public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_food, container, false);

        ArrayList<Location> infoList = new ArrayList<>();
        infoList.add(new Location(getString(R.string.foodName1),R.drawable.barbeque,getString(R.string.foodAdd1)));
        infoList.add(new Location(getString(R.string.foodName2),R.drawable.orange,getString(R.string.foodAdd2)));

        ListView list = v.findViewById(R.id.food);
        LocationAdapter adapter = new LocationAdapter(v.getContext(),infoList);
        list.setAdapter(adapter);

        return v;
    }
}
