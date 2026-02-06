package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C10833xx0;
import o.C4224Si1;

@Deprecated
/* renamed from: o.Oe0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3816Oe0 implements C4224Si1.b {
    @InterfaceC5056aJ2
    public static final String b1 = "https://aomedia.org/emsg/ID3";
    public static final String c1 = "https://developer.apple.com/streaming/emsg-id3";
    @InterfaceC5056aJ2
    public static final String d1 = "urn:scte:scte35:2014:bin";
    public final String X;
    public final String Y;
    public final long Y0;
    public final long Z;
    public final byte[] Z0;
    public int a1;
    public static final C10833xx0 e1 = new C10833xx0.b().g0(C4128Rj1.w0).G();
    public static final C10833xx0 f1 = new C10833xx0.b().g0(C4128Rj1.H0).G();
    public static final Parcelable.Creator<C3816Oe0> CREATOR = new a();

    /* renamed from: o.Oe0$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C3816Oe0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C3816Oe0 createFromParcel(Parcel parcel) {
            return new C3816Oe0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C3816Oe0[] newArray(int i) {
            return new C3816Oe0[i];
        }
    }

    public C3816Oe0(String str, String str2, long j, long j2, byte[] bArr) {
        this.X = str;
        this.Y = str2;
        this.Z = j;
        this.Y0 = j2;
        this.Z0 = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3816Oe0.class == obj.getClass()) {
            C3816Oe0 c3816Oe0 = (C3816Oe0) obj;
            if (this.Z == c3816Oe0.Z && this.Y0 == c3816Oe0.Y0 && TD2.g(this.X, c3816Oe0.X) && TD2.g(this.Y, c3816Oe0.Y) && Arrays.equals(this.Z0, c3816Oe0.Z0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        if (this.a1 == 0) {
            String str = this.X;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String str2 = this.Y;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.Z;
            long j2 = this.Y0;
            this.a1 = ((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.Z0);
        }
        return this.a1;
    }

    @Override // o.C4224Si1.b
    @InterfaceC11300zs1
    public C10833xx0 j() {
        String str = this.X;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals(d1)) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals(b1)) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals(c1)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f1;
            case 1:
            case 2:
                return e1;
            default:
                return null;
        }
    }

    public String toString() {
        return "EMSG: scheme=" + this.X + ", id=" + this.Y0 + ", durationMs=" + this.Z + ", value=" + this.Y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeLong(this.Z);
        parcel.writeLong(this.Y0);
        parcel.writeByteArray(this.Z0);
    }

    @Override // o.C4224Si1.b
    @InterfaceC11300zs1
    public byte[] y0() {
        if (j() != null) {
            return this.Z0;
        }
        return null;
    }

    public C3816Oe0(Parcel parcel) {
        this.X = (String) TD2.o(parcel.readString());
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = parcel.readLong();
        this.Y0 = parcel.readLong();
        this.Z0 = (byte[]) TD2.o(parcel.createByteArray());
    }
}
