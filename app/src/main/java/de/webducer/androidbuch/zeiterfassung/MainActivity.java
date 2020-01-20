package de.webducer.androidbuch.zeiterfassung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText _startDateTime ;
    private EditText _endDateTime ;
    private Button _startCommand;
    private Button _endCommand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        _startDateTime = (EditText) findViewById(R.id.StartDateTime);
        _endDateTime   = (EditText) findViewById(R.id.EndDateTime);
        _startCommand  = (Button)   findViewById(R.id.StartCommand) ;
        _endCommand    = (Button)   findViewById((R.id.EndCommand));

        _startDateTime.setText(Calendar.getInstance().getTime().toString());

    }

    @Override
    protected void onResume() {
        super.onResume();
        _startCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Mainactivity","onClick für Start Button aufgerufen");
                Toast.makeText(MainActivity.this, "onClick aufgerufen für StartButton", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
