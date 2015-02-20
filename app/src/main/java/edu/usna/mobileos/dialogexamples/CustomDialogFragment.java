package edu.usna.mobileos.dialogexamples;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by pepin on 2/2/15.
 */
public class CustomDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    EditText inputET;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = LayoutInflater.from(getActivity());

        View layout = inflater.inflate(R.layout.custom_dialog, null);
        inputET = (EditText) layout.findViewById(R.id.inputET);

        builder.setView(layout);
        builder.setTitle("Custom Dialog: Enter Data")
                .setPositiveButton("OK", this)
                .setNegativeButton("Cancel", this);
        return builder.create();
    }

    public void onClick(DialogInterface dialog, int itemId) {

        if (itemId == Dialog.BUTTON_POSITIVE) {
            Log.d("PEPIN", "You entered " + inputET.getText());
        } else {
            Log.d("PEPIN", "You cancelled your input");
        }

        inputET.setText("");
    }
}
