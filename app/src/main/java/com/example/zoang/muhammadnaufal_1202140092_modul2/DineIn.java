package com.example.zoang.muhammadnaufal_1202140092_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String noMejaSpinner = "";
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        // Create the spinner.
        Spinner spinner = (Spinner) findViewById(R.id.no_meja_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.noMeja_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    public void menuDineIn(View view){
        Intent intent = new Intent(DineIn.this, ContentMenu.class);
        startActivity(intent);
    }

//    public void showText(View view){
//        EditText editText = (EditText) findViewById(R.id.editText_main);
//        if (editText != null) {
//            String showString = (editText.getText().toString() + " - " + noMejaSpinner);
//            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
//        }
//    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        noMejaSpinner = adapterView.getItemAtPosition(i).toString();
//        showText(view);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, getString(R.string.nothing_selected));
    }
}
