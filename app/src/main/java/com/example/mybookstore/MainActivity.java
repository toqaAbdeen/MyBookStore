package com.example.mybookstore;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mybookstore.DataBasePkg.Book;
import com.example.mybookstore.DataBasePkg.BookDataAccsess;
import com.example.mybookstore.DataBasePkg.IBookDB;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spnItems;

    private Button btnShow;
    private TextView txtList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setUp();
        bindSpinner();


    }

    private void bindSpinner() {
        IBookDB data = new BookDataAccsess();
        String[] cats = data.getCats();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cats);
        spnItems.setAdapter(adapter);
    }

    private void setUp() {
        spnItems = findViewById(R.id.spnItems);
        btnShow = findViewById(R.id.btnShow);
        txtList = findViewById(R.id.txtList);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IBookDB data = new BookDataAccsess();
                String cat = spnItems.getSelectedItem().toString();
                List<Book> bookList = data.getBook(cat);
                String str = "";
                for (Book book : bookList) {
                    str += book.toString() + "\n";

                }
                txtList.setText(str);

            }
        });
    }
}
