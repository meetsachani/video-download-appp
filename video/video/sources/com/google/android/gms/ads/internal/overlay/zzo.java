package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.C(parcel, X, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.Y(parcel, X);
                    break;
                case 4:
                    iBinder2 = SafeParcelReader.Y(parcel, X);
                    break;
                case 5:
                    iBinder3 = SafeParcelReader.Y(parcel, X);
                    break;
                case 6:
                    iBinder4 = SafeParcelReader.Y(parcel, X);
                    break;
                case 7:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 8:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 9:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 10:
                    iBinder5 = SafeParcelReader.Y(parcel, X);
                    break;
                case 11:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 12:
                    i2 = SafeParcelReader.Z(parcel, X);
                    break;
                case 13:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.C(parcel, X, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
                case 16:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) SafeParcelReader.C(parcel, X, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinder6 = SafeParcelReader.Y(parcel, X);
                    break;
                case 19:
                    str5 = SafeParcelReader.G(parcel, X);
                    break;
                case 24:
                    str6 = SafeParcelReader.G(parcel, X);
                    break;
                case 25:
                    str7 = SafeParcelReader.G(parcel, X);
                    break;
                case 26:
                    iBinder7 = SafeParcelReader.Y(parcel, X);
                    break;
                case 27:
                    iBinder8 = SafeParcelReader.Y(parcel, X);
                    break;
                case 28:
                    iBinder9 = SafeParcelReader.Y(parcel, X);
                    break;
                case 29:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 30:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, versionInfoParcel, str4, zzlVar, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
