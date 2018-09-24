package goof;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import goof.domain.GetTodoRequest;
import goof.domain.Todo;
import goof.domain.TodoResponse;
import goof.repository.TodoRepository;

@Component("GetTodoFunction")
public class GetTodoFunction implements Function<GetTodoRequest, TodoResponse> {

	@Autowired
	TodoRepository repository;
	
	public Todo getTodo(final String id) {
        return repository.findOne(id);
    }

    @Override
    public TodoResponse apply(final GetTodoRequest getTodoRequest) {
        final TodoResponse result = new TodoResponse();

        result.setResult(getTodo(getTodoRequest.getId()));

        return result;
    }
}
