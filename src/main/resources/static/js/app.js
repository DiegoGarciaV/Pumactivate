var app = angular.module("PaletasApp",[]);

app.controller("controlador",function($scope){

    var paletas = $scope;

    paletas.catalogo = {};

    paletas.getProductos = function(){

        $.ajax({
                    url: "api/productos", 
                    success: function(result){
              
                            paletas.catalogo = result;
                            paletas.$apply();
                    }
                });
    };

    paletas.getProductos();

});