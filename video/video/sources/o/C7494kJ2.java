package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C11005yf1;
import o.C4224Si1;

@Deprecated
/* renamed from: o.kJ2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7494kJ2 implements C4224Si1.b {
    public static final Parcelable.Creator<C7494kJ2> CREATOR = new a();
    public final String X;
    public final String Y;

    /* renamed from: o.kJ2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C7494kJ2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7494kJ2 createFromParcel(Parcel parcel) {
            return new C7494kJ2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7494kJ2[] newArray(int i) {
            return new C7494kJ2[i];
        }
    }

    public C7494kJ2(String str, String str2) {
        this.X = str;
        this.Y = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7494kJ2 c7494kJ2 = (C7494kJ2) obj;
            if (this.X.equals(c7494kJ2.X) && this.Y.equals(c7494kJ2.Y)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.X.hashCode()) * 31) + this.Y.hashCode();
    }

    @Override // o.C4224Si1.b
    public void r(C11005yf1.b bVar) {
        String str = this.X;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(C9642t32.N)) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(C9642t32.W)) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bVar.N(this.Y);
                return;
            case 1:
                bVar.n0(this.Y);
                return;
            case 2:
                bVar.V(this.Y);
                return;
            case 3:
                bVar.M(this.Y);
                return;
            case 4:
                bVar.O(this.Y);
                return;
            default:
                return;
        }
    }

    public String toString() {
        return "VC: " + this.X + "=" + this.Y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
    }

    public C7494kJ2(Parcel parcel) {
        this.X = (String) TD2.o(parcel.readString());
        this.Y = (String) TD2.o(parcel.readString());
    }
}
