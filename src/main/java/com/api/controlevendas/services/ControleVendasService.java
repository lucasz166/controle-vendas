package com.api.controlevendas.services;
import com.api.controlevendas.models.ControleVendasModel;
import com.api.controlevendas.repository.ControleVendasRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ControleVendasService {
    final ControleVendasRepository controleVendasRepository;

    public ControleVendasService(ControleVendasRepository controleVendasRepository) {
        this.controleVendasRepository = controleVendasRepository;
    }

    @Transactional
    public ControleVendasModel save(ControleVendasModel controleVendasModel) {
        return controleVendasRepository.save(controleVendasModel);
    }
}
