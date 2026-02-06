package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public final class zaj implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        String str = null;
        String str2 = null;
        com.google.android.gms.common.server.converter.zaa zaaVar = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 2:
                    i2 = SafeParcelReader.Z(parcel, X);
                    break;
                case 3:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 4:
                    i3 = SafeParcelReader.Z(parcel, X);
                    break;
                case 5:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 6:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 7:
                    i4 = SafeParcelReader.Z(parcel, X);
                    break;
                case 8:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 9:
                    zaaVar = (com.google.android.gms.common.server.converter.zaa) SafeParcelReader.C(parcel, X, com.google.android.gms.common.server.converter.zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
