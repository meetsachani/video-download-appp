package o;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: o.i40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6948i40 {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final Queue<Runnable> d = new ArrayDeque();

    public static final void d(C6948i40 c6948i40, Runnable runnable) {
        C6562gT0.p(c6948i40, "this$0");
        C6562gT0.p(runnable, "$runnable");
        c6948i40.f(runnable);
    }

    public final boolean b() {
        if (!this.b && this.a) {
            return false;
        }
        return true;
    }

    public final void c(InterfaceC5809dQ interfaceC5809dQ, final Runnable runnable) {
        C6562gT0.p(interfaceC5809dQ, "context");
        C6562gT0.p(runnable, "runnable");
        AbstractC8922q71 b0 = C8909q40.e().b0();
        if (!b0.U(interfaceC5809dQ) && !b()) {
            f(runnable);
        } else {
            b0.I(interfaceC5809dQ, new Runnable() { // from class: o.h40
                @Override // java.lang.Runnable
                public final void run() {
                    C6948i40.d(C6948i40.this, runnable);
                }
            });
        }
    }

    public final void e() {
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!this.d.isEmpty() && b()) {
                Runnable poll = this.d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.c = false;
        }
    }

    public final void f(Runnable runnable) {
        if (this.d.offer(runnable)) {
            e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables");
    }

    public final void g() {
        this.b = true;
        e();
    }

    public final void h() {
        this.a = true;
    }

    public final void i() {
        if (!this.a) {
            return;
        }
        if (!this.b) {
            this.a = false;
            e();
            return;
        }
        throw new IllegalStateException("Cannot resume a finished dispatcher");
    }
}
