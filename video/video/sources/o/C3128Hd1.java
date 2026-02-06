package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C4224Si1;

@Deprecated
/* renamed from: o.Hd1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3128Hd1 implements C4224Si1.b {
    public static final Parcelable.Creator<C3128Hd1> CREATOR = new a();
    public static final String Z0 = "com.android.capture.fps";
    public static final int a1 = 1;
    public static final int b1 = 23;
    public static final int c1 = 67;
    public final String X;
    public final byte[] Y;
    public final int Y0;
    public final int Z;

    /* renamed from: o.Hd1$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C3128Hd1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C3128Hd1 createFromParcel(Parcel parcel) {
            return new C3128Hd1(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C3128Hd1[] newArray(int i) {
            return new C3128Hd1[i];
        }
    }

    public /* synthetic */ C3128Hd1(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3128Hd1.class == obj.getClass()) {
            C3128Hd1 c3128Hd1 = (C3128Hd1) obj;
            if (this.X.equals(c3128Hd1.X) && Arrays.equals(this.Y, c3128Hd1.Y) && this.Z == c3128Hd1.Z && this.Y0 == c3128Hd1.Y0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.X.hashCode()) * 31) + Arrays.hashCode(this.Y)) * 31) + this.Z) * 31) + this.Y0;
    }

    public String toString() {
        String N;
        int i = this.Y0;
        if (i != 1) {
            if (i != 23) {
                if (i != 67) {
                    N = TD2.V1(this.Y);
                } else {
                    N = String.valueOf(TD2.W1(this.Y));
                }
            } else {
                N = String.valueOf(TD2.U1(this.Y));
            }
        } else {
            N = TD2.N(this.Y);
        }
        return "mdta: key=" + this.X + ", value=" + N;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeByteArray(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.Y0);
    }

    public C3128Hd1(String str, byte[] bArr, int i, int i2) {
        this.X = str;
        this.Y = bArr;
        this.Z = i;
        this.Y0 = i2;
    }

    public C3128Hd1(Parcel parcel) {
        this.X = (String) TD2.o(parcel.readString());
        this.Y = (byte[]) TD2.o(parcel.createByteArray());
        this.Z = parcel.readInt();
        this.Y0 = parcel.readInt();
    }
}
