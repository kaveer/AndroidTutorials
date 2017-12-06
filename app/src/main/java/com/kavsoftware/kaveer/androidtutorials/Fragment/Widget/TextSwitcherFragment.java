package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TextSwitcherFragment extends Fragment {
    TextSwitcher text;
    Button button;
    int stringIndex;
    String[] row = {"one", "two", "three", "four"};
    TextView textView;

    public TextSwitcherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       getActivity().setTitle("Text Switcher");

       View view = inflater.inflate(R.layout.fragment_text_switcher, container, false);

        text = view.findViewById(R.id.textSwitcher);

       button = view.findViewById(R.id.BtnTextSwitcher);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                if (stringIndex == row.length -1){
                    stringIndex = 0;
                    text.setText(row[stringIndex]);
                }
                else {
                    text.setText(row[++stringIndex]);
                }
           }
       });

       text.setFactory(new ViewSwitcher.ViewFactory() {
           @Override
           public View makeView() {
               textView = new TextView(getActivity());
               textView.setTextColor(Color.BLACK);
               textView.setTextSize(60);
               textView.setGravity(Gravity.CENTER_HORIZONTAL);
               return  textView;
           }
       });

       text.setText(row[stringIndex]);

        return view;
    }

}
