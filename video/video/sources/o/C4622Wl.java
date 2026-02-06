package o;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import o.AbstractC2938Ff;
import o.AbstractC3232If;
import o.C4640Wp1;

/* renamed from: o.Wl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4622Wl extends AbstractC3232If {
    public final AbstractC2938Ff d;
    public final C3084Gr e;

    /* renamed from: o.Wl$a */
    /* loaded from: classes.dex */
    public class a implements AbstractC2938Ff.b {
        public final /* synthetic */ AbstractC5091aS1 a;
        public final /* synthetic */ long b;
        public final /* synthetic */ AbstractC3232If.b c;

        public a(AbstractC5091aS1 abstractC5091aS1, long j, AbstractC3232If.b bVar) {
            this.a = abstractC5091aS1;
            this.b = j;
            this.c = bVar;
        }

        @Override // o.AbstractC2938Ff.b
        public void a(C4118Rh c4118Rh) {
            this.c.a(c4118Rh);
        }

        @Override // o.AbstractC2938Ff.b
        public void b(IOException iOException) {
            C4622Wl.this.m(this.a, this.c, iOException, this.b, null, null);
        }

        @Override // o.AbstractC2938Ff.b
        public void c(CI0 ci0) {
            C4622Wl.this.n(this.a, this.b, ci0, this.c);
        }
    }

    /* renamed from: o.Wl$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final int c = 4096;
        public AbstractC2938Ff a;
        public C3084Gr b = null;

        public b(AbstractC2938Ff abstractC2938Ff) {
            this.a = abstractC2938Ff;
        }

        public C4622Wl a() {
            if (this.b == null) {
                this.b = new C3084Gr(4096);
            }
            return new C4622Wl(this.a, this.b, null);
        }

        public b b(C3084Gr c3084Gr) {
            this.b = c3084Gr;
            return this;
        }
    }

    /* renamed from: o.Wl$c */
    /* loaded from: classes.dex */
    public class c<T> extends AbstractRunnableC9255rS1<T> {
        public final AbstractC5091aS1<T> Y;
        public final AbstractC3232If.b Y0;
        public final C4640Wp1.b Z;

        public c(AbstractC5091aS1<T> abstractC5091aS1, C4640Wp1.b bVar, AbstractC3232If.b bVar2) {
            super(abstractC5091aS1);
            this.Y = abstractC5091aS1;
            this.Z = bVar;
            this.Y0 = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4640Wp1.a(this.Y, this.Z);
                C4622Wl.this.e(this.Y, this.Y0);
            } catch (C6524gJ2 e) {
                this.Y0.a(e);
            }
        }
    }

    /* renamed from: o.Wl$d */
    /* loaded from: classes.dex */
    public class d<T> extends AbstractRunnableC9255rS1<T> {
        public InputStream Y;
        public AbstractC5091aS1<T> Y0;
        public CI0 Z;
        public AbstractC3232If.b Z0;
        public long a1;
        public List<MG0> b1;
        public int c1;

        public d(InputStream inputStream, CI0 ci0, AbstractC5091aS1<T> abstractC5091aS1, AbstractC3232If.b bVar, long j, List<MG0> list, int i) {
            super(abstractC5091aS1);
            this.Y = inputStream;
            this.Z = ci0;
            this.Y0 = abstractC5091aS1;
            this.Z0 = bVar;
            this.a1 = j;
            this.b1 = list;
            this.c1 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4622Wl.this.o(this.a1, this.c1, this.Z, this.Y0, this.Z0, this.b1, C4640Wp1.c(this.Y, this.Z.c(), C4622Wl.this.e));
            } catch (IOException e) {
                C4622Wl.this.m(this.Y0, this.Z0, e, this.a1, this.Z, null);
            }
        }
    }

    public /* synthetic */ C4622Wl(AbstractC2938Ff abstractC2938Ff, C3084Gr c3084Gr, a aVar) {
        this(abstractC2938Ff, c3084Gr);
    }

    @Override // o.AbstractC3232If
    public void e(AbstractC5091aS1<?> abstractC5091aS1, AbstractC3232If.b bVar) {
        if (b() != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.d.c(abstractC5091aS1, C11161zI0.c(abstractC5091aS1.r()), new a(abstractC5091aS1, elapsedRealtime, bVar));
            return;
        }
        throw new IllegalStateException("mBlockingExecuter must be set before making a request");
    }

    @Override // o.AbstractC3232If
    public void f(ExecutorService executorService) {
        super.f(executorService);
        this.d.f(executorService);
    }

    @Override // o.AbstractC3232If
    public void g(ExecutorService executorService) {
        super.g(executorService);
        this.d.g(executorService);
    }

    public final void m(AbstractC5091aS1<?> abstractC5091aS1, AbstractC3232If.b bVar, IOException iOException, long j, CI0 ci0, byte[] bArr) {
        try {
            b().execute(new c(abstractC5091aS1, C4640Wp1.e(abstractC5091aS1, iOException, j, ci0, bArr), bVar));
        } catch (C6524gJ2 e) {
            bVar.a(e);
        }
    }

    public final void n(AbstractC5091aS1<?> abstractC5091aS1, long j, CI0 ci0, AbstractC3232If.b bVar) {
        int e = ci0.e();
        List<MG0> d2 = ci0.d();
        if (e == 304) {
            bVar.b(C4640Wp1.b(abstractC5091aS1, SystemClock.elapsedRealtime() - j, d2));
            return;
        }
        byte[] b2 = ci0.b();
        if (b2 == null && ci0.a() == null) {
            b2 = new byte[0];
        }
        byte[] bArr = b2;
        if (bArr != null) {
            o(j, e, ci0, abstractC5091aS1, bVar, d2, bArr);
            return;
        }
        b().execute(new d(ci0.a(), ci0, abstractC5091aS1, bVar, j, d2, e));
    }

    public final void o(long j, int i, CI0 ci0, AbstractC5091aS1<?> abstractC5091aS1, AbstractC3232If.b bVar, List<MG0> list, byte[] bArr) {
        C4640Wp1.d(SystemClock.elapsedRealtime() - j, abstractC5091aS1, bArr, i);
        if (i >= 200 && i <= 299) {
            bVar.b(new C3470Kp1(i, bArr, false, SystemClock.elapsedRealtime() - j, list));
        } else {
            m(abstractC5091aS1, bVar, new IOException(), j, ci0, bArr);
        }
    }

    public C4622Wl(AbstractC2938Ff abstractC2938Ff, C3084Gr c3084Gr) {
        this.d = abstractC2938Ff;
        this.e = c3084Gr;
    }
}
