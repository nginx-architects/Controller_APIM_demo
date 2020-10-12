echo 'Inside login'
newman run -k ./PostmanCollections/Controller3.x_demo_login.postman_collection.json -e  ./PostmanCollections/Controller3.x_Env.postman_environment.json