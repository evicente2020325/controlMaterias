/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

//import com.models.dao.MateriaDaoJPA;
import com.models.domain.Materia;
import java.io.IOException;
import java.sql.Time;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.models.dao.MateriaDaoImpl;
/**
 *
 * @author esteb
 */
@WebServlet("/ServletMateria")
public class ServletMateria extends HttpServlet{
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");

        System.out.println("\ndoPost");

        String accion = request.getParameter("accion");

        System.out.println("accion: " + accion);
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    insertarMateria(request, response);
                    break;
                case "actualizar":
                    actualizarMateria(request, response);

                    break;
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String accion = request.getParameter("accion");

        if (accion != null) {

            switch (accion) {
                case "listar":
                    listarMateria(request, response);
                    break;

                case "editar":
                    editarMateria(request, response);
                    break;

                case "eliminar":
                    eliminarMateria(request, response);
                    break;

            }
        }
    }
     private void editarMateria(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("\nEditando");
        int id_materia = Integer.parseInt(request.getParameter("id_materia"));
        Materia materia = new MateriaDaoImpl().encontrar(new Materia(id_materia)); 
        request.setAttribute("materia", materia);
        request.getRequestDispatcher("materia/editar-materia.jsp").forward(request, response);
    }
    
    private void eliminarMateria(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id_materia = Integer.parseInt(request.getParameter("id_materia"));

        Materia materia = new Materia(id_materia);
        int registrosEliminados = new MateriaDaoImpl().eliminar(materia);
        listarMateria(request, response);
    }

    private void listarMateria(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Materia> listaMateria = new MateriaDaoImpl().listar();
        
        HttpSession session = request.getSession();
        session.setAttribute("listaMateria", listaMateria);
        response.sendRedirect("materia/listar-materia.jsp");
    }

    
     private void actualizarMateria(HttpServletRequest request, HttpServletResponse response) throws IOException {
     System.out.println("\nActualizando");
        
        int id_materia = Integer.parseInt(request.getParameter("id_materia"));
        
        String nombre_materia = request.getParameter("nombre_materia");
        String ciclo_escolar  = request.getParameter("ciclo_escolar");
        String horario_inicio  = request.getParameter("horario_inicio");
        String horario_final = request.getParameter("horario_final");
        String catedratico = request.getParameter("catedratico");
        String salon = request.getParameter("salon");
        int cupo_maximo = Integer.parseInt(request.getParameter("cupo_maximo"));
        int cupo_minimo = Integer.parseInt(request.getParameter("cupo_minimo"));
        
        Materia materia = new Materia(id_materia, nombre_materia, ciclo_escolar, horario_inicio, horario_final, catedratico, salon, cupo_maximo, cupo_minimo);
        System.out.println(materia);
        
        int registroActualizado = new MateriaDaoImpl().actualizar(materia);
        
        System.out.println("RegistrosActualizados: " + registroActualizado);
        
        listarMateria(request, response);
    }

    private void insertarMateria(HttpServletRequest request, HttpServletResponse response) throws IOException {
       
        System.out.println("insertar");

        Materia materia = new Materia();
        
        materia.setNombre_materia(request.getParameter("nombre_materia"));
        materia.setCiclo_escolar(request.getParameter("ciclo_escolar"));
        materia.setHorario_inicio(request.getParameter("horario_inicio"));
        materia.setHorario_final(request.getParameter("horario_final"));
        materia.setCatedratico(request.getParameter("catedratico"));
        materia.setSalon(request.getParameter("salon"));
        materia.setCupo_maximo(Integer.parseInt(request.getParameter("cupo_maximo")));
        materia.setCupo_minimo(Integer.parseInt(request.getParameter("cupo_minimo")));

        
  

        
        System.out.println(materia);

        int MateriasRegistradas = new MateriaDaoImpl().insertar(materia);

        System.out.println("materias registradas" + MateriasRegistradas);

        listarMateria(request, response);
    }
}
