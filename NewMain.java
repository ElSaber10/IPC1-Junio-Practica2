import java.util.Scanner;
import java.util.*;

public class NewMain{
	public static void main(String[] args){
		NewMain te = new NewMain();
                
	}

	Scanner scanner = new Scanner(System.in);
	Scanner scanner2 = new Scanner(System.in);
	Scanner scanner22 = new Scanner(System.in);
	Scanner scanner3 = new Scanner(System.in);
        //Clientes 
String[] Nombre = new String[100] ;
    int[] IdCliente = new int[100];
    int[] Telefono = new int[100];
    boolean [] compra = new boolean [100];
//Peliculas
    int[] IdPeli = new int[100];
    String[] NombrePeli = new String[100];
    int[] AnioPeli = new int[100];
    String[] CategoriaPeli = new String[100];
    boolean[] DisponiblePe = new boolean[100];
    int [] cantidadDias = new int [100];
    int [] DiasAlquiler = new int [100];            
//Prestamo de peliculas

	public NewMain(){
//            llenarNombresIdes(Nombre, 0, "hhh", IdCliente, 001, Telefono, 123456);

            llenarNom();
            llenarpeli();
            
            
            boolean desicion = true;
            int op;
            
            do {
                System.out.println("1) Prestamo de peliculas");
                System.out.println("2) Devolución de peliculas");
                System.out.println("3) Mostrar Peliculas");
                System.out.println("4) Ordenar Peliculas Ascendente respecto al ID");
                System.out.println("5) Mostrar Clientes"); 
                System.out.println("6) Ordenar peliculas descendente ID"); 
                System.out.println("7) Reporte de peliculas por categorias"); 
                System.out.println("8) Reporte de peliculas mas prestadas ordenado descendente"); 
                System.out.println("9) SALIR");
                
                op = scanner.nextInt();
                if (op == 1){
                    System.out.println("***************PELICULAS DISPONIBLES***************");
                    mostrarPeliDisponible(NombrePeli, IdPeli, AnioPeli, CategoriaPeli, DisponiblePe);
                    buscarNombre(IdCliente, Nombre);
                    buscarPelicula(NombrePeli, DisponiblePe);
                }
                if (op == 2){
                    System.out.println("Devolución de peliculas");
                                        Prestadas(Peliculiculasprestadas, nombrePrestado, DisponiblePe,compra);
                }
                if (op == 3){
                    System.out.println("Mostar peliculas"); 
                    mostrarTienda(NombrePeli, IdPeli, AnioPeli, Nombre, compra);
                }
                if (op == 4){
                    System.out.println("Ordenar Peliculas Ascendente respecto al ID");
                    mostrarTienda(NombrePeli, IdPeli, AnioPeli, Nombre, compra);
                }
                if (op == 5){
                    System.out.println("Mostrar Clientes");
                    mostrarNombre(Nombre, IdCliente, Telefono);
                }
                if (op == 6){
                    System.out.println("Ordenar peliculas descendente ID");
                    Ordenar(IdCliente);
                }
                if (op == 7){
                    System.out.println("Reporte de peliculas por categorias");
                   mostrarporcategoria();
                }
                if (op == 8){
                    System.out.println("Reporte de peliculas mas prestadas ordenado descendente");
                    OrdenarDescendente(IdPeli);
                }
                if (op == 9){
                    System.out.println("Gracias por entrar");
                    desicion = false;
                }
            } while (desicion);
            
            //mostrarNombre(Nombre,IdCliente,Telefono);
            System.out.println(" ");
            //mostrarTienda(NombrePeli, IdPeli, AnioPeli, CategoriaPeli, DisponiblePe);
        }
       
public void Prestadas(String [] nombrepeli, String [] nombre, boolean [] estadopeli, boolean[] estadoCliente) {
    
            for (int i = 0; i < nombrepeli.length; i++) {
                if (nombrepeli[i] != null){
//                    if (estadopeli[i] == false){
//                        System.out.print(NombrePeli[i]);
//                    }
//                    if (estadoCliente[i] == false){
//                         System.out.println(" * | * " + nombre[i]);
//                         System.out.println();
//                    }
System.out.println( nombrepeli[i] + "***" + nombre[i]);
                    }
            }
            Scanner sca = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la pelicula para devolver");
            

    }
public void mostrarporcategoria(){
    String [] terror = new String [100];
    int co = 0;
    String [] comedia = new String [100];
    int come = 0;
    String [] Suspens = new String [100];
    int suspens = 0;
    String [] fantacy = new String [100];
    int fanta = 0;
    for (int i = 0; i < CategoriaPeli.length; i++) {
        if (CategoriaPeli[i] != null){
            if (CategoriaPeli[i] == "Terror"){
                terror[co] = NombrePeli[i];
            co++;
            }
            if (CategoriaPeli[i] == "Suspenso"){
                Suspens[suspens] = NombrePeli[i];
            suspens++;
            }
            if (CategoriaPeli[i] == "Fantacia"){
                fantacy[fanta] = NombrePeli[i];
            fanta++;
            }
            if (CategoriaPeli[i] == "Comedia"){
                comedia[come] = NombrePeli[i];
            come++;
            }
        }
    }
           for (int i = 0; i < comedia.length; i++) {
        if (comedia[i] != null){
            System.out.println( "** Comedia  " + comedia[i]);
        }
           }
           for (int ii = 0; ii < fantacy.length; ii++) {
        if (fantacy[ii] != null){
            System.out.println( "** Fantacia  " + fantacy[ii]);
        }
           }
           for (int iii = 0; iii < terror.length; iii++) {
        if (terror[iii] != null){
            System.out.println( "** Terror  " + terror[iii]);
        }
    }
           for (int iii = 0; iii < Suspens.length; iii++) {
        if (Suspens[iii] != null){
            System.out.println( "** Suspenso  " + Suspens[iii]);
        }
    }

}
public void llenarNombres(String [] arreglo, int posicion, String nombre, int [] IDE, int id,int [] telefono, int telef, boolean[] Compra, boolean compra){
    arreglo[posicion] = nombre;
    IDE[posicion] = posicion;
    telefono[posicion]=telef;
    Compra[posicion] = compra;
}
public void mostrarNombre (String [] arreglo, int [] ide, int [] tel){
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] != null){
        System.out.println(" |  " + ide[i] + " |  " + arreglo[i] +" |  " + tel[i]);
        }
        }
}
public void LlenarTienda(int [] IdPelii, String [] Nombrepeli,String nombre, int [] AnioPel, int anio, String [] Categoria, String catego, boolean [] Estado, boolean estado, int posic){
    IdPelii [posic] = posic;
    Nombrepeli[posic] = nombre;
    AnioPel[posic] = anio;
    Categoria[posic] = catego;
    Estado[posic] = estado;
}
public void mostrarTienda (String [] Nompeli, int [] idePeli, int [] Anio, String [] catego, boolean[] estado){
    for (int i = 0; i < Nompeli.length; i++) {
        if (Nompeli[i] != null){
        System.out.println( " |  " + idePeli[i] + "  | " + Nompeli[i] + "  |  " + Anio[i] + "  |  " + catego[i] + "  |  " + estado[i]);
        }
        }
}

