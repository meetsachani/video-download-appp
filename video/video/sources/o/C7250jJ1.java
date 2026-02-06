package o;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.C6161et;
import o.C8863pt;
import o.FH1;
import o.InterfaceC8187n60;
import o.OU;

@Deprecated
/* renamed from: o.jJ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7250jJ1 implements InterfaceC8187n60 {
    public final Executor a;
    public final OU b;
    public final C6161et c;
    public final C8863pt d;
    @InterfaceC11300zs1
    public final FH1 e;
    @InterfaceC11300zs1
    public InterfaceC8187n60.a f;
    public volatile AbstractRunnableFutureC8290nW1<Void, IOException> g;
    public volatile boolean h;

    /* renamed from: o.jJ1$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableFutureC8290nW1<Void, IOException> {
        public a() {
        }

        @Override // o.AbstractRunnableFutureC8290nW1
        public void c() {
            C7250jJ1.this.d.b();
        }

        @Override // o.AbstractRunnableFutureC8290nW1
        /* renamed from: f */
        public Void d() throws IOException {
            C7250jJ1.this.d.a();
            return null;
        }
    }

    public C7250jJ1(C8322nf1 c8322nf1, C6161et.d dVar) {
        this(c8322nf1, dVar, new D6());
    }

    @Override // o.InterfaceC8187n60
    public void a(@InterfaceC11300zs1 InterfaceC8187n60.a aVar) throws IOException, InterruptedException {
        this.f = aVar;
        FH1 fh1 = this.e;
        if (fh1 != null) {
            fh1.a(-1000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.h) {
                    break;
                }
                this.g = new a();
                FH1 fh12 = this.e;
                if (fh12 != null) {
                    fh12.b(-1000);
                }
                this.a.execute(this.g);
                try {
                    this.g.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable th = (Throwable) C9542sf.g(e.getCause());
                    if (!(th instanceof FH1.a)) {
                        if (!(th instanceof IOException)) {
                            TD2.H1(th);
                        } else {
                            throw ((IOException) th);
                        }
                    }
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC8290nW1) C9542sf.g(this.g)).a();
                FH1 fh13 = this.e;
                if (fh13 != null) {
                    fh13.e(-1000);
                }
                throw th2;
            }
        }
        ((AbstractRunnableFutureC8290nW1) C9542sf.g(this.g)).a();
        FH1 fh14 = this.e;
        if (fh14 != null) {
            fh14.e(-1000);
        }
    }

    @Override // o.InterfaceC8187n60
    public void cancel() {
        this.h = true;
        AbstractRunnableFutureC8290nW1<Void, IOException> abstractRunnableFutureC8290nW1 = this.g;
        if (abstractRunnableFutureC8290nW1 != null) {
            abstractRunnableFutureC8290nW1.cancel(true);
        }
    }

    public final void d(long j, long j2, long j3) {
        float f;
        InterfaceC8187n60.a aVar = this.f;
        if (aVar == null) {
            return;
        }
        if (j != -1 && j != 0) {
            f = (((float) j2) * 100.0f) / ((float) j);
        } else {
            f = -1.0f;
        }
        aVar.a(j, j2, f);
    }

    @Override // o.InterfaceC8187n60
    public void remove() {
        this.c.y().p(this.c.z().a(this.b));
    }

    public C7250jJ1(C8322nf1 c8322nf1, C6161et.d dVar, Executor executor) {
        this.a = (Executor) C9542sf.g(executor);
        C9542sf.g(c8322nf1.Y);
        OU a2 = new OU.b().j(c8322nf1.Y.X).g(c8322nf1.Y.a1).c(4).a();
        this.b = a2;
        C6161et d = dVar.d();
        this.c = d;
        this.d = new C8863pt(d, a2, null, new C8863pt.a() { // from class: o.iJ1
            @Override // o.C8863pt.a
            public final void a(long j, long j2, long j3) {
                C7250jJ1.this.d(j, j2, j3);
            }
        });
        this.e = dVar.i();
    }
}
