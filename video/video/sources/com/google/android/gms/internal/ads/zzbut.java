package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbut extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbut> CREATOR = new zzbuu();
    @SafeParcelable.Field(id = 2)
    public final boolean X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 3)
    public final List Y;

    public zzbut() {
        this(false, Collections.EMPTY_LIST);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 2, z);
        SafeParcelWriter.a0(parcel, 3, this.Y, false);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzbut(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) List list) {
        this.X = z;
        this.Y = list;
    }
}
