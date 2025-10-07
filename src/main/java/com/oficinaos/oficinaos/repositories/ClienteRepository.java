package com.oficinaos.oficinaos.repositories;

import com.oficinaos.oficinaos.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByNomeContainingIgnoreCase(String nome);
}