public void mostrarPeliDisponible (String [] Nompeli, int [] idePeli, int [] Anio, String [] catego, boolean[] estado){
    for (int i = 0; i < Nompeli.length; i++) {
        if (Nompeli[i] != null){
            if (estado [i] != false){
            System.out.println( " |  " + idePeli[i] + "  | " + Nompeli[i] + "  |  " + Anio[i] + "  |  " + catego[i] + "  |  " + estado[i]);
            }
        }
        }
}
public boolean Estado(boolean estado){
    return  estado == true;
}
public void Ordenar(int [] array){
	int temporal=0;
		for (int i = 0;i < array.length; i++){
			for (int j = 0; j< array.length-1; j++){
				if (array[j] < array[j+1]){ // Ordena el array de mayor a menor, cambiar el "<" a ">" para ordenar de menor a mayor
				temporal = array[j]; 
				array[j] = array[j+1]; 
				array[j+1] = temporal;
				}
			}
		}
                for (int i = 0; i < array.length; i++) {
                    if (Nombre[i] != null){
                        System.out.println(" |  " + array[i]);
                    }
                }
	}

public void OrdenarDescendente(int [] array){
	int temporal=0;
		for (int i = 0;i < array.length; i++){
			for (int j = 0; j< array.length-1; j++){
				if (array[j] > array[j+1]){ // Ordena el array de mayor a menor, cambiar el "<" a ">" para ordenar de menor a mayor
				temporal = array[j]; 
				array[j] = array[j+1]; 
				array[j+1] = temporal;
				}
			}
		}
                for (int i = 0; i < array.length; i++) {
                    if (Nombre[i] != null){
                        System.out.println(" |  " + array[i]);
                    }
                }
	}
