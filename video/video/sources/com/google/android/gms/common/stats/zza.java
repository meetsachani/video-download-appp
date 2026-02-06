package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        float f = 0.0f;
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
                case 7:
                case 9:
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
                case 4:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 5:
                    i3 = SafeParcelReader.Z(parcel, X);
                    break;
                case 6:
                    arrayList = SafeParcelReader.I(parcel, X);
                    break;
                case 8:
                    j2 = SafeParcelReader.c0(parcel, X);
                    break;
                case 10:
                    str3 = SafeParcelReader.G(parcel, X);
                    break;
                case 11:
                    i2 = SafeParcelReader.Z(parcel, X);
                    break;
                case 12:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 13:
                    str4 = SafeParcelReader.G(parcel, X);
                    break;
                case 14:
                    i4 = SafeParcelReader.Z(parcel, X);
                    break;
                case 15:
                    f = SafeParcelReader.V(parcel, X);
                    break;
                case 16:
                    j3 = SafeParcelReader.c0(parcel, X);
                    break;
                case 17:
                    str5 = SafeParcelReader.G(parcel, X);
                    break;
                case 18:
                    z = SafeParcelReader.P(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
