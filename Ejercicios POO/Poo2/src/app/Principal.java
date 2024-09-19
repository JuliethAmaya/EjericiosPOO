
package app;


public class Principal {
    
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Hotel Luxor", "Av. Central 123, Ciudad", 200, 5);
        Hotel hotel2 = new Hotel("Hotel Sol", "Calle del Sol 45, Playa", 150, 4);
        Hotel hotel3 = new Hotel("Hotel Sierra", "Carretera Nacional km 12, Montania", 80, 3);

        System.out.println(hotel1);
        System.out.println(hotel2);
        System.out.println(hotel3);
        
        System.out.println("**********************************************************************************");
        
        Juego juego1 = new Juego("The Legend of Zelda: Breath of the Wild", "Nintendo Switch", 2017, "Accion-aventura");
        Juego juego2 = new Juego("God of War", "PlayStation 4", 2018, "Accion");
        Juego juego3 = new Juego("Minecraft", "PC", 2011, "Sandbox");

        System.out.println(juego1);
        System.out.println(juego2);
        System.out.println(juego3);
        
        System.out.println("**********************************************************************************");
        
        Universidad universidad1 = new Universidad("Universidad Nacional", "Calle 45 #26-85, Bogota", 45000, 1);
        Universidad universidad2 = new Universidad("Universidad de los Andes", "Carrera 1 #18A-12, Bogota", 20000, 2);
        Universidad universidad3 = new Universidad("Pontificia Universidad Javeriana", "Carrera 7 #40-62, Bogota", 22000, 3);

        System.out.println(universidad1);
        System.out.println(universidad2);
        System.out.println(universidad3);
        
        System.out.println("**********************************************************************************");
        
        Factura factura1 = new Factura(101, "2024-07-25", "Juan Perez", 1500.75);
        Factura factura2 = new Factura(102, "2024-07-26", "Maria Gomez", 3000.50);
        Factura factura3 = new Factura(103, "2024-07-27", "Carlos Rodriguez", 500.25);

        System.out.println(factura1);
        System.out.println(factura2);
        System.out.println(factura3);
        
        System.out.println("**********************************************************************************");
        
        Proveedor proveedor1 = new Proveedor("Carlos Perez", "Tech Supplies Co.", "123-456-7890", "carlos@techsupplies.co");
        Proveedor proveedor2 = new Proveedor("Laura Martinez", "Office Goods Inc.", "098-765-4321", "laura@officegoods.com");
        Proveedor proveedor3 = new Proveedor("Miguel Hernandez", "Industrial Tools Ltd.", "555-123-4567", "miguel@industrialtools.com");

        System.out.println(proveedor1);
        System.out.println(proveedor2);
        System.out.println(proveedor3);
        
        System.out.println("**********************************************************************************");
        
        Mascota mascota1 = new Mascota("Rober", "Perro", 5, "Juan Perez");
        Mascota mascota2 = new Mascota("Romeo", "Gato", 3, "Maria Gomez");
        Mascota mascota3 = new Mascota("Nemo", "Pez", 1, "Carlos Rodriguez");

        System.out.println(mascota1);
        System.out.println(mascota2);
        System.out.println(mascota3);
        
        System.out.println("**********************************************************************************");
        
        Orden orden1 = new Orden(1, "2024-07-25", "Juan Perez", 1500.75);
        Orden orden2 = new Orden(2, "2024-07-26", "Maria Gomez", 3000.50);
        Orden orden3 = new Orden(3, "2024-07-27", "Carlos Rodriguez", 500.25);

        System.out.println(orden1);
        System.out.println(orden2);
        System.out.println(orden3);
        
        System.out.println("**********************************************************************************");
        
        Persona persona1 = new Persona("Juan", "Perez", 30, "Calle Falsa 123");
        Persona persona2 = new Persona("Maria", "Gomez", 25, "Avenida Siempreviva 456");
        Persona persona3 = new Persona("Carlos", "Rodriguez", 40, "Boulevard Central 789");

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        
        System.out.println("**********************************************************************************");
        
        Restaurante restaurante1 = new Restaurante("El Buen Sabor", "Calle Falsa 123", "Mexicana", 4.5);
        Restaurante restaurante2 = new Restaurante("La Trattoria", "Avenida Italia 456", "Italiana", 4.7);
        Restaurante restaurante3 = new Restaurante("Sushi Master", "Boulevard Japon 789", "Japonesa", 4.8);

        System.out.println(restaurante1);
        System.out.println(restaurante2);
        System.out.println(restaurante3);
        
        System.out.println("**********************************************************************************");
        
        Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia ficcion");
        Pelicula pelicula2 = new Pelicula("The Shawshank Redemption", "Frank Darabont", 1994, "Drama");
        Pelicula pelicula3 = new Pelicula("The Godfather", "Francis Ford Coppola", 1972, "Crimen");

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
        
    }
            
        
}
