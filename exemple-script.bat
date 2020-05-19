

@echo on

SET mypath=%~dp0
SET userprofil=%systemdrive%%homepath%
SET tomcatpath=E:\Users\Benjy\HDD Téléchargements\apache-tomcat-9.0.34\bin

call mvn scm:checkout  -DconnectionUrl=scm:git:https://github.com/BenjaminBoutrois/MavenFormation.git -DcheckoutDirectory=Formulaire_javaV3

cd %mypath%\Formulaire_javaV3\

call mvn clean package

SET src=E:\FormationMaven\TPs\TP6\Formulaire_javaV3\Formulaire_javaV3-web\target\Formulaire_javaV3-web.war
SET dest=E:\Users\Benjy\HDD Téléchargements\apache-tomcat-9.0.34\webapps\apache-tomcat-9.0.19\webapps\

copy %src% %dest%

call %tomcatpath%\startup.sh

start chrome http://127.0.0.1:8080/Formulaire_javaV3-web/
