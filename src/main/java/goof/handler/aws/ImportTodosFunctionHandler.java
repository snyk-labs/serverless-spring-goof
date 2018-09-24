package goof.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import goof.domain.ImportTodosResponse;

public class ImportTodosFunctionHandler extends SpringBootRequestHandler<String, ImportTodosResponse> {
}
