package br.com.gabriels.reactapi.authorapi;

public class AuthorJson {

    private String message;

    private Data data;

    public AuthorJson(Author author) {
        this.message = "sucess";
        this.data = new Data(author);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
