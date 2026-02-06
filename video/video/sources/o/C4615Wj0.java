package o;

import java.io.EOFException;
import java.io.IOException;

@Deprecated
/* renamed from: o.Wj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4615Wj0 {
    @JK1
    public static void a(boolean z, @InterfaceC11300zs1 String str) throws C3989Py1 {
        if (z) {
            return;
        }
        throw C3989Py1.a(str, null);
    }

    public static boolean b(InterfaceC4421Uj0 interfaceC4421Uj0, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return interfaceC4421Uj0.h(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int c(InterfaceC4421Uj0 interfaceC4421Uj0, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int r = interfaceC4421Uj0.r(bArr, i + i3, i2 - i3);
            if (r == -1) {
                break;
            }
            i3 += r;
        }
        return i3;
    }

    public static boolean d(InterfaceC4421Uj0 interfaceC4421Uj0, byte[] bArr, int i, int i2) throws IOException {
        try {
            interfaceC4421Uj0.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC4421Uj0 interfaceC4421Uj0, int i) throws IOException {
        try {
            interfaceC4421Uj0.t(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
