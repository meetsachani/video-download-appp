package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AppSetInfoParcelCreator")
/* loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    @SafeParcelable.Field(getter = "getId", id = 1)
    public final String X;
    @SafeParcelable.Field(getter = "getScope", id = 2)
    public final int Y;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i) {
        this.X = str;
        this.Y = i;
    }

    public final String B0() {
        return this.X;
    }

    public final int m0() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, this.X, false);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.b(parcel, a);
    }
}
