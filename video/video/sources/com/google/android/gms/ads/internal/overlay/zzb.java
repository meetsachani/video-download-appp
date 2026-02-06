package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            switch (SafeParcelReader.O(X)) {
                case 2:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 3:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 4:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 5:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                case 6:
                    str5 = SafeParcelReader.G(parcel, X);
                    break;
                case 7:
                    str6 = SafeParcelReader.G(parcel, X);
                    break;
                case 8:
                    str7 = SafeParcelReader.G(parcel, X);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.C(parcel, X, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = SafeParcelReader.Y(parcel, X);
                    break;
                case 11:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
