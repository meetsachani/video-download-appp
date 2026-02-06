package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C11005yf1;
import o.C4224Si1;

@Deprecated
/* loaded from: classes2.dex */
public final class WC1 implements C4224Si1.b {
    public static final Parcelable.Creator<WC1> CREATOR = new a();
    public final int X;
    public final String Y;
    public final int Y0;
    public final String Z;
    public final int Z0;
    public final int a1;
    public final int b1;
    public final byte[] c1;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<WC1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public WC1 createFromParcel(Parcel parcel) {
            return new WC1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public WC1[] newArray(int i) {
            return new WC1[i];
        }
    }

    public WC1(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.Y0 = i2;
        this.Z0 = i3;
        this.a1 = i4;
        this.b1 = i5;
        this.c1 = bArr;
    }

    public static WC1 a(C3012Fy1 c3012Fy1) {
        int s = c3012Fy1.s();
        String J = c3012Fy1.J(c3012Fy1.s(), KB.a);
        String I = c3012Fy1.I(c3012Fy1.s());
        int s2 = c3012Fy1.s();
        int s3 = c3012Fy1.s();
        int s4 = c3012Fy1.s();
        int s5 = c3012Fy1.s();
        int s6 = c3012Fy1.s();
        byte[] bArr = new byte[s6];
        c3012Fy1.n(bArr, 0, s6);
        return new WC1(s, J, I, s2, s3, s4, s5, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && WC1.class == obj.getClass()) {
            WC1 wc1 = (WC1) obj;
            if (this.X == wc1.X && this.Y.equals(wc1.Y) && this.Z.equals(wc1.Z) && this.Y0 == wc1.Y0 && this.Z0 == wc1.Z0 && this.a1 == wc1.a1 && this.b1 == wc1.b1 && Arrays.equals(this.c1, wc1.c1)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.X) * 31) + this.Y.hashCode()) * 31) + this.Z.hashCode()) * 31) + this.Y0) * 31) + this.Z0) * 31) + this.a1) * 31) + this.b1) * 31) + Arrays.hashCode(this.c1);
    }

    @Override // o.C4224Si1.b
    public void r(C11005yf1.b bVar) {
        bVar.I(this.c1, this.X);
    }

    public String toString() {
        return "Picture: mimeType=" + this.Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.Y0);
        parcel.writeInt(this.Z0);
        parcel.writeInt(this.a1);
        parcel.writeInt(this.b1);
        parcel.writeByteArray(this.c1);
    }

    public WC1(Parcel parcel) {
        this.X = parcel.readInt();
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = (String) TD2.o(parcel.readString());
        this.Y0 = parcel.readInt();
        this.Z0 = parcel.readInt();
        this.a1 = parcel.readInt();
        this.b1 = parcel.readInt();
        this.c1 = (byte[]) TD2.o(parcel.createByteArray());
    }
}
