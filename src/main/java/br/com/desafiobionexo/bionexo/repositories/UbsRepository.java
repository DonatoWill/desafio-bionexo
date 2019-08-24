package br.com.desafiobionexo.bionexo.repositories;

import br.com.desafiobionexo.bionexo.domain.Ubs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbsRepository extends CrudRepository<Ubs, String>{



}
