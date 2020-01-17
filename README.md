#Localized Solr Development Environemnt
*This is a sample project to allow the development of custom Solr Plugins.*

This project will automatically checkout the 8.4.1 release version of Solr, compile the Solr build, compile Solr plugin,
 create local Solr instance, deploy Solr plugin to local instance. The version can easily be updated by modifying the `build.xml`

Make sure that you have Maven and Ant installed on your machine

1. run `sh build.sh` from the project directory
2. Access sample handler from `http://localhost:8983/solr/solr-samples/helloworld?indent=true`

If you need to stop the solr instance run `sh stop.sh` from the project directory

If you need to destroy and delete the Solr instance run `sh destroy.sh` from the project directory

If you need to recompile and re-deploy your plugin code, run `sh rebuild.sh` from the project directory

*Note: There may be issues with this build, it works for me on MacOS Catalina 10.15.2, but might not work for everyone due to environment differences.*

