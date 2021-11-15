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
        <link rel="stylesheet" href="./assets/css/style-css.css"/>
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>
        <link rel="stylesheet" href="assets/css/style-css.css"/>
        <!-- bootsrap -->
        <link rel="stylesheet" href="./assets/css/bootstrap.css">

        <title>Notas</title>

    </head>
    <body class="bg-dark">
         <nav class="navbar navbar-expand-lg navbar-dark bg-black">
                <div class="container-fluid">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/ServletMateria?accion=listar">Materias</a>
                            </li>
                    </div>
                </div>
            </nav>

        <section id="actions" class="py-3 mb-3 bg-info bg-opacity-50">
            <div class="container">
                <div class="row">
                    <div class="col-3">
                        <a href="javascript:history.back()" class="btn btn-danger btn-block">
                            <i class="fa fa-arrow-left"></i> Regresar A Materias
                        </a>

                    </div>
                    <div class="col-md-3">

                    </div>
                    <div class="col-md-3">

                    </div>                
                </div>
            </div>
        </section>


        <main class="container pb-5">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-header bg-secondary bg-opacity-75 text-white">
                            <h4>Editar Materias</h4>
                        </div>
                        <div class="card-body bg-dark bg-opacity-75  text-white">
                            <form method="POST" action="${pageContext.request.contextPath}/ServletMateria">
                                <div class="modal-body">

                                    <div class="mb-3">
                                        <label for="nombre_actividad" class="form-label">Nombre de la materia</label>
                                        <input type="text" id="nombre_materia" name="nombre_materia" class="form-control" value="${materia.nombre_materia}">
                                    </div>

                                    <div class="mb-3">
                                        <label form="ciclo_escolar" class="form-label" >Ciclo escolar</label>
                                        <input type="text" id="ciclo_escolar" name="ciclo_escolar" class="form-control" value="${materia.ciclo_escolar}">
                                    </div>

                                    <div class="mb-3">
                                        <label for="horario_inicio" class="form-label">Horario inicio</label>
                                        <input type="text" id="horario_inicio" name="horario_inicio" class="form-control" value="${materia.horario_inicio}">                         
                                    </div>
                                    <div class="mb-3">
                                        <label for="horario_final" class="form-label">Horario final</label>
                                        <input type="text" id="horario_final" name="horario_final" class="form-control" value="${materia.horario_final}">                         
                                    </div>
                                    <div class="mb-3">
                                        <label for="catedratico" class="form-label">Catedratico</label>
                                        <input type="text" id="catedratico" name="catedratico" class="form-control" value="${materia.catedratico}">                         
                                    </div>
                                    <div class="mb-3">
                                        <label for="salon" class="form-label">Salon</label>
                                        <input type="text" id="salon" name="salon" class="form-control" value="${materia.salon}">                         
                                    </div>
                                    <div class="mb-3">
                                        <label for="cupo_maximo" class="form-label">Cupo maximo</label>
                                        <input type="number" id="cupo_maximo" name="cupo_maximo" class="form-control" value="${materia.cupo_maximo}">                         
                                    </div>
                                    <div class="mb-3">
                                        <label for="cupo_minimo" class="form-label">Cupo minimo</label>
                                        <input type="number" id="cupo_minimo" name="cupo_minimo" class="form-control" value="${materia.cupo_minimo}">                         
                                    </div>
                                    <input type="hidden" name="id_materia" value="${materia.id_materia}">

                                    <input type="hidden"  name="accion" value="actualizar">                           

                                </div>
                                <div class="modal-footer p-1">
                                    
                                    <button type="submit" class="btn btn-info">Guardar Cambios</button>                    
                                </div>
                            </form>

                        </div>
                    </div>

                </div>
            </div>
        </main>


        <script src="./assets/js/jquery-3.6.0.js"></script>
        <script src="./assets/js/bootstrap.bundle.js"></script>
    </body>
</html>