package pl.mateusz.demo.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
public class Controller {

    private Servvice servvice;

    @Autowired
    Controller(Servvice servvice){
        this.servvice = servvice;
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("fille") MultipartFile multipartFile){
        try {
            multipartFile.getName();
            long id = servvice.save(multipartFile.getBytes(), multipartFile.getOriginalFilename());
            return String.valueOf(id);
        } catch (IOException e){
            return "Error";
        }
    }
    @GetMapping("/download")
    public ResponseEntity<Resource> download(@PathVariable long id){
        byte[] bytes = servvice.findFile(id);
        String name = servvice.findName(id);
        InputStreamResource resource = new InputStreamResource(new ByteArrayInputStream(bytes));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + name)
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);

    }
}
