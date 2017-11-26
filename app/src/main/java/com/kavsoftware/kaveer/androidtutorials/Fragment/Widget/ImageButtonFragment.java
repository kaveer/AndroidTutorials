package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageButtonFragment extends Fragment {


    public ImageButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Image button");

        View view  = inflater.inflate(R.layout.fragment_image_button, container, false);

        ImageButton button   = view.findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast messageBox = Toast.makeText(getActivity() , "Hello word" , Toast.LENGTH_LONG);
                messageBox.show();

            }
        });


        return view;
    }

}
