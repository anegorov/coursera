package jagru;

import coursera.GrayScaleConverter;
import coursera.ImageResource;
import coursera.ImageSaver;
import org.junit.Ignore;

public class TestImage {
    @Ignore
    public void testGray(){
        ImageResource ir = new ImageResource();
        GrayScaleConverter gsc = new GrayScaleConverter();
        ImageResource gray = gsc.makeGray(ir);
        gray.draw();
    }

    @Ignore
    public void testSelectAndConvert(){
        GrayScaleConverter gsc = new GrayScaleConverter();
        gsc.selectAndConvert();
    }

    @Ignore
    public void testDoSave(){
        ImageSaver is = new ImageSaver();
        is.doSave();
    }
}
