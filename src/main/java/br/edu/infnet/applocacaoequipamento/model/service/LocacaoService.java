package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Locacao;
import br.edu.infnet.applocacaoequipamento.model.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    public void incluir(Locacao locacao){
        locacaoRepository.save(locacao);
    }

    public Collection<Locacao> obterLista(){
        return (Collection<Locacao>) locacaoRepository.findAll();
    }

    public void excluir(Integer id){
        locacaoRepository.deleteById(id);
    }

}
