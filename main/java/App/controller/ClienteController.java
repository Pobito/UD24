package App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import App.dto.Cliente;
import App.service.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listarClientes(){
		return clienteService.listarClientes();
	}
	
	@PostMapping("/clientes")
	public Cliente insertCliente(@RequestBody Cliente cliente) {
		return clienteService.insertCliente(cliente);
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente clienteID(@PathVariable(name="id") Long id) {
		Cliente cliente_id = new Cliente();
		cliente_id = clienteService.clienteID(id);
		System.out.println("Cliente ID: " + cliente_id);
		return cliente_id;
	}

	@PutMapping("/clientes/{id}")
	public Cliente updateCliente(@PathVariable(name="id") Long id, @RequestBody Cliente cliente) {
		Cliente clienteSelected = new Cliente();
		Cliente clienteUpdated = new Cliente();
		
		clienteSelected = clienteService.clienteID(id);
		
		clienteSelected.setNombre(cliente.getNombre());
		clienteSelected.setApellido(cliente.getApellido());
		clienteSelected.setDireccion(cliente.getDireccion());
		clienteSelected.setDni(cliente.getDni());
		clienteSelected.setFecha(cliente.getFecha());
		
		clienteSelected = clienteService.updateCliente(clienteSelected);
		
		System.out.println("Cliente actualizado");
		
		return clienteUpdated;
	}

	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable(name="id")Long id) {
		clienteService.deleteCliente(id);
	}
}
