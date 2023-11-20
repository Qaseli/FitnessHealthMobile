package com.example.fitnesshealthmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fitnesshealthmobile.databinding.ActivityFeedbackBinding;
import com.example.fitnesshealthmobile.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Feedback extends AppCompatActivity {

    ActivityFeedbackBinding binding;
    String Name, Email,Feedback;
    FirebaseDatabase db;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFeedbackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Name = binding.Name.getText().toString();
                    Email = binding.Email.getText().toString();
                    Feedback = binding.Feedback.getText().toString();

                    if (!Name.isEmpty() && !Email.isEmpty() && !Feedback.isEmpty()){

                        Users users = new Users(Name, Email, Feedback);
                        db = FirebaseDatabase.getInstance();
                        reference = db.getReference("Users");
                        reference.child(Name).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>(){
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {

                                binding.Name.setText("");
                                binding.Email.setText("");
                                binding.Feedback.setText("");
                                Toast.makeText(Feedback.this, "Succesfully Updated", Toast.LENGTH_SHORT).show();

                            }

                        });
                    }
            }
        });
    }
}