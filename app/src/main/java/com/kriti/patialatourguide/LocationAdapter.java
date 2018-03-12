package com.kriti.patialatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kriti.patialatourguide.Location;
import com.kriti.patialatourguide.R;

import java.util.List;

class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Context context, List<Location> locationInfo) {
        super(context, 0, locationInfo);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        Location posItem = getItem(position);
        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }
        TextView heading = view.findViewById(R.id.heading);
        ImageView image = view.findViewById(R.id.imageId);
        TextView info = view.findViewById(R.id.info);
        assert posItem != null;
        if (posItem.hasImage()) {

            image.setImageResource(posItem.getImageResId());
            image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            image.setVisibility(View.GONE);
        }

        heading.setText(posItem.getHeading());
        info.setText(posItem.getInfo());

        return view;
    }
}
