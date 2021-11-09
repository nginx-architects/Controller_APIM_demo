echo "Running Script to populate Roles and Users"
sed "s/controller_host/$1/;s/controller_username/$2/;s/controller_password/$3/" ./PostmanCollections/Controller3.x_Env.postman_environment.json > temp_env.json

newman run -k ./PostmanCollections/3_Controller3.x_Create_Users_and_roles.postman_collection.json -e ./temp_env.json --bail
newman_output=$?
rm ./temp_env.json
if [ $newman_output -eq 0 ]; then
    exit 0
else
    exit 1
fi