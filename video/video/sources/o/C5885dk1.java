package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* renamed from: o.dk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5885dk1 extends LL0 {
    public static final Parcelable.Creator<C5885dk1> CREATOR = new a();
    public static final String b1 = "MLLT";
    public final int Y;
    public final int Y0;
    public final int Z;
    public final int[] Z0;
    public final int[] a1;

    /* renamed from: o.dk1$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C5885dk1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5885dk1 createFromParcel(Parcel parcel) {
            return new C5885dk1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C5885dk1[] newArray(int i) {
            return new C5885dk1[i];
        }
    }

    public C5885dk1(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(b1);
        this.Y = i;
        this.Z = i2;
        this.Y0 = i3;
        this.Z0 = iArr;
        this.a1 = iArr2;
    }

    @Override // o.LL0, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5885dk1.class == obj.getClass()) {
            C5885dk1 c5885dk1 = (C5885dk1) obj;
            if (this.Y == c5885dk1.Y && this.Z == c5885dk1.Z && this.Y0 == c5885dk1.Y0 && Arrays.equals(this.Z0, c5885dk1.Z0) && Arrays.equals(this.a1, c5885dk1.a1)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.Y) * 31) + this.Z) * 31) + this.Y0) * 31) + Arrays.hashCode(this.Z0)) * 31) + Arrays.hashCode(this.a1);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.Y0);
        parcel.writeIntArray(this.Z0);
        parcel.writeIntArray(this.a1);
    }

    public C5885dk1(Parcel parcel) {
        super(b1);
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.Y0 = parcel.readInt();
        this.Z0 = (int[]) TD2.o(parcel.createIntArray());
        this.a1 = (int[]) TD2.o(parcel.createIntArray());
    }
}
