package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlf extends zzlg<Object, Object> {
    public zzlf(int i) {
        super(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final void f() {
        if (!r()) {
            for (int i = 0; i < g(); i++) {
                Map.Entry<Object, Object> i2 = i(i);
                if (((zzis) i2.getKey()).d()) {
                    i2.setValue(Collections.unmodifiableList((List) i2.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : k()) {
                if (((zzis) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.f();
    }
}
