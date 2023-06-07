
public class Principal {

	public static void main(String[] args) {
		Mascotas mascota = new Mascotas();
	    mascota.setNombre("Firulais");
	    mascota.setEspecie("Perro");
	    mascota.setEdad(3);
		System.out.println("Nombre de la mascota: " + mascota.getNombre());
        System.out.println("Especie de la mascota: " + mascota.getEspecie());
        System.out.println("Edad de la mascota: " + mascota.getEdad());

	}

}
