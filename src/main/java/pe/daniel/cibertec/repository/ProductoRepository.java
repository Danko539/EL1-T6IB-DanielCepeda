package pe.daniel.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.daniel.cibertec.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
