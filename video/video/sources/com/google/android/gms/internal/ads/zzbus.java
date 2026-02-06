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
public final class zzbus implements Parcelable.Creator {
    public static final zzbur a(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        Bundle bundle = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzbfv zzbfvVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        com.google.android.gms.ads.internal.client.zzee zzeeVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbmg zzbmgVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 1:
                    i = SafeParcelReader.Z(parcel, X);
                    break;
                case 2:
                    bundle = SafeParcelReader.g(parcel, X);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.C(parcel, X, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) SafeParcelReader.C(parcel, X, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.C(parcel, X, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.C(parcel, X, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 9:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 10:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.C(parcel, X, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.g(parcel, X);
                    break;
                case 13:
                    i2 = SafeParcelReader.Z(parcel, X);
                    break;
                case 14:
                    arrayList = SafeParcelReader.I(parcel, X);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.g(parcel, X);
                    break;
                case 16:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
                case 18:
                    i3 = SafeParcelReader.Z(parcel, X);
                    break;
                case 19:
                    i4 = SafeParcelReader.Z(parcel, X);
                    break;
                case 20:
                    f = SafeParcelReader.V(parcel, X);
                    break;
                case 21:
                    str5 = SafeParcelReader.G(parcel, X);
                    break;
                case 25:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                case 26:
                    str6 = SafeParcelReader.G(parcel, X);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.I(parcel, X);
                    break;
                case 28:
                    str7 = SafeParcelReader.G(parcel, X);
                    break;
                case 29:
                    zzbfvVar = (zzbfv) SafeParcelReader.C(parcel, X, zzbfv.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.I(parcel, X);
                    break;
                case 31:
                    j2 = SafeParcelReader.c0(parcel, X);
                    break;
                case 33:
                    str8 = SafeParcelReader.G(parcel, X);
                    break;
                case 34:
                    f2 = SafeParcelReader.V(parcel, X);
                    break;
                case 35:
                    i5 = SafeParcelReader.Z(parcel, X);
                    break;
                case 36:
                    i6 = SafeParcelReader.Z(parcel, X);
                    break;
                case 37:
                    z3 = SafeParcelReader.P(parcel, X);
                    break;
                case 39:
                    str9 = SafeParcelReader.G(parcel, X);
                    break;
                case 40:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 41:
                    str10 = SafeParcelReader.G(parcel, X);
                    break;
                case 42:
                    z4 = SafeParcelReader.P(parcel, X);
                    break;
                case 43:
                    i7 = SafeParcelReader.Z(parcel, X);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.g(parcel, X);
                    break;
                case 45:
                    str11 = SafeParcelReader.G(parcel, X);
                    break;
                case 46:
                    zzeeVar = (com.google.android.gms.ads.internal.client.zzee) SafeParcelReader.C(parcel, X, com.google.android.gms.ads.internal.client.zzee.CREATOR);
                    break;
                case 47:
                    z5 = SafeParcelReader.P(parcel, X);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.g(parcel, X);
                    break;
                case 49:
                    str12 = SafeParcelReader.G(parcel, X);
                    break;
                case 50:
                    str13 = SafeParcelReader.G(parcel, X);
                    break;
                case 51:
                    str14 = SafeParcelReader.G(parcel, X);
                    break;
                case 52:
                    z6 = SafeParcelReader.P(parcel, X);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.v(parcel, X);
                    break;
                case 54:
                    str15 = SafeParcelReader.G(parcel, X);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.I(parcel, X);
                    break;
                case 56:
                    i8 = SafeParcelReader.Z(parcel, X);
                    break;
                case 57:
                    z7 = SafeParcelReader.P(parcel, X);
                    break;
                case 58:
                    z8 = SafeParcelReader.P(parcel, X);
                    break;
                case 59:
                    z9 = SafeParcelReader.P(parcel, X);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.I(parcel, X);
                    break;
                case 61:
                    str16 = SafeParcelReader.G(parcel, X);
                    break;
                case 63:
                    zzbmgVar = (zzbmg) SafeParcelReader.C(parcel, X, zzbmg.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.G(parcel, X);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.g(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzbur(i, bundle, zzmVar, zzrVar, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, zzbfvVar, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, zzeeVar, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, zzbmgVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbur[i];
    }
}
