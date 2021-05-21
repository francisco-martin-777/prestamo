/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author Javier Bustamante Toledo
 * 
 * Situación: Supongamos que tenemos una aplicación que autoriza el prestamo de una 
 * cantidad de dinero (valor numérico) si en importe se encuentra entre 1000 y 15000. 
 * Por lo tanto, 
 *  Todo préstamo por debajo de 1000 carece de interes y 
 *  Por encima de 15000 es una operación con demasiado riesgo.
 * 
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String estudio (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1000 && cantidad <=15000) {
                sRespuesta = "Felicidades, préstamo concedido";
            } else if (cantidad < 1000) {
                sRespuesta = "Préstamo no concedido carece de interes";
            } else {
                sRespuesta= "Préstamo no concedido es una operación con demasiado riesgo";
            }
        return sRespuesta;
    }

    Prestamo(int prestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Prestamo(int prestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String prestamo(int prestamo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


/*
RESPONDER AQUI EL PUNTO 1 DEL EXÁMEN.

PARTES DE EQUIVALENCIA

caso 1_1: prestamo de una cantidad de dinero (valor numérico) si en importe es de 500.
            la respuesta sera de : "Préstamo no concedido carece de interes"
caso 1_2: prestamo de una cantidad de dinero (valor numérico) si en importe es de 7000.
             la respuesta sera de : "Felicidades, préstamo concedido"
caso 1_3: prestamo de una cantidad de dinero (valor numérico) si en importe es de 20000
            la respuesta sera de : "Préstamo no concedido es una operación con demasiado riesgo"

VALORES LIMITE

caso 1_4: prestamo de una cantidad de dinero (valor numérico) si en importe es de 1000.
            la respuesta sera de :"Felicidades, préstamo concedido"

caso 1_5: prestamo de una cantidad de dinero (valor numérico) si en importe es de 1000.
            la respuesta sera de :"Felicidades, préstamo concedido"
*/