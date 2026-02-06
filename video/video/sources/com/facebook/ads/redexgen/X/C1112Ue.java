package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import o.C2638Cg0;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Ue  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1112Ue {
    public static byte[] A04;
    public static String[] A05 = {"EPfM4EfRxbpEP9gtrDRMlskxYfXi3EIy", "2RTdQxHpZZ8AiQDKhWe0eMGOKfA6zgcU", "emglrqM7KcB96xrWPAlCT1HSFCX", "BYlHqNK3eo406tIlZNUH5uGyHKGLxPsS", "SGf6K716h04aYOies8bsBexpWYiEkey6", "TSOJfYWCxzAl33AyQiIcTNEFCW2LweGK", "8CMs5hd6IV548hO09SYKxFdjcmyhV", "SdeZw3a81E33UQl"};
    public int A00;
    public long A01;
    public final RandomAccessFile A02;
    public final long[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1112Ue A04(File file) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(416, 3, 33));
            if (file.length() >= A00()) {
                long readLong = randomAccessFile.readLong();
                if (readLong == -360011992771067903L) {
                    long readLong2 = randomAccessFile.readLong();
                    if (A05[4].charAt(13) != 'O') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[0] = "qh47im7POLSb1uwOXceGvb4YvfCz05wk";
                    strArr[1] = "3iy4rWBQ3YjawiJr5gwpSuoHtfNura2H";
                    if (readLong2 < 0 || readLong2 > 100000) {
                        throw new IOException(String.format(Locale.US, A05(77, 40, 27), Long.valueOf(readLong2)));
                    }
                    if (randomAccessFile.length() >= A02((int) readLong2)) {
                        long[] jArr = new long[(int) readLong2];
                        for (int i = 0; i < jArr.length; i++) {
                            jArr[i] = randomAccessFile.readLong();
                        }
                        return new C1112Ue(randomAccessFile, jArr, randomAccessFile.length());
                    }
                    throw new IOException(String.format(Locale.US, A05(117, 63, 56), Long.valueOf(readLong2), Long.valueOf(file.length())));
                }
                throw new IOException(String.format(Locale.US, A05(180, 27, 45), Long.valueOf(readLong), -360011992771067903L));
            }
            throw new IOException(String.format(Locale.US, A05(50, 27, 97), Long.valueOf(file.length()), Long.valueOf(A00())));
        } catch (IOException unused) {
            if (0 != 0) {
                A07(null);
            }
            throw new IOException(String.format(Locale.US, A05(26, 24, 114), file.getCanonicalPath()));
        }
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{-106, -79, -71, -68, -75, -76, 112, -60, -65, 112, -77, C2638Cg0.q7, -75, -79, -60, -75, 112, -74, -71, -68, -75, 112, 119, 117, C2638Cg0.r7, 119, -52, -25, -17, -14, -21, -22, -90, -6, -11, -90, -11, -10, -21, -12, -90, -20, -17, -14, -21, -90, -83, -85, -7, -83, -69, -34, C2638Cg0.C7, C2638Cg0.B7, -107, -102, C2638Cg0.E7, -107, -41, -18, -23, C2638Cg0.B7, -24, -95, -107, C2638Cg0.C7, C2638Cg0.B7, -24, -24, -107, -23, -35, -42, -29, -107, -102, C2638Cg0.E7, 117, -104, -101, -108, 79, -109, -108, -110, -101, -112, -95, -108, -94, 79, -112, 79, -93, -98, -93, -112, -101, 79, -98, -107, 79, 84, -109, 79, -95, -108, -110, -98, -95, -109, 79, -94, -101, -98, -93, -94, -110, -75, -72, -79, 108, -80, -79, -81, -72, -83, -66, -79, -65, 108, -83, 108, C2638Cg0.o7, -69, C2638Cg0.o7, -83, -72, 108, -69, -78, 108, 113, -80, 108, -66, -79, -81, -69, -66, -80, 108, -65, -72, -69, C2638Cg0.o7, -65, QC1.w, 108, -82, C2638Cg0.p7, C2638Cg0.o7, 108, -69, -70, -72, C2638Cg0.s7, 108, -76, -83, -65, 108, 113, -80, 108, -82, C2638Cg0.s7, C2638Cg0.o7, -79, -65, -121, -86, -83, -90, 97, -82, -94, -88, -86, -92, 97, 102, -91, 97, -86, -81, -76, -75, -90, -94, -91, 97, -80, -89, 97, 102, -91, -78, C2638Cg0.s7, C2638Cg0.r7, C2638Cg0.A7, -46, -60, Byte.MIN_VALUE, -123, -60, Byte.MIN_VALUE, C2638Cg0.A7, C2638Cg0.t7, C2638Cg0.t7, -45, C2638Cg0.s7, -44, Byte.MIN_VALUE, C2638Cg0.v7, -45, Byte.MIN_VALUE, -123, -60, -116, Byte.MIN_VALUE, C2638Cg0.q7, -43, -44, Byte.MIN_VALUE, -46, C2638Cg0.s7, C2638Cg0.r7, C2638Cg0.A7, -46, -60, Byte.MIN_VALUE, -123, -60, Byte.MIN_VALUE, C2638Cg0.A7, C2638Cg0.t7, C2638Cg0.t7, -45, C2638Cg0.s7, -44, Byte.MIN_VALUE, C2638Cg0.v7, -45, Byte.MIN_VALUE, -123, -60, -97, -78, -80, -68, -65, -79, 109, 114, -79, 109, -68, -77, -77, C2638Cg0.o7, -78, C2638Cg0.p7, 109, C2638Cg0.o7, -75, -68, C2638Cg0.q7, -71, -79, 109, -81, -78, 109, 125, 109, -81, -78, -80, -82, C2638Cg0.q7, C2638Cg0.o7, -78, 109, -65, -78, -80, -68, -65, -79, 109, -80, -68, C2638Cg0.q7, -69, C2638Cg0.p7, 109, -74, C2638Cg0.o7, 109, 114, -79, 121, 109, -81, C2638Cg0.q7, C2638Cg0.p7, 109, -74, C2638Cg0.o7, 109, 114, -79, -37, -18, -20, -8, -5, -19, -87, -82, -19, -87, -4, -3, -22, -5, -3, -4, -87, -22, -3, -87, -8, -17, -17, -4, -18, -3, -87, -82, -19, -75, -87, -21, -2, -3, -87, -17, -14, -11, -18, -87, -4, -14, 3, -18, -87, -14, -4, -87, -82, -19, C2638Cg0.p7, -44, -46, -34, C2638Cg0.C7, -45, -113, -97, -113, -34, -43, -43, -30, -44, -29, -113, -44, -25, -33, -44, -46, -29, -44, -45, -113, -48, -29, -113, -108, -45, -113, -47, -28, -29, -113, C2638Cg0.n7, -30, -113, -48, -29, -113, -108, -45, -89, -84, -88};
    }

    static {
        A06();
    }

    public C1112Ue(RandomAccessFile randomAccessFile, long[] jArr, long j) throws IOException {
        this.A02 = randomAccessFile;
        this.A03 = jArr;
        this.A01 = j;
        for (int i = 0; i < jArr.length && jArr[i] != 0; i++) {
            this.A00++;
        }
        if (this.A00 > 0) {
            long A01 = A01();
            if (jArr[0] != A01) {
                throw new IOException(String.format(Locale.US, A05(373, 43, 91), Long.valueOf(A01), Long.valueOf(jArr[0])));
            }
        }
        for (int i2 = this.A00; i2 < jArr.length; i2++) {
            if (jArr[i2] != 0) {
                throw new IOException(String.format(Locale.US, A05(257, 66, 57), Integer.valueOf(i2), Integer.valueOf(this.A00), Long.valueOf(jArr[i2])));
            }
        }
        for (int i3 = 1; i3 < this.A00; i3++) {
            if (jArr[i3 - 1] > jArr[i3]) {
                throw new IOException(String.format(Locale.US, A05(207, 50, 76), Integer.valueOf(i3 - 1), Long.valueOf(jArr[i3 - 1]), Integer.valueOf(i3), Long.valueOf(jArr[i3])));
            }
        }
        if (this.A00 <= 0 || jArr[this.A00 - 1] <= j) {
            return;
        }
        throw new IOException(String.format(Locale.US, A05(323, 50, 117), Integer.valueOf(this.A00 - 1), Long.valueOf(jArr[this.A00 - 1]), Long.valueOf(j)));
    }

    public static long A00() {
        return 16L;
    }

    private final long A01() {
        return A00() + (this.A03.length * 8);
    }

    public static long A02(int i) {
        return A00() + (i * 8);
    }

    public static C1112Ue A03(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(416, 3, 33));
        try {
            randomAccessFile.writeLong(-360011992771067903L);
            randomAccessFile.writeLong(C1113Uf.A03);
            randomAccessFile.write(new byte[C1113Uf.A03 * 8]);
            randomAccessFile.getFD().sync();
            return new C1112Ue(randomAccessFile, new long[C1113Uf.A03], randomAccessFile.length());
        } catch (IOException unused) {
            A07(randomAccessFile);
            throw new IOException(String.format(Locale.US, A05(0, 26, 60), file.getCanonicalPath()));
        }
    }

    public static void A07(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
