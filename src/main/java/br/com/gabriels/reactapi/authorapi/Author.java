package br.com.gabriels.reactapi.authorapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String author;

    @NotBlank
    private String book;

    @Min(value = 0)
    private int price;

    @Deprecated
    public Author() {
    }

    public Author(@NotBlank String author, @NotBlank String book, int price) {
        this.author = author;
        this.book = book;
        this.price = price;

    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getBook() {
        return book;
    }

    public int getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
