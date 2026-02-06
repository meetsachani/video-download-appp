package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class zzgdh {
    public final zzfwb a = new zzfwb();
    public final String b;
    public volatile Logger c;

    public zzgdh(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
