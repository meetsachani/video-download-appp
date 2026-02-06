package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.C11005yf1;

@Deprecated
/* renamed from: o.Cb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2617Cb extends LL0 {
    public static final Parcelable.Creator<C2617Cb> CREATOR = new a();
    public static final String a1 = "APIC";
    public final String Y;
    public final int Y0;
    @InterfaceC11300zs1
    public final String Z;
    public final byte[] Z0;

    /* renamed from: o.Cb$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C2617Cb> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C2617Cb createFromParcel(Parcel parcel) {
            return new C2617Cb(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C2617Cb[] newArray(int i) {
            return new C2617Cb[i];
        }
    }

    public C2617Cb(String str, @InterfaceC11300zs1 String str2, int i, byte[] bArr) {
        super(a1);
        this.Y = str;
        this.Z = str2;
        this.Y0 = i;
        this.Z0 = bArr;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2617Cb.class == obj.getClass()) {
            C2617Cb c2617Cb = (C2617Cb) obj;
            if (this.Y0 == c2617Cb.Y0 && TD2.g(this.Y, c2617Cb.Y) && TD2.g(this.Z, c2617Cb.Z) && Arrays.equals(this.Z0, c2617Cb.Z0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (527 + this.Y0) * 31;
        String str = this.Y;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.Z;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + Arrays.hashCode(this.Z0);
    }

    @Override // o.C4224Si1.b
    public void r(C11005yf1.b bVar) {
        bVar.I(this.Z0, this.Y0);
    }

    @Override // o.LL0
    public String toString() {
        return this.X + ": mimeType=" + this.Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.Y0);
        parcel.writeByteArray(this.Z0);
    }

    public C2617Cb(Parcel parcel) {
        super(a1);
        this.Y = (String) TD2.o(parcel.readString());
        this.Z = parcel.readString();
        this.Y0 = parcel.readInt();
        this.Z0 = (byte[]) TD2.o(parcel.createByteArray());
    }
}
