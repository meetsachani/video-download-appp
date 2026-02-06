package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.u;
import androidx.savedstate.a;
import o.AbstractC6553gR;
import o.AbstractC8052mY0;
import o.C6551gQ1;
import o.C6562gT0;
import o.HA0;
import o.HH2;
import o.KX1;
import o.LX1;
import o.OX1;
import o.PP0;

/* loaded from: classes.dex */
public final class q {
    public static final String a = "androidx.lifecycle.internal.SavedStateHandlesVM";
    public static final String b = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    public static final AbstractC6553gR.b<OX1> c = new b();
    public static final AbstractC6553gR.b<HH2> d = new c();
    public static final AbstractC6553gR.b<Bundle> e = new a();

    /* loaded from: classes.dex */
    public static final class a implements AbstractC6553gR.b<Bundle> {
    }

    /* loaded from: classes.dex */
    public static final class b implements AbstractC6553gR.b<OX1> {
    }

    /* loaded from: classes.dex */
    public static final class c implements AbstractC6553gR.b<HH2> {
    }

    /* loaded from: classes.dex */
    public static final class d extends AbstractC8052mY0 implements HA0<AbstractC6553gR, LX1> {
        public static final d X = new d();

        public d() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final LX1 invoke(AbstractC6553gR abstractC6553gR) {
            C6562gT0.p(abstractC6553gR, "$this$initializer");
            return new LX1();
        }
    }

    public static final p a(AbstractC6553gR abstractC6553gR) {
        C6562gT0.p(abstractC6553gR, "<this>");
        OX1 ox1 = (OX1) abstractC6553gR.a(c);
        if (ox1 != null) {
            HH2 hh2 = (HH2) abstractC6553gR.a(d);
            if (hh2 != null) {
                Bundle bundle = (Bundle) abstractC6553gR.a(e);
                String str = (String) abstractC6553gR.a(u.c.d);
                if (str != null) {
                    return b(ox1, hh2, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final p b(OX1 ox1, HH2 hh2, String str, Bundle bundle) {
        KX1 d2 = d(ox1);
        LX1 e2 = e(hh2);
        p pVar = e2.g().get(str);
        if (pVar == null) {
            p a2 = p.f.a(d2.b(str), bundle);
            e2.g().put(str, a2);
            return a2;
        }
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends OX1 & HH2> void c(T t) {
        C6562gT0.p(t, "<this>");
        f.b b2 = t.b().b();
        if (b2 != f.b.INITIALIZED && b2 != f.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.E().c(b) == null) {
            KX1 kx1 = new KX1(t.E(), t);
            t.E().j(b, kx1);
            t.b().a(new SavedStateHandleAttacher(kx1));
        }
    }

    public static final KX1 d(OX1 ox1) {
        KX1 kx1;
        C6562gT0.p(ox1, "<this>");
        a.c c2 = ox1.E().c(b);
        if (c2 instanceof KX1) {
            kx1 = (KX1) c2;
        } else {
            kx1 = null;
        }
        if (kx1 != null) {
            return kx1;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final LX1 e(HH2 hh2) {
        C6562gT0.p(hh2, "<this>");
        PP0 pp0 = new PP0();
        pp0.a(C6551gQ1.d(LX1.class), d.X);
        return (LX1) new u(hh2, pp0.b()).b(a, LX1.class);
    }
}
