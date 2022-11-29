package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Order(3)
public class DesktopTeste implements ApplicationRunner {

    @Autowired
    DesktopService desktopService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######desktop");

        try {
            Desktop d1 = new Desktop();
            d1.setCodigo(3);
            d1.setNome("Desktop Dell XPS 8950");;
            d1.setMensalidade(480);;
            d1.setProcessador("Core i7 12th");;
            d1.setMemoria(4);
            d1.setHd("1TB");
            desktopService.incluir(d1);
            System.out.println("Desktop " + d1.getNome() + " cadastrado");
        } catch (Exception e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        try{
            Optional<Desktop> desktop = desktopService.obter(1);
            System.out.println(desktop);
        } catch (Exception e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        System.out.println("===================================================");

    }
}
