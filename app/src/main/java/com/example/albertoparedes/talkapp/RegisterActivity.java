package com.example.albertoparedes.talkapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {

    TextInputLayout mDisplayName;
    TextInputLayout mEmail;
    TextInputLayout mPassword;
    Button mCreateBtn;

    private ProgressDialog mRegProgress;

    private FirebaseAuth mAuth;
    private Toolbar mToolbar;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();
        /*mToolbar = findViewById(R.id.register_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Create Account");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        */

        mDisplayName = findViewById(R.id.reg_display_name);
        mEmail = findViewById(R.id.reg_email);
        mPassword = findViewById(R.id.reg_password);

        mCreateBtn = findViewById(R.id.reg_create_btn);

        mRegProgress = new ProgressDialog(this);

    }

    public void createAccount(View view) {

        String displayName = mDisplayName.getEditText().getText().toString();
        String email = mEmail.getEditText().getText().toString();
        String password = mPassword.getEditText().getText().toString();

        if (!TextUtils.isEmpty(displayName) || !TextUtils.isEmpty(email) || !TextUtils.isEmpty(password)){

            mRegProgress.setTitle("Registering user");
            mRegProgress.setMessage("Please wait while we create your account");
            mRegProgress.setCanceledOnTouchOutside(false);
            mRegProgress.show();

            register_user(displayName,email, password);
        }



    }

    private void register_user(final String displayName, String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
            if (task.isSuccessful()) {

                FirebaseUser current_user = FirebaseAuth.getInstance().getCurrentUser();
                String uid_user = current_user.getUid();
                mDatabase = FirebaseDatabase.getInstance().getReference().child("Users").child(uid_user);

                HashMap<String, String> userMap = new HashMap<>();

                userMap.put("descripcion", "descripcion por defecto");
                //userMap.put("edad", "0");
                userMap.put("estudios", "estudios por defecto");
                userMap.put("foto_1", "foto_1 por defecto");
                userMap.put("foto_2", "foto_2 por defecto");
                userMap.put("foto_3", "foto_3 por defecto");
                userMap.put("foto_4", "foto_4 por defecto");
                userMap.put("foto_5", "foto_5 por defecto");
                userMap.put("foto_6", "foto_6 por defecto");
                userMap.put("idioma_1", "idioma_1 por defecto");
                userMap.put("idioma_2", "idioma_2 por defecto");
                userMap.put("image", "default");
                userMap.put("intereses", "intereses por defecto");
                userMap.put("nacionalidad", "nacionalidad por defecto");
                userMap.put("name", displayName);
                userMap.put("sexo", "sexo por defecto");
                userMap.put("status", "status por defecto");
                userMap.put("telefono", "655776677");
                userMap.put("status", "status por defecto");
                userMap.put("thumb_image", "default");

                mDatabase.setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            mRegProgress.dismiss();
                            Intent i = new Intent(RegisterActivity.this, MainActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i);
                            finish();
                        }
                    }
                });






            } else {
                mRegProgress.hide();
                Toast.makeText(RegisterActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();

            }

                // ...
            }
        });
    }


}
