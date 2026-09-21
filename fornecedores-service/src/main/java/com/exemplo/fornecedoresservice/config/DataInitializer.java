package com.exemplo.fornecedoresservice.config;

import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final FornecedorRepository repository;

    public DataInitializer(FornecedorRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.save(new Fornecedor(null, "Distribuidora Tech", "11.111.111/0001-11"));
        repository.save(new Fornecedor(null, "Logística Rápida", "22.222.222/0001-22"));
        repository.save(new Fornecedor(null, "Importadora Global", "33.333.333/0001-33"));
        repository.save(new Fornecedor(null, "Atacado do Hardware", "44.444.444/0001-44"));
        repository.save(new Fornecedor(null, "Componentes SA", "55.555.555/0001-55"));
    }
}