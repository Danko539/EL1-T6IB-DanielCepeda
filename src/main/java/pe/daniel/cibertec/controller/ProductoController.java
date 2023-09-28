package pe.daniel.cibertec.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import pe.daniel.cibertec.model.Producto;
import pe.daniel.cibertec.service.ProductoService;
import pe.daniel.cibertec.serviceImpl.UploadFileService;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private UploadFileService uploadFileService;
	
	@GetMapping("/listado")
	public String listado(Model model) {
		List<Producto> lista = productoService.listar();
		model.addAttribute("listadoProductos", lista);
		
		return "listadoProductos";
	}
	
	@GetMapping("/agregar")
	public String agregar(Model model) {
		model.addAttribute("producto", new Producto());
		
		return "agregarProducto";
	}
	
	@PostMapping("/grabar")
	public String grabar(Producto producto, @RequestParam("img") MultipartFile file) throws IOException {
		
		// imagen
		if (producto.getId() == null) { // cuando se crea un producto
			String nombreImagen = uploadFileService.saveImage(file);

			producto.setImagen(nombreImagen);
		}

		productoService.agregar(producto);
		
		return "redirect:/listado";
	}
}
