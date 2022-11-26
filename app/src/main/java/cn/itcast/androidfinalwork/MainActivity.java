package cn.itcast.androidfinalwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("三体","刘慈欣",R.drawable.ic_baseline_book_24);
        Book book2 = new Book("乡村教师","刘慈欣",R.drawable.ic_bluebook_24);
        bookList.add(book1);
        bookList.add(book2);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(bookList);

        recyclerView.setAdapter(myAdapter);
    }
}