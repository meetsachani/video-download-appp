package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbwe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwe> CREATOR = new zzbwf();
    @SafeParcelable.Field(id = 2)
    public final com.google.android.gms.ads.internal.client.zzm X;
    @SafeParcelable.Field(id = 3)
    public final String Y;

    @SafeParcelable.Constructor
    public zzbwe(@SafeParcelable.Param(id = 2) com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param(id = 3) String str) {
        this.X = zzmVar;
        this.Y = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.S(parcel, 2, zzmVar, i, false);
        SafeParcelWriter.Y(parcel, 3, this.Y, false);
        SafeParcelWriter.b(parcel, a);
    }
}
