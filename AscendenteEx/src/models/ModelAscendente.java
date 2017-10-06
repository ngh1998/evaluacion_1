/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author PC10
 */
public class ModelAscendente {

    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    private int vart = 0;
    private int mas = 0;
    private int prom;
    private int[] variables;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public int getVart() {
        return vart;
    }

    public int getMas() {
        return mas;
    }

    public int getProm() {
        return prom;
    }

    public int[] getVariables() {
        return variables;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void setVart(int vart) {
        this.vart = vart;
    }

    public void setMas(int mas) {
        this.mas = mas;
    }

    public void setProm(int prom) {
        this.prom = prom;
    }

    public void setVariables(int[] variables) {
        this.variables = variables;
    }

    public void ordenar() {
        variables = new int[5];

        variables[0] = num1;
        variables[1] = num2;
        variables[2] = num3;

        for (int i = 0; i < 3; i++) {
            if (i > i + 1) {
                vart = i;
                mas = i + 1;
                i = mas;
                i + 1 = vart;
            }
        }
    }

    public void agregar() {
        variables[0] = num1;
        variables[1] = num2;
        variables[2] = num3;
    }

    public void promedio() {
        prom = num1 + num2 + num3;
    }

}
