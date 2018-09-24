cd target
cp todo-1.0-SNAPSHOT-aws.jar todo-1.0-delete-fn.jar
cp todo-1.0-SNAPSHOT-aws.jar todo-1.0-update-fn.jar
cp todo-1.0-SNAPSHOT-aws.jar todo-1.0-create-fn.jar
cp todo-1.0-SNAPSHOT-aws.jar todo-1.0-get-fn.jar
cp todo-1.0-SNAPSHOT-aws.jar todo-1.0-import-fn.jar

jar -xvf todo-1.0-SNAPSHOT-aws.jar application.properties
mv application.properties application.properties.ORIG

sed -e s/CreateTodoFunction/DeleteTodoFunction/g application.properties.ORIG > application.properties
jar -uvf todo-1.0-delete-fn.jar/ application.properties

sed -e s/CreateTodoFunction/UpdateTodoFunction/g application.properties.ORIG > application.properties
jar -uvf todo-1.0-update-fn.jar/ application.properties

sed -e s/CreateTodoFunction/GetTodoFunction/g application.properties.ORIG > application.properties
jar -uvf todo-1.0-get-fn.jar/ application.properties

sed -e s/ImportTodosFunction/GetTodoFunction/g application.properties.ORIG > application.properties
jar -uvf todo-1.0-import-fn.jar/ application.properties
