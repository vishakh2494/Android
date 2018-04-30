package com.example.visha.healthcare;

import android.app.Activity;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.multidots.fingerprintauth.AuthErrorCodes;
import com.multidots.fingerprintauth.FingerPrintAuthCallback;
import com.multidots.fingerprintauth.FingerPrintAuthHelper;

public class Authentication extends Activity implements FingerPrintAuthCallback {
    FingerPrintAuthHelper mFingerPrintAuthHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        mFingerPrintAuthHelper = FingerPrintAuthHelper.getHelper(this, this);
    }

    @Override
    protected void onResume(){
        super.onResume();
        mFingerPrintAuthHelper.startAuth();
    }
    protected void onPause(){
        super.onPause();
        mFingerPrintAuthHelper.stopAuth();
    }

    @Override
    public void onNoFingerPrintHardwareFound() {
        Toast.makeText(this, "FingerPrint Scanner not found!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNoFingerPrintRegistered() {
        Toast.makeText(this, "Your FingerPrint is not registered!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBelowMarshmallow() {
        Toast.makeText(this, "Your device is incompatible!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAuthSuccess(FingerprintManager.CryptoObject cryptoObject) {
        Intent intent = new Intent(Authentication.this,InitialCheck.class);
        startActivity(intent);
    }

    @Override
    public void onAuthFailed(int errorCode, String errorMessage) {
        switch (errorCode){
            case AuthErrorCodes.CANNOT_RECOGNIZE_ERROR:
                Toast.makeText(this, "Cannot Recognize your FingerPrint! Please try again", Toast.LENGTH_SHORT).show();
                break;
            case AuthErrorCodes.NON_RECOVERABLE_ERROR:
                break;
            case AuthErrorCodes.RECOVERABLE_ERROR:
                break;
        }
    }
}
