package it.ddalpra.acme.todo.adapters.persistence;

import java.util.UUID;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import it.ddalpra.acme.todo.domain.TodoTaskList;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TodoTaskListRepository implements PanacheRepositoryBase<TodoTaskList,UUID> {
    // Metodi per interagire con il database
}