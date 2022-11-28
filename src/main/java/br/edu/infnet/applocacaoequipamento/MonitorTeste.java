package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(4)
public class MonitorTeste implements ApplicationRunner {

    @Autowired
    MonitorService monitorService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######monitor");


        System.out.println("===================================================");
    }
}
