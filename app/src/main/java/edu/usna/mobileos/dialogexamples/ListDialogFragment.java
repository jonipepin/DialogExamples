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
public class ListDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    String[] choice = new String[ ] {"One", "Two", "Three", "Four", "Five", "Six"};

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("List Dialog: Select One")
                .setItems(choice, this);

        return builder.create();
    }

    public void onClick(DialogInterface dialog, int itemId) {

        Log.d("PEPIN", "You selected item " + itemId);
    }
}
