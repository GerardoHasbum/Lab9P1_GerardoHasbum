//fila 3 silla 8
package lab9p1_gerardohasbum;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ghasb
 */
public class Gusanito {

    static Scanner jhin = new Scanner(System.in);
    static Random ran = new Random();
    ArrayList<String> instrucciones = new ArrayList();
    int gusx, gusy, dimx, dimy, contp;

    public int getGusx() {
        return gusx;
    }

    public void setGusx(int gusx) {
        this.gusx = gusx;
    }

    public int getGusy() {
        return gusy;
    }

    public void setGusy(int gusy) {
        this.gusy = gusy;
    }

    public int getContp() {
        return contp;
    }

    public void setContp(int contp) {
        this.contp = contp;
    }

    public int getDimx() {
        return dimx;
    }

    public void setDimx(int dimx) {
        this.dimx = dimx;
    }

    public int getDimy() {
        return dimy;
    }

    public void setDimy(int dimy) {
        this.dimy = dimy;
    }

    public ArrayList<String> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(ArrayList<String> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public void dims() {
        String dimensiones = (JOptionPane.showInputDialog(null, "Ingrese las dimensiones para la matriz en el formate ancho,alto[Tienen que estar entre 4 y 10]"));
        while (dimensiones.contains(" ")) {
            dims_inc();
            dims();
        }
        while (dimensiones.length() < 3 || dimensiones.length() > 5 || !(dimensiones.contains(","))) {
            dims_inc();
            dims();
        }
        String[] dims = dimensiones.split(",", 2);
        dimx = Integer.parseInt(dims[0]);
        dimy = Integer.parseInt(dims[1]);
    }

    public void dims_inc() {
        JOptionPane.showMessageDialog(null, "Las dimensiones estan incorrectas favor asegurarse que las dimensiones esten entre 4 y 10");
    }

    public void PrintMat(char[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println();
        }
    }

    public int ranObs() {
        int temporal = 0;
        if (dimx > dimy) {
            temporal = ran.nextInt(((dimx - dimy) + 1) + dimy);
        } else if (dimy > dimx) {
            temporal = ran.nextInt(((dimy - dimx) + 1) + dimx);
        } else {
            temporal = dimx;
        }
        return temporal;
    }

    public int RanObsx() {
        int temporal = ran.nextInt(dimx);
        return temporal;
    }

    public int RanObsy() {
        int temporal = ran.nextInt(dimy);
        return temporal;
    }

    public int RanJugx() {
        int temporal = ran.nextInt(dimx);
        return temporal;
    }

    public int RanJugy() {
        int temporal = ran.nextInt(dimy);
        return temporal;
    }

    public int RanManx() {
        int temporal = ran.nextInt(dimx);
        return temporal;
    }

    public int RanMany() {
        int temporal = ran.nextInt(dimy);
        return temporal;
    }

    public static String PrintJoPMat(char[][] mat) {
        String temp = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                temp += "[ " + mat[i][j] + " ]";
                if (j != mat[i].length - 1) {
                    temp += "";
                } else {
                    temp += "\n";
                }
            }
            System.out.println();
        }
        return temp;
    }

    public int OpcionJOP(char[][] mat) {
        byte opcion = Byte.parseByte(JOptionPane.showInputDialog(null, PrintJoPMat(mat) + "\n1. Ingresar Instrucciones\n2. Ejecutar Instrucciones"));
        int temp = (int) opcion;
        return temp;
    }

    public void DarInstruccion(char[][] mat) {
        instrucciones.add(JOptionPane.showInputDialog(null, PrintJoPMat(mat) + "\nDirecciones: RT(right), LT(left), UP, DN(down)\nIngrese La Instruccion que le quiere dar al gusanito en formato magnitudDIRECCION(ej. 2UP):"));
    }

    public void PrintArr(ArrayList<String> array) {//imprime el array
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i != array.size() - 1) {//imprime comas para separar los conjuntos y valida que no sea el ultimo para no poner una coma al final
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    public int JoPsale(char[][] mat) {
        byte opcion = Byte.parseByte(JOptionPane.showInputDialog(null, PrintJoPMat(mat)+"\n Salio del bosque y vio un pajaro, se murio de un infarto\n 1. Ver siguiente paso\n 2. Ver paso anterior\n 3.Seleccionar Paso\n 4. Volver al menu"));
        return (int)opcion;
    }
    public int JoPBuscar(){
        byte op = Byte.parseByte(JOptionPane.showInputDialog(null, "A que paso le gustaria ir?"));
        return op;
    }
    public int JoPnosale(char[][] mat){
        byte opcion = Byte.parseByte(JOptionPane.showInputDialog(null, PrintJoPMat(mat)+"\n No ha llegado a la manzana\n 1. Ver siguiente paso\n 2. Ver paso anterior\n 3.Seleccionar Paso\n 4. Volver al menu"));
        return (int)opcion;
    }

}
