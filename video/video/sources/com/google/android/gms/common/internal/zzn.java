package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, getServiceRequest.X);
        SafeParcelWriter.F(parcel, 2, getServiceRequest.Y);
        SafeParcelWriter.F(parcel, 3, getServiceRequest.Z);
        SafeParcelWriter.Y(parcel, 4, getServiceRequest.Y0, false);
        SafeParcelWriter.B(parcel, 5, getServiceRequest.Z0, false);
        SafeParcelWriter.c0(parcel, 6, getServiceRequest.a1, i, false);
        SafeParcelWriter.k(parcel, 7, getServiceRequest.b1, false);
        SafeParcelWriter.S(parcel, 8, getServiceRequest.c1, i, false);
        SafeParcelWriter.c0(parcel, 10, getServiceRequest.d1, i, false);
        SafeParcelWriter.c0(parcel, 11, getServiceRequest.e1, i, false);
        SafeParcelWriter.g(parcel, 12, getServiceRequest.f1);
        SafeParcelWriter.F(parcel, 13, getServiceRequest.g1);
        SafeParcelWriter.g(parcel, 14, getServiceRequest.h1);
        SafeParcelWriter.Y(parcel, 15, getServiceRequest.B0(), false);
        SafeParcelWriter.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.i0(parcel);
        Scope[] scopeArr = GetServiceRequest.j1;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.k1;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
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
                    str = SafeParcelReader.G(parcel, X);
                    break;
                case 5:
                    iBinder = SafeParcelReader.Y(parcel, X);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.K(parcel, X, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.g(parcel, X);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.C(parcel, X, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.h0(parcel, X);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.K(parcel, X, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.K(parcel, X, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.P(parcel, X);
                    break;
                case 13:
                    i4 = SafeParcelReader.Z(parcel, X);
                    break;
                case 14:
                    z2 = SafeParcelReader.P(parcel, X);
                    break;
                case 15:
                    str2 = SafeParcelReader.G(parcel, X);
                    break;
            }
        }
        SafeParcelReader.N(parcel, i0);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
