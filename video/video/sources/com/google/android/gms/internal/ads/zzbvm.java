package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbvm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        Bundle bundle = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfej zzfejVar = null;
        String str4 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    bundle = SafeParcelReader.g(parcel, X);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.C(parcel, X, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.C(parcel, X, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 5:
                    arrayList = SafeParcelReader.I(parcel, X);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.C(parcel, X, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 8:
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
                case 9:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 10:
                    zzfejVar = (zzfej) SafeParcelReader.C(parcel, X, zzfej.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                case 12:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 13:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 14:
                    bundle2 = SafeParcelReader.g(parcel, X);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.g(parcel, X);
                    break;
                case 16:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbvl(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfejVar, str4, z, z2, bundle2, bundle3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbvl[i];
    }
}
