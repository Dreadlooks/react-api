package br.com.gabriels.reactapi.authorapi;

public class BooksDto {

    private Long id;

    private String book;

    public BooksDto(Author author) {
        this.id = author.getId();
        this.book = author.getBook();
    }

    public Long getId() {
        return id;
    }

    public String getBook() {
        return book;
    }
}
