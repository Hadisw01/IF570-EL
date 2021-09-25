package id.ac.umn.week04b_34659;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnChange1, btnChange2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChange1 = findViewById(R.id.main_button_change_1);
        btnChange2 = findViewById(R.id.main_button_change_2);

        btnChange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intentDua);
            }
        });

        btnChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTiga = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intentTiga);
            }
        });
    }
}
