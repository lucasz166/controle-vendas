package com.api.controlevendas.controller;

import com.api.controlevendas.dtos.ControleVendasDto;
import com.api.controlevendas.models.ControleVendasModel;
import com.api.controlevendas.services.ControleVendasService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/vendas")
public class ControleVendasController {

    final ControleVendasService controleVendasService;

    public ControleVendasController(ControleVendasService controleVendasService) {
        this.controleVendasService = controleVendasService;
    }

    @PostMapping
    public ResponseEntity<Object> saveControleVendas(@RequestBody @Valid ControleVendasDto controleVendasDto) {
        var controleVendasModel = new ControleVendasModel();
        BeanUtils.copyProperties(controleVendasDto, controleVendasModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(controleVendasService.save(controleVendasModel));
    }

}
