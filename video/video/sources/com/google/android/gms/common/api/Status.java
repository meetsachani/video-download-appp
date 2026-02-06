package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o.C9254rS0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;
import o.QB;
import o.X5;

@SafeParcelable.Class(creator = "StatusCreator")
/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    public final int X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    public final String Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    public final ConnectionResult Y0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    public final PendingIntent Z;
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Status Z0 = new Status(-1);
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Status a1 = new Status(0);
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Status b1 = new Status(14);
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Status c1 = new Status(8);
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Status d1 = new Status(15);
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Status e1 = new Status(16);
    @ShowFirstParty
    @InterfaceC5670cr1
    public static final Status g1 = new Status(17);
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Status f1 = new Status(18);
    @InterfaceC5670cr1
    public static final Parcelable.Creator<Status> CREATOR = new zzb();

    @SafeParcelable.Constructor
    public Status(@SafeParcelable.Param(id = 1) int i, @InterfaceC11300zs1 @SafeParcelable.Param(id = 2) String str, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) ConnectionResult connectionResult) {
        this.X = i;
        this.Y = str;
        this.Z = pendingIntent;
        this.Y0 = connectionResult;
    }

    @InterfaceC11300zs1
    public PendingIntent B0() {
        return this.Z;
    }

    @ResultIgnorabilityUnspecified
    public int E0() {
        return this.X;
    }

    @InterfaceC11300zs1
    public String G0() {
        return this.Y;
    }

    public boolean H0() {
        return this.Z != null;
    }

    public boolean I0() {
        return this.X == 16;
    }

    public boolean O0() {
        return this.X == 14;
    }

    @QB
    public boolean S0() {
        return this.X <= 0;
    }

    public void U0(@InterfaceC5670cr1 Activity activity, int i) throws IntentSender.SendIntentException {
        if (!H0()) {
            return;
        }
        PendingIntent pendingIntent = this.Z;
        Preconditions.r(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
    }

    public void V0(@InterfaceC5670cr1 X5<C9254rS0> x5) {
        if (!H0()) {
            return;
        }
        PendingIntent pendingIntent = this.Z;
        Preconditions.r(pendingIntent);
        x5.b(new C9254rS0.a(pendingIntent.getIntentSender()).a());
    }

    @InterfaceC5670cr1
    public final String Z0() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        return CommonStatusCodes.a(this.X);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.X != status.X || !Objects.b(this.Y, status.Y) || !Objects.b(this.Z, status.Z) || !Objects.b(this.Y0, status.Y0)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.Result
    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Status h() {
        return this;
    }

    public int hashCode() {
        return Objects.c(Integer.valueOf(this.X), this.Y, this.Z, this.Y0);
    }

    @InterfaceC11300zs1
    public ConnectionResult m0() {
        return this.Y0;
    }

    @InterfaceC5670cr1
    public String toString() {
        Objects.ToStringHelper d = Objects.d(this);
        d.a("statusCode", Z0());
        d.a("resolution", this.Z);
        return d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, E0());
        SafeParcelWriter.Y(parcel, 2, G0(), false);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.S(parcel, 4, m0(), i, false);
        SafeParcelWriter.b(parcel, a);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(@InterfaceC5670cr1 ConnectionResult connectionResult, @InterfaceC5670cr1 String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i, @InterfaceC11300zs1 String str) {
        this(i, str, (PendingIntent) null);
    }

    @KeepForSdk
    @Deprecated
    public Status(@InterfaceC5670cr1 ConnectionResult connectionResult, @InterfaceC5670cr1 String str, int i) {
        this(i, str, connectionResult.E0(), connectionResult);
    }

    public Status(int i, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }
}
