package br.com.gabriels.reactapi.authorapi;

import java.util.List;
import java.util.stream.Collectors;

public class AuthorsJson {

    private String message;

    private List<Data> data;

    public AuthorsJson(List<Author> authors) {
        this.message = "success";
        this.data = authors.stream().map(Data::new).collect(Collectors.toList());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
