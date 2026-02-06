package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: o.zS0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11201zS0 extends LL0 {
    public static final Parcelable.Creator<C11201zS0> CREATOR = new a();
    public static final String Z0 = "----";
    public final String Y;
    public final String Y0;
    public final String Z;

    /* renamed from: o.zS0$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C11201zS0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C11201zS0 createFromParcel(Parcel parcel) {
            return new C11201zS0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C11201zS0[] newArray(int i) {
            return new C11201zS0[i];
        }
    }

    public C11201zS0(String str, String str2, String str3) {
        super(Z0);
        this.Y = str;
        this.Z = str2;
        this.Y0 = str3;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11201zS0.class == obj.getClass()) {
            C11201zS0 c11201zS0 = (C11201zS0) obj;
            if (TD2.g(this.Z, c11201zS0.Z) && TD2.g(this.Y, c11201zS0.Y) && TD2.g(this.Y0, c11201zS0.Y0)) {
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
        return this.X + ": domain=" + this.Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Y0);
    }

    public C11201zS0(Parcel parcel) {
        super(Z0);
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = (String) TD2.o(parcel.readString());
        this.Y0 = (String) TD2.o(parcel.readString());
    }
}
