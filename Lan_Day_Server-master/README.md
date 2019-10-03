# Lan_Day_Server
serveur d'appli de vote



Attention le fichier persistence.xml n'est pas présent dans ce dépôt.


exemple pour postgres à placer dans le dossier 
WebContent/WEB-INF/classes/META-INF
```html
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.1"
    xmlns="http://xmlns.jcp.org/xml/ns/persistence"               
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"               
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence     
    http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">      
    
    <persistence-unit name="PU_JPA">           
    
   	<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>                    
    
    	<class>com.ort.ms2i.Model.Entreprise</class>   
                   
    
    	<properties>              
    		<!-- PROPRIETES STANDARDS JPA -->             
     		<property     name="javax.persistence.jdbc.driver"      value="org.postgresql.Driver"/>              
     		<property     name="javax.persistence.jdbc.url"       	value="jdbc:postgresql://localhost/Lan_Day"/>              
     		<property     name="javax.persistence.jdbc.user"       	value="JEE"/>
     		<property     name="javax.persistence.jdbc.password"    value="JEE"/>                                
     
     		<!-- PROPRIETES SPECIFIQUES A L’IMPLEMENTATION HIBERNATE UTILISEE -->                          
     		<property       name="hibernate.show_sql"       value="true"/>              
     		<property       name="hibernate.format_sql"     value="true"/> 
     		<property   	name="hibernate.hbm2ddl.auto"   value="update"/>
    	</properties>      
   </persistence-unit>  
</persistence>
```
## Modif Time Zone pour My SQL
SET @@global.time_zone = '+00:00';

SET @@session.time_zone = '+00:00';


## Liens pour JDK 11+
Ajout de dépendance pour lever Java-lang-noclassdeffounderror-javax-xml-bind-jaxbexceptio
https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-in-j

## Utilisation Git
Si des fichiers distants ont été modifiés et que tu veux pousser tes majs :

git pull : il renvoie une erreur alors faire :

- git stash save : mettre les fichiers de côtés
- git merge origin/dev
- git stash pop : là on réunis les fichiers
- git add .
- git commit -m "description"
- git push origin dev
