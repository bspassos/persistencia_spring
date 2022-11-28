package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    public void incluir(Monitor monitor){

        monitorRepository.save(monitor);
    }

    public Collection<Monitor> obterLista(){
        return (Collection<Monitor>) monitorRepository.findAll();
    }

    public void excluir(Integer id){
        monitorRepository.deleteById(id);
    }


}
