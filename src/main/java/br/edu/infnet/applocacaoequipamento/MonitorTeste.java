package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@Order(4)
public class MonitorTeste implements ApplicationRunner {

    @Autowired
    MonitorService monitorService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######monitor");

        try{
            Monitor m1 = new Monitor();
            m1.setCodigo(9);
            m1.setNome("Monitor 23\" Dell P2319H");
            m1.setMensalidade(250);
            m1.setTela(12);
            m1.setResolucao("1920x1080");
            m1.setPortas("DisplayPort, VGA e HDMI");
            monitorService.incluir(m1);
            System.out.println("Monitor " + m1.getNome() + " cadastrado");
        } catch (Exception e) {
            System.out.println("[ERROR - MONITOR] " + e.getMessage());
        }

        try{
            Optional<Monitor> monitor = monitorService.obter(2);
            System.out.println(monitor);
        } catch (Exception e) {
            System.out.println("[ERROR - MONITOR] " + e.getMessage());
        }

        System.out.println("===================================================");
    }
}
