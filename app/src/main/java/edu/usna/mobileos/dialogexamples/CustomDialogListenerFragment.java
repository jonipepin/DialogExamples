package edu.usna.mobileos.dialogexamples;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by pepin on 2/2/15.
 */
public class CustomDialogListenerFragment extends DialogFragment {


    CustomDialogListener myListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Dialog With Custom Listener");
        builder.setMessage("Sends data back to calling Activity");

        builder.setPositiveButton("Pos", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id) {
                myListener.onDialogPositiveClick(CustomDialogListenerFragment.this);
            }

        });

        builder.setNegativeButton("Neg", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id) {
                myListener.onDialogNegativeClick(CustomDialogListenerFragment.this);
            }

        });

        return builder.create();
    }

    public void onClick(DialogInterface dialog, int id) {

        String buttonName = "";

        switch (id) {
            case Dialog.BUTTON_NEGATIVE: buttonName = "Negative"; break;
            case Dialog.BUTTON_POSITIVE: buttonName = "Positive"; break;
        }

        Log.d("PEPIN", "You clicked the " + buttonName + " button");
    }

    // Override the Fragment.onAttach() method to instantiate the NoticeDialogListener
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            myListener = (CustomDialogListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement CustomDialogListener");
        }
    }
}
