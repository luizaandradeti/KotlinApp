package validacao.rest.agenda;

import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import validacao.rest.contatos.Contato;
import validacao.rest.contatos.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class ControllerGeral {

	@Autowired
	private ContatoRepository contatoService;

	@GetMapping("/")
	public ResponseEntity<List<Contato>> contatos(){
		List<Contato> contatos = contatoService.findAll();
		return ResponseEntity.ok(contatos);  	}


	@PostMapping("/inserir")
	public ResponseEntity<Contato> inserir(@RequestBody @Valid Contato contato) throws URISyntaxException {
		contato = contatoService.save(contato);
		return new ResponseEntity<>(contato, HttpStatus.CREATED);  	}

	@PutMapping("/alterar/{id}")
	public ResponseEntity<Contato> alterar(@PathVariable Long id, @RequestBody @Valid Contato contato) throws URISyntaxException {
		contato = contatoService.save(contato);
		return new ResponseEntity<>(contato, HttpStatus.CREATED);
	}

	@DeleteMapping("/remover/{id}")
	public ResponseEntity<Contato> remover(@PathVariable Long id) {
		contatoService.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}