package com.akhil.todo;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	static Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String user = (String) model.get("name");
		System.out.println("name in showmethod = " + user);
		model.addAttribute("todos", service.retrieveTodos(user));
		return "list-todos";
	}
	
	@RequestMapping(value = "/add-todos", method = RequestMethod.GET)
	public String addTodos() {
		System.out.println("Entered add method");
		return "todo";
	}
	
	@RequestMapping(value = "/add-todos", method = RequestMethod.POST)
	public String returnAfterAddingTodos(@RequestParam String desc, @RequestParam String details, @RequestParam("sdate") @DateTimeFormat(pattern="yyyy-MM-dd") Date sdate, @RequestParam("tdate") @DateTimeFormat(pattern="yyyy-MM-dd") Date tdate, ModelMap model) throws Exception {
		String user = (String) model.get("name");
		service.addTodo(user, desc, details, sdate, tdate, false);
		model.clear();
		return "redirect:list-todos";
	}
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodos(@RequestParam int id, ModelMap model) {
		service.deleteTodo(id);
		model.clear();
		return "redirect:list-todos";
	}
}
