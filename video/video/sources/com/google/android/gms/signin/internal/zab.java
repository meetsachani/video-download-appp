package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zab implements Parcelable.Creator<zaa> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zaa createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        SafeParcelReader.h0(parcel, X);
                    } else {
                        intent = (Intent) SafeParcelReader.C(parcel, X, Intent.CREATOR);
                    }
                } else {
                    i2 = SafeParcelReader.Z(parcel, X);
                }
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zaa(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaa[] newArray(int i) {
        return new zaa[i];
    }
}
