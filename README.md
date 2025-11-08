# Simple JSF2 Hello World Webapp

## Why?
Sometimes you need a test app that's nothing more than the simplest 
possible app to use as either:

* a starting point to get started on some other app
* an app to use for testing deployments to a different server or platform
* a simplest case example of an app using a given framework, for comparing with 
other frameworks.

If you remember struts-blank.war from back in the day then this is the same idea.

## What is this?
This is a simplest case webapp using JSF2 that meets the above needs.

It doesn't have any database dependencies, because it's ...simple.

## What Version of JSF is it using?
2.3

## How to build/run

- mvn clean package
- docker build . -t simplejsf2-tomcat  
- docker run -p 8080:8080 simplejsf2-tomcat
- Open browser at http://localhost:8080/simplejsf

Or

- docker compose up

## Tomcat session persistence

The Dockerfile includes an updated Tomcat context.xml that enables
HTTP Session persistence using FileStore, and the test WebBean is updated to 
add @SessionManaged. If you Ctrl-C the running Container and then restart it
with `docker compose up` again, the session state is reloaded - you can test this with
/simplejsf/hello.xhtml.
