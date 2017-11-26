package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RadioButtonFragment extends Fragment {
    Button checkButton;
    RadioGroup group;

    public RadioButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Radio button");
        View view = inflater.inflate(R.layout.fragment_radio_button, container, false);

        group = view.findViewById(R.id.radioGroup);


        checkButton = view.findViewById(R.id.BtnSelectedRadio);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioButtonID = group.getCheckedRadioButtonId();
                View radioButton = group.findViewById(radioButtonID);
                int idx = group.indexOfChild(radioButton);

                Toast messageBox = Toast.makeText(getActivity() , String.valueOf(idx) , Toast.LENGTH_SHORT);
                messageBox.show();

            }
        });

        return view;
    }

}
