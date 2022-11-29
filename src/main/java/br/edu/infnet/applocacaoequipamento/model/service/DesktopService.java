package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.repository.DesktopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class DesktopService {

    @Autowired
    private DesktopRepository desktopRepository;

    public void incluir(Desktop desktop){
        desktopRepository.save(desktop);
    }

    public Collection<Desktop> obterLista(){
        return (Collection<Desktop>) desktopRepository.findAll();
    }

    public Optional<Desktop> obter(Integer id){
        return desktopRepository.findById(id);
    }

    public void excluir(Integer id){
        desktopRepository.deleteById(id);
    }

}
