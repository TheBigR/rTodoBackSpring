# rTodoBackSpring

runs at localhost:8080

available pathes -
/create
string param: title
long param: creationTime
long param: updateTime
boolean param: done

/getAll

/getByTitle
string param: title

/getByUuid
string param: uuid

/update
string param: title
string param: newTitle
long param: updateTime
boolean param: done

/delete
string param: uuid

/deleteAll

this is hooked to an Atlas collection.
see connection string at application properties.
