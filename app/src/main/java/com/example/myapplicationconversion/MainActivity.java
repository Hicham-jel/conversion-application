package com.example.myapplicationconversion;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextNumberDecimal2=findViewById(R.id.editTextNumberDecimal2);
        Button button_name=findViewById(R.id.button);
        final TextView textViewResult=findViewById(R.id.textView);
        ListView listViewResult=findViewById(R.id.listViewResults);
        final List<String> data=new ArrayList<>();
        final ArrayAdapter<String> stringArrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        listViewResult.setAdapter(stringArrayAdapter);
        button_name.setOnClickListener((view)->{double amount=Double.parseDouble(editTextNumberDecimal2.getText().toString());
        double result=amount*11;
        textViewResult.setText(String.valueOf(result));
        data.add(amount+"=>"+result);
        stringArrayAdapter.notifyDataSetChanged();
        editTextNumberDecimal2.setText("");

        });

    }
}