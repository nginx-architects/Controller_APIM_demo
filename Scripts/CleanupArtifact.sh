echo "Running Cleanup Artifact Script"
sed "s/controller_host/$1/;s/controller_username/$2/;s/controller_password/$3/" ./PostmanCollections/Controller3.x_Env.postman_environment.json > temp_env.json

newman run -k ./PostmanCollections/1_Controller3.x_demo_cleanup_MDA.postman_collection.json -e  ./temp_env.json --bail
newman_output=$?
rm ./temp_env.json
if [ $newman_output -eq 0 ]; then
    exit 0
else
    exit 1
fi