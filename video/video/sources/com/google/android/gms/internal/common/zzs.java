package com.google.android.gms.internal.common;

import o.InterfaceC6181ey;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public final class zzs {
    @InterfaceC6181ey
    public static int a(int i, int i2, String str) {
        String a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            a = zzy.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            a = zzy.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(a);
    }

    @InterfaceC6181ey
    public static int b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(d(i, i2, "index"));
    }

    public static void c(int i, int i2, int i3) {
        String d;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                d = zzy.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                d = d(i2, i3, "end index");
            }
        } else {
            d = d(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(d);
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return zzy.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzy.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
