package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzhfk extends zzhfn {
    public final Logger a;

    public zzhfk(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
