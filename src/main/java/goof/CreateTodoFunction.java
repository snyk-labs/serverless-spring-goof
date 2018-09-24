package goof;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import goof.domain.Todo;
import goof.domain.TodoRequest;
import goof.domain.TodoResponse;
import goof.repository.TodoRepository;

@Component("CreateTodoFunction")
public class CreateTodoFunction implements Function<TodoRequest, TodoResponse> {
	
	@Autowired
	TodoRepository repository;
	
	public Todo createTodo(final Todo todo) {
		String id = todo.getId();
		String todoText = todo.getTodoText();
		
		File file = new File("/tmp/todo.txt");
		
		PrintWriter printWriter;
		try {
			if (!file.exists()) file.createNewFile();
			
			printWriter = new PrintWriter(new FileWriter(file));
			printWriter.write("New Todo created with id (" + id + "): " + todoText);
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return repository.save(todo); 
    }

    @Override
    public TodoResponse apply(final TodoRequest todoRequest) {
        final TodoResponse result = new TodoResponse();
        
        result.setResult(todoRequest.getTodo());

        return result;
    }
    
}
