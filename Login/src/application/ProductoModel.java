package application;

import java.time.LocalDate;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ProductoModel {
	
	private final StringProperty producto;
    private final IntegerProperty unidades;
    private final DoubleProperty precio;
    private final ObjectProperty<LocalDate>  fecha;


	public ProductoModel(String producto, Integer unidades) {
		
		this.producto = new SimpleStringProperty(producto);
		this.unidades = new SimpleIntegerProperty(unidades);
		this.precio = null;
		this.fecha = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));;
	}


	public StringProperty getProducto() {
		return producto;
	}
	
	public void setProducto(String producto) {
        this.producto.set(producto);
    }


	public IntegerProperty getUnidades() {
		return unidades;
	}
	
	public void setUnidades(Integer unidades) {
        this.unidades.set(unidades);
    }


	public DoubleProperty getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
        this.precio.set(precio);
    }


	public ObjectProperty<LocalDate> getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
        this.fecha.set(fecha);
    }

	public ObjectProperty<LocalDate> fechaProperty() {
        return fecha;
    }
	
    
    
}
