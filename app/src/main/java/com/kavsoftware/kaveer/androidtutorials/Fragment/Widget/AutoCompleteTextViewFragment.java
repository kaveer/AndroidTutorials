package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutoCompleteTextViewFragment extends Fragment {

    AutoCompleteTextView auto;

    public AutoCompleteTextViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Auto complete");

        View view = inflater.inflate(R.layout.fragment_auto_complete_text_view, container, false);

        auto = view.findViewById(R.id.autoCompleteTextView);
        String[] months = getResources().getStringArray(R.array.month);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_list_item_1, months);

        auto.setAdapter(adapter);



        return view;
    }

}
