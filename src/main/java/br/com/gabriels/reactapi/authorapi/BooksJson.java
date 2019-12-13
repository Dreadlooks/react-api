package br.com.gabriels.reactapi.authorapi;

import java.util.List;
import java.util.stream.Collectors;

public class BooksJson {

    private String message;

    private List<BooksDto> data;

    public BooksJson(List<Author> authors) {
        this.message = "success";
        this.data = authors.stream().map(BooksDto::new).collect(Collectors.toList());
    }

    public String getMessage() {
        return message;
    }

    public List<BooksDto> getData() {
        return data;
    }
}
