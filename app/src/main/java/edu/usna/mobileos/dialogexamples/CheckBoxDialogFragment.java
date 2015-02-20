package edu.usna.mobileos.dialogexamples;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by pepin on 2/2/15.
 */
public class CheckBoxDialogFragment extends DialogFragment
        implements DialogInterface.OnMultiChoiceClickListener, DialogInterface.OnClickListener {

    String[] choice = new String[ ] {"One", "Two", "Three", "Four", "Five", "Six"};

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Checkbox Dialog: Select Many")
                .setMultiChoiceItems(choice, null, this)
                .setPositiveButton("OK", this)
                .setNegativeButton("Cancel", this);

        return builder.create();
    }

    // Single Button Listener
    public void onClick(DialogInterface dialog, int id) {

        String buttonName = "";

        switch (id) {
            case Dialog.BUTTON_NEGATIVE: buttonName = "Negative"; break;
            case Dialog.BUTTON_POSITIVE: buttonName = "Positive"; break;
        }

        Log.d("PEPIN", "You clicked the " + buttonName + " button");
    }

    // MultiChoice Item Listener
    @Override
    public void onClick(DialogInterface dialog, int itemId, boolean isChecked) {

        Log.d("PEPIN", "Checkbox " + itemId + " " + isChecked);
    }
}
