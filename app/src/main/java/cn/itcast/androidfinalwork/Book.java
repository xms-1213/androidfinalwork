package cn.itcast.androidfinalwork;
import java.io.Serializable;
public class Book {
    private String name;
    private String author;
    private int headId;

    public Book(String name, String author, int headId) {
        this.name = name;
        this.author = author;
        this.headId = headId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getHeadId() {
        return headId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setHeadId(int headId) {
        this.headId = headId;
    }
}
