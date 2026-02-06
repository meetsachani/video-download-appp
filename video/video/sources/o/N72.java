package o;

import java.util.ArrayDeque;
import o.AbstractC9510sW;
import o.C9018qW;
import o.C9267rW;

@Deprecated
/* loaded from: classes2.dex */
public abstract class N72<I extends C9267rW, O extends AbstractC9510sW, E extends C9018qW> implements InterfaceC8288nW<I, O, E> {
    public final Thread a;
    public final Object b = new Object();
    public final ArrayDeque<I> c = new ArrayDeque<>();
    public final ArrayDeque<O> d = new ArrayDeque<>();
    public final I[] e;
    public final O[] f;
    public int g;
    public int h;
    @InterfaceC11300zs1
    public I i;
    @InterfaceC11300zs1
    public E j;
    public boolean k;
    public boolean l;
    public int m;

    /* loaded from: classes2.dex */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            N72.this.u();
        }
    }

    public N72(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = h();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = i();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.a = aVar;
        aVar.start();
    }

    public final boolean f() {
        if (!this.c.isEmpty() && this.h > 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8288nW
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                I i = this.i;
                if (i != null) {
                    r(i);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    r(this.c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    this.d.removeFirst().v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC8288nW
    @InterfaceC2591Bt
    public void g() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public abstract I h();

    public abstract O i();

    public abstract E j(Throwable th);

    @InterfaceC11300zs1
    public abstract E k(I i, O o2, boolean z);

    public final boolean l() throws InterruptedException {
        E j;
        synchronized (this.b) {
            while (!this.l && !f()) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            I removeFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o2 = oArr[i];
            boolean z = this.k;
            this.k = false;
            if (removeFirst.q()) {
                o2.j(4);
            } else {
                if (removeFirst.p()) {
                    o2.j(Integer.MIN_VALUE);
                }
                if (removeFirst.r()) {
                    o2.j(C10323vs.Q0);
                }
                try {
                    j = k(removeFirst, o2, z);
                } catch (OutOfMemoryError e) {
                    j = j(e);
                } catch (RuntimeException e2) {
                    j = j(e2);
                }
                if (j != null) {
                    synchronized (this.b) {
                        this.j = j;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        o2.v();
                    } else if (o2.p()) {
                        this.m++;
                        o2.v();
                    } else {
                        o2.Z = this.m;
                        this.m = 0;
                        this.d.addLast(o2);
                    }
                    r(removeFirst);
                } finally {
                }
            }
            return true;
        }
    }

    @Override // o.InterfaceC8288nW
    @InterfaceC11300zs1
    /* renamed from: m */
    public final I d() throws C9018qW {
        boolean z;
        I i;
        synchronized (this.b) {
            p();
            if (this.i == null) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            int i2 = this.g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.e;
                int i3 = i2 - 1;
                this.g = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    @Override // o.InterfaceC8288nW
    @InterfaceC11300zs1
    /* renamed from: n */
    public final O b() throws C9018qW {
        synchronized (this.b) {
            try {
                p();
                if (this.d.isEmpty()) {
                    return null;
                }
                return this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (f()) {
            this.b.notify();
        }
    }

    public final void p() throws C9018qW {
        E e = this.j;
        if (e == null) {
            return;
        }
        throw e;
    }

    @Override // o.InterfaceC8288nW
    /* renamed from: q */
    public final void c(I i) throws C9018qW {
        boolean z;
        synchronized (this.b) {
            p();
            if (i == this.i) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.c.addLast(i);
            o();
            this.i = null;
        }
    }

    public final void r(I i) {
        i.l();
        I[] iArr = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = i;
    }

    @InterfaceC2591Bt
    public void s(O o2) {
        synchronized (this.b) {
            t(o2);
            o();
        }
    }

    public final void t(O o2) {
        o2.l();
        O[] oArr = this.f;
        int i = this.h;
        this.h = i + 1;
        oArr[i] = o2;
    }

    public final void u() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (l());
    }

    public final void v(int i) {
        boolean z;
        if (this.g == this.e.length) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        for (I i2 : this.e) {
            i2.w(i);
        }
    }
}
