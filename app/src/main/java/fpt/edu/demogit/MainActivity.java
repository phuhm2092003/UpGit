package fpt.edu.demogit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Task1", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Task2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Task3", Toast.LENGTH_SHORT).show();
    }
}
