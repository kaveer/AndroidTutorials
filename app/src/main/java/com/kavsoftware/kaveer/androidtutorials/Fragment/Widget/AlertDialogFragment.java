package com.kavsoftware.kaveer.androidtutorials.Fragment.Widget;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.kavsoftware.kaveer.androidtutorials.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlertDialogFragment extends Fragment {


    public AlertDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Alert Dialog");
        View view = inflater.inflate(R.layout.fragment_alert_dialog, container, false);

        Button button = view.findViewById(R.id.BtnAlertDialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage("Show alert dialog");
                builder.setTitle("Alert Dialog");

                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast messageBox = Toast.makeText(getActivity() , "OK", Toast.LENGTH_SHORT);
                        messageBox.show();
                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast messageBox = Toast.makeText(getActivity() , "Cancel", Toast.LENGTH_SHORT);
                        messageBox.show();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.setCancelable(false);
                dialog.show();
            }
        });
        return view;
    }

    private void AlertDialog() {

    }

}
