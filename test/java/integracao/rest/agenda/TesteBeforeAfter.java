package validacao.rest.agenda;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import validacao.rest.contatos.Contato;
import validacao.rest.contatos.ContatoRepository;

@RunWith(SpringRunner.class)   //testes web
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TesteBeforeAfter {




}