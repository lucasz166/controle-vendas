package com.api.controlevendas.repository;

import com.api.controlevendas.models.ControleVendasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ControleVendasRepository extends JpaRepository<ControleVendasModel, UUID> {
}
