echo 'Inside login'
echo $1
echo $2
echo $3
newman run -k ./PostmanCollections/Controller3.x_demo_login.postman_collection.json -e  ./PostmanCollections/Controller3.x_Env.postman_environment.json