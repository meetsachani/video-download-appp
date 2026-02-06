package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
/* loaded from: classes2.dex */
public final class zzbyz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyz> CREATOR = new zzbza();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public final String Y;
    @SafeParcelable.Field(id = 4)
    public final com.google.android.gms.ads.internal.client.zzm Y0;
    @SafeParcelable.Field(id = 3)
    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzr Z;
    @SafeParcelable.Field(id = 5)
    public final int Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 6)
    public final String a1;

    @SafeParcelable.Constructor
    public zzbyz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) com.google.android.gms.ads.internal.client.zzr zzrVar, @SafeParcelable.Param(id = 4) com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param(id = 5) int i, @InterfaceC11300zs1 @SafeParcelable.Param(id = 6) String str3) {
        this.X = str;
        this.Y = str2;
        this.Z = zzrVar;
        this.Y0 = zzmVar;
        this.Z0 = i;
        this.a1 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.S(parcel, 4, this.Y0, i, false);
        SafeParcelWriter.F(parcel, 5, this.Z0);
        SafeParcelWriter.Y(parcel, 6, this.a1, false);
        SafeParcelWriter.b(parcel, a);
    }
}
