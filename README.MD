##Interview Questions

**1. Annotaions used in Enititys ?**
>src/main/com/sample/Users.java

**2. How the Uniquekey works in Collection ?**

>**Method 1: UniqueKey on a member variable**
>@Indexed(name = "first_name_index", direction = IndexDirection.DESCENDING, unique = true)
Error be linke this,
com.mongodb.MongoWriteException: E11000 duplicate key error collection: test.users index: first_name_index dup key: { : "John" }

>**Method 2: UniqueKey on a Reference object**
>@CompoundIndexes({
        @CompoundIndex(name = "address_index", def = "{'address.$id': 1}", unique = true, background = true)
})
Error be like this,
E11000 duplicate key error collection: test.users index: address_index dup key: { : ObjectId('5e005e85067de76a1d5859ee') }; nested exception is com.mongodb.MongoWriteException: E11000 duplicate key error collection: test.users index: address_index dup key: { : ObjectId('5e005e85067de76a1d5859ee') }

**3. How can we avoid the Duplication of data in Collections ? **
>Using of unique key indexing in collection can remove duplicate datas(see the question 2).

**4. Document update in Collection**
>1. save() - update whole object, if _id present it will update else create new document.
>2. updateFirst() - update the first document the matches the query.
>3. updateMulti() - update the all document the matches the query.
>4. upsert() - If no document matches then create new one with Query, Update objects.
>5. findAndModify() - Same as the updateMulti, an option like can return newly added document.
>[ReferenceLink](https://www.mkyong.com/mongodb/spring-data-mongodb-update-document/ "www.mkyong.com")