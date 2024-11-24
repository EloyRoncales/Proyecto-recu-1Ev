public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Compra-Venta de Coches");
        cargarDatosIniciales(empresa);
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Menú Principal:");
        System.out.println("1- Crear nueva sede");
        System.out.println("2- Introducir coche en una sede");
        System.out.println("3- Vender coche");
        System.out.println("4- Buscar coches por marca");
        System.out.println("5- Buscar coches por modelo");
        System.out.println("6- Mostrar listado de coches por concesionario");
        System.out.println("7- Salir");

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Nombre de la ciudad: ");
                String ciudad = scanner.next();
                System.out.print("Capacidad máxima: ");
                int tamanyo = scanner.nextInt();
                empresa.crearSede(ciudad, tamanyo);
                break;

            case 2:
                System.out.print("Marca: ");
                String marca = scanner.next();
                System.out.print("Modelo: ");
                String modelo = scanner.next();
                System.out.print("Matrícula: ");
                String matricula = scanner.next();
                System.out.print("Año: ");
                int anyo = scanner.nextInt();
                System.out.print("Precio: ");
                double precio = scanner.nextDouble();
                System.out.print("Kilómetros: ");
                int kms = scanner.nextInt();
                System.out.print("Ciudad del concesionario: ");
                ciudad = scanner.next();

                Concesionario concesionario = empresa.getConcesionario(ciudad);
                if (concesionario != null) {
                    concesionario.adquirirCoche(new Coche(marca, modelo, matricula, anyo, precio, kms));
                } else {
                    System.out.println("ERROR: No existe un concesionario en " + ciudad);
                }
                break;

            case 3:
                System.out.print("Ciudad del concesionario: ");
                ciudad = scanner.next();
                System.out.print("Matrícula del coche a vender: ");
                matricula = scanner.next();

                concesionario = empresa.getConcesionario(ciudad);
                if (concesionario != null) {
                    concesionario.venderCoche(matricula);
                } else {
                    System.out.println("ERROR: No existe un concesionario en " + ciudad);
                }
                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:

                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }





    public static void cargarDatosIniciales(Empresa empresa) {
        // Crear concesionarios
        empresa.crearSede("Madrid", 7);
        empresa.crearSede("Barcelona", 6);
        empresa.crearSede("Valencia", 8);

        // Crear coches y añadir a los concesionarios
        Concesionario madrid = empresa.getConcesionario("Madrid");
        madrid.adquirirCoche(new Coche("Toyota", "Corolla", "1234ABC", 2015, 12000, 80000));
        madrid.adquirirCoche(new Coche("Honda", "Civic", "5678DEF", 2018, 14000, 60000));
        madrid.adquirirCoche(new Coche("Peugeot", "407", "2329EFG", 2019, 12000, 113000));
        madrid.adquirirCoche(new Coche("Subaru", "Impreza", "9671RFG", 2014, 18000, 103000));

        Concesionario barcelona = empresa.getConcesionario("Barcelona");
        barcelona.adquirirCoche(new Coche("Ford", "Fiesta", "4321GHI", 2017, 10000, 50000));
        barcelona.adquirirCoche(new Coche("BMW", "Serie 3", "8765JKL", 2020, 25000, 30000));
        barcelona.adquirirCoche(new Coche("Yaguar", "XF", "9065HGT", 2021, 35000, 75000));
        barcelona.adquirirCoche(new Coche("BMW", "Serie 5", "3287HNJ", 2018, 22000, 87000));
        barcelona.adquirirCoche(new Coche("Seat", "Ibiza", "1954SAM", 2017, 9000, 60000));

        Concesionario valencia = empresa.getConcesionario("Valencia");
        valencia.adquirirCoche(new Coche("Audi", "A4", "1122MNO", 2016, 22000, 70000));
        valencia.adquirirCoche(new Coche("Mercedes", "Clase C", "3344PQR", 2019, 27000, 45000));
        valencia.adquirirCoche(new Coche("Audi", "A3", "1542GHO", 2017, 22000, 80000));
        valencia.adquirirCoche(new Coche("Ford", "Mondeo", "1058WSY", 2017, 24000, 65000));

        System.out.println("Datos iniciales cargados correctamente.");
    }

}