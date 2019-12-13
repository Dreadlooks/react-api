package br.com.gabriels.reactapi.authorapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class AuthorForm {

    @NotBlank
    @JsonProperty("name")
    private String author;

    @NotBlank
    private String book;

    @Min(value = 0)
    private int price;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author toModel() {
        return new Author(this.author, this.book, this.price);
    }

    public Author update(Author author) {
        author.setAuthor(this.author);
        author.setBook(this.book);
        author.setPrice(this.price);

        return author;
    }
}
