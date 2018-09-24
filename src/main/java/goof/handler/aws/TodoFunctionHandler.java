package goof.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import goof.domain.TodoRequest;
import goof.domain.TodoResponse;

public class TodoFunctionHandler extends SpringBootRequestHandler<TodoRequest, TodoResponse> {
}
