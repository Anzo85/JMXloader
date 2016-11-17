package JMSaz;

/**
 * Created by anzo0316 on 11/17/2016.
 */
public interface URLloaderMBean {
    String getFolder();

    String getUrl();

    void setFolder(String folder);

    void setUrl(String url);

    public void download() throws Exception;

}
