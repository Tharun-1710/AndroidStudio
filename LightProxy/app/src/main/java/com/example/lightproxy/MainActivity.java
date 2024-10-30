package com.example.lightproxy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    TextView tv1,tv2;
    SensorManager sensorManager;
    Sensor sensor1,sensor2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv1=(TextView) findViewById(R.id.T1);
        tv2=(TextView) findViewById(R.id.T2);
        sensorManager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor1=sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        sensor2=sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_PRESSURE))
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}