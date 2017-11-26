package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToggleButtonFragment extends Fragment {


    public ToggleButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Toggle Button");

        View view = inflater.inflate(R.layout.fragment_toggle_button, container, false);

        ToggleButton button = view.findViewById(R.id.toggleButton);

        if (button.isChecked()){
            Toast messageBox = Toast.makeText(getActivity() , "on" , Toast.LENGTH_SHORT);
            messageBox.show();
        }else {
            Toast messageBox = Toast.makeText(getActivity() , "off" , Toast.LENGTH_SHORT);
            messageBox.show();
        }

        return view;
    }

}
