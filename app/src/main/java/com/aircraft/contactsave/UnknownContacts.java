package com.aircraft.contactsave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.aircraft.contactsave.databinding.ActivityUnknownContactsBinding;

public class UnknownContacts extends AppCompatActivity {

    ActivityUnknownContactsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUnknownContactsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), UnknownContacts.class));
                finish();
            }
        }, 1000);
    }
}