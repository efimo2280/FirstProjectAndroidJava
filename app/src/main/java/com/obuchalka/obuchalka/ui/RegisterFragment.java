package com.obuchalka.obuchalka.ui;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

import com.obuchalka.obuchalka.R;

public class RegisterFragment extends AppCompatActivity {

    private EditText nameEditText, ageEditText, massaEditText, heightEditText;
    private Button addButton,clearButton;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        dbHelper = new DatabaseHelper(this);

        nameEditText = findViewById(R.id.etName);
        ageEditText = findViewById(R.id.etAge);
        massaEditText = findViewById(R.id.etMassa);
        heightEditText = findViewById(R.id.etHeight);
        addButton = findViewById(R.id.btnAdd);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUsers();
            }
        });
    }

    private void addUsers() {
        String name = nameEditText.getText().toString();
        int age = Integer.parseInt(ageEditText.getText().toString());

        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COLUMN_NAME, name);
        values.put(DatabaseHelper.COLUMN_AGE, age);

        long newRowId = db.insert(DatabaseHelper.TABLE_USER, null, values);

    }
}

