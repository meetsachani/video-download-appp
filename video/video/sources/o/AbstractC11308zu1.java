package o;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: o.zu1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11308zu1 extends AbstractC4733Xo1 {
    public final OnBackInvokedDispatcher d;
    public final int e;
    public final OnBackInvokedCallback f;
    public boolean g;

    /* renamed from: o.zu1$a */
    /* loaded from: classes.dex */
    public static final class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            AbstractC11308zu1.this.a();
        }

        public void onBackInvoked() {
            AbstractC11308zu1.this.b();
        }

        public void onBackProgressed(BackEvent backEvent) {
            C6562gT0.p(backEvent, "backEvent");
            AbstractC11308zu1.this.c(C5177ap1.a(backEvent));
        }

        public void onBackStarted(BackEvent backEvent) {
            C6562gT0.p(backEvent, "backEvent");
            AbstractC11308zu1.this.d(C5177ap1.a(backEvent));
        }
    }

    public /* synthetic */ AbstractC11308zu1(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, C9516sY c9516sY) {
        this(onBackInvokedDispatcher, i);
    }

    public static final void u(AbstractC11308zu1 abstractC11308zu1) {
        abstractC11308zu1.b();
    }

    @Override // o.AbstractC4733Xo1
    public void o(boolean z) {
        v(z);
    }

    @Override // o.AbstractC4733Xo1
    public void q() {
        v(false);
    }

    public final OnBackInvokedCallback t() {
        return C6834hc.a(new a());
    }

    public final void v(boolean z) {
        if (z && !this.g) {
            this.d.registerOnBackInvokedCallback(this.e, this.f);
            this.g = true;
        } else if (!z && this.g) {
            this.d.unregisterOnBackInvokedCallback(this.f);
            this.g = false;
        }
    }

    public AbstractC11308zu1(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        OnBackInvokedCallback t;
        this.d = onBackInvokedDispatcher;
        this.e = i;
        if (Build.VERSION.SDK_INT == 33) {
            t = new OnBackInvokedCallback() { // from class: o.yu1
                public final void onBackInvoked() {
                    AbstractC11308zu1.u(AbstractC11308zu1.this);
                }
            };
        } else {
            t = t();
        }
        this.f = t;
    }
}
