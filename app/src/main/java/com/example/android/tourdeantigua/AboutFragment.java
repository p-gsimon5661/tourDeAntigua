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
public class AboutFragment extends Fragment {
    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.things_list, container, false);

        // Create a list item about my home nation
        final ArrayList<Custom> customs = new ArrayList<>();
        customs.add(new Custom(R.string.antigua_desc, R.drawable.antigua,
                getResources().getString(R.string.anu_url),
                getResources().getString(R.string.anu_geo)));
        customs.add(new Custom(R.string.barbuda_desc, R.drawable.barbuda,
                getResources().getString(R.string.brd_url),
                getResources().getString(R.string.brd_geo)));

        // Create an {@link CustomAdapter}, whose data source is a list of {@link Custom}s. The
        // adapter knows how to create list items for each item in the list.
        CustomAdapter adapter = new CustomAdapter(getActivity(), customs, R.color.about_color);

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
