package com.example.salaheddine;

import com.example.salaheddine.dao.ClientRepository;
import com.example.salaheddine.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Autowired
    ClientRepository clientRepository;
    private void initCustomers(){
        String[] customers = {"oussama", "salah", "zaki", "ilyass", "omar"};
        for(String name : customers){
            Client customer = new Client();
            customer.setName(name);
            customer.setEmail(name+"@gmail.com");
            clientRepository.save(customer);
        }
    }

    @Override
    public void run(String... args) throws Exception {
        initCustomers();
    }

}
