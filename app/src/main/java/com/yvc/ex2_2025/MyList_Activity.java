package com.yvc.ex2_2025;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyList_Activity extends AppCompatActivity {


    ListView Takenbooks_lv;
    private ArrayList<Book> mybooks;

    private MyBooksAdapter newadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_list);

        Takenbooks_lv=findViewById(R.id.takenbook_list_view);

        mybooks = new ArrayList<>();
        mybooks.add(new Book("book", "noa kirel",LocalDate.of(2000, 10, 26)));
        mybooks.add(new Book("book2", "noa kirel",LocalDate.of(1984, 06, 15)));
        mybooks.add(new Book("book3", "noa kirel",LocalDate.of(1999, 04, 20)));

        newadapter = new MyBooksAdapter(this, R.layout.book_item, mybooks);
        Takenbooks_lv.setAdapter(newadapter);

    }



}