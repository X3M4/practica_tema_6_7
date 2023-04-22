package colasGen;

import colasOOP.ColaArrayObj;

public class  U6y7E02F {
	public static void main(String[] args) {
		ColaGenArray<Object> caoe = new ColaGenArray<>();
		caoe.encolar(1);
		caoe.encolar(56);
		caoe.encolar(5);
		caoe.encolar(76);
		System.out.println("Cola de int");
		System.out.println(caoe);
		caoe.desencolar();
		caoe.encolar(23);
		System.out.println(caoe);
		
		System.out.println("\nCola de String");
		ColaGenArray<String> caos = new ColaGenArray<>();
		caos.encolar("Primero");
		caos.encolar("Segundo");
		caos.encolar("Tercero");
		caos.encolar("Cuarto");
		System.out.println(caos);
		caos.desencolar();
		caos.encolar("Quinto");
		System.out.println(caos);
		
		ColaGenArray<Persona> caop = new ColaGenArray<>();
		caop.encolar(new Persona("Luis", 27));
		caop.encolar(new Persona("Belén", 55));
		caop.encolar(new Persona("Vicente", 47));
		caop.encolar(new Persona("Andrés", 76));
		System.out.println("\nCola de Persona");
		System.out.println(caop);
		caop.desencolar();
		caop.encolar(new Persona("María", 61));
		System.out.println(caop);
		
		ColaGenArray<Object> caom = new ColaGenArray<>();
		caom.encolar(5);
		caom.encolar("String 1");
		caom.encolar(new Persona("Persona 1", 30));
		caom.encolar("String 2");
		caom.encolar(new Persona("Persona 2", 98));
		System.out.println("\nCola Mixta");
		System.out.println(caom);
		caom.desencolar();
		caom.encolar("Último String");
		System.out.println(caom);
		
		for(Object o: caos) {
			System.out.println(o);
		}
		
		System.out.println(caop);
		
		imprimeMedia(caoe);
		imprimeMedia(caos);
		imprimeMedia(caop);
		imprimeMedia(caom);
		
		
		
	}
	
	public static void imprimeMedia(ColaGenArray cao) {
		int suma = 0;
		int valor = 0;
		int num_datos = 0;
		Object[] o = cao.getDatos();
		try {
			for(int i = 0; i < cao.getDatos().length; i++) {
				if(o[i] instanceof Integer || o[i] != (null)) {
					valor = (int) o[i];
					suma += valor;
					num_datos++;
				}
			}
		}catch(Exception e) {
			e.getMessage();
		}
		try {
			double media = suma/num_datos;
			System.out.println(media);

		}catch(Exception e) {
			e.getMessage();
		}
	}
}
