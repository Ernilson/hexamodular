//package br.com.output.TestService;
//
//import br.com.core.domain.PacienteDomain;
//import br.com.output.service.InsertPacienteServiceAdapter;
//import org.junit.jupiter.api.Test;
//
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes = {InsertPacienteServiceAdapter.class})
//public class ServiceTest {
//
//    @Autowired
//    private InsertPacienteServiceAdapter service;
//
//    @Test
//    public void insertPaciente() {
//
//        PacienteDomain domain = new PacienteDomain();
//        domain.setNome("Teste");
//        domain.setCpf("69779848134");
//        domain.setEmail("teste@teste.com");
//        domain.setTelefone("321654987");
//
//        service.insert(domain);
//    }
//}
