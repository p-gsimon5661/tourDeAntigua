package com.example.android.tourdeantigua;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SitesFragment extends Fragment {
    public SitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.things_list, container, false);

        // Create a list item of resturants
        final ArrayList<Custom> customs = new ArrayList<>();
        customs.add(new Custom(R.string.sheights_desc, R.drawable.shirleyheights,
                getResources().getString(R.string.sheights_url),
                getResources().getString(R.string.sheights_geo)));
        customs.add(new Custom(R.string.devilsBridge_desc, R.drawable.devilsbridge,
                getResources().getString(R.string.devilsBridge_url),
                getResources().getString(R.string.devilsBridge_geo)));
        customs.add(new Custom(R.string.eharbour_desc, R.drawable.englishharbour,
                getResources().getString(R.string.eharbour_url),
                getResources().getString(R.string.eharbour_geo)));
        customs.add(new Custom(R.string.fBird_desc, R.drawable.frigatebirdsanctuary,
                getResources().getString(R.string.fBird_url),
                getResources().getString(R.string.fBird_geo)));

        // Create an {@link CustomAdapter}, whose data source is a list of {@link Custom}s. The
        // adapter knows how to create list items for each item in the list.
        CustomAdapter adapter = new CustomAdapter(getActivity(), customs, R.color.sites_color);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // things_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CustomAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
