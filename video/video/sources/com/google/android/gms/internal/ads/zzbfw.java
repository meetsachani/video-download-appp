package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbfw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 2:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 3:
                    i2 = SafeParcelReader.Z(parcel, X);
                    break;
                case 4:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 5:
                    i3 = SafeParcelReader.Z(parcel, X);
                    break;
                case 6:
                    zzfwVar = (com.google.android.gms.ads.internal.client.zzfw) SafeParcelReader.C(parcel, X, com.google.android.gms.ads.internal.client.zzfw.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.P(parcel, X);
                    break;
                case 8:
                    i4 = SafeParcelReader.Z(parcel, X);
                    break;
                case 9:
                    i5 = SafeParcelReader.Z(parcel, X);
                    break;
                case 10:
                    z4 = SafeParcelReader.P(parcel, X);
                    break;
                case 11:
                    i6 = SafeParcelReader.Z(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbfv(i, z, i2, z2, i3, zzfwVar, z3, i4, i5, z4, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfv[i];
    }
}
