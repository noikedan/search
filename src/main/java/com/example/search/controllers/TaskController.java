package com.example.search.controllers;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.search.domains.Task;
import com.example.search.domains.TaskForm;
import com.example.search.mappers.TaskMapper;

@Controller
public class TaskController {

	private final TaskMapper taskMapper;

	@Autowired
	public TaskController(TaskMapper taskMapper) {
		this.taskMapper = taskMapper;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Task> tasks = taskMapper.all();
		model.addAttribute("tasks", tasks);
		return "index";
	}

	@GetMapping("/add")
	public String showAddForm(TaskForm taskForm) {
		return "add";
	}

	@PostMapping("/add")
	public String create(@Validated TaskForm taskForm, BindingResult bindingResult,
			@RequestParam Map<String, String> requestParams) throws Exception {

		if (bindingResult.hasErrors()) {
			return "add";
		} else {
			String title = requestParams.get("title");
//	        System.out.println(title);
			String lmt = requestParams.get("lmt");
//	        System.out.println(lmt);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			int id = 0;
			Task t = new Task(id, false, title, dateFormat.parse(lmt));
			taskMapper.add(t);
			return "add";
		}
	}

	@PostMapping("/complete")
	public String create(@RequestParam("id") String id) {

		Task t = new Task(Integer.parseInt(id));
		taskMapper.complete(t);
		return "redirect:/";
	}

}