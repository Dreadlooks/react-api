package br.com.gabriels.reactapi.authorapi;

public class AuthorDto {

    private Long id;

    private String author;

    private String book;

    private int price;

    public AuthorDto(Author author) {
        this.id = author.getId();
        this.author = author.getAuthor();
        this.book = author.getBook();
        this.price = author.getPrice();
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

}
