package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* renamed from: o.jn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7362jn extends LL0 {
    public static final Parcelable.Creator<C7362jn> CREATOR = new a();
    public final byte[] Y;

    /* renamed from: o.jn$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C7362jn> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7362jn createFromParcel(Parcel parcel) {
            return new C7362jn(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7362jn[] newArray(int i) {
            return new C7362jn[i];
        }
    }

    public C7362jn(String str, byte[] bArr) {
        super(str);
        this.Y = bArr;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7362jn.class == obj.getClass()) {
            C7362jn c7362jn = (C7362jn) obj;
            if (this.X.equals(c7362jn.X) && Arrays.equals(this.Y, c7362jn.Y)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.X.hashCode()) * 31) + Arrays.hashCode(this.Y);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeByteArray(this.Y);
    }

    public C7362jn(Parcel parcel) {
        super((String) TD2.o(parcel.readString()));
        this.Y = (byte[]) TD2.o(parcel.createByteArray());
    }
}
