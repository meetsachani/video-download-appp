package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public final class zak implements Parcelable.Creator<zam> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zam createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        String str = null;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            int O = SafeParcelReader.O(X);
            if (O != 1) {
                if (O != 2) {
                    if (O != 3) {
                        SafeParcelReader.h0(parcel, X);
                    } else {
                        field = (FastJsonResponse.Field) SafeParcelReader.C(parcel, X, FastJsonResponse.Field.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.G(parcel, X);
                }
            } else {
                i = SafeParcelReader.Z(parcel, X);
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zam(i, str, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zam[] newArray(int i) {
        return new zam[i];
    }
}
