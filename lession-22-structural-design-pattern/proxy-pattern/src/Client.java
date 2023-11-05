import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        URL url = new URL("https://cdn.stubdownloader.services.mozilla.com/builds/firefox-stub/vi/win/379e34e415babe46bfd80d6defcb0a9d410c1250fb470acf75c4d57fd8c1f9f5/Firefox%20Installer.exe");
        fileDownloaderProxy.download(url);
    }
}