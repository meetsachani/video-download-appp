package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes3.dex */
public class IS2 implements Parcelable {
    public static final Parcelable.Creator<IS2> CREATOR = new a();
    @A12("downloadables")
    private List<AS2> X;
    @A12("image_url")
    private String Y;
    @A12("status")
    private boolean Y0;
    @A12("platform")
    private String Z;
    @A12("title")
    private String Z0;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<IS2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IS2 createFromParcel(Parcel parcel) {
            return new IS2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IS2[] newArray(int i) {
            return new IS2[i];
        }
    }

    public IS2(boolean z, String str, List<AS2> list, String str2, String str3) {
        this.Y0 = z;
        this.Z0 = str;
        this.X = list;
        this.Y = str2;
        this.Z = str3;
    }

    public static IS2 a(String str) {
        return (IS2) new C6008eF0().f().l(str, IS2.class);
    }

    public List<AS2> b() {
        return this.X;
    }

    public String c() {
        return this.Y;
    }

    public String d() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.Z0;
    }

    public boolean f() {
        return this.Y0;
    }

    public void g(List<AS2> list) {
        this.X = list;
    }

    public void h(String str) {
        this.Y = str;
    }

    public void k(String str) {
        this.Z = str;
    }

    public void m(boolean z) {
        this.Y0 = z;
    }

    public void n(String str) {
        this.Z0 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.Y0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.Z0);
        parcel.writeTypedList(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
    }

    public IS2(Parcel parcel) {
        this.Y0 = parcel.readByte() != 0;
        this.Z0 = parcel.readString();
        this.X = parcel.createTypedArrayList(AS2.CREATOR);
        this.Y = parcel.readString();
        this.Z = parcel.readString();
    }
}
