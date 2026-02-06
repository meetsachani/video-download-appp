package o;

import android.database.CursorWindow;
import android.os.Build;

/* renamed from: o.vS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10225vS {

    /* renamed from: o.vS$a */
    /* loaded from: classes.dex */
    public static class a {
        public static CursorWindow a(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    public static CursorWindow a(String str, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(str, j);
        }
        return new CursorWindow(str);
    }
}
