package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zay implements Parcelable.Creator<zax> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zax createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        int i2 = 0;
        Scope[] scopeArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        if (O != 4) {
                            SafeParcelReader.h0(parcel, X);
                        } else {
                            scopeArr = (Scope[]) SafeParcelReader.K(parcel, X, Scope.CREATOR);
                        }
                    } else {
                        i2 = SafeParcelReader.Z(parcel, X);
                    }
                } else {
                    i3 = SafeParcelReader.Z(parcel, X);
                }
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zax(i, i3, i2, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zax[] newArray(int i) {
        return new zax[i];
    }
}
