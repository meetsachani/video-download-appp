package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zaa implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        SafeParcelReader.h0(parcel, X);
                    } else {
                        bundle = SafeParcelReader.g(parcel, X);
                    }
                } else {
                    i2 = SafeParcelReader.Z(parcel, X);
                }
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new GoogleSignInOptionsExtensionParcelable(i, i2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable[] newArray(int i) {
        return new GoogleSignInOptionsExtensionParcelable[i];
    }
}
