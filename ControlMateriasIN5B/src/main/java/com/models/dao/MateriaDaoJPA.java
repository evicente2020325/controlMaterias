/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package com.models.dao;

import com.db.ConexionPU;
import com.models.domain.Materia;
import com.models.idao.IMateriaDao;
import java.util.List;*/

/**
 *
 * @author esteb
 */
/*public class MateriaDaoJPA implements IMateriaDao{

    private ConexionPU conn = ConexionPU.getInstance();
    
    @Override
    public List<Materia> listar() {
       return conn.getEntityManager().createNamedQuery("Materia.findAll").getResultList();
    }

    @Override
    public Materia encontrar(Materia materia) {
        return (Materia) conn.getEntityManager().createNamedQuery("Nota.find").setParameter("id", materia.getId_materia()).getSingleResult();
    }

    @Override
    public int insertar(Materia materia) {
        int rows = 0;
        try {
            conn.getEntityManager().getTransaction().begin();
            conn.getEntityManager().persist(materia);
            conn.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            conn.getEntityManager().getTransaction().rollback();

        }
        return rows;
    }

    @Override
    public int actualizar(Materia materia) {
        int rows = 0;
        try {
            conn.getEntityManager().getTransaction().begin();
            conn.getEntityManager().merge(materia);
            conn.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            conn.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }

    @Override
    public int eliminar(Materia materia) {
        int rows = 0;
        try {
            conn.getEntityManager().getTransaction().begin();
            conn.getEntityManager().remove(materia);
            conn.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            conn.getEntityManager().getTransaction().rollback();
        }
        return rows;
    
    }
    
}*/
