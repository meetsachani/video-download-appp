package com.google.common.base;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import o.C11304zt1;
import o.C3307Iz;
import o.C8077mf;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public final class Strings {
    public static byte[] A00;
    public static String[] A01 = {"", "rJg0GTHRX", "K9dQxfkFvyPrqanCyvVi9t8TsdGmyNgC", "tUuj0V7XDkeAi6SkgPTUgMEzqoPOG2wI", "s5Ev4BEaYYaheBbHJPARkFomt6p83FKm", "U0fqfbzQ6IMhOxnuinQg0kR", "WEAQUpFs2V4MiUsuqBnPNaxCCDrbqZTD", "9mERPiqnqMQrbOPuWUaYAoq2giX9Yyaq"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{124, 7, 85, 1, C8077mf.G, 7, C8077mf.r, 2, 85, C8077mf.x, 66, 108, C8077mf.m, C3307Iz.Y, C3307Iz.f0, C3307Iz.V, C3307Iz.Z, 48, 31, C8077mf.C, 109, 42, 49, 40, 40, 74, 70, C8077mf.u, 122, 48, 13, C8077mf.z, C8077mf.r, 5, 1, 28, C8077mf.D, C8077mf.E, 85, 17, 0, 7, 28, C8077mf.E, C8077mf.u, 85, C8077mf.C, C8077mf.r, C8077mf.E, 28, C8077mf.r, C8077mf.E, 1, 51, C8077mf.D, 7, C8077mf.B, C8077mf.x, 1, 85, 19, C8077mf.D, 7, 85, C3307Iz.Y, 42, 40, 107, 34, 42, 42, 34, C3307Iz.a0, 32, 107, C3307Iz.Y, 42, 40, 40, 42, C3307Iz.c0, 107, C3307Iz.Z, 36, 54, 32, 107, C8077mf.z, 49, 55, C3307Iz.d0, C3307Iz.c0, 34, 54, 59, 32, 57, 57};
    }

    static {
        A03();
    }

    public static String A01(@CheckForNull Object o2) {
        if (o2 == null) {
            return A00(94, 4, 87);
        }
        try {
            return o2.toString();
        } catch (Exception e) {
            String str = o2.getClass().getName() + C11304zt1.a + Integer.toHexString(System.identityHashCode(o2));
            Logger.getLogger(A00(64, 30, 71)).log(Level.WARNING, A00(29, 35, 119) + str, (Throwable) e);
            return A00(27, 1, 44) + str + A00(2, 7, 119) + e.getClass().getName() + A00(28, 1, 70);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x007c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A02(@CheckForNull String template, @CheckForNull Object... args) {
        int i;
        String valueOf = String.valueOf(template);
        if (args == null) {
            args = new Object[]{A00(11, 14, 70)};
        } else {
            for (int templateStart = 0; templateStart < i; templateStart++) {
                args[templateStart] = A01(args[templateStart]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (args.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i3 < args.length && (i = valueOf.indexOf(A00(9, 2, 51), i2)) != -1) {
            sb.append((CharSequence) valueOf, i2, i);
            int templateStart2 = i3 + 1;
            sb.append(args[i3]);
            i2 = i + 2;
            i3 = templateStart2;
        }
        sb.append((CharSequence) valueOf, i2, valueOf.length());
        if (i3 < args.length) {
            sb.append(A00(0, 2, 94));
            int i4 = i3 + 1;
            sb.append(args[i3]);
            while (i4 < args.length) {
                sb.append(A00(25, 2, 100));
                int templateStart3 = i4 + 1;
                sb.append(args[i4]);
                i4 = templateStart3;
            }
            sb.append(']');
        }
        String sb2 = sb.toString();
        String[] strArr = A01;
        String str = strArr[6];
        String str2 = strArr[2];
        int templateStart4 = str.charAt(10);
        int i5 = str2.charAt(10);
        if (templateStart4 != i5) {
            String[] strArr2 = A01;
            strArr2[3] = "Qm2mYSTY5Rq3J9usgP1HZ6PJLyEDSebu";
            strArr2[4] = "9oyFi5AVRUYlh10JePir3xWfNUiO2b4f";
            return sb2;
        }
        throw new RuntimeException();
    }
}
