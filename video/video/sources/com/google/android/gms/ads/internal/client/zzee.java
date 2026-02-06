package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "IconAdOptionsParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new zzef();
    @SafeParcelable.Field(id = 2)
    public final int X;

    @SafeParcelable.Constructor
    public zzee(@SafeParcelable.Param(id = 2) int i) {
        this.X = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 2, i2);
        SafeParcelWriter.b(parcel, a);
    }
}
