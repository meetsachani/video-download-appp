package o;

import android.os.CancellationSignal;

@Deprecated
/* renamed from: o.wy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10593wy {
    public boolean a;
    public a b;
    public Object c;
    public boolean d;

    /* renamed from: o.wy$a */
    /* loaded from: classes.dex */
    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.d = true;
                a aVar = this.b;
                Object obj = this.c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.c = cancellationSignal;
                    if (this.a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean c() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void d(a aVar) {
        synchronized (this) {
            try {
                f();
                if (this.b == aVar) {
                    return;
                }
                this.b = aVar;
                if (this.a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public void e() {
        if (!c()) {
            return;
        }
        throw new C3590Lv1();
    }

    public final void f() {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
