package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import o.InterfaceC11300zs1;
import o.XE2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zabs {
    public final ApiKey<?> a;
    public final Feature b;

    public /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.a = apiKey;
        this.b = feature;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj != null && (obj instanceof zabs)) {
            zabs zabsVar = (zabs) obj;
            if (Objects.b(this.a, zabsVar.a) && Objects.b(this.b, zabsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.c(this.a, this.b);
    }

    public final String toString() {
        return Objects.d(this).a("key", this.a).a(XE2.g, this.b).toString();
    }
}
