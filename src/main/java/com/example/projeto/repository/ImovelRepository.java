package com.example.projeto.repository;

import com.example.projeto.models.ImovelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovelRepository extends JpaRepository<ImovelModel, Integer> {

    // Define a consulta para encontrar imóveis com ofertas que tenham desconto
    List<ImovelModel> findDistinctByOfertas_DescontoIsNotNull();
}
