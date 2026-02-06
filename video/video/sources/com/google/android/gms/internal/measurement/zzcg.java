package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
final class zzcg extends zzcd {
    @Override // com.google.android.gms.internal.measurement.zzcd
    public final URLConnection b(URL url, String str) throws IOException {
        return url.openConnection();
    }

    private zzcg() {
    }
}
