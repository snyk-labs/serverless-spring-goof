package goof.domain;

public class GetTodoRequest {

    private String id;

    public GetTodoRequest() {
    }
    
    public GetTodoRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }
}
