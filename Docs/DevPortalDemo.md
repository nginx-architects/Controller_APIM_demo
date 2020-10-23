## APIM Developer Portal Demo
- On the Jumphost, open up `Google Chrome`.

- Select the bookmark toolbar link: (`Sports DevPortal`) https://devportal.example.com 

- Login to Controller using Admin credentials. (For credentials, refer [README.md](../README.md#demo-environment-related-credentials) file)

- Select `Sports Results` and then click on `View Docs` button.
  ![DevPortal View Docs](Media/DevPortal/01_Devportal_viewDocs.png)

- Select `F1 Results API` and then click on `Get Started` button. <br>
  ![DevPortal F1 Get Started](Media/DevPortal/02_Devportal_F1_GetStarted.png)

- Demonstrate/browse the published content and review the API definitions and details.

- Note the (`Active Indicator`) color of the left side browser frame which is blue.
  ![DevPortal Default Active Color](Media/DevPortal/03_Devportal_Default_active_color.png)

- Login to Controller using Admin credentials. (For credentials, refer [README.md](../README.md#demo-environment-related-credentials) file)

- Navigate to `Services` view within Controller by clicking on the top right NGINX button.
![services view](./Media/01_Controller_Services_view.png) 

- Select `APIs` and then select `Dev Portals` <br>
  ![APIs select DevPortals](Media/DevPortal/04_Devportal_Select_Devportals.png)

- Select `Sports Developers' Portal` and then click on the `Edit` button
  ![Devportal Edit](Media/DevPortal/05_Devportal_edit_button.png) 

- Briefly browse the page and show the Dev Portals various style configuration capabilities. 

- Select `Colors` and then select `Active Indicator` which would open a color palette as shown in below screenshot.
  ![Devportal active color edit](Media/DevPortal/06_Devportal_active_color_edit.png)

- Change the HEX value from `#3B43BE` to `#FF0000` which is the HEX code for red and then click on `Submit` on top right corner of the screen to save the changes.<br>
  ![Devportal active color red](Media/DevPortal/07_Devportal_active_color_red.png)
  
- Return to the http://devportal.example.com webpage and reload it. 

- Note the highlight color changed to `Red` which we selected as the `Active Indicator`.
  ![Devportal Active Indicator Red](Media/DevPortal/08_Devportal_active_indicator_red.png)

- The ability to customize your Dev Portal is a standard feature in NGINX Controller.