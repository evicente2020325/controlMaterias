/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models.idao;

import com.models.domain.Materia;
import java.util.List;

/**
 *
 * @author esteb
 */
public interface IMateriaDao {
    public List<Materia> listar();
    
    public Materia encontrar(Materia materia);
    
    public int insertar(Materia materia);
    
    public int actualizar(Materia materia);
    
    public int eliminar(Materia materia);
}
