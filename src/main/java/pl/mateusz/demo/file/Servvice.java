package pl.mateusz.demo.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servvice {
    public final FileRepo fileRepo;

    @Autowired
    Servvice(FileRepo fileRepo){
        this.fileRepo = fileRepo;
    }

    public long save(byte[] bytes, String name){
        File file = new File(name, bytes);
        return fileRepo.save(file).getId();
    }
    public byte[] findFile(long id){
        File file = fileRepo.findById(id).get();
        return file.getBinary();
    }
    public String findName(long id){
        File file = fileRepo.findById(id).get();
        return file.getName();
    }
}
