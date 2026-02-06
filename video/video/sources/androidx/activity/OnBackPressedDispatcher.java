package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.f;
import o.AbstractC2891Eu1;
import o.AbstractC4442Uo1;
import o.AbstractC4733Xo1;
import o.C10822xu1;
import o.C2499Au1;
import o.C3000Fu1;
import o.C4148Ro1;
import o.C4248So1;
import o.C6210f5;
import o.C6562gT0;
import o.C8827pk;
import o.C9516sY;
import o.InterfaceC10579wu1;
import o.InterfaceC10929yL;
import o.KZ0;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final InterfaceC10929yL<Boolean> b;
    public boolean c;
    public final C4248So1 d;
    public final a e;

    /* loaded from: classes.dex */
    public final class a extends AbstractC4733Xo1 {
        public a() {
        }

        @Override // o.AbstractC4733Xo1
        public void o(boolean z) {
            OnBackPressedDispatcher.this.c = z;
            InterfaceC10929yL interfaceC10929yL = OnBackPressedDispatcher.this.b;
            if (interfaceC10929yL != null) {
                interfaceC10929yL.accept(Boolean.valueOf(z));
            }
        }

        public final void s() {
            a();
        }

        public final void t() {
            b();
        }

        public final void u(C4148Ro1 c4148Ro1) {
            C6562gT0.p(c4148Ro1, "event");
            c(c4148Ro1);
        }

        public final void v(C4148Ro1 c4148Ro1) {
            C6562gT0.p(c4148Ro1, "event");
            d(c4148Ro1);
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    public static final void i(OnBackPressedDispatcher onBackPressedDispatcher) {
        Runnable runnable = onBackPressedDispatcher.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(KZ0 kz0, AbstractC2891Eu1 abstractC2891Eu1) {
        C6562gT0.p(kz0, "owner");
        C6562gT0.p(abstractC2891Eu1, "onBackPressedCallback");
        f b = kz0.b();
        if (b.b() == f.b.DESTROYED) {
            return;
        }
        AbstractC4442Uo1<?> b2 = abstractC2891Eu1.b(new C3000Fu1(abstractC2891Eu1, kz0));
        if (C6210f5.b) {
            b2.y(false);
            C4248So1.c(this.d, b2, 0, 2, null);
        }
        OnBackPressedDispatcher$addCallback$lifecycleObserver$1 onBackPressedDispatcher$addCallback$lifecycleObserver$1 = new OnBackPressedDispatcher$addCallback$lifecycleObserver$1(b2, abstractC2891Eu1, this, b);
        b.a(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
        abstractC2891Eu1.a(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
    }

    public final void e(AbstractC2891Eu1 abstractC2891Eu1) {
        C6562gT0.p(abstractC2891Eu1, "onBackPressedCallback");
        C4248So1.c(this.d, abstractC2891Eu1.b(new C3000Fu1(abstractC2891Eu1, null, 2, null)), 0, 2, null);
    }

    public final void f() {
        this.e.s();
    }

    public final void g(C8827pk c8827pk) {
        C6562gT0.p(c8827pk, "backEvent");
        this.e.u(c8827pk.g());
    }

    public final void h(C8827pk c8827pk) {
        C6562gT0.p(c8827pk, "backEvent");
        this.e.v(c8827pk.g());
    }

    public final C4248So1 j() {
        return this.d;
    }

    public final boolean k() {
        return this.c;
    }

    public final void l() {
        this.e.t();
    }

    public final void m(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C6562gT0.p(onBackInvokedDispatcher, "invoker");
        this.d.e(new C10822xu1(onBackInvokedDispatcher), 1);
        this.d.e(new C2499Au1(onBackInvokedDispatcher), 0);
    }

    public OnBackPressedDispatcher(Runnable runnable, InterfaceC10929yL<Boolean> interfaceC10929yL) {
        this.a = runnable;
        this.b = interfaceC10929yL;
        C4248So1 c4248So1 = new C4248So1(new InterfaceC10579wu1() { // from class: o.Gu1
            @Override // o.InterfaceC10579wu1
            public final void a() {
                OnBackPressedDispatcher.i(OnBackPressedDispatcher.this);
            }
        });
        this.d = c4248So1;
        a aVar = new a();
        this.e = aVar;
        c4248So1.d(aVar);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? null : runnable);
    }
}
