package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzal implements Parcelable.Creator<zzam> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            if (SafeParcelReader.O(X) != 1) {
                SafeParcelReader.h0(parcel, X);
            } else {
                bundle = SafeParcelReader.g(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzam(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam[] newArray(int i) {
        return new zzam[i];
    }
}
