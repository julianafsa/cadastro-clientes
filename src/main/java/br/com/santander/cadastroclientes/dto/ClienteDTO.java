package br.com.santander.cadastroclientes.dto;

import br.com.santander.cadastroclientes.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ClienteDTO {
	
	private String nome;
	private EnderecoDTO endereco;
	private String telefone;
	
	public ClienteDTO(Cliente cliente) {
		this.nome  = cliente.getNome();
		this.endereco = new EnderecoDTO(cliente.getEndereco());
		this.telefone = cliente.getTelefone();
	}

}
