package it.ddalpra.acme.todo.application;

import java.util.List;
import java.util.UUID;

import it.ddalpra.acme.todo.adapters.persistence.TodoTaskListRepository;
import it.ddalpra.acme.todo.domain.TodoTaskList;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TodoTaskListService {

    @Inject
    TodoTaskListRepository repository;

    public List<TodoTaskList> getAllTodoTaskLists() {
        return repository.listAll();
    }

    public TodoTaskList getTodoTaskListById(UUID id) {
        return repository.findById(id);
    }

    public void createTodoTaskList(TodoTaskList todoTaskList) {
        repository.persist(todoTaskList);
    }

    public void updateTodoTaskList(TodoTaskList todoTaskList) {
        repository.update("displayName = ?1, isOwner = ?2, isShared = ?3, wellknownListName = ?4 where id = ?5",
                todoTaskList.getDisplayName(), todoTaskList.getIsOwner(), todoTaskList.getIsShared(), todoTaskList.getWellknownListName(), todoTaskList.getId());
    }

    public void deleteTodoTaskList(UUID id) {
        repository.deleteById(id);
    }
}