package com.example.astrademoapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileDataRepo extends MongoRepository<FileData, String> {
}
