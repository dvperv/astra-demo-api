package com.example.astrademoapi;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileDataService {
    private final FileDataRepo fileDataRepo;

    public FileDataService(FileDataRepo fileDataRepo) {
        this.fileDataRepo = fileDataRepo;
    }

    public String upload(String path, MultipartFile file) throws IOException {
        FileData fileData = new FileData(path);
        fileData.setData(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        return fileDataRepo.insert(fileData).getId();
    }

    public FileData result(String id){
        return fileDataRepo.findById(id).get();
    }
}
