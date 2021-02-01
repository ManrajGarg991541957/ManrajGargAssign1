/*
Manraj Garg s991541957
This is assignment 1 to demonstrate the use of activities and how to invoke 3rd party app
 */
package manraj.garg.s991541957;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GargActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garg);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ManrajActivity.msg);
        TextView textView = findViewById(R.id.displayText);
        textView.setText(message);
    }
}