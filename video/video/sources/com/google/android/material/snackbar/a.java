package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class a {
    public static final int e = 0;
    public static final int f = 1500;
    public static final int g = 2750;
    public static a h;
    @InterfaceC5670cr1
    public final Object a = new Object();
    @InterfaceC5670cr1
    public final Handler b = new Handler(Looper.getMainLooper(), new C0130a());
    @InterfaceC11300zs1
    public c c;
    @InterfaceC11300zs1
    public c d;

    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0130a implements Handler.Callback {
        public C0130a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@InterfaceC5670cr1 Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i);

        void show();
    }

    /* loaded from: classes3.dex */
    public static class c {
        @InterfaceC5670cr1
        public final WeakReference<b> a;
        public int b;
        public boolean c;

        public c(int i, b bVar) {
            this.a = new WeakReference<>(bVar);
            this.b = i;
        }

        public boolean a(@InterfaceC11300zs1 b bVar) {
            if (bVar != null && this.a.get() == bVar) {
                return true;
            }
            return false;
        }
    }

    public static a c() {
        if (h == null) {
            h = new a();
        }
        return h;
    }

    public final boolean a(@InterfaceC5670cr1 c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar != null) {
            this.b.removeCallbacksAndMessages(cVar);
            bVar.a(i);
            return true;
        }
        return false;
    }

    public void b(b bVar, int i) {
        synchronized (this.a) {
            try {
                if (g(bVar)) {
                    a(this.c, i);
                } else if (h(bVar)) {
                    a(this.d, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(@InterfaceC5670cr1 c cVar) {
        synchronized (this.a) {
            try {
                if (this.c != cVar) {
                    if (this.d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean g2;
        synchronized (this.a) {
            g2 = g(bVar);
        }
        return g2;
    }

    public boolean f(b bVar) {
        boolean z;
        synchronized (this.a) {
            try {
                if (!g(bVar) && !h(bVar)) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    public final boolean g(b bVar) {
        c cVar = this.c;
        if (cVar != null && cVar.a(bVar)) {
            return true;
        }
        return false;
    }

    public final boolean h(b bVar) {
        c cVar = this.d;
        if (cVar != null && cVar.a(bVar)) {
            return true;
        }
        return false;
    }

    public void i(b bVar) {
        synchronized (this.a) {
            try {
                if (g(bVar)) {
                    this.c = null;
                    if (this.d != null) {
                        o();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.a) {
            try {
                if (g(bVar)) {
                    m(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.a) {
            try {
                if (g(bVar)) {
                    c cVar = this.c;
                    if (!cVar.c) {
                        cVar.c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.a) {
            try {
                if (g(bVar)) {
                    c cVar = this.c;
                    if (cVar.c) {
                        cVar.c = false;
                        m(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(@InterfaceC5670cr1 c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = 1500;
            } else {
                i = g;
            }
        }
        this.b.removeCallbacksAndMessages(cVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    public void n(int i, b bVar) {
        synchronized (this.a) {
            try {
                if (g(bVar)) {
                    c cVar = this.c;
                    cVar.b = i;
                    this.b.removeCallbacksAndMessages(cVar);
                    m(this.c);
                    return;
                }
                if (h(bVar)) {
                    this.d.b = i;
                } else {
                    this.d = new c(i, bVar);
                }
                c cVar2 = this.c;
                if (cVar2 != null && a(cVar2, 4)) {
                    return;
                }
                this.c = null;
                o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            b bVar = cVar.a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.c = null;
            }
        }
    }
}
