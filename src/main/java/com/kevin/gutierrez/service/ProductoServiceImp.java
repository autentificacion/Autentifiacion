package com.kevin.gutierrez.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kevin.gutierrez.model.Producto;

@Service
public class ProductoServiceImp implements IntProductoService{

	private List<Producto> lista;
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public ProductoServiceImp() {
		lista = new LinkedList<Producto>();
		//objetos de tipos producto
		Producto p1 = new Producto();
		p1.setId(1);
		p1.setNombre("kevin");
		p1.setDescripcion("Descripción del producto");
		p1.setExistencias(5);
		p1.setPrecio(302.0);
		//p1.setFechaProduccion(LocalDate.now());
		p1.setFechaProduccion(LocalDate.parse("22-03-2020", formato));
		p1.setImagen("martillo.jpg");
	
	//*****************
	Producto p2 = new Producto();
	p2.setId(2);
	p2.setNombre("Brayan");
	p2.setDescripcion("Descripción del producto");
	p2.setExistencias(10);
	p2.setPrecio(350.0);
	p2.setFechaProduccion(LocalDate.parse("02-08-2020", formato));
	p2.setImagen("desarmador.jpg");

//******************************************
	Producto p3 = new Producto();
	p3.setId(3);
	p3.setNombre("Carretilla");
	p3.setDescripcion("Descripción del producto");
	p3.setExistencias(6);
	p3.setPrecio(230.0);
	p3.setFechaProduccion(LocalDate.parse("12-05-2021", formato));
	p3.setImagen("carretilla.jpg");
	
	//******************************************
		Producto p4 = new Producto();
		p4.setId(3);
		p4.setNombre("Carretilla");
		p4.setDescripcion("Descripción del producto");
		p4.setExistencias(6);
		p4.setPrecio(230.0);
		p4.setFechaProduccion(LocalDate.parse("12-05-2021", formato));
		p4.setImagen("carretilla.jpg");

	//******************************************
		Producto p5 = new Producto();
		p5.setId(3);
		p5.setNombre("Carretilla");
		p5.setDescripcion("Descripción del producto");
		p5.setExistencias(6);
		p5.setPrecio(230.0);
		p5.setFechaProduccion(LocalDate.parse("12-05-2021", formato));
		p5.setImagen("carretilla.jpg");

	lista.add(p1);
	lista.add(p2);
	lista.add(p3);
	lista.add(p4);
	lista.add(p5);
	
	}
	@Override
	public List<Producto> obtenerTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer idProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto buscarPorId(Integer idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
