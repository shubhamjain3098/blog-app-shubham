package com.blog.app.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class CategoryDto {
	
	private Integer categoryId;
	@NotBlank
	@Size(min = 3,message = "minimum size of category title is 3 !!")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 5,message = "minimum size of category description is 5 !!")
	private String categoryDescription;
	

}
