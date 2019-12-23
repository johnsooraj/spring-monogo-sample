##Interview Questions

**1. Annotaions used in Enititys?**
>src/main/com/sample/Users.java

**2. Uniquekey in Collection **
>@Indexed(name = "first_name_index", direction = IndexDirection.DESCENDING, unique = true)
Error be linke this,
com.mongodb.MongoWriteException: E11000 duplicate key error collection: test.users index: first_name_index dup key: { : "John" }