package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.Common;
import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Button");

        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_button, container, false);


        Button button   = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast messageBox = Toast.makeText(getActivity() , "Hello word" , Toast.LENGTH_LONG);
                messageBox.show();

            }
        });



        Button sourceCode   = view.findViewById(R.id.buttonSourceCode);
        sourceCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common common = new Common();

                if (common.isNetworkConnected(getActivity(), getContext())){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gist.github.com/kaveer/2a29ebbc7f867d93bd10eab8496078dc"));
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
