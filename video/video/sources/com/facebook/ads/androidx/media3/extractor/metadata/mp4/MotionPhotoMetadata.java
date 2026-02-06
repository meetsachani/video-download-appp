package com.facebook.ads.androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.X.AbstractC2307rd;
import com.facebook.ads.redexgen.X.C2242qI;
import com.facebook.ads.redexgen.X.C3E;
import com.facebook.ads.redexgen.X.IN;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static byte[] A05;
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{13, 1, 81, 73, 80, 85, 80, 49, 83, 70, 84, 70, 79, 85, 66, 85, 74, 80, 79, 53, 74, 78, 70, 84, 85, 66, 78, 81, 54, 84, C8077mf.H, -27, C2638Cg0.E7, C3307Iz.a0, C3307Iz.V, 40, C3307Iz.e0, 40, C8077mf.n, 34, 51, C8077mf.H, -10, 3, -9, 77, 64, 59, 60, 70, 42, 64, 81, 60, C8077mf.x, C2638Cg0.A7, C2638Cg0.r7, C8077mf.C, C8077mf.n, 7, 8, C8077mf.u, -10, C8077mf.A, 4, C8077mf.y, C8077mf.A, -13, C8077mf.u, C8077mf.z, C8077mf.n, C8077mf.A, C8077mf.n, C8077mf.u, 17, -32, C8077mf.u, 52, 57, C3307Iz.f0, 52, 51, -27, 53, C3307Iz.e0, 52, 57, 52, -27, 50, 42, 57, C3307Iz.Y, C3307Iz.a0, C3307Iz.Y, 57, C3307Iz.Y, -1, -27, 53, C3307Iz.e0, 52, 57, 52, C8077mf.B, 57, C3307Iz.Y, 55, 57, C8077mf.y, 52, 56, C3307Iz.f0, 57, C3307Iz.f0, 52, 51, 2};
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
        CREATOR = new IN();
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A03 = j5;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, IN in) {
        this(parcel);
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
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.A02 == motionPhotoMetadata.A02 && this.A01 == motionPhotoMetadata.A01 && this.A00 == motionPhotoMetadata.A00 && this.A04 == motionPhotoMetadata.A04 && this.A03 == motionPhotoMetadata.A03;
    }

    public final int hashCode() {
        int result = AbstractC2307rd.A00(this.A02);
        int result2 = AbstractC2307rd.A00(this.A00);
        int result3 = AbstractC2307rd.A00(this.A03);
        return (((((((((17 * 31) + result) * 31) + AbstractC2307rd.A00(this.A01)) * 31) + result2) * 31) + AbstractC2307rd.A00(this.A04)) * 31) + result3;
    }

    public final String toString() {
        return A00(76, 42, 93) + this.A02 + A00(31, 12, 81) + this.A01 + A00(0, 31, 121) + this.A00 + A00(55, 21, 59) + this.A04 + A00(43, 12, 111) + this.A03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }
}
