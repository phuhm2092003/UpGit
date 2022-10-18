package fpt.edu.demogit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Android", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello Android2", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello Android3", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello Android4", Toast.LENGTH_SHORT).show();
                Intent intent = getIntent();
                Toast.makeText(MainActivity.this, "Hello Android5", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello Android5", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello Android6", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello Android6", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello Android7", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
