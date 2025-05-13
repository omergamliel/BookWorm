package com.yvc.ex2_2025;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BrowseBooksActivity extends Activity {

    private ListView book_list_view;
    private BookAdapter adapter;
    private ArrayList<Book> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_books);
        book_list_view = findViewById(R.id.book_list_view);

        books = new ArrayList<>();
        books.add(new Book("book", "noa kirel", R.drawable.book1,"https://www.google.com/"));
        books.add(new Book("book2", "noa kirel", R.drawable.book1,"https://www.google.com/"));
        books.add(new Book("book3", "noa kirel", R.drawable.book1,"https://www.google.com/"));

        adapter = new BookAdapter(this, R.layout.book_item, books);
        book_list_view.setAdapter(adapter);
    }
}
