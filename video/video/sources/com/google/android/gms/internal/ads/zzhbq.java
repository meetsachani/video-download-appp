package com.google.android.gms.internal.ads;

import o.C8077mf;
import o.ED2;

/* loaded from: classes2.dex */
final class zzhbq {
    public static /* bridge */ /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!g(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !g(b3) && !g(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & ED2.a) << 12) | ((b3 & ED2.a) << 6) | (b4 & ED2.a);
            cArr[i] = (char) ((i2 >>> 10) + ED2.d);
            cArr[i + 1] = (char) ((i2 & 1023) + ED2.e);
            return;
        }
        throw new zzgzh("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!g(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!g(b3)) {
                cArr[i] = (char) (((b & C8077mf.q) << 12) | ((b2 & ED2.a) << 6) | (b3 & ED2.a));
                return;
            }
        }
        throw new zzgzh("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !g(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & ED2.a));
            return;
        }
        throw new zzgzh("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ boolean d(byte b) {
        return b >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean e(byte b) {
        return b < -16;
    }

    public static /* bridge */ /* synthetic */ boolean f(byte b) {
        return b < -32;
    }

    public static boolean g(byte b) {
        return b > -65;
    }
}
