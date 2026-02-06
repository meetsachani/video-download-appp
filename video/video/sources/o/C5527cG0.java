package o;

import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.cG0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5527cG0 {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 6;
    public static final int g = 3;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 12;
    public static final int l = 13;
    public static final int m = 16;
    public static final int n = 17;

    /* renamed from: o  reason: collision with root package name */
    public static final int f705o = 21;
    public static final int p = 22;
    public static final int q = 23;
    public static final int r = 24;
    public static final int s = 25;
    public static final int t = 26;
    public static final int u = 27;
    public static final int v = 0;
    public static final int w = 27;
    public static final int x = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.cG0$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.cG0$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i2) {
        if (i2 == -1) {
            return -1;
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 6;
        if (i3 < 34) {
            switch (i2) {
                case 21:
                case 23:
                case 26:
                    i2 = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i2 = 4;
                    break;
                case 25:
                    i2 = 0;
                    break;
            }
        }
        if (i3 < 30) {
            if (i2 != 12) {
                if (i2 != 13) {
                    if (i2 != 16) {
                        if (i2 == 17) {
                            i4 = 0;
                        }
                    }
                }
                if (i3 >= 27 && (i4 == 7 || i4 == 8 || i4 == 9)) {
                    return -1;
                }
                return i4;
            }
            i4 = 1;
            if (i3 >= 27) {
            }
            return i4;
        }
        i4 = i2;
        if (i3 >= 27) {
        }
        return i4;
    }
}
