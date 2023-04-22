package colasGen;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ColaGenArray<T> implements ColaGen, Iterable<Object>{
	private static final int LONGITUD_POR_DEFECTO = 20;
	private int max_longitud;
	private int cabeza;
	private int fin;
	private Object[] datos;
	
	public ColaGenArray() {
		this.datos = new Object[this.LONGITUD_POR_DEFECTO];
		this.max_longitud = this.LONGITUD_POR_DEFECTO + 1;
		this.fin = 0;
		this.cabeza = 1;
		
	}
	
	public ColaGenArray(int longitud) {
		this.max_longitud = longitud +1;
		this.fin = 0;
		this.cabeza = 1;
		this.datos = new Object[this.max_longitud];
	}
	
	
	@Override
	public void vaciar() {
		// TODO Auto-generated method stub
		this.fin = 0;
		this.cabeza = 1;
	}
	
	@Override
	public boolean encolar(Object o) {
		// TODO Auto-generated method stub
		if((this.fin + 2) % this.max_longitud != this.cabeza) {
			this.fin = (this.fin + 1) % this.max_longitud;
			datos[this.fin] = o;
			return true;
		}
		else {
			throw new IndexOutOfBoundsException("La cola está llena");
		}
	}
	
	@Override
	public Object desencolar(){
		// TODO Auto-generated method stub
		if(longitud() != 0) {
			Object o = datos[cabeza];
			datos[cabeza] = null;
			this.cabeza = (cabeza + 1) % this.max_longitud;
			return o;
			
		}else {
			throw new IllegalArgumentException("La cola está vacía");
		}
		
	}

	@Override
	public Object primero() throws IllegalArgumentException{
		// TODO Auto-generated method stub
		if(longitud() != 0) {
			return datos[this.cabeza];
		}else {
			throw new IllegalArgumentException("La cola está vacía");
		}
	}

	@Override
	public int longitud() {
		// TODO Auto-generated method stub
		return (this.fin + this.max_longitud - this.cabeza + 1) % this.max_longitud;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < this.datos.length; i++) {
			sb.append(datos[i] + "-");
		}
		sb.append("]");
		sb.delete(sb.length()-2, sb.length()-1);
		return sb.toString();
	}
	
	public Object[] getDatos() {
		return this.datos;
	}
	
	class ObjectIterator implements Iterator<Object>{
		private int cont = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return cont < datos.length;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(cont == datos.length) {
				throw new NoSuchElementException("No quedan elementos");
			}
			cont++;
			return datos[cont-1];
		}
		
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new ObjectIterator();
	}

}
