package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
/* loaded from: classes2.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzh();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    public final boolean X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getAppEventListenerBinder", id = 2, type = "android.os.IBinder")
    public final zzcl Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 3)
    public final IBinder Z;

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class Builder {
        @InterfaceC5670cr1
        @KeepForSdk
        public Builder a(@InterfaceC5670cr1 ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param(id = 1) boolean z, @InterfaceC11300zs1 @SafeParcelable.Param(id = 2) IBinder iBinder, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) IBinder iBinder2) {
        zzcl zzclVar;
        this.X = z;
        if (iBinder != null) {
            zzclVar = zzck.W7(iBinder);
        } else {
            zzclVar = null;
        }
        this.Y = zzclVar;
        this.Z = iBinder2;
    }

    public final boolean B0() {
        return this.X;
    }

    @InterfaceC11300zs1
    public final zzcl m0() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        IBinder asBinder;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 1, this.X);
        zzcl zzclVar = this.Y;
        if (zzclVar == null) {
            asBinder = null;
        } else {
            asBinder = zzclVar.asBinder();
        }
        SafeParcelWriter.B(parcel, 2, asBinder, false);
        SafeParcelWriter.B(parcel, 3, this.Z, false);
        SafeParcelWriter.b(parcel, a);
    }
}
