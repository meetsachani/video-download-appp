package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: o.Gd2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3031Gd2 implements Comparable<C3031Gd2>, Parcelable, InterfaceC8368nr {
    public static final Parcelable.Creator<C3031Gd2> CREATOR = new a();
    public static final String Y0 = TD2.R0(0);
    public static final String Z0 = TD2.R0(1);
    public static final String a1 = TD2.R0(2);
    public final int X;
    public final int Y;
    public final int Z;

    /* renamed from: o.Gd2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C3031Gd2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C3031Gd2 createFromParcel(Parcel parcel) {
            return new C3031Gd2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C3031Gd2[] newArray(int i) {
            return new C3031Gd2[i];
        }
    }

    public C3031Gd2(int i, int i2) {
        this(0, i, i2);
    }

    public static C3031Gd2 h(Bundle bundle) {
        return new C3031Gd2(bundle.getInt(Y0, 0), bundle.getInt(Z0, 0), bundle.getInt(a1, 0));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        int i = this.X;
        if (i != 0) {
            bundle.putInt(Y0, i);
        }
        int i2 = this.Y;
        if (i2 != 0) {
            bundle.putInt(Z0, i2);
        }
        int i3 = this.Z;
        if (i3 != 0) {
            bundle.putInt(a1, i3);
        }
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3031Gd2.class == obj.getClass()) {
            C3031Gd2 c3031Gd2 = (C3031Gd2) obj;
            if (this.X == c3031Gd2.X && this.Y == c3031Gd2.Y && this.Z == c3031Gd2.Z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C3031Gd2 c3031Gd2) {
        int i = this.X - c3031Gd2.X;
        if (i == 0) {
            int i2 = this.Y - c3031Gd2.Y;
            if (i2 == 0) {
                return this.Z - c3031Gd2.Z;
            }
            return i2;
        }
        return i;
    }

    public int hashCode() {
        return (((this.X * 31) + this.Y) * 31) + this.Z;
    }

    public String toString() {
        return this.X + UE.h + this.Y + UE.h + this.Z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
    }

    public C3031Gd2(int i, int i2, int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
    }

    public C3031Gd2(Parcel parcel) {
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
    }
}
