package pe.daniel.cibertec.service;

import java.util.List;

import pe.daniel.cibertec.model.Producto;

public interface ProductoService {
	public List<Producto> listar();
	public Producto agregar(Producto producto);
}
