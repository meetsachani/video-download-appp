package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Lf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0885Lf {
    public static byte[] A00;
    public static String[] A01 = {"pXXvlweo53LEBZFO8IULCIdZyckTRG5r", "DuGHfKZCm01", "80fcVnrJERY0uuv61EoOWTfKBWpdgNO", "9CXibrLJZkMktsdeymca", "5EX4ZE8RGyFWDwwd0Tfx6XQfl6R1kt5", "MQihPub9yWY", "FZA8FrqtMtEe7NzfiE56", "M8QLs2sFGOm02m2V5lAOlFR2Pc3pvKwT"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{92, C8077mf.y, C8077mf.q, 92, C8077mf.u, 19, 8, 92, C8077mf.B, C8077mf.y, C8077mf.p, C8077mf.C, 31, 8, 19, C8077mf.p, 5, 93, 52, C8077mf.C, 2, C8077mf.y, 19, 4, 31, 2, 9, 80, 85, 3, 80, 19, 17, C8077mf.H, 87, 4, 80, C8077mf.u, C8077mf.y, 80, 19, 2, C8077mf.y, 17, 4, C8077mf.y, C8077mf.x, 62, 9, 9, C8077mf.x, 9, 91, 9, C8077mf.H, C8077mf.B, 9, C8077mf.H, C8077mf.D, C8077mf.q, C8077mf.H, 91, 1, C8077mf.H, 9, C8077mf.x, 86, 8, C8077mf.u, 1, C8077mf.H, 91, C8077mf.G, C8077mf.u, C8077mf.A, C8077mf.H, 91, 122, 77, 77, 80, 77, 31, 76, 90, 75, 31, 83, 94, 76, 75, 31, 82, 80, 91, 86, 89, 86, 90, 91, 31, 91, 94, 75, 90, 31, 75, 80, 31, 83, 124, 121, 112, 53, 99, 102, 117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized void A06(File file) throws IOException {
        synchronized (C0885Lf.class) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new IOException(A00(109, 5, 102) + file + A00(0, 18, 15));
                }
            } else if (!file.mkdirs()) {
                throw new IOException(String.format(Locale.US, A00(18, 29, 3), file.getAbsolutePath()));
            }
        }
    }

    static {
        A02();
    }

    public static List<File> A01(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            List<File> asList = Arrays.asList(listFiles);
            Collections.sort(asList, new C0884Le());
            return asList;
        }
        return linkedList;
    }

    public static void A03(File file) throws IOException {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                A04(file);
                if (file.lastModified() >= currentTimeMillis) {
                    return;
                }
                throw new IOException(A00(77, 32, 76) + file);
            }
        }
    }

    public static void A04(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            A05(file);
            String[] strArr = A01;
            if (strArr[7].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "fwMIAeZxeVy";
            strArr2[1] = "XGkZ1N2vKGp";
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A00(114, 3, 98));
        long size = length - 1;
        randomAccessFile.seek(size);
        byte readByte = randomAccessFile.readByte();
        randomAccessFile.seek(length - 1);
        randomAccessFile.write(readByte);
        randomAccessFile.close();
    }

    public static void A05(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        throw new IOException(A00(47, 30, 8) + file);
    }
}
