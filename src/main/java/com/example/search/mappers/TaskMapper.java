package com.example.search.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.search.domains.Member;
import com.example.search.domains.Task;

@Mapper
public interface TaskMapper {

	List<Task> all();
	void add(Task task);
	void complete(Task task);
	
}
