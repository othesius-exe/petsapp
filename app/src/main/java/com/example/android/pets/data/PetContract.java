package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * PetContract class
 */

public class PetContract {

    private PetContract() {}

    // Define table contents here
    public static abstract class PetEntry implements BaseColumns {

        // Table name
        public static final String TABLE_NAME = "pets";

        // Table Column Names
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_WEIGHT = "weight";
        public static final String COLUMN_PET_GENDER = "gender";

        // Gender constants
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;

    }
}
