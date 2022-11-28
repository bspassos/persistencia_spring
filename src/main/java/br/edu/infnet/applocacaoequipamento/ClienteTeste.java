package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(2)
public class ClienteTeste implements ApplicationRunner {

    @Autowired
    ClienteService clienteService;

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("===================================================");
        System.out.println("######cliente");



        System.out.println("===================================================");

    }
}
