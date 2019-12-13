package br.com.gabriels.reactapi.authorapi;

public class AuthorJson {

    private String message;

    private AuthorDto data;

    public AuthorJson(Author author) {
        this.message = "sucess";
        this.data = new AuthorDto(author);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AuthorDto getData() {
        return data;
    }

    public void setData(AuthorDto data) {
        this.data = data;
    }
}
