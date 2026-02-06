package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
/* loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();
    public static final Scope[] j1 = new Scope[0];
    public static final Feature[] k1 = new Feature[0];
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final int Y;
    @SafeParcelable.Field(id = 4)
    public String Y0;
    @SafeParcelable.Field(id = 3)
    public final int Z;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 5)
    public IBinder Z0;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    public Scope[] a1;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    public Bundle b1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 8)
    public Account c1;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    public Feature[] d1;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    public Feature[] e1;
    @SafeParcelable.Field(id = 12)
    public final boolean f1;
    @SafeParcelable.Field(defaultValue = "0", id = 13)
    public final int g1;
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    public boolean h1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    public final String i1;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @InterfaceC11300zs1 @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @InterfaceC11300zs1 @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) boolean z2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 15) String str2) {
        Account account2;
        scopeArr = scopeArr == null ? j1 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? k1 : featureArr;
        featureArr2 = featureArr2 == null ? k1 : featureArr2;
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        if ("com.google.android.gms".equals(str)) {
            this.Y0 = "com.google.android.gms";
        } else {
            this.Y0 = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                account2 = AccountAccessor.o1(IAccountAccessor.Stub.g1(iBinder));
            } else {
                account2 = null;
            }
            this.c1 = account2;
        } else {
            this.Z0 = iBinder;
            this.c1 = account;
        }
        this.a1 = scopeArr;
        this.b1 = bundle;
        this.d1 = featureArr;
        this.e1 = featureArr2;
        this.f1 = z;
        this.g1 = i4;
        this.h1 = z2;
        this.i1 = str2;
    }

    @InterfaceC11300zs1
    public final String B0() {
        return this.i1;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public Bundle m0() {
        return this.b1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        zzn.a(this, parcel, i);
    }
}
