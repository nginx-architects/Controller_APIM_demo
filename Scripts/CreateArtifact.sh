echo "Running Create Artifacts Script"

newman run -k ./PostmanCollections/Controller3.x_demo_prep.postman_collection.json -e  ./temp_env.json