package com.google.android.gms.internal.measurement;

import o.C8077mf;
import o.ED2;

/* loaded from: classes3.dex */
final class zzmj {
    public static /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!e(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !e(b3) && !e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & ED2.a) << 12) | ((b3 & ED2.a) << 6) | (b4 & ED2.a);
            cArr[i] = (char) ((i2 >>> 10) + ED2.d);
            cArr[i + 1] = (char) ((i2 & 1023) + ED2.e);
            return;
        }
        throw zzji.d();
    }

    public static /* synthetic */ void b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!e(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !e(b3)))) {
            cArr[i] = (char) (((b & C8077mf.q) << 12) | ((b2 & ED2.a) << 6) | (b3 & ED2.a));
            return;
        }
        throw zzji.d();
    }

    public static /* synthetic */ void c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !e(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & ED2.a));
            return;
        }
        throw zzji.d();
    }

    public static /* synthetic */ void d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean e(byte b) {
        return b > -65;
    }
}
