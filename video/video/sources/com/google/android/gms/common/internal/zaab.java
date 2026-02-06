package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zaab implements Parcelable.Creator<TelemetryData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TelemetryData createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    SafeParcelReader.h0(parcel, X);
                } else {
                    arrayList = SafeParcelReader.L(parcel, X, MethodInvocation.CREATOR);
                }
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new TelemetryData(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TelemetryData[] newArray(int i) {
        return new TelemetryData[i];
    }
}
