package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.*;
import br.edu.infnet.applocacaoequipamento.model.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Component
@Order(6)
public class LocacaoTeste implements ApplicationRunner {

    @Autowired
    LocacaoService locacaoService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######locacao");

        try{
            Cliente cliente = new Cliente();
            cliente.setId(1);
    
            Set<Equipamento> equipamentos = new HashSet<Equipamento>();
            Desktop d1 = new Desktop();
            d1.setId(1);
            d1.setCodigo(123);
            Monitor m1 = new Monitor();
            m1.setId(2);
            m1.setCodigo(456);
            Impressora i1 = new Impressora();
            i1.setId(3);
            i1.setCodigo(789);

            equipamentos.add(d1);
            equipamentos.add(m1);
            equipamentos.add(i1);

            Locacao locacao = new Locacao(cliente, equipamentos);
            locacao.setDescricao("Primeira Locacao");
            locacao.setMeses(3);
            locacao.setCliente(cliente);
            locacao.setEquipamentos(equipamentos);
            locacaoService.incluir(locacao);
            System.out.println("Locacao " + locacao.getDescricao() + " cadastrada");
        } catch (Exception e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        try{
            Optional<Locacao> locacao = locacaoService.obter(1);
            System.out.println(locacao);
        } catch (Exception e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }
        
        System.out.println("===================================================");
    }
}
