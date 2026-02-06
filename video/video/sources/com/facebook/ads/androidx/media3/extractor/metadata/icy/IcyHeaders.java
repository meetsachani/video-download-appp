package com.facebook.ads.androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.X.C2242qI;
import com.facebook.ads.redexgen.X.C3E;
import com.facebook.ads.redexgen.X.C5C;
import com.facebook.ads.redexgen.X.I5;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static byte[] A06;
    public static String[] A07 = {"ghaGnAUOt2SitSRHHz423X90tSKTPAXx", "FBrp2nvQgqmyeffboeTEyGvTZbETTMzG", "eMo1BdFVOzvhBgFL81jHh", "7Uh1kBGFxd7GLg5A0JuRGjBqdN4vVDce", "ZLGEUlzQT0qHH0ct6", "61ApNNUKl6RqFIc15O7NgM3p8KU8Sqmx", "LSx5TaQkP", "Wz18oCr93"};
    public static final Parcelable.Creator<IcyHeaders> CREATOR;
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{93, 83, 95, C8077mf.G, C8077mf.z, C8077mf.m, 13, C8077mf.H, C8077mf.m, C8077mf.D, 66, 110, 96, 108, C3307Iz.c0, C3307Iz.a0, 34, 62, C3307Iz.a0, 113, 110, 103, 107, C3307Iz.Y, C3307Iz.f0, ED2.a, 42, 47, 42, ED2.a, 42, 2, C3307Iz.X, ED2.a, C3307Iz.f0, 57, C4715Xk.i, 42, C3307Iz.Z, 118, 4, C3307Iz.f0, 52, 5, 40, C3307Iz.d0, C3307Iz.a0, 40, ED2.a, 62, 119, 109, 35, C3307Iz.d0, 32, 40, 112, 111};
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ byte[] A9a() {
        return C3E.A01(this);
    }

    @Override // com.facebook.ads.androidx.media3.common.Metadata.Entry
    public final /* synthetic */ C2242qI A9b() {
        return C3E.A00(this);
    }

    static {
        A01();
        CREATOR = new I5();
    }

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = C5C.A1C(parcel);
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.A00 == icyHeaders.A00) {
            boolean A1E = C5C.A1E(this.A02, icyHeaders.A02);
            if (A07[4].length() == 20) {
                throw new RuntimeException();
            }
            A07[5] = "I4GVatcg3Odw2bdDZmPqVg6Hl1I8OBM0";
            if (A1E && C5C.A1E(this.A03, icyHeaders.A03) && C5C.A1E(this.A04, icyHeaders.A04) && this.A05 == icyHeaders.A05 && this.A01 == icyHeaders.A01) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int result2 = ((17 * 31) + result) * 31;
        int result3 = this.A02 != null ? this.A02.hashCode() : 0;
        int result4 = (result2 + result3) * 31;
        int result5 = this.A03 != null ? this.A03.hashCode() : 0;
        int result6 = (result4 + result5) * 31;
        int hashCode = this.A04 != null ? this.A04.hashCode() : 0;
        int result7 = this.A05 ? 1 : 0;
        return ((((result6 + hashCode) * 31) + result7) * 31) + this.A01;
    }

    public final String toString() {
        return A00(40, 18, 62) + this.A03 + A00(11, 10, 63) + this.A02 + A00(0, 11, 12) + this.A00 + A00(21, 19, 56) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        C5C.A0w(parcel, this.A05);
        parcel.writeInt(this.A01);
    }
}
