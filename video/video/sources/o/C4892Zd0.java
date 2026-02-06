package o;

import android.os.Environment;
import java.io.File;

/* renamed from: o.Zd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4892Zd0 {
    @Deprecated
    public static final String a = "unknown";

    /* renamed from: o.Zd0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    public static String a(File file) {
        return a.a(file);
    }
}
