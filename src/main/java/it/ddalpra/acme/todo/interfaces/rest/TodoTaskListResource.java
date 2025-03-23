package it.ddalpra.acme.todo.interfaces.rest;

import java.util.List;
import java.util.UUID;

import it.ddalpra.acme.todo.application.TodoTaskListService;
import it.ddalpra.acme.todo.domain.TodoTaskList;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/todo-lists")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TodoTaskListResource {

    @Inject
    TodoTaskListService service;

    @GET
    public List<TodoTaskList> getAllTodoTaskLists() {
        return service.getAllTodoTaskLists();
    }

    @GET
    @Path("/{id}")
    public TodoTaskList getTodoTaskListById(@PathParam("id") UUID id) {
        return service.getTodoTaskListById(id);
    }

    @POST
    public void createTodoTaskList(TodoTaskList todoTaskList) {
        service.createTodoTaskList(todoTaskList);
    }

    @PUT
    public void updateTodoTaskList(TodoTaskList todoTaskList) {
        service.updateTodoTaskList(todoTaskList);
    }

    @DELETE
    @Path("/{id}")
    public void deleteTodoTaskList(@PathParam("id") UUID id) {
        service.deleteTodoTaskList(id);
    }
}