package com.example.reifenwechselapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

public class TerminBuchenKalender extends AppCompatActivity {

    public static final String TAG = " reifenwechselapp";

    private CalendarView mCalenderView;
    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termin_buchen_kalender);

        mCalenderView = (CalendarView) findViewById(R.id.calendarView);

        mCalenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i2 + "/" + (i1 +1) + "/" + i;

                Log.d(TAG, "onSelectedDayChange: dd/MM/YYYY: " + date);

                Intent nextPage = new Intent(TerminBuchenKalender.this, RegisterUser.class);
                nextPage.putExtra("date", date);
                startActivity(nextPage);
            }
        });
        confirmButton = (Button) findViewById(R.id.buttonBestätigen);

        confirmButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TerminBuchenKalender.this, RegisterUser.class);
                startActivity(intent);
            }
        });

    }
}
