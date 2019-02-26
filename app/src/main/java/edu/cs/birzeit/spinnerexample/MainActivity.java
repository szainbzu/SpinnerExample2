package edu.cs.birzeit.spinnerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner  = (Spinner)findViewById(R.id.spinner);
        edtName = (EditText)findViewById(R.id.edtName);
        populateSpinner();

    }

    private void populateSpinner() {
        List<String> books = new ArrayList<>();
        books.add("Java");
        books.add("C#");
        books.add("Python");
        books.add("C++");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, books);
        spinner.setAdapter(adapter);
    }

    public void btnSendOnClick(View view) {
        String name = edtName.getText().toString();
        String item = spinner.getSelectedItem().toString();
        Toast.makeText(this, "name: "+ name + "\nitem: " + item,
                Toast.LENGTH_SHORT).show();

    }
}
