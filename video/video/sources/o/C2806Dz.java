package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Dz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2806Dz implements Parcelable {
    public static final Parcelable.Creator<C2806Dz> CREATOR = new a();
    public String X;
    public String Y;
    public String Z;

    /* renamed from: o.Dz$a */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<C2806Dz> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C2806Dz createFromParcel(Parcel parcel) {
            return new C2806Dz(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C2806Dz[] newArray(int i) {
            return new C2806Dz[i];
        }
    }

    public C2806Dz() {
    }

    public String a() {
        return this.Z;
    }

    public String b() {
        return this.X;
    }

    public String c() {
        return this.Y;
    }

    public void d(String str) {
        this.Z = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(String str) {
        this.X = str;
    }

    public void f(String str) {
        this.Y = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
    }

    public C2806Dz(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
    }
}
