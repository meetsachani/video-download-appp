package com.facebook.ads.androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.redexgen.X.AbstractC1879k9;
import com.facebook.ads.redexgen.X.C04774v;
import com.facebook.ads.redexgen.X.C2242qI;
import com.facebook.ads.redexgen.X.C3E;
import com.facebook.ads.redexgen.X.C5C;
import com.facebook.ads.redexgen.X.I2;
import java.util.Arrays;
import o.C4715Xk;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static byte[] A08;
    public static String[] A09 = {"rI5TEheYOJp05VNApergGrEEHCWaES4C", "o6wWfrjUdw4LevlhwfZASZQrY", "UWoyLLtEqu034Q80pJxgHqQ3TFbt", "jnvUxVCjnhOQIYYcwBh2GPR5wbhVDTOy", "29XTtQExfztCGetR3Cqmh5L0E52wuoLu", "Hd1JIMrPWoRu", "ETzUd0wMReQVTdTsGtn8YYwfqZIUbVPg", "sLyN"};
    public static final Parcelable.Creator<PictureFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static PictureFrame A00(C04774v c04774v) {
        int A0C = c04774v.A0C();
        String A0X = c04774v.A0X(c04774v.A0C(), AbstractC1879k9.A01);
        String A0W = c04774v.A0W(c04774v.A0C());
        int A0C2 = c04774v.A0C();
        int A0C3 = c04774v.A0C();
        int A0C4 = c04774v.A0C();
        int A0C5 = c04774v.A0C();
        int A0C6 = c04774v.A0C();
        byte[] bArr = new byte[A0C6];
        c04774v.A0k(bArr, 0, A0C6);
        return new PictureFrame(A0C, A0X, A0W, A0C2, A0C3, A0C4, A0C5, bArr);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{76, 64, 4, 5, 19, 3, C8077mf.u, 9, C8077mf.r, C8077mf.x, 9, C8077mf.q, C8077mf.p, 93, C4715Xk.i, 4, C8077mf.p, C8077mf.C, C8077mf.B, 31, 8, 87, 77, 0, 4, 0, 8, 57, C8077mf.x, C8077mf.G, 8, 80};
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
        A02();
        CREATOR = new I2();
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.A03 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = (String) C5C.A0f(parcel.readString());
        this.A05 = (String) C5C.A0f(parcel.readString());
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = (byte[]) C5C.A0f(parcel.createByteArray());
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
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.A03 == pictureFrame.A03) {
            String str = this.A06;
            if (A09[2].length() != 28) {
                throw new RuntimeException();
            }
            A09[2] = "EI2VBd4ee1IoRa9rBnnoAwg1aEDf";
            if (str.equals(pictureFrame.A06) && this.A05.equals(pictureFrame.A05) && this.A04 == pictureFrame.A04 && this.A02 == pictureFrame.A02 && this.A01 == pictureFrame.A01 && this.A00 == pictureFrame.A00 && Arrays.equals(this.A07, pictureFrame.A07)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = this.A05.hashCode();
        int result3 = this.A02;
        int result4 = this.A00;
        return (((((((((((((((17 * 31) + result) * 31) + this.A06.hashCode()) * 31) + result2) * 31) + this.A04) * 31) + result3) * 31) + this.A01) * 31) + result4) * 31) + Arrays.hashCode(this.A07);
    }

    public final String toString() {
        return A01(14, 18, 122) + this.A06 + A01(0, 14, 119) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }
}
