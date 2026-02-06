package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zan implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MethodInvocation createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        int i5 = -1;
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
                    i3 = SafeParcelReader.Z(parcel, X);
                    break;
                case 4:
                    j = SafeParcelReader.c0(parcel, X);
                    break;
                case 5:
                    j2 = SafeParcelReader.c0(parcel, X);
                    break;
                case 6:
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 7:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
                case 8:
                    i4 = SafeParcelReader.Z(parcel, X);
                    break;
                case 9:
                    i5 = SafeParcelReader.Z(parcel, X);
                    break;
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
