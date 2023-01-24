package com.capgemini.start.api.dto.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class GeneroInputDTO {

	@NotNull
	@Length(max = 100)
	private String descricao;
}
