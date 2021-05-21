package com.example.search.domains;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class TaskForm {

	private int id;
	private boolean status;
	@NotBlank
	@Min(2)
	private String title;
	@NotNull
	@DateTimeFormat(iso = ISO.DATE)
	private Date lmt;
}
