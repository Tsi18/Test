package com.example.bible;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfListView = (ListView) findViewById(R.id.PDFList);
        
        String[] pdfiles = {"Matthew",
                            "Mark",
                            "Luck",
                "John",
                "Acts of the Apostles",
                "Romans",
                "Corinthians I",
                "Corinthians II",
                "Galatians",
                "Ephesians",
                "Philippians",
                "Colossians",
                "Thessalonians I",
                "Thessalonians II",
                "Timothy I",
                "Timothy II",
                "Titus",
                "Philemon",
                "Hebrews",
                "James",
                "Peter I",
                "Peter II",
                "John I",
                "John II",
                "John III",
                "Jude",
                "Revelation to John",};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view. findViewById(android.R.id.text1);
                return view;
            }
        };

        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = pdfListView.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}