package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import o.InterfaceC11300zs1;
import o.JK1;

/* loaded from: classes2.dex */
public final class zzadr {
    public static int a(zzado zzadoVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int H = zzadoVar.H(bArr, i + i3, i2 - i3);
            if (H == -1) {
                break;
            }
            i3 += H;
        }
        return i3;
    }

    @JK1
    public static void b(boolean z, @InterfaceC11300zs1 String str) throws zzaz {
        if (z) {
            return;
        }
        throw zzaz.a(str, null);
    }

    public static boolean c(zzado zzadoVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzadoVar.F(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean d(zzado zzadoVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            zzadoVar.I(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(zzado zzadoVar, int i) throws IOException {
        try {
            zzadoVar.G(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