String [] Peliculiculasprestadas = new String [100];
            int cont =0;
    public void buscarPelicula(String[] NomPeli, boolean [] disponible) {
        boolean ops = true;
        do {                
            System.out.println("******************** Qué pelicula quiere alquilar ************************");
            String cual = scanner2.nextLine();

            for (int i = 0; i < NomPeli.length; i++) {
                if (NomPeli[i] != null){
                    if  (cual == null ? NomPeli[i] == null : cual.equals(NomPeli[i]) ) {
                        System.out.println("Ya se encontro. Seleccionada  *** " + cual + " *** "+"\n");
                        System.out.println("Presione S si esta seguro de lo contrario N");
                        String s = scanner22.nextLine();
                        if ("S".equals(s) || "s".equals(s)){
                            Peliculiculasprestadas[cont] = NomPeli[i];
                            cont++;
                            DiasDeAlquiler(DiasAlquiler, i);
                            disponible[i]=false;
                        ops = false;
                        }
                        break;
                    }
                }
            }
        } while (ops);

    }
    String [] nombrePrestado = new String[100];
    int contNom=0;
        public void buscarNombre(int[] Ide, String [] nombre) {
        boolean ops = true;
        do {                
            System.out.println("******************** Cual es su ID de cliente ************************");
            int cual = scanner3.nextInt();
            for (int i = 0; i < Ide.length; i++) {
                    if  (Ide[i] == cual) {
                            if (compra[i]== false){
                                System.out.println("No esta disponible su usuario");
                                break;
                            }else{
                        System.out.println("Ya se encontro. Seleccionado/a  *** " + cual +  " | " +nombre[i]  + " *** "+"\n");
                        ops = false;
                        compra[i]= false;
                        nombrePrestado[contNom] = nombre[i];
                        contNom++;
                        break;
                            }
                    }
            }
        } while (ops);
    }
        public void DiasDeAlquiler(int [] alqui, int posci){
            Scanner n = new Scanner(System.in);
            System.out.println("Cuantos dias alquilará ");
            int ss = n.nextInt();
            alqui[posci] = ss;
        }
        public void llenarNom(){
                        llenarNombres( Nombre, 0,  "Jorge", IdCliente, 0000001, Telefono,12345671, compra, true);
            llenarNombres( Nombre, 1,  "Daniel", IdCliente, 0001, Telefono,12345672, compra, true);
            llenarNombres( Nombre, 2,  "Alex", IdCliente, 0001, Telefono,12345673, compra, true);
            llenarNombres( Nombre, 3,  "Alan", IdCliente, 0001, Telefono,12345674, compra, true);
            llenarNombres( Nombre, 4,  "Fabí", IdCliente, 0001, Telefono,12345675, compra, true);
            llenarNombres( Nombre, 5,  "Ana", IdCliente, 0001, Telefono,12345676, compra, true);
            llenarNombres( Nombre, 6,  "Karla", IdCliente, 0001, Telefono,12345677, compra, true);
            llenarNombres( Nombre, 7,  "Margarita", IdCliente, 0001, Telefono,12345678, compra, true);
            llenarNombres( Nombre, 8,  "Elia", IdCliente, 0001, Telefono,12345679, compra, true);
            llenarNombres( Nombre, 9,  "Beatriz", IdCliente, 0001, Telefono,12345610, compra, true);
            llenarNombres( Nombre, 10,  "Juan", IdCliente, 0001, Telefono,12345611, compra, true);
            llenarNombres( Nombre, 11, "VIviana", IdCliente, 0001, Telefono,12345612, compra, true);
            llenarNombres( Nombre, 12,  "Stephanie", IdCliente, 0001, Telefono,12345613, compra, true);
            llenarNombres( Nombre, 13,  "Emanuel", IdCliente, 0001, Telefono,12345614, compra, true);
            llenarNombres( Nombre, 14,  "Secy", IdCliente, 0001, Telefono,12345615, compra, true);
            llenarNombres( Nombre, 15,  "Elvia", IdCliente, 0001, Telefono,12345616, compra, true);
            llenarNombres( Nombre, 16,  "Carlos", IdCliente, 0001, Telefono,12345617, compra, true);
            llenarNombres( Nombre, 17,  "Galindo", IdCliente, 0001, Telefono,1234518, compra, true);
            llenarNombres( Nombre, 18,  "Rubí", IdCliente, 0001, Telefono,12345619, compra, true);
            llenarNombres( Nombre, 19,  "Jennifer", IdCliente, 0001, Telefono,12345620, compra, true);
            llenarNombres( Nombre, 20,  "Silvia", IdCliente, 0001, Telefono,12345621, compra, true);
            llenarNombres( Nombre, 21,  "Angeles", IdCliente, 0001, Telefono,12345622, compra, true);
            llenarNombres( Nombre, 22,  "Rosa", IdCliente, 0001, Telefono,12345623, compra, true);
            llenarNombres( Nombre, 23,  "Alejandra", IdCliente, 0001, Telefono,12345624, compra, true);
            llenarNombres( Nombre, 24,  "Sergio", IdCliente, 0001, Telefono,12345625, compra, true);
            llenarNombres( Nombre, 25,  "Vivi", IdCliente, 0001, Telefono,12345626, compra, true);
            llenarNombres( Nombre, 26,  "Sebastian", IdCliente, 0001, Telefono,12345627, compra, true);
            llenarNombres( Nombre, 27,  "Sonia", IdCliente, 0001, Telefono,12345628, compra, true);
            llenarNombres( Nombre, 28,  "Valeria", IdCliente, 0001, Telefono,12345629, compra, true);
            llenarNombres( Nombre, 29,  "Ada", IdCliente, 0001, Telefono,12345630, compra, true);
            llenarNombres( Nombre, 30,  "Paola", IdCliente, 0001, Telefono,12345631, compra, true);
            
        }
        public void llenarpeli(){
            LlenarTienda(IdPeli, NombrePeli,"La Psicosis", AnioPeli, 1960, CategoriaPeli, "Suspenso", DisponiblePe, true, 0);
            LlenarTienda(IdPeli, NombrePeli,"La diosa", AnioPeli, 2010, CategoriaPeli, "Suspenso", DisponiblePe, true, 1);
            LlenarTienda(IdPeli, NombrePeli,"La ventana indiscreta", AnioPeli, 1954, CategoriaPeli, "Suspenso", DisponiblePe, true, 2);
            LlenarTienda(IdPeli, NombrePeli,"Instinto básico", AnioPeli, 1992, CategoriaPeli, "Suspenso", DisponiblePe, true, 3);
            LlenarTienda(IdPeli, NombrePeli,"El nombre de la rosa", AnioPeli, 1986, CategoriaPeli, "Suspenso", DisponiblePe, true, 4);
            LlenarTienda(IdPeli, NombrePeli,"Reservoir Dogs", AnioPeli, 1992, CategoriaPeli, "Suspenso", DisponiblePe, true, 5);
            LlenarTienda(IdPeli, NombrePeli,"Shutter Island", AnioPeli, 2010, CategoriaPeli, "Suspenso", DisponiblePe, true, 6);
            LlenarTienda(IdPeli, NombrePeli,"Origen", AnioPeli, 2010, CategoriaPeli, "Suspenso", DisponiblePe, true, 7);
            LlenarTienda(IdPeli, NombrePeli," Los crímenes de Oxford", AnioPeli, 2008, CategoriaPeli, "Suspenso", DisponiblePe, true, 8);
            LlenarTienda(IdPeli, NombrePeli,"Infiltrados en clase", AnioPeli, 2012, CategoriaPeli, "Comedia", DisponiblePe, true, 9);
            LlenarTienda(IdPeli, NombrePeli,"Cómo acabar con tu jefe", AnioPeli, 2010, CategoriaPeli, "Comedia", DisponiblePe, true, 10);
            LlenarTienda(IdPeli, NombrePeli,"Ted", AnioPeli, 2012, CategoriaPeli, "Comedia", DisponiblePe, true, 11);
            LlenarTienda(IdPeli, NombrePeli,"Bienvenidos al fin del mundo", AnioPeli, 2013 , CategoriaPeli, "Comedia", DisponiblePe, true, 12);
            LlenarTienda(IdPeli, NombrePeli,"Dolor y dinero", AnioPeli, 2013, CategoriaPeli, "Comedia", DisponiblePe, true, 13);
            LlenarTienda(IdPeli, NombrePeli,"Resacón en Las Vegas'", AnioPeli, 2008, CategoriaPeli, "Comedia", DisponiblePe, true, 14);
            LlenarTienda(IdPeli, NombrePeli,"La fiesta de las salchichas", AnioPeli, 2017, CategoriaPeli, "Comedia", DisponiblePe, true, 15);
            LlenarTienda(IdPeli, NombrePeli,"The disaster artist", AnioPeli, 2015, CategoriaPeli, "Comedia", DisponiblePe, true, 16);
            LlenarTienda(IdPeli, NombrePeli,"GRETEL & HANSEL", AnioPeli, 2020, CategoriaPeli, "Terror", DisponiblePe, true, 17);
            LlenarTienda(IdPeli, NombrePeli,"LA CURA DEL BIENESTAR", AnioPeli, 2016, CategoriaPeli, "Terror", DisponiblePe, true, 18);
            LlenarTienda(IdPeli, NombrePeli,"THE WIND", AnioPeli, 2018, CategoriaPeli, "Terror", DisponiblePe, true, 19);
            LlenarTienda(IdPeli, NombrePeli,"DOCTOR SUEÑO", AnioPeli, 2019, CategoriaPeli, "Terror", DisponiblePe, true, 20);
            LlenarTienda(IdPeli, NombrePeli,"MIDSOMMAR", AnioPeli, 2019, CategoriaPeli, "Terror", DisponiblePe, true, 21);
            LlenarTienda(IdPeli, NombrePeli,"LA BRUJA", AnioPeli, 2015, CategoriaPeli, "Terror", DisponiblePe, true, 22);
            LlenarTienda(IdPeli, NombrePeli,"CRUDO'", AnioPeli, 2016, CategoriaPeli, "Terror", DisponiblePe, true, 23);
            LlenarTienda(IdPeli, NombrePeli,"Spider Man", AnioPeli, 2012, CategoriaPeli, "Fantacia", DisponiblePe, true, 24);
            LlenarTienda(IdPeli, NombrePeli,"Venom", AnioPeli, 2017, CategoriaPeli, "Fantacia", DisponiblePe, true, 25);
            LlenarTienda(IdPeli, NombrePeli,"Iro Man", AnioPeli, 2018, CategoriaPeli, "Fantacia", DisponiblePe, true, 26);
            LlenarTienda(IdPeli, NombrePeli,"Dc. Strange", AnioPeli, 2016, CategoriaPeli, "Fantacia", DisponiblePe, true, 27);
            LlenarTienda(IdPeli, NombrePeli,"Capitan America", AnioPeli, 2011, CategoriaPeli, "Fantacia", DisponiblePe, true, 28);
            LlenarTienda(IdPeli, NombrePeli,"Pantera negra", AnioPeli, 2018, CategoriaPeli, "Fantacia", DisponiblePe, true, 29);
        }
}


