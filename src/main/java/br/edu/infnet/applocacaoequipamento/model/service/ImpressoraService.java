package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.repository.ImpressoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ImpressoraService {

    @Autowired
    private ImpressoraRepository impressoraRepository;

    public void salvar(Impressora impressora){
        impressoraRepository.save(impressora);
    }

    public Collection<Impressora> obterLista(){
        return (Collection<Impressora>) impressoraRepository.findAll();
    }

    public Optional<Impressora> obter(Integer id){
        return impressoraRepository.findById(id);
    }

    public void excluir(Integer id){
        impressoraRepository.deleteById(id);
    }

}
