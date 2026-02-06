package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zacd<T> implements OnCompleteListener<T> {
    public final GoogleApiManager a;
    public final int b;
    public final ApiKey<?> c;
    public final long d;
    public final long e;

    @VisibleForTesting
    public zacd(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey, long j, long j2, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        this.a = googleApiManager;
        this.b = i;
        this.c = apiKey;
        this.d = j;
        this.e = j2;
    }

    @InterfaceC11300zs1
    public static <T> zacd<T> b(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey) {
        boolean z;
        long j;
        if (!googleApiManager.g()) {
            return null;
        }
        RootTelemetryConfiguration a = RootTelemetryConfigManager.b().a();
        if (a != null) {
            if (!a.E0()) {
                return null;
            }
            z = a.G0();
            zabq x = googleApiManager.x(apiKey);
            if (x != null) {
                if (!(x.s() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) x.s();
                if (baseGmsClient.R() && !baseGmsClient.h()) {
                    ConnectionTelemetryConfiguration c = c(x, baseGmsClient, i);
                    if (c == null) {
                        return null;
                    }
                    x.D();
                    z = c.H0();
                }
            }
        } else {
            z = true;
        }
        long j2 = 0;
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        }
        return new zacd<>(googleApiManager, i, apiKey, j, j2, null, null);
    }

    @InterfaceC11300zs1
    public static ConnectionTelemetryConfiguration c(zabq<?> zabqVar, BaseGmsClient<?> baseGmsClient, int i) {
        int[] B0;
        int[] E0;
        ConnectionTelemetryConfiguration P = baseGmsClient.P();
        if (P == null || !P.G0() || ((B0 = P.B0()) != null ? !ArrayUtils.c(B0, i) : !((E0 = P.E0()) == null || !ArrayUtils.c(E0, i))) || zabqVar.p() >= P.m0()) {
            return null;
        }
        return P;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @InterfaceC10697xN2
    public final void a(@InterfaceC5670cr1 Task<T> task) {
        zabq x;
        boolean z;
        int i;
        int i2;
        int i3;
        int m0;
        int i4;
        int i5;
        long j;
        long j2;
        if (this.a.g()) {
            RootTelemetryConfiguration a = RootTelemetryConfigManager.b().a();
            if ((a == null || a.E0()) && (x = this.a.x(this.c)) != null && (x.s() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) x.s();
                boolean z2 = true;
                int i6 = 0;
                if (this.d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int G = baseGmsClient.G();
                if (a != null) {
                    z &= a.G0();
                    int m02 = a.m0();
                    int B0 = a.B0();
                    i = a.d0();
                    if (baseGmsClient.R() && !baseGmsClient.h()) {
                        ConnectionTelemetryConfiguration c = c(x, baseGmsClient, this.b);
                        if (c != null) {
                            if (!c.H0() || this.d <= 0) {
                                z2 = false;
                            }
                            B0 = c.m0();
                            z = z2;
                        } else {
                            return;
                        }
                    }
                    i3 = m02;
                    i2 = B0;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                GoogleApiManager googleApiManager = this.a;
                int i7 = -1;
                if (task.v()) {
                    i4 = 0;
                } else {
                    if (task.t()) {
                        i6 = 100;
                    } else {
                        Exception q = task.q();
                        if (q instanceof ApiException) {
                            Status a2 = ((ApiException) q).a();
                            int E0 = a2.E0();
                            ConnectionResult m03 = a2.m0();
                            if (m03 == null) {
                                m0 = -1;
                            } else {
                                m0 = m03.m0();
                            }
                            i4 = m0;
                            i6 = E0;
                        } else {
                            i6 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z) {
                    long j3 = this.d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i5 = i2;
                    i7 = (int) (SystemClock.elapsedRealtime() - this.e);
                    j = j3;
                    j2 = currentTimeMillis;
                } else {
                    i5 = i2;
                    j = 0;
                    j2 = 0;
                }
                googleApiManager.L(new MethodInvocation(this.b, i6, i4, j, j2, null, null, G, i7), i, i3, i5);
            }
        }
    }
}
