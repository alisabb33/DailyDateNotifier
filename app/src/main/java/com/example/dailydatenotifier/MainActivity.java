package com.example.dailydatenotifier;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a TextView programmatically
        TextView textView = new TextView(this);
        textView.setTextSize(24);

        // Get today’s date
        String today = new SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.getDefault()).format(new Date());
        textView.setText("Today is: " + today);

        // Show on screen
        setContentView(textView);
    }
}
