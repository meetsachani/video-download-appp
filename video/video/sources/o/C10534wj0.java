package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.wj0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10534wj0 extends J {
    public static final Parcelable.Creator<C10534wj0> CREATOR = new a();
    @InterfaceC5670cr1
    public final C9654t62<String, Bundle> Z;

    /* renamed from: o.wj0$a */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.ClassLoaderCreator<C10534wj0> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC11300zs1
        /* renamed from: a */
        public C10534wj0 createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            return new C10534wj0(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @InterfaceC5670cr1
        /* renamed from: b */
        public C10534wj0 createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            return new C10534wj0(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: c */
        public C10534wj0[] newArray(int i) {
            return new C10534wj0[i];
        }
    }

    public /* synthetic */ C10534wj0(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    @InterfaceC5670cr1
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.Z + "}";
    }

    @Override // o.J, android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.Z.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.Z.g(i2);
            bundleArr[i2] = this.Z.l(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C10534wj0(Parcelable parcelable) {
        super(parcelable);
        this.Z = new C9654t62<>();
    }

    public C10534wj0(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.Z = new C9654t62<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.Z.put(strArr[i], bundleArr[i]);
        }
    }
}
