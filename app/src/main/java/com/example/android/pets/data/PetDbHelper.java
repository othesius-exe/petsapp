package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Extends SQLiteOpenHelper
 * Creates and upgrades the database
 */

public class PetDbHelper extends SQLiteOpenHelper {

    // Log tag for this class
    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    // Name of the database file
    public static final String DATABASE_NAME = "shelter.db";

    // Database version.
    // Should be incremented when the table is upgraded
    public static final int DATABASE_VERSION = 1;

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Call this method to create a new table
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create the table with the following columns and attributes
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME + " ("
                + PetEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT"
                + PetEntry.COLUMN_PET_NAME + "TEXT NOT NULL"
                + PetEntry.COLUMN_PET_BREED + "TEXT"
                + PetEntry.COLUMN_PET_GENDER + "INTEGER NOT NULL"
                + PetEntry.COLUMN_PET_WEIGHT + "INTEGER NOT NULL DEFAULT 0);";
        Log.v(LOG_TAG, SQL_CREATE_PETS_TABLE);

        // Execute the sql statement
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    // Call this method when a table needs to be upgraded
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
