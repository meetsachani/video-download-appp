package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "ConnectionResultCreator")
/* loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    @KeepForSdk
    public static final int Z0 = -1;
    public static final int a1 = 0;
    public static final int b1 = 1;
    public static final int c1 = 2;
    public static final int d1 = 3;
    public static final int e1 = 4;
    public static final int f1 = 5;
    public static final int g1 = 6;
    public static final int h1 = 7;
    public static final int i1 = 8;
    public static final int j1 = 9;
    public static final int k1 = 10;
    public static final int l1 = 11;
    public static final int m1 = 13;
    public static final int n1 = 14;
    public static final int o1 = 15;
    public static final int p1 = 16;
    public static final int q1 = 17;
    public static final int r1 = 18;
    public static final int s1 = 19;
    public static final int t1 = 20;
    public static final int u1 = 22;
    public static final int v1 = 23;
    public static final int w1 = 24;
    @Deprecated
    public static final int x1 = 1500;
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getErrorCode", id = 2)
    public final int Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getErrorMessage", id = 4)
    public final String Y0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getResolution", id = 3)
    public final PendingIntent Z;
    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static final ConnectionResult y1 = new ConnectionResult(0);
    @InterfaceC5670cr1
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();

    @SafeParcelable.Constructor
    public ConnectionResult(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) String str) {
        this.X = i;
        this.Y = i2;
        this.Z = pendingIntent;
        this.Y0 = str;
    }

    @InterfaceC5670cr1
    public static String O0(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i + C9811tl1.d;
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    @InterfaceC11300zs1
    public String B0() {
        return this.Y0;
    }

    @InterfaceC11300zs1
    public PendingIntent E0() {
        return this.Z;
    }

    public boolean G0() {
        return (this.Y == 0 || this.Z == null) ? false : true;
    }

    public boolean H0() {
        return this.Y == 0;
    }

    public void I0(@InterfaceC5670cr1 Activity activity, int i) throws IntentSender.SendIntentException {
        if (!G0()) {
            return;
        }
        PendingIntent pendingIntent = this.Z;
        Preconditions.r(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.Y == connectionResult.Y && Objects.b(this.Z, connectionResult.Z) && Objects.b(this.Y0, connectionResult.Y0)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.c(Integer.valueOf(this.Y), this.Z, this.Y0);
    }

    public int m0() {
        return this.Y;
    }

    @InterfaceC5670cr1
    public String toString() {
        Objects.ToStringHelper d = Objects.d(this);
        d.a("statusCode", O0(this.Y));
        d.a("resolution", this.Z);
        d.a("message", this.Y0);
        return d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.F(parcel, 2, m0());
        SafeParcelWriter.S(parcel, 3, E0(), i, false);
        SafeParcelWriter.Y(parcel, 4, B0(), false);
        SafeParcelWriter.b(parcel, a);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, @InterfaceC11300zs1 PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, @InterfaceC11300zs1 PendingIntent pendingIntent, @InterfaceC11300zs1 String str) {
        this(1, i, pendingIntent, str);
    }
}
