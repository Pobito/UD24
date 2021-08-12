package App.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import App.dto.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {

}
