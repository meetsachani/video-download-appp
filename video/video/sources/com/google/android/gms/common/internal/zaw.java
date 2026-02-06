package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zaw implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zav createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        if (O != 4) {
                            if (O != 5) {
                                SafeParcelReader.h0(parcel, X);
                            } else {
                                z2 = SafeParcelReader.P(parcel, X);
                            }
                        } else {
                            z = SafeParcelReader.P(parcel, X);
                        }
                    } else {
                        connectionResult = (ConnectionResult) SafeParcelReader.C(parcel, X, ConnectionResult.CREATOR);
                    }
                } else {
                    iBinder = SafeParcelReader.Y(parcel, X);
                }
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i) {
        return new zav[i];
    }
}
