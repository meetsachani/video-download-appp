package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzlx extends RuntimeException {
    public final List<String> X;

    public zzlx(zzkj zzkjVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.X = null;
    }
}
