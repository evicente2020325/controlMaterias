<%-- 
    Document   : listar-materia
    Created on : Oct 25, 2021, 12:24:08 PM
    Author     : esteb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Glory:ital,wght@1,200;1,500&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" href="../assets/css/style-css.css"/>
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>
        <link rel="stylesheet" href="../assets/css/style-css.css"/>
        <!-- bootsrap -->
        <link rel="stylesheet" href="../assets/css/bootstrap.css">

        <title>Materias</title> 

    </head>

    <body class="bg-gradient">


        <header id="main-header" class="py-2 bg-info bg-gradient text-white text-center" > 
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h1><i class="far fa-clipboard"></i> Materias</h1>
                    </div>
                </div>
            </div>
        </header> 

        <div class="modal fade" id="agregar-materia-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header bg-primary text-white">
                        <h5 class="modal-title" id="exampleModalLabel">Agregar Materia </h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <form method="POST" action="${pageContext.request.contextPath}/ServletMateria">
                        <div class="modal-body">

                            <div class="mb-3">
                                <label for="nombre_materia" class="form-label">Nombre de la materia</label>
                                <input type="text" id="nombre_actividad" name="nombre_materia" class="form-control">
                            </div>

                            <div class="mb-3">
                                <label form="ciclo_escolar" class="form-label" >Ciclo escolar</label>
                                <input type="text" id="ciclo_escolar" name="ciclo_escolar" class="form-control" >
                            </div>

                            <div class="mb-3">
                                <label for="horario_inicio" class="form-label">Horario inicio</label>
                                <input type="text" id="horario_inicio" name="horario_inicio" class="form-control" >                         
                            </div>

                            <div class="mb-3">
                                <label for="horario_final" class="form-label">Horario final</label>
                                <input type="text" id="horario_final" name="horario_final" class="form-control" >
                            </div>
                            
                            <div class="mb-3">
                                <label for="catedratico" class="form-label">Catedratico</label>
                                <input type="text" id="catedratico" name="catedratico" class="form-control" >
                            </div>
                            
                            <div class="mb-3">
                                <label for="salon" class="form-label">Salon</label>
                                <input type="text" id="salon" name="salon" class="form-control" >
                            </div>
                            
                            <div class="mb-3">
                                <label for="cupo_maximo" class="form-label">Cupo maximo</label>
                                <input type="number" id="cupo_maximo" name="cupo_maximo" class="form-control" >
                            </div>
                            
                            <div class="mb-3">
                                <label for="cupo_minimo" class="form-label">Cupo minimo</label>
                                <input type="number" id="cupo_minimo" name="cupo_minimo" class="form-control">
                            </div>

                            <input type="hidden"  name="accion" value="insertar">                           

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                            <button type="submit" class="btn btn-success">Guardar</button>                    
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <section id="notas">
            <div class="container  pt-3">
                <div class="row">
                    <div class="col-xs-12 col-md-12">
                        <table class="table table-primary table-sm table-bordered border-primary table-striped text-center fs-6">
                            <thead class="table-dark">              
                                <tr>
                                    <th>#</th>
                                    <th>Nombre de la materia</th>
                                    <th>Ciclo escolar</th>
                                    <th>Horario inicio</th>
                                    <th>Horario final</th>
                                    <th>Catedratico</th>
                                    <th>Salon</th>
                                    <th>Cupo maximo</th>
                                    <th>Cupo minimo</th>
                                    <th colspan="2" >
                                        <a class="btn btn-primary bnt-block w-auto h-auto rounded-pill fs-6 " data-bs-toggle="modal" data-bs-target="#agregar-materia-modal" class="btn btn-block">
                                            <i class="fa fa-plus"></i> Agregar Materia
                                        </a>
                                    </th>
                                </tr>
                            </thead>
                            <tbody>  
                                <c:forEach var="materia" items="${listaMateria}">
                                    <tr>
                                        <td>${materia.id_materia}</td>

                                        <td>${materia.nombre_materia} </td>
                                        <td>${materia.ciclo_escolar}</td>
                                        <td>${materia.horario_inicio}</td>                                  
                                        <td>${materia.horario_final}</td> 
                                        <td>${materia.catedratico}</td>
                                        <td>${materia.salon}</td>
                                        <td>${materia.cupo_maximo}</td>
                                        <td>${materia.cupo_minimo}</td>
                                        <td>
                                            <button type="button" class="btn btn-outline-dark rounded-pill w-auto fs-6">
                                                 <a href="${pageContext.request.contextPath}/ServletMateria?accion=eliminar&id_materia=${materia.id_materia}" class="text-decoration-none text-white"><i class="fas fa-trash-alt"></i> Eliminar</a>
                                            </button>
                                        </td>
                                        <td>
                                            <button type="button" class="btn btn-outline-dark rounded-pill w-auto fs-6">
                                                <a href="${pageContext.request.contextPath}/ServletMateria?accion=editar&id_materia=${materia.id_materia}" class="text-decoration-none text-white"><i class="far fa-edit"></i> Editar</a>
                                            </button>
                                        </td>                        
                                    </tr>
                                </c:forEach>  

                            </tbody>
                        </table>    
                    </div>



                </div>
            </div>
        </section>
                              
    </body>
        <script src="../assets/js/jquery-3.6.0.js"></script>
        <script src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
