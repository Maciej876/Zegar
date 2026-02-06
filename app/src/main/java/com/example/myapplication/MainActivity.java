package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button button;
    TimePicker timePicker;
    DatePicker dataPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        timePicker = findViewById(R.id.czas);
        dataPicker = findViewById(R.id.data);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int godzina = timePicker.getHour();
                        int minuta = timePicker.getMinute();
                        int rok = dataPicker.getYear();
                        Toast.makeText(MainActivity.this, "godzina: "+godzina+" minuta: "+minuta+" rok: "+rok, Toast.LENGTH_SHORT).show();
                        Date data = new Date();
                        Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(Calendar.YEAR, dataPicker.getYear());
                        calendar.set(Calendar.MINUTE, dataPicker.getYear());
                        Toast.makeText(MainActivity.this, ""+calendar.get(Calendar.YEAR), Toast.LENGTH_SHORT).show();
                    }
                }
        );
        });
    }
}