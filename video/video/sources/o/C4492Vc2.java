package o;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: o.Vc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4492Vc2 {
    public static final C4492Vc2 a = new C4492Vc2();

    public void a(String str, Context context, String str2) {
        String str3;
        Uri contentUri;
        if (str != null && str2 != null && context != null) {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
            if (str2.equalsIgnoreCase("video")) {
                str3 = "VID_" + format + ".mp4";
            } else {
                str3 = "IMG_" + format + C4940Zp0.X;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str3);
            if (str2.equalsIgnoreCase("video")) {
                contentValues.put(CY.i, C4128Rj1.f);
            } else {
                contentValues.put(CY.i, C4128Rj1.R0);
            }
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + RemoteSettings.i + "Saved Status");
            if (str2.equalsIgnoreCase("video")) {
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
            } else {
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
            }
            ContentResolver contentResolver = context.getContentResolver();
            Uri insert = contentResolver.insert(contentUri, contentValues);
            if (insert == null) {
                Toast.makeText(context, "Failed to save", 0).show();
                return;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(str));
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                if (openOutputStream == null) {
                    return;
                }
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        openOutputStream.write(bArr, 0, read);
                    } else {
                        fileInputStream.close();
                        openOutputStream.close();
                        Toast.makeText(context, "File Saved Successfully", 0).show();
                        return;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(context, "Error saving file", 0).show();
            }
        } else {
            Toast.makeText(context, "Invalid file", 0).show();
        }
    }

    public void b(String str, String str2, Context context) {
        if (str != null && context != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            if (str2.equalsIgnoreCase("image")) {
                intent.setType(C4128Rj1.R0);
            } else {
                intent.setType(C4128Rj1.f);
            }
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
            intent.putExtra("android.intent.extra.TEXT", "Please Try This App\n\nhttps://play.google.com/store/apps/details?id=" + context.getPackageName());
            context.startActivity(Intent.createChooser(intent, "Share Via"));
        }
    }
}
