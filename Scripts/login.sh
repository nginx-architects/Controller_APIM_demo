echo "Running Login Script"
sed "s/controller_host/$1/;s/controller_username/$2/;s/controller_password/$3/" ./PostmanCollections/Controller3.x_Env.postman_environment.json > temp_env.json

newman run -k ./PostmanCollections/Controller3.x_demo_login.postman_collection.json -e  ./temp_env.json
rm ./temp_env.json