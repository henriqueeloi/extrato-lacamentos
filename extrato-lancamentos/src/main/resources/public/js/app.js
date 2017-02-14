angular.module('listaLancamentos', [])
.controller('lancamentosController', function($scope, $http) {
    $http.get('http://localhost:8080/api/lancamentos').
        then(function(response) {
            $scope.lancamentos = response.data;
        }); 
});

