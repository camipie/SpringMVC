<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>La Historia del Videojuego</title>
    <link href="<c:url value="/resources/css/estilos.css" />" rel="stylesheet">	
  </head>
  <body>

    <div class="header">
      <div class="top-header">
        <div class="contenedor">
          <div class="top-menu">
            <ul>
              <li><a href="#">INICIO</a></li>
              <li><a href="#">ACERCA DE</a></li>
              <li><a href="#">CONTACTO</a></li>
            </ul>
          </div>

          <div class="top-redes">
            <ul>
              <li><a href="#">Instagram</a></li>
              <li><a href="#">Twitter</a></li>
              <li><a href="#">Facebook</a></li>
            </ul>
          </div>
        </div>
      </div>

      <div class="titulo-blog">
        <div class="contenedor">
          <h1><a href="#">La Historia del Videojuego</a></h1>
          <p class="subtitulo">DESDE ATARI HASTA HOY</p>
        </div>
      </div>

      <div class="menu-principal">
        <div class="contenedor">
          <ul>
            <li><a href="#">INICIO</a></li>
            <li><a href="#">PONG1</a></li>
            <li><a href="#">PONG2</a></li>
            <li><a href="#">PONG3</a></li>
          </ul>
        </div>
      </div>
    </div>

	<div class="main">
<!--  -->      <div class="banner">
        <div class="contenedor">
          <div class="banner-principal">
            <img src="img/banner-principal.jpeg" alt="">
          </div>
        </div>
      </div>
<-->
      <div class="blog">
        <div class="contenedor">
          <div class="articulos-blog">
          
            <div class="articulo">
              <p class="fecha-articulo">Enero 17 de 2017</p>
              <h3 class="titulo-articulo">5 Tips para organizar mejor tus viajes</h3>
              <p class="categoria-articulo">VIAJES</p>
              <img src="img/imagen-articulo-1.jpg" alt="">
              <div class="texto-articulo">
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
              </div>
              <div class="boton">
                <a href="#">Seguir leyendo</a>
              </div>
            </div>

          <div class="aside">
            <div class="widget">
              <div class="autor-widget">
                <div class="foto-autor">
                  <img src="img/foto.jpg" alt="Foto del autor">
                </div>
                <div class="datos-autor">
                  <h3 class="nombre">Autores</h3>
                  <p class="profesion">Gerónimo Le Lan, Camila Pieroni</p>
                  <p class="info">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in.</p>
                </div>
              </div>
            </div>

          </div>
        </div>
      </div>
    </div>

    <div class="footer">
      <p>(C) Todos los derechos reservados</p>
    </div>

  </body>
</html>