package com.example.flutterapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WinCertificateActivity extends AppCompatActivity {

    private int timeRemaining = 30;
    private EditText answerInput;
    private TextView timerView;
    private Button submitButton;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_certificate);

        // Initialize views
        answerInput = findViewById(R.id.answer_input);
        timerView = findViewById(R.id.timer_view);
        submitButton = findViewById(R.id.submit_button);

        // Start the countdown timer
        startTimer();

        // Submit button functionality
        submitButton.setOnClickListener(v -> {
            // Handle answer submission (e.g., store answer or show confirmation)
            String answer = answerInput.getText().toString();
            // Process the answer (you can save it or show a success message)
        });
    }

    // Start countdown timer
    private void startTimer() {
        countDownTimer = new CountDownTimer(timeRemaining * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeRemaining--;
                timerView.setText("Time remaining: " + timeRemaining + " seconds");
            }

            @Override
            public void onFinish() {
                timerView.setText("Time's up!");
                answerInput.setEnabled(false); // Disable input after time's up
                submitButton.setVisibility(View.VISIBLE); // Show submit button
            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Stop the timer when the activity is destroyed
        countDownTimer.cancel();
    }
}