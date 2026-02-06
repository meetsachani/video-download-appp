package o;

import java.io.IOException;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class NU {
    public static void a(@InterfaceC11300zs1 FU fu) {
        if (fu != null) {
            try {
                fu.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(FU fu, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = fu.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new IllegalStateException("Not enough data could be read: " + i2 + " < " + i);
            }
        }
        return bArr;
    }

    public static byte[] c(FU fu) throws IOException {
        byte[] bArr = new byte[1024];
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            if (i2 == bArr.length) {
                bArr = Arrays.copyOf(bArr, bArr.length * 2);
            }
            i = fu.read(bArr, i2, bArr.length - i2);
            if (i != -1) {
                i2 += i;
            }
        }
        return Arrays.copyOf(bArr, i2);
    }
}
