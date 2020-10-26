## APIM User/Group - Gateway Isolation

- On the Jumphost, open up `Google Chrome`.

- Select the bookmark toolbar link: (`Controller|Login`) https://nginxcontrollerdemo.com 

- Login to Controller using Admin credentials. (For credentials, refer [README.md](../README.md#demo-environment-related-credentials) file)

- Navigate to `Platform` view within Controller by clicking on the top right NGINX button.<br>
![Platform view](Media/02_Controller_Platform_view.png)

- Create a `Role` by selecting the `Roles` icon from left pane and then clicking on `Create Role`.<br>
![Create Roles](Media/UserGroup/01_UserGroup_roles.png)

- Within the `Create Role` pane, navigate to the bottom of the page and select `CREATE NEW ENVIRONMENT`.<br>
![Create New Env](Media/UserGroup/02_UserGroup_create_env.png)

- In the `Create Environment` pane, enter the name `dev-f1` and then click on submit. This would create a new environment with `dev-f1` name.
![New Environment Pane](Media/UserGroup/03_UserGroup_new_env_pane.png)

- Once the new Environment has been created, enter `devrole` in role Name field, and at the bottom for permissions section, grant appropriate access as shown in the screenshot below. Once done click on `Create` button to create the new role.<br>
![Create role](Media/UserGroup/04_UserGroup_create_role.png)

- Next we will create a user, to create a user select the `Users` icon on left pane and then click on `Create User` button.<br>
![Create Users](Media/UserGroup/05_UserGroup_users.png)

- Within the `Create User` pane, fill out the details as below screenshot. Once done click on `Create` button to create the new user.
  ![Create new User](Media/UserGroup/06_UserGroup_create_user.png)

- Navigate to `Services` view within Controller by clicking on the top right NGINX button.<br>
![services view](Media/01_Controller_Services_view.png)

- Now we would create a new gateway. Navigate to `Gateways` icon and then click on `Create Gateway` button.<br>
![Create Gatewy](Media/UserGroup/07_UserGroup_gateways.png)

- Within the `Create Gateway` pane, fill out the fields as below:
  - In `Configuration` tab, fill `Name` and `Environment` section as shown in the screenshot.<br>
  ![Create Gateway Configuration tab](Media/UserGroup/08_UserGroup_gateway_config.png)
  - In `Placements` tab, fill `Instance Refs` section as shown in the screenshot.<br>
  ![Create Gateway Placements tab](Media/UserGroup/09_UserGroup_gateway_placements.png)
  - In `Hostnames` tab, select `Add Hostname` and then fill `Hostname(URI Formatted)` section as shown in the screenshot.<br>
  ![Create Gateway Hostnames tab](Media/UserGroup/10_UserGroup_gateway_hostnames.png)
  - Finally, select `Submit` to create the new gateway.
  
- Now we would create a new app. Navigate to `Apps` icon and then click on `Create App` button.<br>
![Create Apps](Media/UserGroup/11_UserGroup_apps.png)

- Within the `Create App` pane, fill out the details as below screenshot. Once done click on `Submit` button to create the new app.
![Create New App](Media/UserGroup/12_UserGroup_apps_create.png)

- Open `Postman` app from the desktop and then run `4_NGINX Controller Dev API` collection.
  - Click on `Run` by selecting the collection. 
  ![Postman Run Collection1](Media/UserGroup/13_UserGroup_postman1.png)
  - Select the `Environment` as `Controller3.x Env` and then click on the `Run` button as shown in below screenshot.
    ![Postman Run Collection2](Media/UserGroup/14_UserGroup_postman2.png)

- Log out of NGINX Controller as `admin`<br>
  ![Admin Logout](Media/UserGroup/15_UserGroup_Admin_logout.png)

- Log back into NGINX controller as `dev` user using below credentials
  - Username: `dev@example.com`
  - Password: `Admin123!@#`<br>
![Dev Login](Media/UserGroup/16_UserGroup_Dev_Login.png)

- Navigate to `Services` view within Controller by clicking on the top right NGINX button.<br>
![services view](Media/01_Controller_Services_view.png)

- Select `Environments`, `Gateways` and `Apps` sequentially.<br>
![Left Service Pane](Media/UserGroup/17_UserGroup_env_gateway_apps.png)

- **NOTE:** You can only view the components that are defined in your role and environment. Also, the placement for the gateway is limited to `apigateway3`.

- Select `APIs`.<br> 
  ![Apis](Media/UserGroup/18_UserGroup_api.png)

- **Note:** You can only view API definition, published APIs and components for `dev-f1-results` based on your role access.

- Logout of NGINX Controller as `dev` user.<br>
![Dev logout](Media/UserGroup/19_UserGroup_Dev_logout.png)