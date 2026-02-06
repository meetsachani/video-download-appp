package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
/* loaded from: classes2.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();
    @InterfaceC11300zs1
    public final byte[] X;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<WrappedParcelable> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public WrappedParcelable[] newArray(int i) {
            return new WrappedParcelable[i];
        }
    }

    public WrappedParcelable(Parcel parcel) {
        this.X = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @InterfaceC11300zs1
    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.X;
        if (bArr != null) {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Parcelable readParcelable = obtain.readParcelable(classLoader);
            obtain.recycle();
            return readParcelable;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.X);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.X = marshallParcelable(parcelable);
    }

    public WrappedParcelable(@InterfaceC11300zs1 byte[] bArr) {
        this.X = bArr;
    }
}
