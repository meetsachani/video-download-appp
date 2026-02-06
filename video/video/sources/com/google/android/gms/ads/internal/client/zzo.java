package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        zzft zzftVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzcVar = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 2:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                case 3:
                    bundle = SafeParcelReader.g(parcel, X);
                    break;
                case 4:
                    i2 = SafeParcelReader.Z(parcel, X);
                    break;
                case 5:
                    arrayList = SafeParcelReader.I(parcel, X);
                    break;
                case 6:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 7:
                    i3 = SafeParcelReader.Z(parcel, X);
                    break;
                case 8:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 9:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 10:
                    zzftVar = (zzft) SafeParcelReader.C(parcel, X, zzft.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.C(parcel, X, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.g(parcel, X);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.g(parcel, X);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.I(parcel, X);
                    break;
                case 16:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 17:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                case 18:
                    z3 = SafeParcelReader.P(parcel, X);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.C(parcel, X, zzc.CREATOR);
                    break;
                case 20:
                    i4 = SafeParcelReader.Z(parcel, X);
                    break;
                case 21:
                    str5 = SafeParcelReader.G(parcel, X);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.I(parcel, X);
                    break;
                case 23:
                    i5 = SafeParcelReader.Z(parcel, X);
                    break;
                case 24:
                    str6 = SafeParcelReader.G(parcel, X);
                    break;
                case 25:
                    i6 = SafeParcelReader.Z(parcel, X);
                    break;
                case 26:
                    j2 = SafeParcelReader.c0(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzm(i, j, bundle, i2, arrayList, z, i3, z2, str, zzftVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, zzcVar, i4, str5, arrayList3, i5, str6, i6, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
