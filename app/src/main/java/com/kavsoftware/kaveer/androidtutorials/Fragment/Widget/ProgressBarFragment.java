package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.kavsoftware.kaveer.androidtutorials.R;

public class ProgressBarFragment extends Fragment {
    ProgressBar bar;
    int count = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Progress Bar");

        View view = inflater.inflate(R.layout.fragment_progress_bar, container, false);

        bar = view.findViewById(R.id.progressBar);
        bar.setMax(100);

        Button button = view.findViewById(R.id.BtnProgressBar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bar.setProgress(count += 10);
            }
        });



        return view;
    }
}
