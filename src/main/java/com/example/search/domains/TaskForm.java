package com.example.search.domains;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class TaskForm {

	private int id;
	private boolean status;
	@NotBlank(message="必須項目です")
	@Size(min=3, message="2文字以上入力してください")
	private String title;
	@NotNull(message="必須項目です")
	@DateTimeFormat(iso = ISO.DATE)
	private Date lmt;
}
