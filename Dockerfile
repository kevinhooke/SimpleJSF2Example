FROM tomcat:9.0.111-jre8-temurin-jammy

COPY ./target/simplejsf.war /usr/local/tomcat/webapps
EXPOSE 8080

CMD ["catalina.sh", "run"]