package com.akhil.todo;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	static{
		todos.add(new Todo(1, "Anvesh", "Buy Groceries", "Brinjal, Cabbage", new Date(121, 03, 21), new Date(121, 10, 11), false));
		todos.add(new Todo(2, "Anvesh", "Study Java", "Finish SCJP 6 book", new Date(121, 04, 25), new Date(121, 06, 11), false));
		todos.add(new Todo(3, "Anvesh", "Running", "Run at least for 20 minutes", new Date(121, 05, 01), new Date(121, 07, 13), false));
	}
	
	public void addTodo(String name, String desc, String details, Date startDate, Date endDate, boolean isDone) {
		Todo todo = new Todo(++todoCount, name, desc, details, startDate, endDate, isDone);
		todos.add(todo);
	}
	
	public void deleteTodo(int id) {
		Todo todo;
		Iterator<Todo> it = todos.listIterator();
		while(it.hasNext()) {
			todo = it.next();
			if(todo.getId() == id) {
				it.remove();
			}
		}
	}
	
	public List<Todo> retrieveTodos(String name){
		List<Todo> filteredTodos = new ArrayList<Todo>();
		Todo todo;
		Iterator<Todo> it = todos.iterator();
		while(it.hasNext()) {
			todo = it.next();
			if(todo.getName().equals(name)) {
				filteredTodos.add(todo);
			}
		}
		for(Todo todo1: todos) {
			System.out.println(todo1);
		}
		return filteredTodos;
	}
}
