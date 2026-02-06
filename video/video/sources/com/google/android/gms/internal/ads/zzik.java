package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import o.InterfaceC11300zs1;
import o.OB;
import o.XH0;

/* loaded from: classes2.dex */
public final class zzik extends zzba {
    @InterfaceC11300zs1
    public final String Y0;
    public final int Z;
    public final int Z0;
    @InterfaceC11300zs1
    public final zzz a1;
    public final int b1;
    @InterfaceC11300zs1
    public final zzvb c1;
    public final boolean d1;

    public zzik(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static zzik b(Throwable th, String str, int i, @InterfaceC11300zs1 zzz zzzVar, int i2, @InterfaceC11300zs1 zzvb zzvbVar, boolean z, int i3) {
        if (zzzVar == null) {
            i2 = 4;
        }
        return new zzik(1, th, null, i3, str, i, zzzVar, i2, zzvbVar, z);
    }

    public static zzik c(IOException iOException, int i) {
        return new zzik(0, iOException, i);
    }

    public static zzik d(RuntimeException runtimeException, int i) {
        return new zzik(2, runtimeException, i);
    }

    @OB
    public final zzik a(@InterfaceC11300zs1 zzvb zzvbVar) {
        String message = getMessage();
        String str = zzeu.a;
        return new zzik(message, getCause(), this.X, this.Z, this.Y0, this.Z0, this.a1, this.b1, zzvbVar, this.Y, this.d1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzik(int i, @InterfaceC11300zs1 Throwable th, @InterfaceC11300zs1 String str, int i2, @InterfaceC11300zs1 String str2, int i3, @InterfaceC11300zs1 zzz zzzVar, int i4, @InterfaceC11300zs1 zzvb zzvbVar, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, r5, r6, zzzVar, i4, zzvbVar, SystemClock.elapsedRealtime(), z);
        String str3;
        int i5;
        String str4;
        String str5;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            str4 = "Source error";
        } else if (i != 1) {
            str4 = "Unexpected runtime error";
            str3 = str2;
            i5 = i3;
        } else {
            String valueOf = String.valueOf(zzzVar);
            String str6 = zzeu.a;
            if (i4 == 0) {
                str5 = XH0.W;
            } else if (i4 == 1) {
                str5 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str5 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str5 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i4 != 4) {
                throw new IllegalStateException();
            } else {
                str5 = XH0.V;
            }
            StringBuilder sb = new StringBuilder();
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(valueOf);
            sb.append(", format_supported=");
            sb.append(str5);
            str4 = sb.toString();
        }
    }

    public zzik(String str, @InterfaceC11300zs1 Throwable th, int i, int i2, @InterfaceC11300zs1 String str2, int i3, @InterfaceC11300zs1 zzz zzzVar, int i4, @InterfaceC11300zs1 zzvb zzvbVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        boolean z2;
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzdc.d(z2);
        zzdc.d(th != null);
        this.Z = i2;
        this.Y0 = str2;
        this.Z0 = i3;
        this.a1 = zzzVar;
        this.b1 = i4;
        this.c1 = zzvbVar;
        this.d1 = z;
    }
}
