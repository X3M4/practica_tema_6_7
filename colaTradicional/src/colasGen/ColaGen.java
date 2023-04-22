package colasGen;

public interface ColaGen<T> {
	public void vaciar();
	
	public boolean encolar(Object o);
	
	public Object desencolar();
	
	public Object primero();
	
	public int longitud();
	
}
