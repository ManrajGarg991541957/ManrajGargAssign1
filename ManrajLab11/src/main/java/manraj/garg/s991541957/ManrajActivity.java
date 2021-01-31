/*
Manraj Garg s991541957
This is assignment 1 to demonstrate the use of activities and how to invoke 3rd party app
 */
package manraj.garg.s991541957;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ManrajActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callIntent(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnBrowser:

                Context context = getApplicationContext();
                CharSequence text = getString(R.string.toast_label);
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.ca"));
                startActivity(intent);
                break;
            case R.id.btnActivity:

                Snackbar.make(view, "The First SnackBar Button was clicked.", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

                intent = new Intent(this, GargActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}