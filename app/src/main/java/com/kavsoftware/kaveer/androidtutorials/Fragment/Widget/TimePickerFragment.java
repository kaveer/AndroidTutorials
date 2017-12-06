package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends Fragment {

    TimePicker time;

    public TimePickerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Time Picker");

        View view = inflater.inflate(R.layout.fragment_time_picker, container, false);

        time = view.findViewById(R.id.timePicker);

        Button button = view.findViewById(R.id.BtnTimePicker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int hour = time.getCurrentHour();
                int minute = time.getCurrentMinute();

                Toast messageBox = Toast.makeText(getActivity() , hour + ":" + minute, Toast.LENGTH_SHORT);
                messageBox.show();
            }
        });

        return view;
    }

}
