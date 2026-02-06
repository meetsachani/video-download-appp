package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class HA extends LL0 {
    public static final Parcelable.Creator<HA> CREATOR = new a();
    public static final String b1 = "CTOC";
    public final String Y;
    public final boolean Y0;
    public final boolean Z;
    public final String[] Z0;
    public final LL0[] a1;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<HA> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public HA createFromParcel(Parcel parcel) {
            return new HA(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public HA[] newArray(int i) {
            return new HA[i];
        }
    }

    public HA(String str, boolean z, boolean z2, String[] strArr, LL0[] ll0Arr) {
        super(b1);
        this.Y = str;
        this.Z = z;
        this.Y0 = z2;
        this.Z0 = strArr;
        this.a1 = ll0Arr;
    }

    public LL0 a(int i) {
        return this.a1[i];
    }

    public int b() {
        return this.a1.length;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HA.class == obj.getClass()) {
            HA ha = (HA) obj;
            if (this.Z == ha.Z && this.Y0 == ha.Y0 && TD2.g(this.Y, ha.Y) && Arrays.equals(this.Z0, ha.Z0) && Arrays.equals(this.a1, ha.a1)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((527 + (this.Z ? 1 : 0)) * 31) + (this.Y0 ? 1 : 0)) * 31;
        String str = this.Y;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Y);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Y0 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.Z0);
        parcel.writeInt(this.a1.length);
        for (LL0 ll0 : this.a1) {
            parcel.writeParcelable(ll0, 0);
        }
    }

    public HA(Parcel parcel) {
        super(b1);
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = parcel.readByte() != 0;
        this.Y0 = parcel.readByte() != 0;
        this.Z0 = (String[]) TD2.o(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.a1 = new LL0[readInt];
        for (int i = 0; i < readInt; i++) {
            this.a1[i] = (LL0) parcel.readParcelable(LL0.class.getClassLoader());
        }
    }
}
