package goof;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import goof.domain.Todo;
import goof.domain.TodoRequest;
import goof.domain.TodoResponse;
import goof.repository.TodoRepository;

@Component("UpdateTodoFunction")
public class UpdateTodoFunction implements Function<TodoRequest, TodoResponse> {

	@Autowired
	TodoRepository repository;
	
	public Todo updateTodo(final Todo todo) {
        return repository.save(todo); //updateTodo in db
    }

    @Override
    public TodoResponse apply(final TodoRequest todoRequest) {
        final TodoResponse result = new TodoResponse();

        result.setResult(updateTodo(todoRequest.getTodo()));

        return result;
    }
}
