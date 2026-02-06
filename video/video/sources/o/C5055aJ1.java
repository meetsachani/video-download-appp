package o;

import android.os.Bundle;
import android.os.CancellationSignal;

/* renamed from: o.aJ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5055aJ1 {
    public final int a;
    public final Bundle b;
    public final String c;
    public final CancellationSignal d;

    public C5055aJ1(int i, Bundle bundle, String str, CancellationSignal cancellationSignal) {
        C6562gT0.p(bundle, "params");
        this.a = i;
        this.b = bundle;
        this.c = str;
        this.d = cancellationSignal;
    }

    public final CancellationSignal a() {
        return this.d;
    }

    public final Bundle b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }
}
