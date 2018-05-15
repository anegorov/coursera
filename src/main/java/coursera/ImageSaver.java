package coursera;

import java.io.File;

public class ImageSaver {
    public void doSave(){
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            ImageResource image = new ImageResource(f);
            String fname = image.getFileName();
            String newNmane = "copy-" + fname;
            image.setFileName(newNmane);
            image.save();
        }
    }

}
