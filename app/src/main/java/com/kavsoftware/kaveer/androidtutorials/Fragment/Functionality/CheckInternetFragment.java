package com.kavsoftware.kaveer.androidtutorials.Fragment.Functionality;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kavsoftware.kaveer.androidtutorials.Common;
import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CheckInternetFragment extends Fragment {


    public CheckInternetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Check internet connection");
        View view = inflater.inflate(R.layout.fragment_check_internet, container, false);

        Button button   = view.findViewById(R.id.BtnCheckInternet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common common = new Common();

                if(common.isNetworkConnected(getActivity(), getContext())){
                    common.DisplayToastFromFragment(getActivity(), "Connected to internet");
                }
                else {
                    common.DisplayToastFromFragment(getActivity(), "No internet connection");
                }


            }
        });

        Button buttonSourceCode   = view.findViewById(R.id.BtnCheckInernetSourceCode);
        buttonSourceCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common common = new Common();

                if(common.isNetworkConnected(getActivity(), getContext())){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gist.github.com/kaveer/b9f150f3219c751e5a4746c3bc1c6f24"));
                    startActivity(browserIntent);
                }
                else {
                    common.DisplayToastFromFragment(getActivity(), "No internet connection");
                }


            }
        });

        return view;
    }

}
