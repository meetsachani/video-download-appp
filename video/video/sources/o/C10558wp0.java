package o;

import java.io.File;

/* renamed from: o.wp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10558wp0 {
    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
