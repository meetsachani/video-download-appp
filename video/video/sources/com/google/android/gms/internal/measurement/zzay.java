package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzay {
    public final List<zzbv> a = new ArrayList();

    public final zzaq a(String str) {
        if (this.a.contains(zzg.c(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract zzaq b(String str, zzh zzhVar, List<zzaq> list);
}
