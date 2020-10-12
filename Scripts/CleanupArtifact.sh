echo "Running Cleanup Artifact Script"

newman run -k ./PostmanCollections/Controller3.x_demo_cleanup.postman_collection.json -e  ./temp_env.json