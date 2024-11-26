package com.example.flutterapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;

public class LoginPage extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText phoneNumberInput;
    private Button googleSignInButton, phoneSignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        // Initialize the UI elements
        phoneNumberInput = findViewById(R.id.phone_number_input);
        googleSignInButton = findViewById(R.id.google_sign_in_button);
        phoneSignInButton = findViewById(R.id.phone_sign_in_button);

        // Google sign-in logic
        googleSignInButton.setOnClickListener(v -> {
            // Trigger Google sign-in flow
            signInWithGoogle();
        });

        // Phone number sign-in logic
        phoneSignInButton.setOnClickListener(v -> {
            String phoneNumber = phoneNumberInput.getText().toString();
            signInWithPhone(phoneNumber);
        });
    }

    private void signInWithGoogle() {
        // Implement Google Sign-In logic (already provided in previous responses)
    }

    private void signInWithPhone(String phoneNumber) {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phoneNumber,
                60, // Timeout duration
                java.util.concurrent.TimeUnit.SECONDS,
                this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    @Override
                    public void onVerificationCompleted(PhoneAuthCredential credential) {
                        // Automatically sign-in if the verification is successful
                        mAuth.signInWithCredential(credential)
                                .addOnCompleteListener(task -> {
                                    if (task.isSuccessful()) {
                                        navigateToHomePage();
                                    }
                                });
                    }

                    @Override
                    public void onVerificationFailed(Exception e) {
                        // Handle verification failure
                    }
                });
    }

    private void navigateToHomePage() {
        // Navigate to HomePage after successful login
        startActivity(new Intent(LoginPage.this, HomePage.class));
        finish(); // Finish login activity to prevent going back to it
    }
}