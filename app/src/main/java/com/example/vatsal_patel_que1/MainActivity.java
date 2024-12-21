package com.example.vatsal_patel_que1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FrameLayout box;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        box = findViewById(R.id.box);

        Button btnUp = findViewById(R.id.upBtn);
        Button btnDown = findViewById(R.id.downBtn);
        Button btnLeft = findViewById(R.id.leftBtn);
        Button btnRight = findViewById(R.id.rightBtn);

        btnUp.setOnClickListener(v -> animateBox(0, -300));
        btnDown.setOnClickListener(v -> animateBox(0, 300));
        btnLeft.setOnClickListener(v -> animateBox(-300, 0));
        btnRight.setOnClickListener(v -> animateBox(300, 0));
    }
    private void animateBox(float toXDelta, float toYDelta) {

        box.animate().translationXBy(toXDelta).translationYBy(toYDelta).rotationYBy(360).setDuration(1000).start();
    }
}
