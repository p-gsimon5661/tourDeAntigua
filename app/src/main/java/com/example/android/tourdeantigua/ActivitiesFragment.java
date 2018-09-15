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
public class ActivitiesFragment extends Fragment {
    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.things_list, container, false);

        // Create a list item of resturants
        final ArrayList<Custom> customs = new ArrayList<>();
        customs.add(new Custom(R.string.zipLine_desc, R.drawable.zipline,
                getResources().getString(R.string.zipLine_url),
                getResources().getString(R.string.zipLine_geo)));
        customs.add(new Custom(R.string.dowHill_desc, R.drawable.dowhill,
                getResources().getString(R.string.dowHill_url),
                getResources().getString(R.string.dowHill_geo)));
        customs.add(new Custom(R.string.donkey_desc, R.drawable.donkey,
                getResources().getString(R.string.donkey_url),
                getResources().getString(R.string.donkey_geo)));
        customs.add(new Custom(R.string.bcave_desc, R.drawable.barbudacaves,
                getResources().getString(R.string.bcave_url),
                getResources().getString(R.string.bcave_geo)));

        // Create an {@link CustomAdapter}, whose data source is a list of {@link Custom}s. The
        // adapter knows how to create list items for each item in the list.
        CustomAdapter adapter = new CustomAdapter(getActivity(), customs, R.color.todo_color);

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
