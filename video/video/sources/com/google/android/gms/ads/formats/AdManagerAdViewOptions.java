package com.google.android.gms.ads.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
/* loaded from: classes2.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    public final boolean X;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public boolean a = false;

        @InterfaceC5670cr1
        public AdManagerAdViewOptions a() {
            return new AdManagerAdViewOptions(this, null);
        }

        @InterfaceC5670cr1
        public Builder b(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.X = builder.a;
    }

    public boolean m0() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 1, m0());
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public AdManagerAdViewOptions(@SafeParcelable.Param(id = 1) boolean z) {
        this.X = z;
    }
}
