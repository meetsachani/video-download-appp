package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzadh {
    public final zzadg a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public zzadh(zzadg zzadgVar) {
        this.a = zzadgVar;
    }

    @InterfaceC11300zs1
    public final zzadn a(Object... objArr) {
        Constructor a;
        AtomicBoolean atomicBoolean = this.b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    a = this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (zzadn) a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
