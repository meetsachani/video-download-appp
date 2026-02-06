package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import o.InterfaceC5670cr1;

@KeepForSdk
@KeepName
/* loaded from: classes2.dex */
public final class BinderWrapper implements Parcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new zzh();
    public final IBinder X;

    @KeepForSdk
    public BinderWrapper(@InterfaceC5670cr1 IBinder iBinder) {
        this.X = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        parcel.writeStrongBinder(this.X);
    }
}
