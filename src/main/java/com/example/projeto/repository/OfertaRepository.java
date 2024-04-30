package com.example.projeto.repository;

import com.example.projeto.models.OfertaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfertaRepository extends JpaRepository<OfertaModel, Integer> {

    // Defina a consulta para encontrar ofertas com desconto
    @Query("SELECT o FROM OfertaModel o WHERE o.desconto IS NOT NULL")
    List<OfertaModel> findOfertasComDesconto();

    @Query("SELECT o FROM OfertaModel o WHERE o.desconto IS NOT NULL")
    List<OfertaModel> findByDescontoIsNotNull();
}
