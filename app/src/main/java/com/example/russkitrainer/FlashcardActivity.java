package com.example.russkitrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class FlashcardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_stress_flashcard);
        setText("знаки", "знаки", 2);

    }
     private void setText(String prompt, String word, int stressPosition){
        SpannableString spannableWord = new SpannableString(word);
        final TextView wordView = findViewById(R.id.wordView);
         ClickableSpan correctClickSpan = new ClickableSpan() {
             @Override
             public void onClick(View yourTextView) {
                 //what you want to do on click of it
                 wordView.setTextColor(Color.GREEN);
             }
         };
         ClickableSpan incorrectClickSpan = new ClickableSpan() {
             @Override
             public void onClick(View yourTextView) {
                 //what you want to do on click of it
                 wordView.setTextColor(Color.RED);
             }
         };

         spannableWord.setSpan(incorrectClickSpan, 0, stressPosition - 1, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
         spannableWord.setSpan(incorrectClickSpan, stressPosition + 1, spannableWord.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
         spannableWord.setSpan(correctClickSpan, stressPosition, stressPosition, Spanned.SPAN_INCLUSIVE_INCLUSIVE);

        wordView.setText(spannableWord);
        wordView.setMovementMethod(LinkMovementMethod.getInstance());
     }


}
