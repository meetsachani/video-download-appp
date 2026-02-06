package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C11005yf1;
import o.C4224Si1;

@Deprecated
/* loaded from: classes2.dex */
public final class IL0 implements C4224Si1.b {
    public static final Parcelable.Creator<IL0> CREATOR = new a();
    public final byte[] X;
    @InterfaceC11300zs1
    public final String Y;
    @InterfaceC11300zs1
    public final String Z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<IL0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IL0 createFromParcel(Parcel parcel) {
            return new IL0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IL0[] newArray(int i) {
            return new IL0[i];
        }
    }

    public IL0(byte[] bArr, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        this.X = bArr;
        this.Y = str;
        this.Z = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IL0.class == obj.getClass()) {
            return Arrays.equals(this.X, ((IL0) obj).X);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.X);
    }

    @Override // o.C4224Si1.b
    public void r(C11005yf1.b bVar) {
        String str = this.Y;
        if (str != null) {
            bVar.n0(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.Y, this.Z, Integer.valueOf(this.X.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
    }

    public IL0(Parcel parcel) {
        this.X = (byte[]) C9542sf.g(parcel.createByteArray());
        this.Y = parcel.readString();
        this.Z = parcel.readString();
    }
}
