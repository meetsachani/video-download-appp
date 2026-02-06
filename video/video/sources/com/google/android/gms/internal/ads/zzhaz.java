package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhaz extends zzhbe {
    public zzhaz() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final void a() {
        if (!k()) {
            for (int i = 0; i < c(); i++) {
                Map.Entry g = g(i);
                if (((zzgyg) ((zzhba) g).e()).d()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((zzgyg) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
