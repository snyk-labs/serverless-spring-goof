package goof.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import goof.domain.Todo;

@EnableScan
@RepositoryRestResource
public interface TodoRepository extends CrudRepository<Todo, String> {
     
}
