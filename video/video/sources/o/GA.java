package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class GA extends LL0 {
    public static final Parcelable.Creator<GA> CREATOR = new a();
    public static final String c1 = "CHAP";
    public final String Y;
    public final int Y0;
    public final int Z;
    public final long Z0;
    public final long a1;
    public final LL0[] b1;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<GA> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GA createFromParcel(Parcel parcel) {
            return new GA(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GA[] newArray(int i) {
            return new GA[i];
        }
    }

    public GA(String str, int i, int i2, long j, long j2, LL0[] ll0Arr) {
        super(c1);
        this.Y = str;
        this.Z = i;
        this.Y0 = i2;
        this.Z0 = j;
        this.a1 = j2;
        this.b1 = ll0Arr;
    }

    public LL0 a(int i) {
        return this.b1[i];
    }

    public int b() {
        return this.b1.length;
    }

    @Override // o.LL0, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GA.class == obj.getClass()) {
            GA ga = (GA) obj;
            if (this.Z == ga.Z && this.Y0 == ga.Y0 && this.Z0 == ga.Z0 && this.a1 == ga.a1 && TD2.g(this.Y, ga.Y) && Arrays.equals(this.b1, ga.b1)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((((((527 + this.Z) * 31) + this.Y0) * 31) + ((int) this.Z0)) * 31) + ((int) this.a1)) * 31;
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
        parcel.writeInt(this.Z);
        parcel.writeInt(this.Y0);
        parcel.writeLong(this.Z0);
        parcel.writeLong(this.a1);
        parcel.writeInt(this.b1.length);
        for (LL0 ll0 : this.b1) {
            parcel.writeParcelable(ll0, 0);
        }
    }

    public GA(Parcel parcel) {
        super(c1);
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = parcel.readInt();
        this.Y0 = parcel.readInt();
        this.Z0 = parcel.readLong();
        this.a1 = parcel.readLong();
        int readInt = parcel.readInt();
        this.b1 = new LL0[readInt];
        for (int i = 0; i < readInt; i++) {
            this.b1[i] = (LL0) parcel.readParcelable(LL0.class.getClassLoader());
        }
    }
}
