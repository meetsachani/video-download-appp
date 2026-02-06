package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.X.C2242qI;
import com.facebook.ads.redexgen.X.C3E;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{54, C3307Iz.Y, 49, 32, 72, 86, 80, 69, C8077mf.z, C8077mf.y, 9, C8077mf.n, 6, 0, 69, 6, 10, 8, 8, 4, C8077mf.m, 1, 95, 69, 17, 28, C8077mf.y, 0, 88};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9a() {
        return C3E.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C2242qI A9b() {
        return C3E.A00(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return A02(0, 29, 61) + getClass().getSimpleName();
    }
}
