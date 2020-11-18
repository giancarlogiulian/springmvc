package com.example.springmvc.boot;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        Product product1 = new Product();
        product1.setCategory("Jogos");
        product1.setDescription("GTA IV");
        product1.setName("GTA IV");
        product1.setType("Ação");
        product1.setPrice(200.0);

        repository.save(product1);

        Product product2 = new Product();
        product2.setCategory("Jogos");
        product2.setDescription("NFS U2");
        product2.setName("NFS U2");
        product2.setType("Corrida");
        product2.setPrice(100.0);

        repository.save(product2);
    }
}
