package com.acewira.fixmovie.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static int DATABASE_VERSION = 1;
    public static String DATABASE_NAME = "catalogue_movie";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE_MOVIE = "create table " + FVColumn.TABLE_NAME + " (" +
                FVColumn.COLUMN_ID + " integer primary key autoincrement, " +
                FVColumn.COLUMN_TITLE + " text not null, " +
                FVColumn.COLUMN_BACKDROP + " text not null, " +
                FVColumn.COLUMN_POSTER + " text not null, " +
                FVColumn.COLUMN_RELEASE_DATE + " text not null, " +
                FVColumn.COLUMN_VOTE + " text not null, " +
                FVColumn.COLUMN_OVERVIEW + " text not null " +
                ");";

        sqLiteDatabase.execSQL(CREATE_TABLE_MOVIE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE MOVIE IF EXISTS " + FVColumn.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
