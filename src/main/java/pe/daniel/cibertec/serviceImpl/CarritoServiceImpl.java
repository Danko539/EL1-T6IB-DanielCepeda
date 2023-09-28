package pe.daniel.cibertec.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.daniel.cibertec.model.Carrito;
import pe.daniel.cibertec.repository.CarritoRepository;
import pe.daniel.cibertec.service.CarritoService;

@Service
public class CarritoServiceImpl implements CarritoService{
	
	@Autowired
	private CarritoRepository carritoRepository;
	
	@Override
	public List<Carrito> listar() {
		
		return carritoRepository.findAll();
	}

}
