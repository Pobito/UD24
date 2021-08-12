package App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.dao.ClienteDAO;
import App.dto.Cliente;

@Service
public class ClienteService implements IClienteService {
	@Autowired
	ClienteDAO ClienteDAO;

	@Override
	public List<Cliente> listarClientes() {
		return ClienteDAO.findAll();
	}

	@Override
	public Cliente insertCliente(Cliente cliente) {
		return ClienteDAO.save(cliente);
	}

	@Override
	public Cliente clienteID(Long id) {
		return ClienteDAO.findById(id).get();
	}

	@Override
	public Cliente updateCliente(Cliente cliente) {
		return ClienteDAO.save(cliente);
	}

	@Override
	public void deleteCliente(Long id) {
		ClienteDAO.deleteById(id);
		
	}

}
