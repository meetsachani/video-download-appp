package o;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.r11  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9147r11<L> {
    public static final Logger b = Logger.getLogger(C9147r11.class.getName());
    public final List<b<L>> a = Collections.synchronizedList(new ArrayList());

    /* renamed from: o.r11$a */
    /* loaded from: classes3.dex */
    public interface a<L> {
        void a(L l);
    }

    /* renamed from: o.r11$b */
    /* loaded from: classes3.dex */
    public static final class b<L> implements Runnable {
        public final L X;
        public final Executor Y;
        @InterfaceC7980mF0("this")
        public boolean Z0;
        @InterfaceC7980mF0("this")
        public final Queue<a<L>> Z = C10445wL1.d();
        @InterfaceC7980mF0("this")
        public final Queue<Object> Y0 = C10445wL1.d();

        public b(L l, Executor executor) {
            this.X = (L) C10664xF1.E(l);
            this.Y = (Executor) C10664xF1.E(executor);
        }

        public synchronized void a(a<L> aVar, Object obj) {
            this.Z.add(aVar);
            this.Y0.add(obj);
        }

        public void b() {
            boolean z;
            synchronized (this) {
                try {
                    if (!this.Z0) {
                        z = true;
                        this.Z0 = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                try {
                    this.Y.execute(this);
                } catch (RuntimeException e) {
                    synchronized (this) {
                        this.Z0 = false;
                        Logger logger = C9147r11.b;
                        Level level = Level.SEVERE;
                        String valueOf = String.valueOf(this.X);
                        String valueOf2 = String.valueOf(this.Y);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 42 + valueOf2.length());
                        sb.append("Exception while running callbacks for ");
                        sb.append(valueOf);
                        sb.append(" on ");
                        sb.append(valueOf2);
                        logger.log(level, sb.toString(), (Throwable) e);
                        throw e;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
            r2.a(r10.X);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
            r4 = o.C9147r11.b;
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r10.X);
            r3 = java.lang.String.valueOf(r3);
            r8 = new java.lang.StringBuilder((r6.length() + 37) + r3.length());
            r8.append("Exception while executing callback: ");
            r8.append(r6);
            r8.append(o.C4500Ve2.b);
            r8.append(r3);
            r4.log(r5, r8.toString(), (java.lang.Throwable) r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z;
            Throwable th;
            while (true) {
                boolean z2 = true;
                try {
                    synchronized (this) {
                        try {
                            C10664xF1.g0(this.Z0);
                            a<L> poll = this.Z.poll();
                            Object poll2 = this.Y0.poll();
                            if (poll == null) {
                                this.Z0 = false;
                                try {
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = false;
                                    while (true) {
                                        try {
                                            break;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            z = true;
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (z2) {
                    }
                    throw th;
                }
                try {
                    break;
                    throw th;
                } catch (Throwable th6) {
                    boolean z3 = z;
                    th = th6;
                    z2 = z3;
                    if (z2) {
                        synchronized (this) {
                            this.Z0 = false;
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public void b(L l, Executor executor) {
        C10664xF1.F(l, ServiceSpecificExtraArgs.CastExtraArgs.a);
        C10664xF1.F(executor, "executor");
        this.a.add(new b<>(l, executor));
    }

    public void c() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).b();
        }
    }

    public void d(a<L> aVar) {
        f(aVar, aVar);
    }

    public void e(a<L> aVar, String str) {
        f(aVar, str);
    }

    public final void f(a<L> aVar, Object obj) {
        C10664xF1.F(aVar, "event");
        C10664xF1.F(obj, "label");
        synchronized (this.a) {
            try {
                for (b<L> bVar : this.a) {
                    bVar.a(aVar, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
