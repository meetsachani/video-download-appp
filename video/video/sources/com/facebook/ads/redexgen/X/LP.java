package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;
import o.FJ2;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class LP {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static LN A02(InterfaceC2033ms interfaceC2033ms) throws IOException {
        byte[] bArr;
        C04774v c04774v = new C04774v(16);
        LO A03 = A03(FJ2.c, interfaceC2033ms, c04774v);
        AbstractC04543y.A08(A03.A01 >= 16);
        interfaceC2033ms.AGt(c04774v.A0l(), 0, 16);
        c04774v.A0f(0);
        int A0G = c04774v.A0G();
        int A0G2 = c04774v.A0G();
        int A0F = c04774v.A0F();
        int A0F2 = c04774v.A0F();
        int A0G3 = c04774v.A0G();
        int A0G4 = c04774v.A0G();
        int i = ((int) A03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC2033ms.AGt(bArr, 0, i);
        } else {
            bArr = C5C.A07;
        }
        interfaceC2033ms.AK3((int) (interfaceC2033ms.A8i() - interfaceC2033ms.A8n()));
        return new LN(A0G, A0G2, A0F, A0F2, A0G3, A0G4, bArr);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, C8077mf.r, 13, C8077mf.z, 19, 88, 17, C8077mf.m, 88, C8077mf.n, C8077mf.A, C8077mf.A, 88, C8077mf.x, C8077mf.C, 10, 31, C8077mf.G, 88, 80, 6, 74, ED2.a, 58, 83, 81, 88, C8077mf.n, C8077mf.A, 88, C8077mf.m, 19, 17, 8, 67, 88, 17, 28, 66, 88, C3307Iz.e0, 3, 10, C8077mf.m, C8077mf.z, 13, 10, 3, 68, 17, 10, C8077mf.q, 10, C8077mf.m, 19, 10, 68, 51, C3307Iz.X, 50, 68, 7, C8077mf.n, 17, 10, C8077mf.q, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 90, 83, 78, 81, 28, 72, 69, 76, 89, 6, 28, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC2033ms interfaceC2033ms) throws IOException {
        C04774v c04774v = new C04774v(8);
        LO chunkHeader = LO.A00(interfaceC2033ms, c04774v);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC2033ms.AIl();
            return -1L;
        }
        interfaceC2033ms.A47(8);
        c04774v.A0f(0);
        interfaceC2033ms.AGt(c04774v.A0l(), 0, 8);
        long sampleDataSize = c04774v.A0N();
        interfaceC2033ms.AK3(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC2033ms interfaceC2033ms) throws IOException {
        interfaceC2033ms.AIl();
        LO A03 = A03(1684108385, interfaceC2033ms, new C04774v(8));
        interfaceC2033ms.AK3(8);
        return Pair.create(Long.valueOf(interfaceC2033ms.A8n()), Long.valueOf(A03.A01));
    }

    public static LO A03(int i, InterfaceC2033ms interfaceC2033ms, C04774v c04774v) throws IOException {
        LO A002 = LO.A00(interfaceC2033ms, c04774v);
        while (A002.A00 != i) {
            AbstractC04624g.A07(A04(91, 15, 125), A04(40, 28, 39) + A002.A00);
            long j = A002.A01 + 8;
            if (j <= 2147483647L) {
                interfaceC2033ms.AK3((int) j);
                A002 = LO.A00(interfaceC2033ms, c04774v);
            } else {
                throw C3K.A00(A04(0, 40, 59) + A002.A00);
            }
        }
        return A002;
    }

    public static boolean A06(InterfaceC2033ms interfaceC2033ms) throws IOException {
        C04774v c04774v = new C04774v(8);
        LO A002 = LO.A00(interfaceC2033ms, c04774v);
        if (A002.A00 != 1380533830) {
            int i = A002.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i != 1380333108) {
                return false;
            }
        }
        interfaceC2033ms.AGt(c04774v.A0l(), 0, 4);
        c04774v.A0f(0);
        int A0C = c04774v.A0C();
        if (A0C != 1463899717) {
            AbstractC04624g.A05(A04(91, 15, 125), A04(68, 23, 127) + A0C);
            return false;
        }
        return true;
    }
}
