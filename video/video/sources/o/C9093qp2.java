package o;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.AbstractC10097uw0;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.qp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9093qp2<V> extends AbstractC10097uw0.a<V> {
    @MB
    public InterfaceFutureC8411o11<V> d1;
    @MB
    public ScheduledFuture<?> e1;

    /* renamed from: o.qp2$b */
    /* loaded from: classes3.dex */
    public static final class b<V> implements Runnable {
        @MB
        public C9093qp2<V> X;

        public b(C9093qp2<V> c9093qp2) {
            this.X = c9093qp2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11;
            C9093qp2<V> c9093qp2 = this.X;
            if (c9093qp2 == null || (interfaceFutureC8411o11 = c9093qp2.d1) == null) {
                return;
            }
            this.X = null;
            if (interfaceFutureC8411o11.isDone()) {
                c9093qp2.D(interfaceFutureC8411o11);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = c9093qp2.e1;
                c9093qp2.e1 = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder("Timed out".length() + 66);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(interfaceFutureC8411o11);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
                sb2.append(valueOf);
                sb2.append(": ");
                sb2.append(valueOf2);
                c9093qp2.C(new c(sb2.toString()));
            } finally {
                interfaceFutureC8411o11.cancel(true);
            }
        }
    }

    /* renamed from: o.qp2$c */
    /* loaded from: classes3.dex */
    public static final class c extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        public c(String str) {
            super(str);
        }
    }

    public C9093qp2(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        this.d1 = (InterfaceFutureC8411o11) C10664xF1.E(interfaceFutureC8411o11);
    }

    public static <V> InterfaceFutureC8411o11<V> Q(InterfaceFutureC8411o11<V> interfaceFutureC8411o11, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C9093qp2 c9093qp2 = new C9093qp2(interfaceFutureC8411o11);
        b bVar = new b(c9093qp2);
        c9093qp2.e1 = scheduledExecutorService.schedule(bVar, j, timeUnit);
        interfaceFutureC8411o11.h4(bVar, C3645Mk1.c());
        return c9093qp2;
    }

    @Override // o.Q0
    public void m() {
        x(this.d1);
        ScheduledFuture<?> scheduledFuture = this.e1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.d1 = null;
        this.e1 = null;
    }

    @Override // o.Q0
    @MB
    public String y() {
        InterfaceFutureC8411o11<V> interfaceFutureC8411o11 = this.d1;
        ScheduledFuture<?> scheduledFuture = this.e1;
        if (interfaceFutureC8411o11 != null) {
            String valueOf = String.valueOf(interfaceFutureC8411o11);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append(C6566gU0.g);
            String sb2 = sb.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    String valueOf2 = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(valueOf2.length() + 43);
                    sb3.append(valueOf2);
                    sb3.append(", remaining delay=[");
                    sb3.append(delay);
                    sb3.append(" ms]");
                    return sb3.toString();
                }
                return sb2;
            }
            return sb2;
        }
        return null;
    }
}
