var app = angular.module("indexApp",[]);

app.controller("controlador",function($scope){

    var indexPage = $scope;


});

app.controller("login",function($scope){

    var loginPage = $scope;

    loginPage.username = "";
    loginPage.password = "";

    loginPage.logedUser = {

        username: "",
        password: "",
        email: "",
        rol: 0,
        
    };
    loginPage.logUser = function(){
        
        var dataJSON = {username: loginPage.username, password: loginPage.password};
        $.ajax({
                    url:            "login/log", 
                    method:         "POST",    
                    data:           JSON.stringify(dataJSON),
                    dataType:       "json",
                    contentType:    "application/json",   
                    success:        function(result)
                                    {
                                        loginPage.logedUser = result;
                                        loginPage.$apply();
                                        if(result.userId*1 > 0)
                                        {
                                            document.cookie = "username=" + result.username;
                                        }
                                        else
                                            document.cookie = "username=";
                                    }
                });
    };


});