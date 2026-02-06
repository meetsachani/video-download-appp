package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes2.dex */
public final class XC2 extends LL0 {
    public static final Parcelable.Creator<XC2> CREATOR = new a();
    @InterfaceC11300zs1
    public final String Y;
    public final String Z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<XC2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public XC2 createFromParcel(Parcel parcel) {
            return new XC2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public XC2[] newArray(int i) {
            return new XC2[i];
        }
    }

    public XC2(String str, @InterfaceC11300zs1 String str2, String str3) {
        super(str);
        this.Y = str2;
        this.Z = str3;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && XC2.class == obj.getClass()) {
            XC2 xc2 = (XC2) obj;
            if (this.X.equals(xc2.X) && TD2.g(this.Y, xc2.Y) && TD2.g(this.Z, xc2.Z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (527 + this.X.hashCode()) * 31;
        String str = this.Y;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.Z;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // o.LL0
    public String toString() {
        return this.X + ": url=" + this.Z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
    }

    public XC2(Parcel parcel) {
        super((String) TD2.o(parcel.readString()));
        this.Y = parcel.readString();
        this.Z = (String) TD2.o(parcel.readString());
    }
}
