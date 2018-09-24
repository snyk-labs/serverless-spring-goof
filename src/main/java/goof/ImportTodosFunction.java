package goof;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import goof.domain.ImportTodosResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component("ImportTodosFunction")
public class ImportTodosFunction implements Function<String, ImportTodosResponse> {

//	@Autowired
//	TodoRepository repository;
	
//	public Todo getTodo(final String id) {
//        return repository.findOne(id);
//    }

    @Override
    public ImportTodosResponse apply(String input) {
        ObjectMapper om = new ObjectMapper();
        om.enableDefaultTyping();

        try {
            ImportTodo i = om.readValue(input, ImportTodo.class);
        } catch (Exception e) {
            System.out.println("Exception was");
            e.printStackTrace(System.out);
        }

        return new ImportTodosResponse();
    }
}

class ImportTodo {

    private Object obj;
    ImportTodo() {
    }

    public ImportTodo(Object obj) {

        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object ob) {
        this.obj = obj;
    }

}