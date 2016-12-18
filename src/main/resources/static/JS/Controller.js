app.controller('usersController', function($scope, $http) {
	$scope.loading = true;
    $http.get('http://localhost:8080/user').
        then(function(response) {
        	$scope.users= response.data._embedded.user;
        });
});
