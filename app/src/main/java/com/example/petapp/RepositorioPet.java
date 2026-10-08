package com.example.petapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class RepositorioPet extends SQLiteOpenHelper{


    public RepositorioPet(@Nullable Context context) {
        super(context, "pet", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE PET (id INTEGER NOT NULL PRIMARY KEY, nome TEXT, idade TEXT)";
        db.execSQL(sql);
        Log.i("pet", "criada tabela no banco de dados");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void salvar (Pet pet) {
        String sql = "INSERT INTO PET VALUES (null, '" + pet.nome + "','" + pet.idade + "')";
        super.getWritableDatabase().execSQL(sql);
        Log.i("pet", "pet inserido com sucesso");

    }



}
