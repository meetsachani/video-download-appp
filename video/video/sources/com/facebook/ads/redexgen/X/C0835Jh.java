package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Arrays;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.Jh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0835Jh {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{C3307Iz.V};
    }

    public final BP<C2192pT> A02(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return AnonymousClass44.A01(C2192pT.A0I, (ArrayList) AbstractC04543y.A01(readBundle.getParcelableArrayList(A00(0, 1, 47))));
    }
}
