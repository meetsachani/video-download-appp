package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class SC0 extends LL0 {
    public static final Parcelable.Creator<SC0> CREATOR = new a();
    public static final String a1 = "GEOB";
    public final String Y;
    public final String Y0;
    public final String Z;
    public final byte[] Z0;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<SC0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SC0 createFromParcel(Parcel parcel) {
            return new SC0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SC0[] newArray(int i) {
            return new SC0[i];
        }
    }

    public SC0(String str, String str2, String str3, byte[] bArr) {
        super(a1);
        this.Y = str;
        this.Z = str2;
        this.Y0 = str3;
        this.Z0 = bArr;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SC0.class == obj.getClass()) {
            SC0 sc0 = (SC0) obj;
            if (TD2.g(this.Y, sc0.Y) && TD2.g(this.Z, sc0.Z) && TD2.g(this.Y0, sc0.Y0) && Arrays.equals(this.Z0, sc0.Z0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.Y;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.Z;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.Y0;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 + i3) * 31) + Arrays.hashCode(this.Z0);
    }

    @Override // o.LL0
    public String toString() {
        return this.X + ": mimeType=" + this.Y + ", filename=" + this.Z + ", description=" + this.Y0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.Y0);
        parcel.writeByteArray(this.Z0);
    }

    public SC0(Parcel parcel) {
        super(a1);
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = (String) TD2.o(parcel.readString());
        this.Y0 = (String) TD2.o(parcel.readString());
        this.Z0 = (byte[]) TD2.o(parcel.createByteArray());
    }
}
