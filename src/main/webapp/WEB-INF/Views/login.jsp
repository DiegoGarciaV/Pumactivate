<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es" ng-app="indexApp">
    <head>
        <title>Administración Pumactivate</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/index/index.css">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet">

        <script type="text/javascript" src="js/index.js"></script>
        <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="js/angular.js"></script>
        <script type="text/javascript" src="js/app.js"></script>

    </head>
    <body onload="onloadBody()" ng-controller="login">
        <h1>Login</h1>
        <form>
            <input type="text" ng-model="username">
            <input type="password" ng-model="password">
            <button ng-click="logUser()">Enviar</button>
        </form>

        <div>
            <h2>{{logedUser.username}}</h2>
            <p>Email: {{logedUser.email}}</p>
            <p>Rol: {{logedUser.username}}</p>
        </div>
    </body>
</html>