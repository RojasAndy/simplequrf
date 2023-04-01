package package12_ARojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import package12_ARojas.model.Empleados;
import package12_ARojas.repository.IEmpleadosRepository;

@Controller
public class Controlador {
	@Autowired
	private IEmpleadosRepository rps;
	
	@GetMapping("/registrar")
	public String reporte(@RequestParam(name = "nombre", required = false, defaultValue = "Marcos") String nombregh, Model modelogh) {
		Empleados em = new Empleados();
		em.setCodigo(1);
		em.setApellido("Rojas");
		em.setNombre("Andy");
		em.setOcupacion("Pintor");
		em.setSueldo(1200.90);
		rps.save(em);
		
		modelogh.addAttribute("nm", em.getNombre());
		return "welcome";
	}
	
	@GetMapping("/listar")
	public String reporte(Model modelxds) {
		modelxds.addAttribute("empleados", rps.findAll());
		return "list";
	}
}
