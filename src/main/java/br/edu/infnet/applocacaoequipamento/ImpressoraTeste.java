package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.service.ImpressoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Order(5)
public class ImpressoraTeste implements ApplicationRunner {

    @Autowired
    ImpressoraService impressoraService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######impressora");

        try {
            Impressora i1 = new Impressora();
            i1.setCodigo(6);
            i1.setNome("Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4");
            i1.setMensalidade(400);
            i1.setTipo("Laser");
            i1.setMarca("Xerox");
            i1.setTanqueDeTinta(false);
            impressoraService.incluir(i1);
            System.out.println("Impressora " + i1.getNome() + " cadastrada");
        } catch (Exception e) {
            System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
        }

        try{
            Optional<Impressora> impressora = impressoraService.obter(3);
            System.out.println(impressora);
        } catch (Exception e) {
            System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
        }
        
        System.out.println("===================================================");

    }
}
