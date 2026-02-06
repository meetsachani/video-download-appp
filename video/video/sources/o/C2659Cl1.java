package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C4224Si1;

@Deprecated
/* renamed from: o.Cl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2659Cl1 implements C4224Si1.b {
    public static final Parcelable.Creator<C2659Cl1> CREATOR = new a();
    public final float X;
    public final float Y;

    /* renamed from: o.Cl1$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C2659Cl1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C2659Cl1 createFromParcel(Parcel parcel) {
            return new C2659Cl1(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C2659Cl1[] newArray(int i) {
            return new C2659Cl1[i];
        }
    }

    public /* synthetic */ C2659Cl1(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2659Cl1.class == obj.getClass()) {
            C2659Cl1 c2659Cl1 = (C2659Cl1) obj;
            if (this.X == c2659Cl1.X && this.Y == c2659Cl1.Y) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + C3589Lv0.i(this.X)) * 31) + C3589Lv0.i(this.Y);
    }

    public String toString() {
        return "xyz: latitude=" + this.X + ", longitude=" + this.Y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.X);
        parcel.writeFloat(this.Y);
    }

    public C2659Cl1(@InterfaceC2501Av0(from = -90.0d, to = 90.0d) float f, @InterfaceC2501Av0(from = -180.0d, to = 180.0d) float f2) {
        C9542sf.b(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.X = f;
        this.Y = f2;
    }

    public C2659Cl1(Parcel parcel) {
        this.X = parcel.readFloat();
        this.Y = parcel.readFloat();
    }
}
