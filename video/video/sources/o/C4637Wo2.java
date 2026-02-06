package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: o.Wo2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4637Wo2 extends AbstractC4193Sa2 {
    public static final Parcelable.Creator<C4637Wo2> CREATOR = new a();
    public final long X;
    public final long Y;

    /* renamed from: o.Wo2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C4637Wo2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4637Wo2 createFromParcel(Parcel parcel) {
            return new C4637Wo2(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4637Wo2[] newArray(int i) {
            return new C4637Wo2[i];
        }
    }

    public /* synthetic */ C4637Wo2(long j, long j2, a aVar) {
        this(j, j2);
    }

    public static C4637Wo2 a(C3012Fy1 c3012Fy1, long j, C10071up2 c10071up2) {
        long b = b(c3012Fy1, j);
        return new C4637Wo2(b, c10071up2.b(b));
    }

    public static long b(C3012Fy1 c3012Fy1, long j) {
        long L = c3012Fy1.L();
        if ((128 & L) != 0) {
            return 8589934591L & ((((L & 1) << 32) | c3012Fy1.N()) + j);
        }
        return C10323vs.b;
    }

    @Override // o.AbstractC4193Sa2
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.X + ", playbackPositionUs= " + this.Y + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.X);
        parcel.writeLong(this.Y);
    }

    public C4637Wo2(long j, long j2) {
        this.X = j;
        this.Y = j2;
    }
}
