package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
public class a {

    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0035a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    public static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (a(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static void b(Context context, ProfileInstallReceiver.a aVar) {
        File a;
        if (Build.VERSION.SDK_INT >= 34) {
            a = b.a(context).getCacheDir();
        } else {
            a = C0035a.a(b.a(context));
        }
        if (a(a)) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
