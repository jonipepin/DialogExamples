package edu.usna.mobileos.dialogexamples;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener, CustomDialogListener {

    Button button1, button2, button3, button4, button5, button6, button7, button8;
    TextView messageArea;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        messageArea = (TextView) findViewById(R.id.messageText);

        button1 = (Button) findViewById(R.id.showAlertBtn1);
        button2 = (Button) findViewById(R.id.showAlertBtn2);
        button3 = (Button) findViewById(R.id.showAlertBtn3);
        button4 = (Button) findViewById(R.id.showAlertBtn4);
        button5 = (Button) findViewById(R.id.showAlertBtn5);
        button6 = (Button) findViewById(R.id.showAlertBtn6);
        button7 = (Button) findViewById(R.id.showAlertBtn7);
        button8 = (Button) findViewById(R.id.showAlertBtn8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
    }

    //------------- Event Handlers ----------------------------//

    public void onClick(View view) {

        if(view == button1) {
            BasicAlertDialogFragment dialog = new BasicAlertDialogFragment();
            dialog.show(getFragmentManager(), "BasicAlertDialogFragment");
        } else if(view == button2) {
            RadioButtonDialogFragment dialog2 = new RadioButtonDialogFragment();
            dialog2.show(getFragmentManager(), "RadioButtonDialogFragment");
        } else if(view == button3) {
            CheckBoxDialogFragment dialog3 = new CheckBoxDialogFragment();
            dialog3.show(getFragmentManager(), "CheckBoxDialogFragment");
        } else if(view == button4) {
            ListDialogFragment dialog4 = new ListDialogFragment();
            dialog4.show(getFragmentManager(), "ListDialogFragment");
        } else if(view == button5) {
            CustomDialogFragment dialog5 = new CustomDialogFragment();
            dialog5.show(getFragmentManager(), "CustomDialogFragment");
        } else if(view == button6) {
            DatePickerDialogFragment dialog6 = new DatePickerDialogFragment();
            dialog6.show(getFragmentManager(), "DatePickerDialogFragment");
        } else if(view == button7) {
            TimePickerDialogFragment dialog7 = new TimePickerDialogFragment();
            dialog7.show(getFragmentManager(), "TimePickerDialogFragment");
        } else if(view == button8) {
            CustomDialogListenerFragment dialog8 = new CustomDialogListenerFragment();
            dialog8.show(getFragmentManager(), "CustomDialogListenerFragment");
        }
    }


    // Custom Dialog Listener Methods
    public void onDialogPositiveClick(DialogFragment dialog){
        Log.d("PEPIN", "Custom positive button");
        messageArea.setText("Custom Positive Button Clicked!");
    }

    public void onDialogNegativeClick(DialogFragment dialog){
        Log.d("PEPIN", "Custom negative button");
        messageArea.setText("");
    }


}
