package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class HH1 extends LL0 {
    public static final Parcelable.Creator<HH1> CREATOR = new a();
    public static final String Y0 = "PRIV";
    public final String Y;
    public final byte[] Z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<HH1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public HH1 createFromParcel(Parcel parcel) {
            return new HH1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public HH1[] newArray(int i) {
            return new HH1[i];
        }
    }

    public HH1(String str, byte[] bArr) {
        super(Y0);
        this.Y = str;
        this.Z = bArr;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HH1.class == obj.getClass()) {
            HH1 hh1 = (HH1) obj;
            if (TD2.g(this.Y, hh1.Y) && Arrays.equals(this.Z, hh1.Z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.Y;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((527 + i) * 31) + Arrays.hashCode(this.Z);
    }

    @Override // o.LL0
    public String toString() {
        return this.X + ": owner=" + this.Y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Y);
        parcel.writeByteArray(this.Z);
    }

    public HH1(Parcel parcel) {
        super(Y0);
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = (byte[]) TD2.o(parcel.createByteArray());
    }
}
