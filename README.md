# Vulnerable Spring Cloud Function todo application to be run on AWS

This application has 4 functions, create, get, update and delete. To build, run:

```mvn clean install```

Then run ```createFunctions.sh``` to duplicate the jar output and change the ```function.name``` in the ```application.properties``` file.

To deploy, run:

```sls deploy -v --aws-profile <your_profile>```

To invoke, run:

```sls invoke -f createtodo -l --aws-profile <your_profile> --data '{"todoText":"Buy Milk"}'```
