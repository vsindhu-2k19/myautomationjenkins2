catalina stop
cp -f appl/target/arapp.war /opt/tomcat8/webapps
rm -r /opt/tomcat8/webapps/arapp
catalina start
