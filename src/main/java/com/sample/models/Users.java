package com.sample.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@CompoundIndexes({
        @CompoundIndex(name = "address_index", def = "{'address.$id': 1}", unique = true, background = true)
})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Users {

    @Id
    private String id;

    private String userName;

    @Indexed(name = "first_name_index", direction = IndexDirection.DESCENDING, unique = true)
    private String firstName;

    @DBRef
    Address address;

    public Users(String userName) {
        this.userName = userName;
    }
}
