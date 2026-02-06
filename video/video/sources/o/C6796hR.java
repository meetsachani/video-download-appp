package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C4224Si1;

/* renamed from: o.hR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6796hR implements C4224Si1.b {
    public static final Parcelable.Creator<C6796hR> CREATOR = new a();
    public final long X;

    /* renamed from: o.hR$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C6796hR> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6796hR createFromParcel(Parcel parcel) {
            return new C6796hR(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6796hR[] newArray(int i) {
            return new C6796hR[i];
        }
    }

    public /* synthetic */ C6796hR(Parcel parcel, a aVar) {
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
        if ((obj instanceof C6796hR) && this.X == ((C6796hR) obj).X) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7194j51.k(this.X);
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("Creation time: ");
        long j = this.X;
        if (j == -2082844800000L) {
            valueOf = "unset";
        } else {
            valueOf = Long.valueOf(j);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.X);
    }

    public C6796hR(long j) {
        this.X = j;
    }

    public C6796hR(Parcel parcel) {
        this.X = parcel.readLong();
    }
}
