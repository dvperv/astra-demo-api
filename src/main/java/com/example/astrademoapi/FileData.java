package com.example.astrademoapi;

import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "defiles")
public class FileData {
    @Id
    private String id;

    private String path;

    private Binary data;

    private float result = -1;

    public FileData(String path) {
        this.path = path;
    }
}
