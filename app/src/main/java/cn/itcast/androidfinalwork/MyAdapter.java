package cn.itcast.androidfinalwork;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<Book> bookList;

    public  MyAdapter(List<Book>bookList){
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       Book book = bookList.get(position);
       holder.nameText.setText(book.getName());
       holder.authorText.setText(book.getAuthor());
       holder.head.setImageResource(book.getHeadId());
    }

    @Override
    public int getItemCount() {

        return bookList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nameText;
        TextView authorText;
        ImageView head;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.nameText = itemView.findViewById(R.id.textView);
            this.authorText = itemView.findViewById(R.id.textView1);
            this.head = itemView.findViewById(R.id.imageView);
        }
    }
}
