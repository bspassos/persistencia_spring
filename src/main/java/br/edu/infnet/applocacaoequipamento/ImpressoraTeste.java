package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.service.ImpressoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class ImpressoraTeste implements ApplicationRunner {

    @Autowired
    ImpressoraService impressoraService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######impressora");


        System.out.println("===================================================");

    }
}
