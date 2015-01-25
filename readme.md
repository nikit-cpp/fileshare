#Деплой-плагин:
In settings.xml : must be rile manager-script <user username="admin" password="s3cret" roles="manager-gui,manager-script"/>  
...And the URI in the plugin should be /manager/text  

#Проблема:
The superclass “javax.servlet.http.HttpServlet” was not found on the Java Build Path  
##Решение:
[http://stackoverflow.com/questions/22756153/the-superclass-javax-servlet-http-httpservlet-was-not-found-on-the-java-build/25266076#25266076]  
Add a runtime first and select project properties then check server name from 'Runtimes' tab as shown in image.  

#Проблема:
Cannot change version of project facet Dynamic Web Module to 2.4.	struts-hello-world		line 1	Maven Java EE Configuration Problem
##Решение:
I updated my web.xml  

<web-app xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee  
          http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"  
    version="3.0">  
    
.. and in pom.xml add to properties:  
<maven.compiler.source>1.7</maven.compiler.source>  
<maven.compiler.target>1.7</maven.compiler.target>  

#Документация по Jetty-плагину
http://www.eclipse.org/jetty/documentation/9.2.2.v20140723/jetty-maven-plugin.html  
