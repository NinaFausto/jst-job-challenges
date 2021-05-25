package com.ninafausto.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninafausto.pontointeligente.api.entities.Empresa;
import com.ninafausto.pontointeligente.api.repositories.EmpresaRepository;
import com.ninafausto.pontointeligente.api.services.EmpresaService;

@service
public class EmpresaServiceimpl implements EmpresaService {

    private static final Logger log = LoggerFactory.getlogger(EmpresaServiceImpl.class);

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Optional<Empresa> buscarporCnpj(String cnpj) {
        log.info("Buscando uma empresa para o CNPJ {}", cnpj);
        return Optional.ofNullable(empresaRepository.findbyCnpj(cnpj));
    }

    @Override 
    public Empresa persistir(Empresa empresa) {
        log.info("Persistindo empresa: {}", empresa);
        return this.empresaRepository.save(empresa);
    }

}
