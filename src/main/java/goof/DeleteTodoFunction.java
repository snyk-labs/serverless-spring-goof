package goof;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import goof.domain.GetTodoRequest;
import goof.domain.TodoResponse;
import goof.repository.TodoRepository;

@Component("DeleteTodoFunction")
public class DeleteTodoFunction implements Function<GetTodoRequest, TodoResponse> {
	
	@Autowired
	TodoRepository repository;
	
	public void deleteTodo(final String todo) {
        repository.delete(todo);
    }

    @Override
    public TodoResponse apply(final GetTodoRequest todoRequest) {
        final TodoResponse result = new TodoResponse();

        deleteTodo(todoRequest.getId());

        return result;
    }
}
