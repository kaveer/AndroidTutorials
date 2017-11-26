package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RatingBarFragment extends Fragment {


    public RatingBarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Rating bar");

        View view = inflater.inflate(R.layout.fragment_rating_bar, container, false);


        final RatingBar rating = view.findViewById(R.id.ratingBar2);
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast messageBox = Toast.makeText(getActivity() , String.valueOf(rating.getRating()) , Toast.LENGTH_SHORT);
                messageBox.show();


            }
        });
        return view;
    }

}
