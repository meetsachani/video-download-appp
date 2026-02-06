package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C4224Si1;

@Deprecated
/* renamed from: o.ml1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8103ml1 implements C4224Si1.b {
    public static final Parcelable.Creator<C8103ml1> CREATOR = new a();
    public final long X;
    public final long Y;
    public final long Y0;
    public final long Z;
    public final long Z0;

    /* renamed from: o.ml1$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C8103ml1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C8103ml1 createFromParcel(Parcel parcel) {
            return new C8103ml1(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C8103ml1[] newArray(int i) {
            return new C8103ml1[i];
        }
    }

    public /* synthetic */ C8103ml1(Parcel parcel, a aVar) {
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
        if (obj != null && C8103ml1.class == obj.getClass()) {
            C8103ml1 c8103ml1 = (C8103ml1) obj;
            if (this.X == c8103ml1.X && this.Y == c8103ml1.Y && this.Z == c8103ml1.Z && this.Y0 == c8103ml1.Y0 && this.Z0 == c8103ml1.Z0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + C7194j51.k(this.X)) * 31) + C7194j51.k(this.Y)) * 31) + C7194j51.k(this.Z)) * 31) + C7194j51.k(this.Y0)) * 31) + C7194j51.k(this.Z0);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.X + ", photoSize=" + this.Y + ", photoPresentationTimestampUs=" + this.Z + ", videoStartPosition=" + this.Y0 + ", videoSize=" + this.Z0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.X);
        parcel.writeLong(this.Y);
        parcel.writeLong(this.Z);
        parcel.writeLong(this.Y0);
        parcel.writeLong(this.Z0);
    }

    public C8103ml1(long j, long j2, long j3, long j4, long j5) {
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.Y0 = j4;
        this.Z0 = j5;
    }

    public C8103ml1(Parcel parcel) {
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        this.Z = parcel.readLong();
        this.Y0 = parcel.readLong();
        this.Z0 = parcel.readLong();
    }
}
