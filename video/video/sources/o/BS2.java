package o;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class BS2 {
    public static String a = "XVid HD Video Downloader";
    public static String b = "Status Video Downloader ";
    public static String c = "de_file";
    public static final long d = 1024;
    public static final long e = 1048576;
    public static final long f = 1073741824;

    public static void a() {
        f();
    }

    public static String b(long j) {
        long j2 = j / 1000;
        return String.format("%02d:%02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60));
    }

    public static String c(long j) {
        if (j < 1024) {
            return j + " B";
        } else if (j < 1048576) {
            return String.format("%.2f KB", Double.valueOf(j / 1024.0d));
        } else {
            int i = (j > 1073741824L ? 1 : (j == 1073741824L ? 0 : -1));
            double d2 = j;
            if (i < 0) {
                return String.format("%.2f MB", Double.valueOf(d2 / 1048576.0d));
            }
            return String.format("%.2f GB", Double.valueOf(d2 / 1.073741824E9d));
        }
    }

    public static List<File> d(Context context) {
        Uri uri;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 29) {
            uri = MediaStore.Video.Media.getContentUri("external");
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        Uri uri2 = uri;
        String[] strArr = {"_id", C7033iP1.m0};
        Cursor query = context.getContentResolver().query(uri2, strArr, "relative_path LIKE ?", new String[]{"Download/" + a + "%"}, "date_added DESC");
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow(C7033iP1.m0);
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    File file = new File(string);
                    if (file.exists()) {
                        arrayList.add(file);
                        Log.d("checkvideo", "Added file: " + string);
                    }
                }
            } catch (Throwable th) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public static Pair<Long, Long> e(String str) throws IOException {
        long j;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        long j2 = 0;
        if (extractMetadata != null) {
            j = Long.parseLong(extractMetadata);
        } else {
            j = 0;
        }
        File file = new File(str);
        if (file.exists()) {
            j2 = file.length();
        }
        mediaMetadataRetriever.release();
        return new Pair<>(Long.valueOf(j), Long.valueOf(j2));
    }

    public static File f() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File file = new File(externalStorageDirectory, Environment.DIRECTORY_DOWNLOADS + File.separator + a);
        String str = c;
        Log.d(str, "getParentFilePath: " + file);
        if (!file.exists() && !file.mkdirs()) {
            file.mkdir();
        }
        return file;
    }
}
