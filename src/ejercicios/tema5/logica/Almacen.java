package ejercicios.tema5.logica;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Almacen {

    private File fichero;
    private FileWriter writer;
    private BufferedReader reader;

    public Almacen(){
        prepararRecursos();
    }

    public void almacenarNumero(int numero){
        //Generar la lógica para almacenar el número en el fichero.txt
        try {
            writer.append(String.valueOf(numero));
            writer.append(";");
            //writer.write(String.valueOf(numero));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> recuperarNumeros (){
        //Recuperar los números del fichero.txt almacenados
        List<Integer> resultado = null;
        try {
            resultado = Arrays.asList(reader.readLine().split(";"))
                    .stream()
                    .map(cadena -> Integer.parseInt(cadena))
            //        .filter(dato -> dato == 12)
                    .collect(Collectors.toList());
            //String [] split = reader.readLine().split(";");
            //List<String> strings = Arrays.asList(split);
            //Stream<Integer> integerStream = strings.stream().map(cadena -> Integer.parseInt(cadena));
            //List<Integer> collect = integerStream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public void cerrarRecursos(){
        try {
            this.reader.close();
            this.writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void prepararRecursos(){
        this.fichero = new File("src/ejercicios/tema5/fichero.txt");
        try {
            if (!this.fichero.exists()){
                this.fichero.createNewFile();
            }
            this.writer = new FileWriter(this.fichero, true);
            this.reader = new BufferedReader(new FileReader(this.fichero));
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
