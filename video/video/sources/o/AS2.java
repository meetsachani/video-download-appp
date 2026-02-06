package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class AS2 implements Parcelable {
    public static final Parcelable.Creator<AS2> CREATOR = new a();
    @A12("quality")
    private String X;
    @A12("url")
    private String Y;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<AS2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AS2 createFromParcel(Parcel parcel) {
            return new AS2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AS2[] newArray(int i) {
            return new AS2[i];
        }
    }

    public AS2(String str, String str2) {
        this.X = str;
        this.Y = str2;
    }

    public String a() {
        return this.X;
    }

    public String b() {
        return this.Y;
    }

    public void c(String str) {
        this.X = str;
    }

    public void d(String str) {
        this.Y = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
    }

    public AS2(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = parcel.readString();
    }
}
