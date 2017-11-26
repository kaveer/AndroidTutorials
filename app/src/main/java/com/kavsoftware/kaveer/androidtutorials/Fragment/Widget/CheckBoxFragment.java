package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CheckBoxFragment extends Fragment {

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;


    public CheckBoxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("CheckBox");
        View view = inflater.inflate(R.layout.fragment_check_box, container, false);

       checkBox1 = view.findViewById(R.id.checkBox);
       checkBox2 = view.findViewById(R.id.checkBox2);
       checkBox3 = view.findViewById(R.id.checkBox3);

        Button button   = view.findViewById(R.id.BtnCheckBox);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox1.isChecked()) {
                    Toast messageBox = Toast.makeText(getActivity(), "Checkbox 1 checked", Toast.LENGTH_LONG);
                    messageBox.show();
                }

                if (checkBox2.isChecked()){
                    Toast messageBox = Toast.makeText(getActivity(), "Checkbox 2 checked", Toast.LENGTH_LONG);
                    messageBox.show();
                }

                if (checkBox3.isChecked()){
                    Toast messageBox = Toast.makeText(getActivity(), "Checkbox 3 checked", Toast.LENGTH_LONG);
                    messageBox.show();
                }

            }
        });


        return view;
    }

}
