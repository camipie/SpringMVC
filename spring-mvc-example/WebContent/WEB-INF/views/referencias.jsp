<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Bowser CV</title>
    <link href="<c:url value="/resources/css/estilos.css" />" rel="stylesheet">	
  </head>
   <body>
   <div id="fb-root"></div>
<script async defer crossorigin="anonymous" src="https://connect.facebook.net/es_LA/sdk.js#xfbml=1&version=v4.0"></script>
    <div class="header">
      <div class="top-header">
        <div class="contenedor">
          <div class="top-menu">
            <ul>
              <li><a href="about">ACERCA DE LOS CREADORES DE CV ONLINE</a></li>
              <li><a href="#">CONTACTAR A LOS CREADORES</a></li>
            </ul>
          </div>

          <div class="top-redes">
            <ul>
              <li><a href="#">Instagram</a></li>
              <li><a href="#">Twitter</a></li>
              <li><a href="#">Encontranos en Facebook</a></li>
            </ul>
          </div>
        </div>
      </div>

      <div class="titulo-blog">
        <div class="contenedor">
          <h1><a href="#">Bowser Morton Koopa</a></h1>
          <p class="subtitulo">REY DE LOS KOOPAS</p>
        </div>
      </div>

      <div class="menu-principal">
        <div class="contenedor">
          <ul>
            <li><a href="home">APTITUDES</a></li>
            <li><a href="#">EXPERIENCIA</a></li>
            <li><a href ="referencias">REFERENCIAS</a></li>
          </ul>
        </div>
      </div>
    </div>

    <div class="main">

      <div class="blog">
        <div class="contenedor">
          <div class="articulos-blog">
            <div class="articulo">
              <p class="fecha-articulo"></p>
              <h3 class="titulo-articulo">Referencias de colegas o antiguos empleadores</h3>
              <p class="categoria-articulo"></p>
              <img src="" alt="">
              <div class="texto-articulo">
              <div class="fb-comments" data-href="http://localhost:8080/finall/referencias" data-width="100%" data-numposts="5"></div>
              </div>
            </div>

          </div>

          <div class="aside">
            <div class="widget">
              <div class="autor-widget">
                <div class="foto-autor">
                  <img src="http://mariopartylegacy.com/wp-content/uploads/2018/07/bowserprofile.png" alt="Foto del autor">
                </div>
                <div class="datos-autor">
                  <h3 class="nombre">Bowser</h3>
                  <p class="profesion">Típico villano</p>
                  <h5 class = "nombre">Situación actual: </h5>
        			<iframe src="http://localhost:8080/finall/test"></iframe>                		
                </div>
              </div>
            </div>

          </div>
        </div>
      </div>
    </div>

    <div class="footer">
    </div>

  </body>
</html>