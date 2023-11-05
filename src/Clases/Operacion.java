/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.text.DecimalFormat;

/**
 *
 * @author mco_a
 */
public class Operacion {
    
    private CajaValidacion caja1;
    private CajaValidacion caja2;
    private CajaValidacion resultado;

    public Operacion(
            CajaValidacion caja1, 
            CajaValidacion caja2, 
            CajaValidacion resultado
    ) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.resultado = resultado;
    }
    
    // Método genérico para formatear el resultado
    private void mostrarResultado(float res) {
        DecimalFormat decimalFormat = 
                new DecimalFormat("#.##");
        String formattedResult = 
                decimalFormat.format(res);
        this.resultado.mostrarInfo(formattedResult);
    }
    
    public void Suma(){
        float res = this.caja1.getValor() + 
                this.caja2.getValor();
        mostrarResultado(res);
        
    }
    
    public void Resta(){
        float res = this.caja1.getValor() - 
                this.caja2.getValor();
        mostrarResultado(res);
    }
    
    public void Multiplicacion(){
        float res = this.caja1.getValor() * 
                this.caja2.getValor();
        mostrarResultado(res);
    }
    
    public void Division(){
        float res = this.caja1.getValor() / 
                this.caja2.getValor();
        this.resultado.mostrarError("");
        
        if(this.caja1.getValor() == 0 && 
                this.caja2.getValor() == 0){
            this.resultado.mostrarError(
                    "¡Ambos números deben "
                            + "ser mayores a cero!");
        }else if(this.caja2.getValor() == 0){
            this.resultado.mostrarError(
                    "¡No es posible dividir "
                            + "entre cero!");
        }else{
            mostrarResultado(res);
        }
    }
}
