/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosEParametros;

/**
 *
 * @author clayton
 */
public class NewCarro {
    public static void main(String[] args){
        Carro volkswagen = new Carro();
        volkswagen.marca = "Volkswagen";
        volkswagen.modelo = "Amarok";
        volkswagen.numPassageiros = 5;
        volkswagen.capCombustivel = 100;
        volkswagen.conCombustivel = 0.2;

        double autonomia = volkswagen.exibirAutonomia();
        System.out.println(autonomia);
        
        double qtdCombustivel = volkswagen.calculoDeCombustivel(50);
        System.out.println("A quantidade de combustivel para 50 km é: " + qtdCombustivel);
    }
}
