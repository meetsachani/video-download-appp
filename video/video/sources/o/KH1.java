package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes2.dex */
public final class KH1 extends AbstractC4193Sa2 {
    public static final Parcelable.Creator<KH1> CREATOR = new a();
    public final long X;
    public final long Y;
    public final byte[] Z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<KH1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public KH1 createFromParcel(Parcel parcel) {
            return new KH1(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public KH1[] newArray(int i) {
            return new KH1[i];
        }
    }

    public /* synthetic */ KH1(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static KH1 a(C3012Fy1 c3012Fy1, int i, long j) {
        long N = c3012Fy1.N();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        c3012Fy1.n(bArr, 0, i2);
        return new KH1(N, bArr, j);
    }

    @Override // o.AbstractC4193Sa2
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.X + ", identifier= " + this.Y + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.X);
        parcel.writeLong(this.Y);
        parcel.writeByteArray(this.Z);
    }

    public KH1(long j, byte[] bArr, long j2) {
        this.X = j2;
        this.Y = j;
        this.Z = bArr;
    }

    public KH1(Parcel parcel) {
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        this.Z = (byte[]) TD2.o(parcel.createByteArray());
    }
}
