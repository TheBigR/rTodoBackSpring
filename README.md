# rTodoBackSpring

runs at localhost:8080

available pathes -
/create
string param: title
int param: creationTime
int param: updateTime
boolean param: done

/getAll

/get
string param: title

/update
string param: title
string param: newTitle
int param: updateTime
boolean param: done

/delete
string param: title

/deleteAll

this is hooked to an Atlas collection.
see connection string at application properties.
