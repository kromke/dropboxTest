import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import java.io.FileInputStream;
import java.io.InputStream;

public class DropBoxThread extends Thread {

    private static final String ACCESS_TOKEN = "jeYtZLBO1SEAAAAAAAAAAcKCem5lc6ddK_mKQUOI3g6aNCaYFjfF3GGOIl480y59";

    public void run() {
        DbxRequestConfig config = DbxRequestConfig.newBuilder("kromke").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        try (
                InputStream in = new FileInputStream("C:\\Users\\user\\Desktop\\test1.txt")) {
            FileMetadata metadata = client.files().uploadBuilder("/test1.txt")
                    .uploadAndFinish(in);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}
