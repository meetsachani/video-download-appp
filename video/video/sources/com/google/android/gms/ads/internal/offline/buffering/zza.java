package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OfflineNotificationParcelCreator")
/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public final String Y;
    @SafeParcelable.Field(id = 3)
    public final String Z;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3) {
        this.X = str;
        this.Y = str2;
        this.Z = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.Y(parcel, 3, this.Z, false);
        SafeParcelWriter.b(parcel, a);
    }
}
