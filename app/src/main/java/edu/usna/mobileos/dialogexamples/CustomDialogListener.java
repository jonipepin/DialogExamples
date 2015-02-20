package edu.usna.mobileos.dialogexamples;

import android.app.DialogFragment;

/**
 * Created by pepin on 2/19/15.
 */
public interface CustomDialogListener {

    public void onDialogPositiveClick(DialogFragment dialog);
    public void onDialogNegativeClick(DialogFragment dialog);
}
