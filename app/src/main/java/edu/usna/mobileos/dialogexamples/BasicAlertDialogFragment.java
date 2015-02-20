package edu.usna.mobileos.dialogexamples;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by pepin on 2/2/15.
 */
public class BasicAlertDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Basic Alert Dialog Title");
        builder.setIcon(R.drawable.cs_logo);
        builder.setMessage("Hello. This is the message body.");
        builder.setPositiveButton("Pos", this);
        builder.setNeutralButton("Neu", this);
        builder.setNegativeButton("Neg", this);
//    	builder.setCancelable(false);

        //Dot chaining is possible because Dialog methods return 'this'
//    	builder.setTitle("Alert Dialog Title")
//    		   .setIcon(R.drawable.icon)
//    	       .setMessage("Hello. This is the message body.")
//    	       .setPositiveButton("Pos", this)
//    	       .setNeutralButton("Neu", this)
//    	       .setNegativeButton("Neg", this)
//    	       .setCancelable(false);

        return builder.create();
    }

    public void onClick(DialogInterface dialog, int id) {

        String buttonName = "";

        switch (id) {
            case Dialog.BUTTON_NEGATIVE: buttonName = "Negative"; break;
            case Dialog.BUTTON_NEUTRAL:  buttonName = "Neutral"; break;
            case Dialog.BUTTON_POSITIVE: buttonName = "Positive"; break;
        }

        Log.d("PEPIN", "You clicked the " + buttonName + " button");
    }
}
