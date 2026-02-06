package o;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: o.sW1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9512sW1 {
    public static final String a = "GlideRuntimeCompat";
    public static final String b = "cpu[0-9]+";
    public static final String c = "/sys/devices/system/cpu/";

    /* renamed from: o.sW1$a */
    /* loaded from: classes.dex */
    public class a implements FilenameFilter {
        public final /* synthetic */ Pattern X;

        public a(Pattern pattern) {
            this.X = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.X.matcher(str).matches();
        }
    }

    public static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static int b() {
        File[] fileArr;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File(c).listFiles(new a(Pattern.compile(b)));
        } catch (Throwable th) {
            try {
                if (Log.isLoggable(a, 6)) {
                    Log.e(a, "Failed to calculate accurate cpu count", th);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        if (fileArr != null) {
            i = fileArr.length;
        } else {
            i = 0;
        }
        return Math.max(1, i);
    }
}
