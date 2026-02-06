package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzcs extends zzcy {
    public final AtomicReference<Bundle> Y = new AtomicReference<>();
    public boolean Z;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> T o1(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", canonicalName, canonicalName2), e);
            throw e;
        }
    }

    public final Long V3(long j) {
        return (Long) o1(g1(j), Long.class);
    }

    public final Bundle g1(long j) {
        Bundle bundle;
        synchronized (this.Y) {
            if (!this.Z) {
                try {
                    this.Y.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.Y.get();
        }
        return bundle;
    }

    public final String r4(long j) {
        return (String) o1(g1(j), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void v0(Bundle bundle) {
        synchronized (this.Y) {
            try {
                this.Y.set(bundle);
                this.Z = true;
                this.Y.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
