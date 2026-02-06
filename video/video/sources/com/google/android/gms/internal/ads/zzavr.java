package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes2.dex */
public final class zzavr {
    public NetworkCapabilities a;

    public zzavr(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzavq(this));
            } catch (RuntimeException unused) {
                synchronized (zzavr.class) {
                    this.a = null;
                }
            }
        }
    }

    public static zzavr c(Context context) {
        if (context != null) {
            return new zzavr((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (zzavr.class) {
            try {
                NetworkCapabilities networkCapabilities = this.a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final NetworkCapabilities b() {
        return this.a;
    }
}
