package com.example.Files.components;

import com.example.Files.models.File;
import com.example.Files.models.Folder;
import com.example.Files.models.User;
import com.example.Files.respositories.FileRepository;
import com.example.Files.respositories.FolderRepository;
import com.example.Files.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User user = new User("Lorraine");
        userRepository.save(user);

        File file = new File("Tapu File", "ruby", 255);
        fileRepository.save(file);

        Folder folder = new Folder("Stuff");
        folderRepository.save(folder);
    }


}
