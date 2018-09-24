package goof;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;

import goof.domain.Todo;
import goof.domain.TodoRequest;
import goof.domain.TodoResponse;
import goof.repository.TodoRepository;

@Component("CreateTodoFunction")
public class CreateTodoFunction implements Function<TodoRequest, TodoResponse> {
	
	@Autowired
	TodoRepository repository;
	
	public Todo createTodo(final Todo todo) {
        return repository.save(todo);
    }

    @Override
    public TodoResponse apply(final TodoRequest todoRequest) {
        final TodoResponse result = new TodoResponse();

        result.setResult(createTodo(todoRequest.getTodo()));

        return result;
    }
}
