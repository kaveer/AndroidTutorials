package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends Fragment {

    DatePicker datePicker;

    public DatePickerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       getActivity().setTitle("Date picker");

       View view = inflater.inflate(R.layout.fragment_date_picker, container, false);


        datePicker = view.findViewById(R.id.datePicker);


        Button button = view.findViewById(R.id.BtnDatePicker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();

                Toast messageBox = Toast.makeText(getActivity() , year + "-" + month + "-" + day, Toast.LENGTH_SHORT);
                messageBox.show();
            }
        });


       return view;
    }

}
