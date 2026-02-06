package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C4224Si1;

@Deprecated
/* renamed from: o.x92  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10641x92 implements C4224Si1.b {
    public static final Parcelable.Creator<C10641x92> CREATOR = new a();
    public final float X;
    public final int Y;

    /* renamed from: o.x92$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C10641x92> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C10641x92 createFromParcel(Parcel parcel) {
            return new C10641x92(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C10641x92[] newArray(int i) {
            return new C10641x92[i];
        }
    }

    public /* synthetic */ C10641x92(Parcel parcel, a aVar) {
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
        if (obj != null && C10641x92.class == obj.getClass()) {
            C10641x92 c10641x92 = (C10641x92) obj;
            if (this.X == c10641x92.X && this.Y == c10641x92.Y) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + C3589Lv0.i(this.X)) * 31) + this.Y;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.X + ", svcTemporalLayerCount=" + this.Y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.X);
        parcel.writeInt(this.Y);
    }

    public C10641x92(float f, int i) {
        this.X = f;
        this.Y = i;
    }

    public C10641x92(Parcel parcel) {
        this.X = parcel.readFloat();
        this.Y = parcel.readInt();
    }
}
