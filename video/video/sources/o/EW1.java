package o;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;

/* loaded from: classes.dex */
public final class EW1 {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    public static void a(SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            a.a(sQLiteCursor, z);
        }
    }
}
