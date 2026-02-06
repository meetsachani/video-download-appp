package o;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: o.Kf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3428Kf<D> extends Q11<D> {
    public static final String p = "AsyncTaskLoader";
    public static final boolean q = false;
    public final Executor j;
    public volatile AbstractC3428Kf<D>.a k;
    public volatile AbstractC3428Kf<D>.a l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public Handler f520o;

    /* renamed from: o.Kf$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractC10293vk1<Void, Void, D> implements Runnable {
        public final CountDownLatch l1 = new CountDownLatch(1);
        public boolean m1;

        public a() {
        }

        @Override // o.AbstractC10293vk1
        public void m(D d) {
            try {
                AbstractC3428Kf.this.E(this, d);
            } finally {
                this.l1.countDown();
            }
        }

        @Override // o.AbstractC10293vk1
        public void n(D d) {
            try {
                AbstractC3428Kf.this.F(this, d);
            } finally {
                this.l1.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.m1 = false;
            AbstractC3428Kf.this.G();
        }

        @Override // o.AbstractC10293vk1
        /* renamed from: u */
        public D b(Void... voidArr) {
            try {
                return (D) AbstractC3428Kf.this.K();
            } catch (C3590Lv1 e) {
                if (k()) {
                    return null;
                }
                throw e;
            }
        }

        public void v() {
            try {
                this.l1.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public AbstractC3428Kf(Context context) {
        this(context, AbstractC10293vk1.g1);
    }

    public void E(AbstractC3428Kf<D>.a aVar, D d) {
        J(d);
        if (this.l == aVar) {
            x();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            e();
            G();
        }
    }

    public void F(AbstractC3428Kf<D>.a aVar, D d) {
        if (this.k != aVar) {
            E(aVar, d);
        } else if (k()) {
            J(d);
        } else {
            c();
            this.n = SystemClock.uptimeMillis();
            this.k = null;
            f(d);
        }
    }

    public void G() {
        if (this.l == null && this.k != null) {
            if (this.k.m1) {
                this.k.m1 = false;
                this.f520o.removeCallbacks(this.k);
            }
            if (this.m > 0 && SystemClock.uptimeMillis() < this.n + this.m) {
                this.k.m1 = true;
                this.f520o.postAtTime(this.k, this.n + this.m);
                return;
            }
            this.k.e(this.j, null);
        }
    }

    public boolean H() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    public abstract D I();

    public D K() {
        return I();
    }

    public void L(long j) {
        this.m = j;
        if (j != 0) {
            this.f520o = new Handler();
        }
    }

    public void M() {
        AbstractC3428Kf<D>.a aVar = this.k;
        if (aVar != null) {
            aVar.v();
        }
    }

    @Override // o.Q11
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.m1);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.l);
            printWriter.print(" waiting=");
            printWriter.println(this.l.m1);
        }
        if (this.m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C5178ap2.c(this.m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C5178ap2.b(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // o.Q11
    public boolean o() {
        if (this.k == null) {
            return false;
        }
        if (!this.e) {
            this.h = true;
        }
        if (this.l != null) {
            if (this.k.m1) {
                this.k.m1 = false;
                this.f520o.removeCallbacks(this.k);
            }
            this.k = null;
            return false;
        } else if (this.k.m1) {
            this.k.m1 = false;
            this.f520o.removeCallbacks(this.k);
            this.k = null;
            return false;
        } else {
            boolean a2 = this.k.a(false);
            if (a2) {
                this.l = this.k;
                D();
            }
            this.k = null;
            return a2;
        }
    }

    @Override // o.Q11
    public void q() {
        super.q();
        b();
        this.k = new a();
        G();
    }

    public AbstractC3428Kf(Context context, Executor executor) {
        super(context);
        this.n = -10000L;
        this.j = executor;
    }

    public void D() {
    }

    public void J(D d) {
    }
}
