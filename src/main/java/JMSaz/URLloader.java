package JMSaz;


import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;


public class URLloader implements URLloaderMBean {

    String folder;
    String url;


    public URLloader(String folder, String url) {
        this.folder = folder;
        this.url = url;
    }

    public String getFolder() {
        return folder;
    }

    public String getUrl() {
        return url;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void download() throws Exception {
        BufferedInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            URL fileUrl = new URL(url);
            inStream = new BufferedInputStream(fileUrl.openStream());
            outStream = new FileOutputStream(folder);
            byte data[] = new byte[1024];
            int counter;
            while ((counter = inStream.read(data, 0, 1024)) != -1) {
                outStream.write(data, 0, counter);
            }
            System.out.println("downloaded to " + folder);
        } finally {
            if (inStream != null)
                inStream.close();
            if (outStream != null)
                outStream.close();

        }

    }


}




