package pl.ohayer.motorcycle_dealear.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class PhotoService {
    public void saveImage(MultipartFile imageFile) {
        try {
            String folder = "C:\\projectCar\\";
            byte[] bytes = imageFile.getBytes();
            String fileName = imageFile.getOriginalFilename();
            Path filePath = Path.of(folder, fileName);
            Files.write(filePath, bytes);
        } catch (IOException e) {
            System.err.println("File not found on disc C");
        }
    }

    public List<File> getPhotosById(Long id) {
        String folder = "C:\\projectCar\\";
        File[] files = new File(folder).listFiles();
        List<File> matchingPhotos = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().startsWith(id + "#")) {
                    matchingPhotos.add(file);
                }
            }
        }
        return matchingPhotos;
    }

    public String returnImage() throws IOException {
        String folder = "C:\\projectCar\\";
        File file = new File(folder, "1#1.jpg");
        byte[] imageBytes = Files.readAllBytes(Paths.get(file.getPath()));
        String encodedImage = Base64.getEncoder().encodeToString(imageBytes);
        return "data:image/jpeg;base64," + encodedImage;
    }
}


