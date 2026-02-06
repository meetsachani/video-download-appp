package o;

import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: o.eP0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6048eP0 implements InterfaceC10688xL1 {
    public static final Set<String> a = new HashSet(Arrays.asList("A24"));

    public static boolean f() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && a.contains(Build.DEVICE.toUpperCase(Locale.US))) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        return f();
    }

    public final boolean d(byte[] bArr) {
        byte b;
        int i = 2;
        while (i + 4 <= bArr.length && (b = bArr[i]) == -1) {
            if (b == -1 && bArr[i + 1] == -38) {
                return true;
            }
            i += (((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255)) + 2;
        }
        return false;
    }

    public final int e(byte[] bArr) {
        int i = 2;
        while (true) {
            int i2 = i + 1;
            if (i2 > bArr.length) {
                return -1;
            }
            if (bArr[i] == -1 && bArr[i2] == -40) {
                return i;
            }
            i = i2;
        }
    }

    public byte[] g(androidx.camera.core.g gVar) {
        int i = 0;
        ByteBuffer B = gVar.f3()[0].B();
        byte[] bArr = new byte[B.capacity()];
        B.rewind();
        B.get(bArr);
        if (!d(bArr) && (i = e(bArr)) == -1) {
            return bArr;
        }
        return Arrays.copyOfRange(bArr, i, B.limit());
    }
}
