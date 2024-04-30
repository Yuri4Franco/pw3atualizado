package com.example.projeto.service;

import com.example.projeto.models.DescontoModel;
import com.example.projeto.models.OfertaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projeto.repository.DescontoRepository;
import com.example.projeto.repository.OfertaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OfertaService {

    @Autowired
    private OfertaRepository ofertaRepository;

    
    @Autowired
    private DescontoRepository descontoRepository;

    public List<OfertaModel> buscarOfertasComDesconto() {
        return ofertaRepository.findByDescontoIsNotNull();
    }

    public List<OfertaModel> getAll() {
        return ofertaRepository.findAll();
    }

    public OfertaModel findById(Integer id) {
        Optional<OfertaModel> ofertaOptional = ofertaRepository.findById(id);
        return ofertaOptional.orElse(null);
    }

    public OfertaModel insert(OfertaModel model) {
        return ofertaRepository.save(model);
    }

    public OfertaModel create(OfertaModel oferta) {
        return ofertaRepository.save(oferta);
    }

    public OfertaModel update(OfertaModel oferta) {
        return ofertaRepository.save(oferta);
    }

    public void deleteById(Integer id) {
        ofertaRepository.deleteById(id);
    }

    public List<OfertaModel> findOfertasComDesconto() {
        return ofertaRepository.findOfertasComDesconto();
    }

    public void associarDesconto(OfertaModel oferta, DescontoModel desconto) {
        oferta.setDesconto(desconto);
        ofertaRepository.save(oferta);
    }
}
