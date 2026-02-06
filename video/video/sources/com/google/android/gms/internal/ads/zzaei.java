package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import o.C10323vs;
import o.C8077mf;
import o.ED2;

/* loaded from: classes2.dex */
public final class zzaei {
    public static int a(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int b(ByteBuffer byteBuffer) {
        int i;
        byte b = 0;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b2 = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b2; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b3 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b3; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + C8077mf.E + i;
        byte b4 = byteBuffer.get(i6);
        if (byteBuffer.limit() - i6 > 1) {
            b = byteBuffer.get(i6 + 1);
        }
        return (int) ((g(b4, b) * 48000) / 1000000);
    }

    public static int c(ByteBuffer byteBuffer) {
        byte b = 0;
        byte b2 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b = byteBuffer.get(1);
        }
        return (int) ((g(b2, b) * 48000) / 1000000);
    }

    public static long d(byte[] bArr) {
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return g(b2, b);
    }

    public static List e(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(i(h(a(bArr))));
        arrayList.add(i(h(3840L)));
        return arrayList;
    }

    public static boolean f(long j, long j2) {
        return j - j2 <= h(3840L) / 1000;
    }

    public static long g(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & ED2.a;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        return i * (i5 >= 16 ? 2500 << i2 : i5 >= 12 ? 10000 << (i5 & 1) : (i5 & 3) == 3 ? 60000 : 10000 << i2);
    }

    public static long h(long j) {
        return (j * C10323vs.k) / 48000;
    }

    public static byte[] i(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
