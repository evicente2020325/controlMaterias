<%-- 
    Document   : index
    Created on : Oct 25, 2021, 12:24:28 PM
    Author     : esteb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Glory:ital,wght@1,200;1,500&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" href="assets/css/style-css.css"/>
        <script src="https://kit.fontawesome.com/f90d3bf50d.js"></script>
        <link rel="stylesheet" href="./assets/css/bootstrap.css">
        <title>Control materias</title>
    </head>
    <body id="fondo">
        <section>

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

            <section class="main" class="py-6 mb-6">

                <div class="container py-5" class="main">

                    <div class="row py-5">
                        <div class="col-lg-7 pt-5 text-lg-start">
                            <h1 class="pt-5">Bienvenido</h1>

                        </div>
                        <div>
                            <h3 class="pt-5">Desde acá podras tener el control de todas las materias disponibles</h3>
                        </div>
                    </div>
                </div>
            </section>
            <section>
                <footer>
                    <div class="container py-5" >
                        <p class="text-center">Copyright ©2021 Todos los derechos reservados | Centro Educativo Técnico Laboral KINAL</p>
                    </div> 
                </footer>

            </section>
        </section>

        <script src="./assets/js/jquery-3.6.0.js"></script> 
        <script src="./assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
