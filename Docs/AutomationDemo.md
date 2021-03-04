## APIM Automation/Publish Demo
- On the Jumphost, open up `Google Chrome`.

- Select the bookmark toolbar link: (`Controller|Login`) https://nginxcontrollerdemo.com 

- Login to Controller using Admin credentials. (For credentials, refer [README.md](../README.md#demo-environment-related-credentials) file)

- Navigate to `Services` view within Controller by clicking on the top right NGINX button.<br>
![services view](./Media/01_Controller_Services_view.png)

- Make sure none of the components have been created.

- Now in another tab, within Google Chrome, Select the bookmark toolbar link: (`Jenkins|Login`) http://10.1.1.10:8080/
  
- Login to Jenkins using Admin credentials. (For credentials, refer [README.md](../README.md#demo-environment-related-credentials) file)

- Within Jenkins you should be able to see three pipeline jobs as below.<br>
  ![Jenkins Dashboard](./Media/Automation/01_Jenkins_Dashboard.png)

- Open the `CreateArtifact_Pipeline_Controller3.x` job, by clicking on it. 

- Within the job detail page, click on `Build with Parameter` from the left pane.<br>
  ![Jenkins Build with Param](Media/Automation/02_Jenkins_Build_with_param.png)

- Clicking on `Build with Parameter` will open the job parameter options page.
  
- For our UDF, all the default values should work except the password. To update the default password click on the `Change Password` button on the right most side of password field.<br/>
  ![Jenkins Job Change Password](Media/Automation/03_change_password_button.png)

- Once you have updated the Controller admin password click on the `Build` button.<br>
  ![Jenkins Job build](Media/Automation/04_Jenkins_Job_Build.png)

- Once the `Build` button is pressed, you would be navigated back to the main page for the job and you should be able to see a job running as below. Clicking on the `Job number` (highlighted in the diagram) opens the job details page.<br>
  ![Jenkins Job Run](Media/Automation/05_Jenkins_Job_Run.png)

- Within the job's detail page, click on `Console Output` to get detailed logs of the job run.<br>
  ![Jenkins Job Details](Media/Automation/06_Jenkins_Job_details.png)

- Scrolling all the way till the end we notice the job finished with `Success` and also get some useful stats as highlighted in below screenshot.<br>
  ![Jenkins console output](Media/Automation/07_Jenkins_Console_output.png)

- If we navigate back to Controller we can see all the components have been created and are ready to be used.<br>
  ![Controller Services Populated](Media/Automation/08_Controller_Services_populated.png)

- To deploy a newer version of F1 API (Version 2 API Spec) run `UpdateF1Spec` job within jenkins in a similar fashion as you ran the `CreateArtifact_Pipeline_Controller3.x` job.<br>
  ![Jenkins UpdateF1Spec](Media/Automation/09_Jenkins_F1V2_job.png)