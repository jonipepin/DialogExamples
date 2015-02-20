package edu.usna.mobileos.dialogexamples;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by pepin on 2/2/15.
 */
public class TimePickerDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Calendar c = Calendar.getInstance(); //current date and time

        TimePickerDialog timeDlg = new TimePickerDialog(getActivity(), this,
                c.get(Calendar.HOUR_OF_DAY),
                c.get(Calendar.MINUTE),
                false);

        return timeDlg;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        //The method onTimeSet is called once even if the back key is pressed,
        // and is called twice if ‘Done’ is selected.  This is a known issue!

        Log.d("PEPIN", "Time Selected: " + hourOfDay + ":" + minute);
    }
}
