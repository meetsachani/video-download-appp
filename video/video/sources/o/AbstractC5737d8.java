package o;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* renamed from: o.d8  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5737d8<InputT, OutputT> extends AbstractC5979e8<OutputT> {
    public static final Logger k1 = Logger.getLogger(AbstractC5737d8.class.getName());
    @MB
    public TN0<? extends InterfaceFutureC8411o11<? extends InputT>> h1;
    public final boolean i1;
    public final boolean j1;

    /* renamed from: o.d8$a */
    /* loaded from: classes3.dex */
    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AbstractC5737d8(TN0<? extends InterfaceFutureC8411o11<? extends InputT>> tn0, boolean z, boolean z2) {
        super(tn0.size());
        this.h1 = (TN0) C10664xF1.E(tn0);
        this.i1 = z;
        this.j1 = z2;
    }

    public static /* synthetic */ void N(AbstractC5737d8 abstractC5737d8, InterfaceFutureC8411o11 interfaceFutureC8411o11, int i) {
        abstractC5737d8.getClass();
        try {
            if (interfaceFutureC8411o11.isCancelled()) {
                abstractC5737d8.h1 = null;
                abstractC5737d8.cancel(false);
            } else {
                abstractC5737d8.Q(i, interfaceFutureC8411o11);
            }
            abstractC5737d8.R(null);
        } catch (Throwable th) {
            abstractC5737d8.R(null);
            throw th;
        }
    }

    public static boolean O(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public static void V(Throwable th) {
        String str;
        if (th instanceof Error) {
            str = "Input Future failed with Error";
        } else {
            str = "Got more than one input Future failure. Logging failures after the first";
        }
        k1.log(Level.SEVERE, str, th);
    }

    @Override // o.AbstractC5979e8
    public final void I(Set<Throwable> set) {
        C10664xF1.E(set);
        if (!isCancelled()) {
            Throwable a2 = a();
            Objects.requireNonNull(a2);
            O(set, a2);
        }
    }

    public abstract void P(int i, @InterfaceC7165iy1 InputT inputt);

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i, Future<? extends InputT> future) {
        try {
            P(i, C6980iC0.h(future));
        } catch (ExecutionException e) {
            T(e.getCause());
        } catch (Throwable th) {
            T(th);
        }
    }

    public final void R(@MB TN0<? extends Future<? extends InputT>> tn0) {
        boolean z;
        int K = K();
        if (K >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.h0(z, "Less than 0 remaining futures");
        if (K == 0) {
            W(tn0);
        }
    }

    public abstract void S();

    public final void T(Throwable th) {
        C10664xF1.E(th);
        if (this.i1 && !C(th) && O(L(), th)) {
            V(th);
        } else if (th instanceof Error) {
            V(th);
        }
    }

    public final void U() {
        final TN0<? extends InterfaceFutureC8411o11<? extends InputT>> tn0;
        Objects.requireNonNull(this.h1);
        if (this.h1.isEmpty()) {
            S();
        } else if (this.i1) {
            AbstractC6237fB2<? extends InterfaceFutureC8411o11<? extends InputT>> it = this.h1.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final InterfaceFutureC8411o11<? extends InputT> next = it.next();
                next.h4(new Runnable() { // from class: o.b8
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC5737d8.N(AbstractC5737d8.this, next, i);
                    }
                }, C3645Mk1.c());
                i++;
            }
        } else {
            if (this.j1) {
                tn0 = this.h1;
            } else {
                tn0 = null;
            }
            Runnable runnable = new Runnable() { // from class: o.c8
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC5737d8.this.R(tn0);
                }
            };
            AbstractC6237fB2<? extends InterfaceFutureC8411o11<? extends InputT>> it2 = this.h1.iterator();
            while (it2.hasNext()) {
                it2.next().h4(runnable, C3645Mk1.c());
            }
        }
    }

    public final void W(@MB TN0<? extends Future<? extends InputT>> tn0) {
        if (tn0 != null) {
            AbstractC6237fB2<? extends Future<? extends InputT>> it = tn0.iterator();
            int i = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    Q(i, next);
                }
                i++;
            }
        }
        J();
        S();
        X(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    @InterfaceC6919hx0
    @InterfaceC7890lx1
    public void X(a aVar) {
        C10664xF1.E(aVar);
        this.h1 = null;
    }

    @Override // o.Q0
    public final void m() {
        boolean z;
        super.m();
        TN0<? extends InterfaceFutureC8411o11<? extends InputT>> tn0 = this.h1;
        X(a.OUTPUT_FUTURE_DONE);
        boolean isCancelled = isCancelled();
        if (tn0 != null) {
            z = true;
        } else {
            z = false;
        }
        if (isCancelled & z) {
            boolean E = E();
            AbstractC6237fB2<? extends InterfaceFutureC8411o11<? extends InputT>> it = tn0.iterator();
            while (it.hasNext()) {
                it.next().cancel(E);
            }
        }
    }

    @Override // o.Q0
    @MB
    public final String y() {
        TN0<? extends InterfaceFutureC8411o11<? extends InputT>> tn0 = this.h1;
        if (tn0 != null) {
            String valueOf = String.valueOf(tn0);
            StringBuilder sb = new StringBuilder(valueOf.length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.y();
    }
}
