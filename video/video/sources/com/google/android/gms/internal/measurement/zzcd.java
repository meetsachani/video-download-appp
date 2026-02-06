package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public abstract class zzcd {
    public static zzcd a = new zzcg();

    public static synchronized zzcd a() {
        zzcd zzcdVar;
        synchronized (zzcd.class) {
            zzcdVar = a;
        }
        return zzcdVar;
    }

    public abstract URLConnection b(URL url, String str) throws IOException;
}
