package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void salvar(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public Collection<Cliente> obterLista(){
        return (Collection<Cliente>) clienteRepository.findAll();
    }

    public Optional<Cliente> obter(Integer id){
        return clienteRepository.findById(id);
    }

    public void excluir(Integer id){
        clienteRepository.deleteById(id);
    }

}
