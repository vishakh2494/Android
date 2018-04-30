package com.example.visha.healthcare;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by visha on 30-Oct-17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="register";
    public static final String COL_1="First_Name";
    public static final String COL_2="Last_Name";
    public static final String COL_3="Age";
    public static final String COL_4="Sex";
    public static final String COL_5="Address";
    public static final String COL_6="Phone";
    public static final String COL_7="username";
    public static final String COL_8="password";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " +TABLE_NAME+ "(First_Name TEXT, Last_Name TEXT, Age INTEGER, Sex TEXT, Address TEXT, Phone INTEGER, username TEXT, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);
    }
}
