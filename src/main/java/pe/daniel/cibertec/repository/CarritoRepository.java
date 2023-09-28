package pe.daniel.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.daniel.cibertec.model.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer>{

}
