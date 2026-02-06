package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C4224Si1;

@Deprecated
/* renamed from: o.dO2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5804dO2 implements C4224Si1.b {
    public static final Parcelable.Creator<C5804dO2> CREATOR = new a();
    public final byte[] X;

    /* renamed from: o.dO2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C5804dO2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5804dO2 createFromParcel(Parcel parcel) {
            return new C5804dO2(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C5804dO2[] newArray(int i) {
            return new C5804dO2[i];
        }
    }

    public /* synthetic */ C5804dO2(Parcel parcel, a aVar) {
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
        if (obj != null && C5804dO2.class == obj.getClass()) {
            return Arrays.equals(this.X, ((C5804dO2) obj).X);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.X);
    }

    public String toString() {
        return "XMP: " + TD2.V1(this.X);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.X);
    }

    public C5804dO2(byte[] bArr) {
        this.X = bArr;
    }

    public C5804dO2(Parcel parcel) {
        this.X = (byte[]) TD2.o(parcel.createByteArray());
    }
}
