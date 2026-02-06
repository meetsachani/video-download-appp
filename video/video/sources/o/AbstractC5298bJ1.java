package o;

import android.os.Bundle;
import android.os.CancellationSignal;
import o.AbstractC5298bJ1;

/* renamed from: o.bJ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5298bJ1<T extends AbstractC5298bJ1<T>> {
    public String a;
    public CancellationSignal b;

    public final C5055aJ1 a() {
        return new C5055aJ1(c(), b(), this.a, this.b);
    }

    public abstract Bundle b();

    public abstract int c();

    public abstract T d();

    public final T e(CancellationSignal cancellationSignal) {
        C6562gT0.p(cancellationSignal, "cancellationSignal");
        this.b = cancellationSignal;
        return d();
    }

    public final T f(String str) {
        C6562gT0.p(str, "tag");
        this.a = str;
        return d();
    }
}
