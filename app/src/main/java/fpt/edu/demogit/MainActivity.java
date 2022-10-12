package fpt.edu.demogit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn, btn6, btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Android studio
        Toast.makeText(this, "Hello android studio", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello android studio1", Toast.LENGTH_SHORT).show();
        // phú sửa
        /// tú
        Toast.makeText(this, "Helo word", Toast.LENGTH_SHORT).show();

        // hello Hồ minh phú
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello my app", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Android nâng cao", Toast.LENGTH_SHORT).show();

            }
        });
        Toast.makeText(this, "CLick me", Toast.LENGTH_SHORT).show();

    }
}
