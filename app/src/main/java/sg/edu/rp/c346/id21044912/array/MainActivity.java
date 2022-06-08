package sg.edu.rp.c346.id21044912.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        tv = findViewById(R.id.textView);

        StringBuilder text = new StringBuilder("Fruits\n");
        text.append("=====\n");

        for (String fruit : fruits) {
            text.append(fruit).append("\n");
        }

        tv.setText(text.toString());
    }
}