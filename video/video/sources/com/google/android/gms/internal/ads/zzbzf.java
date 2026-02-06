package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbzf {
    public long a = -1;
    public long b = -1;
    public final /* synthetic */ zzbzg c;

    public zzbzf(zzbzg zzbzgVar) {
        this.c = zzbzgVar;
    }

    public final long a() {
        return this.b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.a);
        bundle.putLong("tclose", this.b);
        return bundle;
    }

    public final void c() {
        Clock clock;
        clock = this.c.a;
        this.b = clock.b();
    }

    public final void d() {
        Clock clock;
        clock = this.c.a;
        this.a = clock.b();
    }
}
