package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X) != 2) {
                SafeParcelReader.h0(parcel, X);
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzx(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzx[i];
    }
}
