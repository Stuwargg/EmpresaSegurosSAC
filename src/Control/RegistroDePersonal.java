package Control;

import Modelo.PersonalDelEmpresa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class RegistroDePersonal {

    String ruta = "C:\\Users\\Stuwar Giron Garcia\\Documents\\NetBeansProjects\\Ejercicio04\\Files\\personal.txt";
    PersonalDelEmpresa objPer = new PersonalDelEmpresa();
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;

    public ArrayList<PersonalDelEmpresa> lista = new ArrayList<>();

    //Metodo para crear la tabla
    public void agregar(PersonalDelEmpresa p) throws FileNotFoundException, IOException {

        fw = new FileWriter(ruta, true);
        String cad = p.getCodigo() + "-" + p.getNombre() + "-" + p.getApellido() + "-" + p.getSexo() + "-" + p.getEdad() + "-" + p.getEstadoCivil()
                + "-" + p.getArea() + "-" + p.getFechaIngreso();
        fw.write(cad);
        fw.write(13); //hace un salto de linea
        fw.close();
    }
    
    //Leer
    public void leer() throws FileNotFoundException, IOException {
        lista.clear();     //Limpiar arrayList 0 elementos
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine(); // Leer linea = readLine
        String[] vec;
        while (cad != null) {
            vec = cad.split("-");  //separar la cadena en un vector
            objPer = new PersonalDelEmpresa(vec[0], vec[1],(vec[2]),vec[3] ,Integer.parseInt(vec[4]),vec[5],vec[6], vec[7]);
            lista.add(objPer);   //agregar elementos al arrayList
            cad = br.readLine();
        }
        fr.close();
    }
}
