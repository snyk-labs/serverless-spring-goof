package goof.domain;

public class TodoRequest {

    private Todo todo;

    public TodoRequest() {
        this.todo = new Todo();
    }

    public TodoRequest(String txt) {
        this.todo = new Todo(txt);
    }
    
    public TodoRequest(Todo todo) {
        this.todo = todo;
    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(final Todo todo) {
        this.todo = todo;
    }
}
