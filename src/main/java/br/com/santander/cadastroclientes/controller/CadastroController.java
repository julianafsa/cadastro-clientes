package br.com.santander.cadastroclientes.controller;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santander.cadastroclientes.dto.ClienteDTO;
import br.com.santander.cadastroclientes.model.Cliente;
import br.com.santander.cadastroclientes.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class CadastroController {
	
	private final Logger log = LoggerFactory.getLogger(CadastroController.class);

	private final ClienteRepository repository;

	@Autowired
	public CadastroController(ClienteRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/{id}")
	public ResponseEntity<ClienteDTO> buscarPorId(@PathVariable Long id) {
		log.info("Buscando o usuário de id ", id);
		Cliente cliente = repository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Cliente de id " + id + " não encontrado"));
		ClienteDTO clienteDTO = new ClienteDTO(cliente);
		return ResponseEntity.ok(clienteDTO);
	}

}
