package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@Order(2)
public class ClienteTeste implements ApplicationRunner {

    @Autowired
    ClienteService clienteService;

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("===================================================");
        System.out.println("######cliente");

        try{
            Cliente c1 = new Cliente("Bruno", "11111111111", "bruno@teste.com");
            clienteService.salvar(c1);
            System.out.println("Cliente " + c1.getNome() + " cadastrado");
        } catch (Exception e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }

        try{
            Optional<Cliente> clienteOptional = clienteService.obter(1);
            System.out.println(clienteOptional);

            if(clienteOptional.isPresent()){
                Cliente currentCliente = clienteOptional.get();
                currentCliente.setNome("Bruno Passos");
                clienteService.salvar(currentCliente);
                System.out.println("Cliente " + currentCliente.getNome() + " atualizado");
            }


        } catch (Exception e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }

        System.out.println("===================================================");

    }
}
