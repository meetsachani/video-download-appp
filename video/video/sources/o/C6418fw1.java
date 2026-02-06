package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: o.fw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6418fw1 {
    public static final int a = 48000;
    public static final int b = 63750;
    public static final int c = 3840;
    public static final int d = 3;

    public static List<byte[]> a(byte[] bArr) {
        long j = j(f(bArr));
        long j2 = j(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(j));
        arrayList.add(b(j2));
        return arrayList;
    }

    public static byte[] b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static long d(byte b2, byte b3) {
        int i;
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b3 & ED2.a;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else if (i6 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << i6;
        }
        return i * i2;
    }

    public static long e(byte[] bArr) {
        byte b2 = 0;
        byte b3 = bArr[0];
        if (bArr.length > 1) {
            b2 = bArr[1];
        }
        return d(b3, b2);
    }

    public static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int g(ByteBuffer byteBuffer) {
        byte b2;
        int h = h(byteBuffer);
        int i = byteBuffer.get(h + 26) + C8077mf.E + h;
        byte b3 = byteBuffer.get(i);
        if (byteBuffer.limit() - i > 1) {
            b2 = byteBuffer.get(i + 1);
        } else {
            b2 = 0;
        }
        return (int) ((d(b3, b2) * 48000) / 1000000);
    }

    public static int h(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b2 = byteBuffer.get(26);
        int i = 28;
        int i2 = 28;
        for (int i3 = 0; i3 < b2; i3++) {
            i2 += byteBuffer.get(i3 + 27);
        }
        byte b3 = byteBuffer.get(i2 + 26);
        for (int i4 = 0; i4 < b3; i4++) {
            i += byteBuffer.get(i2 + 27 + i4);
        }
        return i2 + i;
    }

    public static int i(ByteBuffer byteBuffer) {
        byte b2 = 0;
        byte b3 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b2 = byteBuffer.get(1);
        }
        return (int) ((d(b3, b2) * 48000) / 1000000);
    }

    public static long j(long j) {
        return (j * C10323vs.k) / 48000;
    }
}
