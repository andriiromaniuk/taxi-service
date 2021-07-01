#Taxi Service
____
This application may be used by taxi companies that want to organize the list of available cars and drivers that are assigned to them.

## How to use:
____
1. Configure Web Server (I personally used Tomcat 9.0.46)
2. Setup MySQL Server and enter your schemas URL, USERNAME and PASSWORD in src/main/java/taxi/util/ConnectionUtil.java. User must have access to schema that was given in URL.
3. Run a project

After those steps you have possibilites to:
- add new drivers to DB;
- deleted drivers from DB;
- add new car to DB;
- assign a driver to existing car;
- deleted cars from DB;
- add new manufacturer to DB;
- deleted manufacturer from DB;
- get information about cars, drivers and manufacturers.

For menu to show up use browser to send /index request to your server after logging in.

##Tecnhologies used in project
____
- JDBC
- MySQL Server 8.0.25
- Java Servlet API
- JSP
- Apache Tomcat 9.0.46