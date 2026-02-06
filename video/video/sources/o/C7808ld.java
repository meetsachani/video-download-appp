package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C4224Si1;

@Deprecated
/* renamed from: o.ld  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7808ld implements C4224Si1.b {
    public static final Parcelable.Creator<C7808ld> CREATOR = new a();
    public static final int Y0 = 2;
    public static final int Z = 1;
    public final int X;
    public final String Y;

    /* renamed from: o.ld$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C7808ld> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7808ld createFromParcel(Parcel parcel) {
            return new C7808ld(parcel.readInt(), (String) C9542sf.g(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7808ld[] newArray(int i) {
            return new C7808ld[i];
        }
    }

    public C7808ld(int i, String str) {
        this.X = i;
        this.Y = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.X + ",url=" + this.Y + C9811tl1.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Y);
        parcel.writeInt(this.X);
    }
}
