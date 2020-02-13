(function () {
    'use strict';
    
    angular
        .module('admin.pages', [])
        .config(config);

    config.$inject = ['$stateProvider', '$urlRouterProvider'];
    function config($stateProvider, $urlRouterProvider) {
 
        $stateProvider
            .state('admin.pages', {
                url: 'pages',
                templateUrl: '../views/admin/admin.pages.html',
                controller: 'AboutCtrl as vm',
                data: {
                    is_granted: ['ROLE_ADMIN']
                }
            });
    }
    
})();
 