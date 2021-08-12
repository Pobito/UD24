package App.service;

import java.util.List;

import App.dto.Cliente;

public interface IClienteService {

	public List<Cliente> listarClientes();
	public Cliente insertCliente(Cliente cliente);
	public Cliente clienteID(Long id);
	public Cliente updateCliente(Cliente cliente);
	public void deleteCliente(Long id);
}
