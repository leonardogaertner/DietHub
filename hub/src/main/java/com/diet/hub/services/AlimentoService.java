package com.diet.hub.services;

import org.springframework.stereotype.Service;

import com.diet.hub.entities.Alimento;
import com.diet.hub.repositories.AlimentoRepository;

import java.util.List;

@Service
public class AlimentoService {

    private final AlimentoRepository alimentoRepository;

    public AlimentoService(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    public Alimento salvarAlimento(Alimento alimento) {
        return alimentoRepository.save(alimento);
    }

    public Alimento buscarPorId(Long id) {
        return alimentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alimento não encontrado!"));
    }

    public List<Alimento> listarTodos() {
        return alimentoRepository.findAll();
    }
}

