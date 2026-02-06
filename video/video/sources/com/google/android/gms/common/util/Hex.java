package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import o.C3599Ly1;
import o.C8077mf;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class Hex {
    public static final char[] a = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', C3599Ly1.i, 'F'};
    public static final char[] b = {C3599Ly1.j, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @InterfaceC5670cr1
    @KeepForSdk
    public static String a(@InterfaceC5670cr1 byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b2 : bArr) {
            char[] cArr2 = b;
            cArr[i] = cArr2[(b2 & 255) >>> 4];
            cArr[i + 1] = cArr2[b2 & C8077mf.q];
            i += 2;
        }
        return new String(cArr);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static String b(@InterfaceC5670cr1 byte[] bArr) {
        return c(bArr, false);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static String c(@InterfaceC5670cr1 byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0); i++) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & C8077mf.q]);
        }
        return sb.toString();
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static byte[] d(@InterfaceC5670cr1 String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            int i = 0;
            while (i < length) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
