package com.example.kotchaphan.snackbar;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
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
//        Snackbar.make(coordinatorLayut, "Hello SnackBar", Snackbar.LENGTH_LONG)
//                .setAction("undo", clickListener)
//                .show();

        //  Snackbar.make(coordinatorLayut, Html.fromHtml("Add <b>bold</b> to Snackbar text"), Snackbar.LENGTH_LONG).show();

        SpannableStringBuilder snackBarText = new SpannableStringBuilder();
        snackBarText.append("Add ");
        int bold = snackBarText.length();
        snackBarText.append("bold color");
        snackBarText.setSpan(new ForegroundColorSpan(0xFFFF0000)
                , bold, snackBarText.length()
                , Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        snackBarText.setSpan(new StyleSpan(Typeface.BOLD)
                , bold, snackBarText.length()
                , Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        snackBarText.append(" to SnackBar Text");

        Snackbar.make(coordinatorLayut , snackBarText , Snackbar.LENGTH_LONG)
                .setAction("Reply" , clickListener)
                .show();

    }

}
