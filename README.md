# CityBikeApp
Java Spring Boot backend / REST API app to show journeys made with city bikes in the Helsinki Capital area. 

Backend built with Spring Boot, Java and JPA.

About the project:
-used spring-boot-starter-parent for dependency version control
-maven package handling
-organized package by feature for Spring Boot location scanning
-hibernate validator

You will need java 8 to run this application (https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html). If you have other version of java simply change it from project's pom.xml :
    <properties>
		<java.version>8</java.version>
    </properties>

If you want to run the project from commanline you will need maven. Install maven: (https://maven.apache.org/install.html).
Then run from project directory 
mvn package
and
mvnw spring-boot:run 

With VS Code or Eclipse project can be run from CityBikeAppApplication.java (select file and right click: run java)

The app should then run on port 8080.

You need to have this backend running for frontend.


![journeysrest](https://user-images.githubusercontent.com/70891200/184506959-d54029d1-6410-4447-b36b-e12e13d52790.png)

The data is owned by City Bike Finland.


