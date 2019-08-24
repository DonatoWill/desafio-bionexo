package br.com.desafiobionexo.bionexo.services;

import br.com.desafiobionexo.bionexo.domain.Ubs;
import br.com.desafiobionexo.bionexo.repositories.UbsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbsService{


    @Autowired
    private UbsRepository ubsRepository;

    public List<Ubs> findAll(){
        return (List<Ubs>) this.ubsRepository.findAll();
    }

}
