package com.example.quicknotes;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;

public class AddEditNoteActivity extends AppCompatActivity {

    private EditText titleEditText, contentEditText;
    private Spinner categorySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_note);

        titleEditText = findViewById(R.id.titleEditText);
        contentEditText = findViewById(R.id.contentEditText);
        categorySpinner = findViewById(R.id.categorySpinner);

        findViewById(R.id.saveButton).setOnClickListener(v -> saveNote());
    }

    private void saveNote() {
        // Logic to save or update note in SQLite and Firebase
    }
}
