/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models.domain;

import java.io.Serializable;
import java.sql.Time;
import java.time.Year;


/**
 *
 * @author esteb
 */
public class Materia implements Serializable{

private int id_materia;
   
   private String nombre_materia;
   
   private String ciclo_escolar;
   
   private String horario_inicio;
   
   private String horario_final;
   
   private String catedratico;
   
   private String salon;
   
   private int cupo_maximo;
   
   private int cupo_minimo;

    public Materia() {
    }

    public Materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public Materia(String nombre_materia, String ciclo_escolar, String horario_inicio, String horario_final, String catedratico, String salon, int cupo_maximo, int cupo_minimo) {
        this.nombre_materia = nombre_materia;
        this.ciclo_escolar = ciclo_escolar;
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
        this.catedratico = catedratico;
        this.salon = salon;
        this.cupo_maximo = cupo_maximo;
        this.cupo_minimo = cupo_minimo;
    }

    public Materia(int id_materia, String nombre_materia, String ciclo_escolar, String horario_inicio, String horario_final, String catedratico, String salon, int cupo_maximo, int cupo_minimo) {
        this.id_materia = id_materia;
        this.nombre_materia = nombre_materia;
        this.ciclo_escolar = ciclo_escolar;
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
        this.catedratico = catedratico;
        this.salon = salon;
        this.cupo_maximo = cupo_maximo;
        this.cupo_minimo = cupo_minimo;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public String getCiclo_escolar() {
        return ciclo_escolar;
    }

    public void setCiclo_escolar(String ciclo_escolar) {
        this.ciclo_escolar = ciclo_escolar;
    }

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(String horario_final) {
        this.horario_final = horario_final;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public int getCupo_maximo() {
        return cupo_maximo;
    }

    public void setCupo_maximo(int cupo_maximo) {
        this.cupo_maximo = cupo_maximo;
    }

    public int getCupo_minimo() {
        return cupo_minimo;
    }

    public void setCupo_minimo(int cupo_minimo) {
        this.cupo_minimo = cupo_minimo;
    }

    @Override
    public String toString() {
        return "Materia{" + "id_materia=" + id_materia + ", nombre_materia=" + nombre_materia + ", ciclo_escolar=" + ciclo_escolar + ", horario_inicio=" + horario_inicio + ", horario_final=" + horario_final + ", catedratico=" + catedratico + ", salon=" + salon + ", cupo_maximo=" + cupo_maximo + ", cupo_minimo=" + cupo_minimo + '}';
    }

    
    

}
    

    

   
   
