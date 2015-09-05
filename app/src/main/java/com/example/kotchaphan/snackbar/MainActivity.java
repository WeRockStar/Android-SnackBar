package com.example.kotchaphan.snackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        final View coordinatorLayut = findViewById(R.id.snackbarPossition);
        Snackbar.make(coordinatorLayut, "Hello SnackBar", Snackbar.LENGTH_LONG)
                .setAction("undo", clickListener)
                .show();
    }

}
