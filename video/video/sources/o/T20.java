package o;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class T20 {
    public static T20 a() {
        return b(Build.MANUFACTURER, Build.MODEL, Build.VERSION.SDK_INT);
    }

    public static T20 b(String str, String str2, int i) {
        return new C2841Ei(str, str2, i);
    }

    public abstract String c();

    public abstract String d();

    public abstract int e();
}
