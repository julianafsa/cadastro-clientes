package br.com.santander.cadastroclientes.dto;

import br.com.santander.cadastroclientes.enumerations.TipoEndereco;
import br.com.santander.cadastroclientes.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EnderecoDTO {
	
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private TipoEndereco tipo;
	
	public EnderecoDTO(Endereco endereco) {
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.estado = endereco.getEstado();
		this.cep = endereco.getCep();
		this.tipo = endereco.getTipo();		
	}
	
}
