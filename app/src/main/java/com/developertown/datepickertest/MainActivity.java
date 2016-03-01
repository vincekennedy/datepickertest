package com.developertown.datepickertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_picker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                DatePickerDialog dpd = DatePickerDialog.newInstance(dateSetListener,
                                                                    2016,
                                                                    3,
                                                                    1);
                dpd.setOkText("Select");
                dpd.setThemeDark(true);
                dpd.setAccentColor(0x46A4C3);
                dpd.setCancelText("Cancel");
                dpd.show(getFragmentManager(), dpd.getTag());
            }
        });
    }


    DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(final DatePickerDialog view,
                              final int year,
                              final int monthOfYear,
                              final int dayOfMonth) {
           Log.e("TAG", "Date");
        }
    };
}
