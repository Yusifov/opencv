package webcam;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class WebCam {

    public static void main(String[] args) {
        Webcam webcam = Webcam.getDefault();
        
        webcam.addWebcamListener(new WebcamListener() {
            @Override
            public void webcamOpen(WebcamEvent we) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void webcamClosed(WebcamEvent we) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void webcamDisposed(WebcamEvent we) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void webcamImageObtained(WebcamEvent we) {
                
            }
        });
        webcam.setViewSize(new Dimension(640, 480));
        webcam.open();
        for(int i=0;i<10;i++) {
                    try {
                        ImageIO.write(webcam.getImage(), "jpg", new File("A"+i+".jpg"));
                    } catch (IOException ex) {
                        Logger.getLogger(WebCam.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
    }
}
