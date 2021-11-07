package br.com.santander.cadastroclientes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.santander.cadastroclientes.enumerations.TipoEndereco;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Endereco {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private TipoEndereco tipo;
	
	@OneToOne
	private Cliente cliente;

	public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String estado,
			String cep, TipoEndereco tipo, Cliente cliente) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.tipo = tipo;
		this.cliente = cliente;
	}
	
}
