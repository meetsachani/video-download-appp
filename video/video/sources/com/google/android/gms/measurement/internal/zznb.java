package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zznb implements Parcelable.Creator<zznc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zznc createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 2:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 3:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                case 4:
                    l = SafeParcelReader.d0(parcel, X);
                    break;
                case 5:
                    f = SafeParcelReader.W(parcel, X);
                    break;
                case 6:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 7:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 8:
                    d = SafeParcelReader.U(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zznc(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zznc[] newArray(int i) {
        return new zznc[i];
    }
}
