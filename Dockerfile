FROM tomcat:8.0-jre8
MAINTAINER kalyter "xiaogangla@qq.com"

#部署项目
COPY target/api.war webapps/

ENTRYPOINT sh bin/startup.sh && tail -f logs/catalina.out
