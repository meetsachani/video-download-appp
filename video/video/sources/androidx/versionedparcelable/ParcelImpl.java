package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import o.InterfaceC5283bF2;
import o.ZE2;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
    public final InterfaceC5283bF2 X;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(InterfaceC5283bF2 interfaceC5283bF2) {
        this.X = interfaceC5283bF2;
    }

    public <T extends InterfaceC5283bF2> T a() {
        return (T) this.X;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new ZE2(parcel).l1(this.X);
    }

    public ParcelImpl(Parcel parcel) {
        this.X = new ZE2(parcel).g0();
    }
}
