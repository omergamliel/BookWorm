package com.yvc.ex2_2025;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MyBooksAdapter extends ArrayAdapter<Book> {

    private Context context;
    private ArrayList<Book> books_list;

    public MyBooksAdapter(Context context, int resource, ArrayList<Book> books_list) {
        super(context, resource);
        this.context = context;
        this.books_list = books_list;
    }
    @Override
    public int getCount() {
        return books_list.size();
    }

    @Override
    public Book getItem(int position) {
        return books_list.get(position);
    }

    @Override
    public View getView(int position, View rootView, ViewGroup parent) {
        if (rootView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            rootView = inflater.inflate(R.layout.book_item, null, false);
        }
        Book book = getItem(position);
        TextView name = rootView.findViewById(R.id.name);
        TextView author = rootView.findViewById(R.id.author);
        EditText returnDate = rootView.findViewById(R.id.returnDate);
        Button reminderButton = rootView.findViewById(R.id.reminderButton);
        ImageView cover = rootView.findViewById(R.id.cover);
        Button addButton = rootView.findViewById(R.id.addButton);
        TextView url=rootView.findViewById(R.id.url);

        cover.setVisibility(View.GONE);
        addButton.setVisibility(View.GONE);
        url.setVisibility(View.GONE);

        if (book != null) {
            name.setText(book.getName());
            author.setText(book.getAuthor());
            returnDate.setText(book.getReturndate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        }

        return rootView ;

}}
