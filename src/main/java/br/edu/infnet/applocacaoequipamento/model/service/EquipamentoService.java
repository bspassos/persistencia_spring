package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Equipamento;
import br.edu.infnet.applocacaoequipamento.model.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EquipamentoService {

    @Autowired
    private EquipamentoRepository equipamentoRepository;

    public List<Equipamento> obterLista(){
        return (List<Equipamento>) equipamentoRepository.findAll();
    }

    public void excluir(Integer id){
        equipamentoRepository.deleteById(id);
    }

}
