app = angular.module("admin-app", ["ngRoute"]);
app.config(function($routeProvider) {
	$routeProvider
		.when("/product", {
			templateUrl: "/assets/admin/product/index.html",
			controller: "product-ctrl"
		})
		.when("/account", {
			templateUrl: "/assets/admin/account/index.html",
			controller: "account-ctrl"
		})
		.when("/authorize", {
			templateUrl: "/assets/admin/authority/index.html",
			controller: "authority-ctrl"
		})
		.when("/unauthorized", {
			templateUrl: "/assets/admin/authority/unauthorized.html",
			controller: "authority-ctrl"
		})
		.otherwise({
			templete: "<h1 class='text-center'> FPT Polytecnich Administration</h1>"
		});
})