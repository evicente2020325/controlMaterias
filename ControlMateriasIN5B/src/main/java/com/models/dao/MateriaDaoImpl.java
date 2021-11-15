/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.models.domain.Materia;
import com.models.idao.IMateriaDao;
import com.db.Conexion;
import java.sql.Time;
/**
 *
 * @author Erwin Esteban Vicente Hernandez
 * Codigo Tecnico IN5BV
 */ 
public class MateriaDaoImpl implements IMateriaDao{
private static final String SQL_SELECT = "select id_materia, nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo from Materia;";
    private static final String SQL_DELETE = "DELETE FROM instructor WHERE instructor_id = ?";
    private static final String SQL_SELECT_BY_ID = "SELECT id_materia , nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo FROM Materia WHERE id_materia = ?";
    private static String SQL_INSERT = "INSERT INTO materia (nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo) VALUES(?,?,?,?,?,?,?,?);";
    private static final String SQL_UPDATE = "UPDATE materia SET nombre_materia = ?, ciclo_escolar = ?, horario_inicio = ?, horario_final = ?, catedratico = ?, salon = ?, cupo_maximo = ?, cupo_minimo = ? WHERE id_materia = ?";
    
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Materia materia = null;
    List<Materia> listarMateria = new ArrayList<>();
    
    

    @Override
    public List<Materia> listar() {
     try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id_materia = rs.getInt("id_materia");
                String nombre_materia = rs.getString("nombre_materia");
                String ciclo_escolar = rs.getString("ciclo_escolar");
                String horario_inicio = rs.getString("horario_inicio");
                String horario_final = rs.getString("horario_final");
                String catedratico = rs.getString("catedratico");
                String salon = rs.getString("salon");
                int cupo_maximo = rs.getInt("cupo_maximo");
                int cupo_minimo = rs.getInt("cupo_minimo");

                materia = new Materia(id_materia, 
                        nombre_materia, 
                        ciclo_escolar, 
                        horario_inicio, 
                        horario_final, 
                        catedratico, 
                        salon, 
                        cupo_maximo, 
                        cupo_minimo);
                listarMateria.add(materia);
                System.out.println(materia);
            
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(conn);
        }

        return listarMateria; 
    
    }

    @Override
    public Materia encontrar(Materia materia) {
    try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, materia.getId_materia());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String nombre_materia = rs.getString("nombre_materia");
                String ciclo_escolar = rs.getString("ciclo_escolar");
                String horario_inicio = rs.getString("horario_inicio");
                String horario_final = rs.getString("horario_final");
                String catedratico = rs.getString("catedratico");
                String salon = rs.getString("salon");
                int cupo_maximo = rs.getInt("cupo_maximo");
                int cupo_minimo = rs.getInt("cupo_minimo");
                
                materia.setNombre_materia(nombre_materia);
                materia.setCiclo_escolar(ciclo_escolar);
                materia.setHorario_final(horario_final);
                materia.setHorario_inicio(horario_inicio);
                materia.setCatedratico(catedratico);
                materia.setSalon(salon);
                materia.setCupo_maximo(cupo_maximo);
                materia.setCupo_minimo(cupo_minimo);
                

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(conn);
        }

        return materia;
     
    }

    @Override
    public int insertar(Materia materia) {
        int row = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_INSERT);
            pstmt.setString(1, materia.getNombre_materia());
            pstmt.setString(2, materia.getCiclo_escolar());
            pstmt.setString(3, materia.getHorario_inicio());
            pstmt.setString(4, materia.getHorario_final());
            pstmt.setString(5, materia.getCatedratico());
            pstmt.setString(6, materia.getSalon());
            pstmt.setInt(7, materia.getCupo_maximo());
            pstmt.setInt(8, materia.getCupo_minimo());

            System.out.println(pstmt.toString());
            row = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return row;    
    
    }

    @Override
    public int actualizar(Materia materia) {
        int row = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_UPDATE);
             pstmt.setString(1, materia.getNombre_materia());
            pstmt.setString(2, materia.getCiclo_escolar());
            pstmt.setString(3, materia.getHorario_inicio());
            pstmt.setString(4, materia.getHorario_final());
            pstmt.setString(5, materia.getCatedratico());
            pstmt.setString(6, materia.getSalon());
            pstmt.setInt(7, materia.getCupo_maximo());
            pstmt.setInt(8, materia.getCupo_minimo());
            pstmt.setInt(9, materia.getId_materia());
            System.out.println(pstmt.toString());
            row = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return row;
    }


    @Override
    public int eliminar(Materia materia) {
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, materia.getId_materia());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
  

}
