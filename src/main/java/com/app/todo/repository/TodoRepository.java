package com.app.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
