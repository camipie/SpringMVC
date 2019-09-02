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
            <li><a href="#">EXPERIENCIA (to do)</a></li>
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
              <h3 class="titulo-articulo">Mis aptitudes</h3>
              <p class="categoria-articulo"></p>
              <img src="" alt="">
              <div class="texto-articulo">
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
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
                  <p class="info">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in.</p>
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