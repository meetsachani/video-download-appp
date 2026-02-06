package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC6181ey;

/* loaded from: classes2.dex */
final class zzz {
    @InterfaceC11300zs1
    public String a = null;
    public long b = -1;
    public zzag c = zzag.B();
    public zzag d = zzag.B();

    @InterfaceC6181ey
    public final zzz a(long j) {
        this.b = j;
        return this;
    }

    @InterfaceC6181ey
    public final zzz b(List list) {
        Preconditions.r(list);
        this.d = zzag.w(list);
        return this;
    }

    @InterfaceC6181ey
    public final zzz c(List list) {
        Preconditions.r(list);
        this.c = zzag.w(list);
        return this;
    }

    @InterfaceC6181ey
    public final zzz d(String str) {
        this.a = str;
        return this;
    }

    public final zzab e() {
        if (this.a != null) {
            if (this.b >= 0) {
                if (this.c.isEmpty() && this.d.isEmpty()) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                }
                return new zzab(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        throw new IllegalStateException("packageName must be defined");
    }
}
