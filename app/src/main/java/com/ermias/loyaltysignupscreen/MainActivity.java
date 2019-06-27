package com.ermias.loyaltysignupscreen;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFName,editTextLName, editTextEmail,editTextPhone;
    private PatternClass patterClass=new PatternClass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSubmit=(Button) findViewById(R.id.button_submit);
        editTextFName=(EditText) findViewById(R.id.editText_FName);
        editTextLName=(EditText) findViewById(R.id.editText_LName);
        editTextEmail=(EditText) findViewById(R.id.editText_email);
        editTextPhone=(EditText) findViewById(R.id.editText_phone);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result=patterClass.getPatternResult(editTextFName.getText().toString(),
                        editTextFName.getText().toString(),editTextEmail.getText().toString(),
                        editTextPhone.getText().toString());
                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Loyalty Sign Up Screen");
                alert.setMessage(result);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.show();
            }
        });
    }
}
