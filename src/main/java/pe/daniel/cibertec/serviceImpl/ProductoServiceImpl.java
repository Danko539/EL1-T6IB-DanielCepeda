package pe.daniel.cibertec.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.daniel.cibertec.model.Producto;
import pe.daniel.cibertec.repository.ProductoRepository;
import pe.daniel.cibertec.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> listar() {
		
		return productoRepository.findAll();
	}

	@Override
	public Producto agregar(Producto producto) {
		
		return productoRepository.save(producto);
	}

}
