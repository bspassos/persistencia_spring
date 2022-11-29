package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Collection;
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

        //inserir
        try {
            Desktop d1 = new Desktop();
            d1.setCodigo(3);
            d1.setNome("Desktop Dell");;
            d1.setMensalidade(480);;
            d1.setProcessador("Core i7 12th");;
            d1.setMemoria(4);
            d1.setHd("1TB");
            desktopService.salvar(d1);
            System.out.println("Desktop " + d1.getNome() + " cadastrado");
        } catch (Exception e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        //ler e alterar
        try{
            Optional<Desktop> desktopOptional = desktopService.obter(1);
            System.out.println(desktopOptional);

            if(desktopOptional.isPresent()){
                Desktop currentDesktop = desktopOptional.get();
                currentDesktop.setNome("Desktop Dell XPS 8950");
                desktopService.salvar(currentDesktop);
                System.out.println("Desktop " + currentDesktop.getNome() + " atualizado");
            }

        } catch (Exception e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        //listar todos
        System.out.println("************listar desktops************");
        try{
            Collection<Desktop> desktops = desktopService.obterLista();

            for(Desktop desktop : desktops){
                System.out.println(desktop);
            }

        } catch (Exception e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        System.out.println("===================================================");

    }
}
