package o;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.savedstate.Recreator;

/* loaded from: classes.dex */
public final class NX1 {
    public static final a d = new a(null);
    public final OX1 a;
    public final androidx.savedstate.a b;
    public boolean c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final NX1 a(OX1 ox1) {
            C6562gT0.p(ox1, "owner");
            return new NX1(ox1, null);
        }

        public a() {
        }
    }

    public /* synthetic */ NX1(OX1 ox1, C9516sY c9516sY) {
        this(ox1);
    }

    @InterfaceC9511sW0
    public static final NX1 a(OX1 ox1) {
        return d.a(ox1);
    }

    public final androidx.savedstate.a b() {
        return this.b;
    }

    public final void c() {
        androidx.lifecycle.f b = this.a.b();
        if (b.b() == f.b.INITIALIZED) {
            b.a(new Recreator(this.a));
            this.b.g(b);
            this.c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void d(Bundle bundle) {
        if (!this.c) {
            c();
        }
        androidx.lifecycle.f b = this.a.b();
        if (!b.b().g(f.b.STARTED)) {
            this.b.h(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + b.b()).toString());
    }

    public final void e(Bundle bundle) {
        C6562gT0.p(bundle, "outBundle");
        this.b.i(bundle);
    }

    public NX1(OX1 ox1) {
        this.a = ox1;
        this.b = new androidx.savedstate.a();
    }
}
