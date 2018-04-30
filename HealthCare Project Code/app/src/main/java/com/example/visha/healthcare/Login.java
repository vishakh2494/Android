package com.example.visha.healthcare;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Button login;
    Cursor cursor;
    EditText usrname, passcode;
    ImageView fingerlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        openHelper = new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();

        usrname = (EditText) findViewById(R.id.username);
        passcode = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.signin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usrname.getText().toString();
                String password = passcode.getText().toString();

                cursor = db.rawQuery("SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE " + DatabaseHelper.COL_7 + "=?  AND " + DatabaseHelper.COL_8 + "=?", new String[]{username,password});
                if (cursor!=null)
                {
                    if (cursor.getCount()>0) {
                        cursor.moveToNext();
                        Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,InitialCheck.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Login Error! Please verify username or password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void auth(View view) {
        Intent intent = new Intent(Login.this,Authentication.class);
        startActivity(intent);
    }
}
