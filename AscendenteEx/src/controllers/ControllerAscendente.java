/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelAscendente;
import views.ViewAscendentee;

public class ControllerAscendente {

    ModelAscendente model_ascendente;
    ViewAscendentee view_ascendentee;

    public ControllerAscendente(ModelAscendente model_ascendente, ViewAscendentee view_ascendentee) {
        this.model_ascendente = model_ascendente;
        this.view_ascendentee = view_ascendentee;
        view_ascendentee.jbtn_asc.addActionListener(e -> jbtn_asc_click());
        view_ascendentee.jbtn_promedio.addActionListener(e -> jbtn_promedio_click());
        view_ascendentee.jbtn_agregar.addActionListener(e -> jbtn_agregar_click());
        initView();
    }

    public void initView() {
        view_ascendentee.jtf_insertar.setText(String.valueOf(model_ascendente.getNum1()));
        view_ascendentee.jtf_insertar.setText(String.valueOf(model_ascendente.getNum2()));
        view_ascendentee.jtf_insertar.setText(String.valueOf(model_ascendente.getNum3()));
        view_ascendentee.setVisible(true);
    }
    
    public void jbtn_asc_click(){
        model_ascendente.setNum1(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.setNum2(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.setNum3(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.ordenar();
    }
    public void jbtn_promedio_click(){
        model_ascendente.setNum1(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.setNum2(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.setNum3(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.promedio();
    }
    public void jbtn_agregar_click(){
        model_ascendente.setNum1(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.setNum2(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.setNum3(Integer.parseInt(view_ascendentee.jtf_insertar.getText()));
        model_ascendente.promedio();
    }
}