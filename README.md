# jsp-templates
### Description
This app demonstrates how to use jsp templates in Spring-Boot
### Procdeure
Create a "demo" template using Spring Initializr. Navigate to Spring Initializr at [Spring Initializr](https://start.spring.io/), then select Maven, and add the "Spring Web" dependency. Click on the Generate button to download the template

![Spring Initializr](https://raw.githubusercontent.com/mmackenzie-syd/java-servlets/main/spring-boot-initiliser.png)

In the pom.xml file add the "tomcat-embed-jasper" and "jstl" dependencies as shown below. These are for transforming the jsp page into html.

![pom file](https://raw.githubusercontent.com/mmackenzie-syd/jsp-templates/main/pom-file.png)

Create a "webapp" folder in the "src/main" folder and add an "index.jsp" page as shown. The "webapp" folder follows the standard, Apache naming convention:

![jsp page](https://raw.githubusercontent.com/mmackenzie-syd/jsp-templates/main/index.png)

Add a "HomeController" class corresponding to the "index" jsp page as shown:

![Home Controller](https://raw.githubusercontent.com/mmackenzie-syd/jsp-templates/main/controller.png)

Modify the "applications.properties" file to tell maven to use the jsp templating. The default folder for the jsp files is "webapp", but another folder can be pointed to, for example "views", by adding the "spring.mvc.view.prefix: /views" in the properties file.

![properties](https://raw.githubusercontent.com/mmackenzie-syd/jsp-templates/main/properties.png)


### Running the App
You can run the application by using 
```
./mvnw spring-boot:run
```
Alternatively, you can build the JAR file with 
```
./mvnw clean package
``` 
and then run the JAR file, as follows:
```
java -jar target/gs-serving-web-content-0.1.0.jar
```
In a browser, navigate to localhost:8080 to view the servlet response.

### References:
https://www.mytroubleshooting.com/2018/06/spring-boot-mvc-jsp-visual-studio-code.html
