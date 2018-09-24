package goof.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import goof.domain.GetTodoRequest;
import goof.domain.TodoResponse;

public class GetTodoFunctionHandler extends SpringBootRequestHandler<GetTodoRequest, TodoResponse> {
}
