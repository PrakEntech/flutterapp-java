# Firebase Authentication App

A simple Android app developed using Java that supports **Google Sign-In** and **Phone Number Authentication** via Firebase. This app also includes a **Profile Tab** where users can manage their profile and win a certificate after answering a question within 30 seconds.

## Features

- **Google Sign-In**: Users can log in with their Google account using Firebase Authentication.
- **Phone Number Authentication**: Users can log in via their phone number using Firebase Phone Authentication and OTP (One Time Password).
- **Profile Tab**: Displays the user’s profile information and a **“Win Certificate”** button.
- **Win Certificate**: After clicking the **“Win Certificate”** button, a timer starts, and the user is asked to answer a question within 30 seconds. The user must submit the answer within the time limit.
- **Navigation**: After login, users are directed to the HomePage with a bottom navigation bar that includes **Profile**, **Chat**, **Certificate**, and **Score** tabs.

## Project Structure

1. **MainActivity.java** - The entry point of the app where Firebase is initialized and checks if the user is already logged in.
2. **LoginPage.java** - A login screen with Google Sign-In and Phone Number Authentication.
3. **ProfileFragment.java** - The profile page that displays user details and includes the **“Win Certificate”** button.
4. **WinCertificateActivity.java** - A timer-based activity that asks the user to answer a question within 30 seconds.
5. **HomePage.java** - The home screen, displayed after successful login, containing navigation options to different tabs (Profile, Chat, Certificate, Score).

## Setup

### Prerequisites

- **Android Studio**: Ensure that Android Studio is installed on your machine.
- **Firebase Project**: Create a Firebase project and add Firebase to your Android project. Set up Firebase Authentication (Google Sign-In and Phone Authentication).
- **Google Sign-In Configuration**: Set up Google Sign-In in Firebase and get your web client ID to configure it in your app.

### Steps to Run the App

1. **Clone this repository**:
   ```bash
   git clone https://github.com/yourusername/yourproject.git

2.	Open the project in Android Studio.
3.	Configure Firebase:
	•	Go to Firebase Console.
	•	Add a new project, then add your Android app to the Firebase project.
	•	Download the google-services.json file and place it in the app/ folder of your project.
	•	Enable Google Sign-In and Phone Authentication in the Firebase Console.
4.	Install dependencies:
	•	Ensure you have the necessary dependencies set up in your build.gradle files (both project-level and app-level).
5.	Run the app:
	•	Build and run the app on an Android emulator or device.

Key Code Files

	1.	MainActivity.java: Initializes Firebase and navigates to the LoginPage if the user is not logged in.
	2.	LoginPage.java: Implements Google Sign-In and Phone Authentication with Firebase.
	3.	ProfileFragment.java: Displays profile information and includes the “Win Certificate” button.
	4.	WinCertificateActivity.java: Handles the 30-second timer and allows the user to submit their answer to win a certificate.
	5.	HomePage.java: Displays the home screen with bottom navigation tabs.

Firebase Integration

To enable Firebase Authentication:
	•	Enable Google Sign-In and Phone Authentication in Firebase Console.
	•	Set up SHA-1 fingerprint in Firebase for Google Sign-In.
	•	Use Firebase’s FirebaseAuth API to manage user authentication.

UI Screens

	•	LoginPage: The user can sign in with Google or via Phone Number.
	•	HomePage: After login, the user is directed to the HomePage with four tabs: Certificate, Profile, Chat, and Score.
	•	ProfileTab: Contains user information and a button to “Win Certificate”.
	•	WinCertificateActivity: Asks the user a question, starts a countdown, and allows them to submit their answer for a certificate.

Additional Notes

	•	This project uses Firebase Realtime Database to store user data and certificates.
	•	The Win Certificate functionality uses a simple countdown timer to add an interactive element for the user.
	•	All Firebase-related logic is handled through the Firebase SDK, including Google Sign-In and Phone Authentication.

To Add More Features:

	•	Add a Chat Tab where users can chat with others.
	•	Add a Score Tab that stores user achievements or points.

 
