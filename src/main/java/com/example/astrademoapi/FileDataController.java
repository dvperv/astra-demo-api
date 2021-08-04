package com.example.astrademoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FileDataController {
    private final FileDataService fileDataService;

    public FileDataController(FileDataService fileDataService) {
        this.fileDataService = fileDataService;
    }

    @PostMapping("/api/fd/upload")
    public String FileDataUpload(@RequestParam("path") String path, @RequestParam("file") MultipartFile file, Model model)
        throws IOException {
        return fileDataService.upload(path, file);
    }

//TODO get mapping
//TODO DB connection
}
