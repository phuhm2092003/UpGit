package fpt.edu.demogit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Android studio
        Toast.makeText(this, "Hello android studio", Toast.LENGTH_SHORT).show();
        // b comment
        // a comment
    }
}
