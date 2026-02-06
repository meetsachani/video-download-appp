package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.C(parcel, X, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 3:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 4:
                    iArr = SafeParcelReader.u(parcel, X);
                    break;
                case 5:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.u(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
