package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        if (O != 4) {
                            SafeParcelReader.h0(parcel, X);
                        } else {
                            connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.C(parcel, X, ConnectionTelemetryConfiguration.CREATOR);
                        }
                    } else {
                        i = SafeParcelReader.Z(parcel, X);
                    }
                } else {
                    featureArr = (Feature[]) SafeParcelReader.K(parcel, X, Feature.CREATOR);
                }
            } else {
                bundle = SafeParcelReader.g(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzk(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
