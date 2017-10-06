/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.ModelAscendente;
import views.ViewAscendentee;
import controllers.ControllerAscendente;

public class Main {

    private static ModelAscendente model_ascendente;
    private static ViewAscendentee view_ascendentee;
    private static ControllerAscendente controller_ascendente;

    public static void main(String[] ngh) {
        view_ascendentee = new ViewAscendentee();
        model_ascendente = new ModelAscendente();
        controller_ascendente = new ControllerAscendente(model_ascendente, view_ascendentee);
    }
}
