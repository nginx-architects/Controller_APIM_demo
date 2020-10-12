echo $1
echo $2
echo $3
sed 's/controller_host/$1/' ./PostmanCollections/Controller3.x_Env.postman_environment.json
sed 's/controller_username/$2/' ./PostmanCollections/Controller3.x_Env.postman_environment.json
sed 's/controller_password/$3/' ./PostmanCollections/Controller3.x_Env.postman_environment.json
cat ./PostmanCollections/Controller3.x_Env.postman_environment.json

newman run -k ./PostmanCollections/Controller3.x_demo_login.postman_collection.json -e  ./PostmanCollections/Controller3.x_Env.postman_environment.json