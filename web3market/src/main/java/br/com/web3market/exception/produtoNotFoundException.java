package br.com.web3market.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class produtoNotFoundException extends RuntimeException {
	public produtoNotFoundException() {
		super("Nome do Produto não encontrado");
	}
}
