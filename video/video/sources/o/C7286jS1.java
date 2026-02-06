package o;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o.jS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7286jS1<R> implements InterfaceFutureC6239fC0<R>, InterfaceC7529kS1<R> {
    public static final a f1 = new a();
    public final int X;
    public final int Y;
    public final a Y0;
    public final boolean Z;
    public R Z0;
    public InterfaceC5334bS1 a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public TD0 e1;

    /* renamed from: o.jS1$a */
    /* loaded from: classes.dex */
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public C7286jS1(int i, int i2) {
        this(i, i2, true, f1);
    }

    @Override // o.InterfaceC7529kS1
    public synchronized boolean a(R r, Object obj, InterfaceC2856El2<R> interfaceC2856El2, GU gu, boolean z) {
        this.c1 = true;
        this.Z0 = r;
        this.Y0.a(this);
        return false;
    }

    @Override // o.InterfaceC7529kS1
    public synchronized boolean b(TD0 td0, Object obj, InterfaceC2856El2<R> interfaceC2856El2, boolean z) {
        this.d1 = true;
        this.e1 = td0;
        this.Y0.a(this);
        return false;
    }

    public final synchronized R c(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.Z && !isDone()) {
                SD2.a();
            }
            if (!this.b1) {
                if (!this.d1) {
                    if (this.c1) {
                        return this.Z0;
                    }
                    if (l == null) {
                        this.Y0.b(this, 0L);
                    } else if (l.longValue() > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longValue = l.longValue() + currentTimeMillis;
                        while (!isDone() && currentTimeMillis < longValue) {
                            this.Y0.b(this, longValue - currentTimeMillis);
                            currentTimeMillis = System.currentTimeMillis();
                        }
                    }
                    if (!Thread.interrupted()) {
                        if (!this.d1) {
                            if (!this.b1) {
                                if (this.c1) {
                                    return this.Z0;
                                }
                                throw new TimeoutException();
                            }
                            throw new CancellationException();
                        }
                        throw new ExecutionException(this.e1);
                    }
                    throw new InterruptedException();
                }
                throw new ExecutionException(this.e1);
            }
            throw new CancellationException();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.b1 = true;
                this.Y0.a(this);
                InterfaceC5334bS1 interfaceC5334bS1 = null;
                if (z) {
                    InterfaceC5334bS1 interfaceC5334bS12 = this.a1;
                    this.a1 = null;
                    interfaceC5334bS1 = interfaceC5334bS12;
                }
                if (interfaceC5334bS1 != null) {
                    interfaceC5334bS1.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return c(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o.InterfaceC2856El2
    public void h(U82 u82) {
        u82.d(this.X, this.Y);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.b1;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.b1 && !this.c1) {
            if (!this.d1) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // o.InterfaceC2856El2
    public synchronized InterfaceC5334bS1 j() {
        return this.a1;
    }

    @Override // o.InterfaceC2856El2
    public synchronized void m(Drawable drawable) {
    }

    @Override // o.InterfaceC2856El2
    public synchronized void o(R r, InterfaceC8136mt2<? super R> interfaceC8136mt2) {
    }

    @Override // o.InterfaceC2856El2
    public synchronized void q(InterfaceC5334bS1 interfaceC5334bS1) {
        this.a1 = interfaceC5334bS1;
    }

    public String toString() {
        InterfaceC5334bS1 interfaceC5334bS1;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                interfaceC5334bS1 = null;
                if (this.b1) {
                    str = "CANCELLED";
                } else if (this.d1) {
                    str = "FAILURE";
                } else if (this.c1) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    interfaceC5334bS1 = this.a1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC5334bS1 != null) {
            return str2 + str + ", request=[" + interfaceC5334bS1 + "]]";
        }
        return str2 + str + C6566gU0.g;
    }

    public C7286jS1(int i, int i2, boolean z, a aVar) {
        this.X = i;
        this.Y = i2;
        this.Z = z;
        this.Y0 = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return c(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // o.IZ0
    public void onDestroy() {
    }

    @Override // o.IZ0
    public void onStart() {
    }

    @Override // o.IZ0
    public void onStop() {
    }

    @Override // o.InterfaceC2856El2
    public void e(U82 u82) {
    }

    @Override // o.InterfaceC2856El2
    public void i(Drawable drawable) {
    }

    @Override // o.InterfaceC2856El2
    public void k(Drawable drawable) {
    }
}
