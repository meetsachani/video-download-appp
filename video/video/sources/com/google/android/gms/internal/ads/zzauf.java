package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;
import o.MS2;

/* loaded from: classes2.dex */
public final class zzauf implements PackageManager$OnChecksumsReadyListener {
    public final zzgds a = zzgds.A();

    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        if (list == null) {
            this.a.l("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum a = MS2.a(list.get(i));
                type = a.getType();
                if (type == 8) {
                    zzgds zzgdsVar = this.a;
                    zzgap e = zzgap.g().e();
                    value = a.getValue();
                    zzgdsVar.l(e.h(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.a.l("");
    }
}
