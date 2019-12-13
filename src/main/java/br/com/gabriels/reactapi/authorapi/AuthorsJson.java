package br.com.gabriels.reactapi.authorapi;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorsJson {

    private String message;

    private List<AuthorDto> data;

    public AuthorsJson(List<Author> authors) {
        this.message = "success";
        this.data = authors.stream().map(AuthorDto::new).collect(Collectors.toList());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<AuthorDto> getData() {
        return data;
    }

    public void setData(List<AuthorDto> data) {
        this.data = data;
    }
}
