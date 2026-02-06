package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
/* loaded from: classes2.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getAccount", id = 2)
    public final Account Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getSignInAccountHint", id = 4)
    public final GoogleSignInAccount Y0;
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.X = i;
        this.Y = account;
        this.Z = i2;
        this.Y0 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.S(parcel, 2, this.Y, i, false);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.S(parcel, 4, this.Y0, i, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zat(Account account, int i, @InterfaceC11300zs1 GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
