package com.example.flutterapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    private TextView welcomeText;
    private Button winCertificateButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the fragment's layout
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Initialize views
        welcomeText = view.findViewById(R.id.welcome_text);
        winCertificateButton = view.findViewById(R.id.win_certificate_button);

        // Display user welcome message (this should be fetched dynamically)
        welcomeText.setText("Welcome, User!");

        // Set up Win Certificate button click listener
        winCertificateButton.setOnClickListener(v -> {
            // Open WinCertificateActivity
            startActivity(new Intent(getActivity(), WinCertificateActivity.class));
        });

        return view;
    }
}