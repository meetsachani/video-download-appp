package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes2.dex */
public final class KG extends LL0 {
    public static final Parcelable.Creator<KG> CREATOR = new a();
    public static final String Z0 = "COMM";
    public final String Y;
    public final String Y0;
    public final String Z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<KG> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public KG createFromParcel(Parcel parcel) {
            return new KG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public KG[] newArray(int i) {
            return new KG[i];
        }
    }

    public KG(String str, String str2, String str3) {
        super(Z0);
        this.Y = str;
        this.Z = str2;
        this.Y0 = str3;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && KG.class == obj.getClass()) {
            KG kg = (KG) obj;
            if (TD2.g(this.Z, kg.Z) && TD2.g(this.Y, kg.Y) && TD2.g(this.Y0, kg.Y0)) {
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
        return i5 + i3;
    }

    @Override // o.LL0
    public String toString() {
        return this.X + ": language=" + this.Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Y0);
    }

    public KG(Parcel parcel) {
        super(Z0);
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = (String) TD2.o(parcel.readString());
        this.Y0 = (String) TD2.o(parcel.readString());
    }
}
