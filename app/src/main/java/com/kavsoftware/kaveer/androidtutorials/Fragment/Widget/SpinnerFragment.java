package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.R;

public class SpinnerFragment extends Fragment {

    String result = "";
    Spinner spinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getActivity().setTitle("Spinner");

        final View view = inflater.inflate(R.layout.fragment_spinner, container, false);




        Button button   = view.findViewById(R.id.BtnCheckSpinner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                spinner = view.findViewById(R.id.spinner);

                result = spinner.getSelectedItem().toString();
                Toast messageBox = Toast.makeText(getActivity() , result , Toast.LENGTH_LONG);
                messageBox.show();

            }
        });


        return view;
    }
}
