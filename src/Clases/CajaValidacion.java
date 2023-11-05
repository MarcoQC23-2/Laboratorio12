/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mco_a
 */
public class CajaValidacion {
    
    private JTextField caja;
    private JLabel error;

    public CajaValidacion(JTextField caja, JLabel error) {
        this.caja = caja;
        this.error = error;
    }
    
    public float getValor(){
        float valor = 0;
        error.setText("");
        try{
            String valorTexto = caja.getText();
            valor = Float.parseFloat(valorTexto);
        } catch(NumberFormatException ex){
            error.setText("Digite un número");
        }
        
        return valor;
    }
    
    public void mostrarInfo(String t){
        this.caja.setText(t);
    }
    
    public void mostrarError(String e){
        this.error.setText(e);
    }
}
