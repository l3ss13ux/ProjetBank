REM SET JAVA_HOME=C:\Program Files\Java\jdk1.6.0_45
REM SET PATH=%JAVA_HOME%\bin;%PATH%

"%JAVA_HOME%\bin\java" -cp ./hsql.init.j7-1.0.0-jar-with-dependencies.jar org.hsqldb.server.Server --database.0 file:banque --dbname.0 banque