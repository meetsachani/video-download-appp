package o;

import o.InterfaceC6304fS1;

/* renamed from: o.uo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10067uo2 implements InterfaceC6304fS1, InterfaceC5334bS1 {
    public final InterfaceC6304fS1 a;
    public final Object b;
    public volatile InterfaceC5334bS1 c;
    public volatile InterfaceC5334bS1 d;
    public InterfaceC6304fS1.a e;
    public InterfaceC6304fS1.a f;
    public boolean g;

    public C10067uo2(Object obj, InterfaceC6304fS1 interfaceC6304fS1) {
        InterfaceC6304fS1.a aVar = InterfaceC6304fS1.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.b = obj;
        this.a = interfaceC6304fS1;
    }

    private boolean k() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.a;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.d(this)) {
            return false;
        }
        return true;
    }

    private boolean l() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.a;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.j(this)) {
            return false;
        }
        return true;
    }

    private boolean m() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.a;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.c(this)) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC6304fS1, o.InterfaceC5334bS1
    public boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                if (!this.d.a() && !this.c.a()) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // o.InterfaceC6304fS1
    public void b(InterfaceC5334bS1 interfaceC5334bS1) {
        synchronized (this.b) {
            try {
                if (interfaceC5334bS1.equals(this.d)) {
                    this.f = InterfaceC6304fS1.a.SUCCESS;
                    return;
                }
                this.e = InterfaceC6304fS1.a.SUCCESS;
                InterfaceC6304fS1 interfaceC6304fS1 = this.a;
                if (interfaceC6304fS1 != null) {
                    interfaceC6304fS1.b(this);
                }
                if (!this.f.g()) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC6304fS1
    public boolean c(InterfaceC5334bS1 interfaceC5334bS1) {
        boolean z;
        synchronized (this.b) {
            try {
                z = (!m() || (!interfaceC5334bS1.equals(this.c) && this.e == InterfaceC6304fS1.a.SUCCESS)) ? false : false;
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // o.InterfaceC5334bS1
    public void clear() {
        synchronized (this.b) {
            this.g = false;
            InterfaceC6304fS1.a aVar = InterfaceC6304fS1.a.CLEARED;
            this.e = aVar;
            this.f = aVar;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // o.InterfaceC6304fS1
    public boolean d(InterfaceC5334bS1 interfaceC5334bS1) {
        boolean z;
        synchronized (this.b) {
            try {
                if (k() && interfaceC5334bS1.equals(this.c) && this.e != InterfaceC6304fS1.a.PAUSED) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // o.InterfaceC5334bS1
    public boolean e() {
        boolean z;
        synchronized (this.b) {
            if (this.e == InterfaceC6304fS1.a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // o.InterfaceC6304fS1
    public void f(InterfaceC5334bS1 interfaceC5334bS1) {
        synchronized (this.b) {
            try {
                if (!interfaceC5334bS1.equals(this.c)) {
                    this.f = InterfaceC6304fS1.a.FAILED;
                    return;
                }
                this.e = InterfaceC6304fS1.a.FAILED;
                InterfaceC6304fS1 interfaceC6304fS1 = this.a;
                if (interfaceC6304fS1 != null) {
                    interfaceC6304fS1.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC5334bS1
    public boolean g() {
        boolean z;
        synchronized (this.b) {
            if (this.e == InterfaceC6304fS1.a.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // o.InterfaceC6304fS1
    public InterfaceC6304fS1 getRoot() {
        InterfaceC6304fS1 interfaceC6304fS1;
        synchronized (this.b) {
            try {
                InterfaceC6304fS1 interfaceC6304fS12 = this.a;
                if (interfaceC6304fS12 != null) {
                    interfaceC6304fS1 = interfaceC6304fS12.getRoot();
                } else {
                    interfaceC6304fS1 = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC6304fS1;
    }

    @Override // o.InterfaceC5334bS1
    public boolean h(InterfaceC5334bS1 interfaceC5334bS1) {
        if (interfaceC5334bS1 instanceof C10067uo2) {
            C10067uo2 c10067uo2 = (C10067uo2) interfaceC5334bS1;
            if (this.c != null ? this.c.h(c10067uo2.c) : c10067uo2.c == null) {
                if (this.d == null) {
                    if (c10067uo2.d == null) {
                        return true;
                    }
                } else if (this.d.h(c10067uo2.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.InterfaceC5334bS1
    public void i() {
        synchronized (this.b) {
            try {
                this.g = true;
                if (this.e != InterfaceC6304fS1.a.SUCCESS) {
                    InterfaceC6304fS1.a aVar = this.f;
                    InterfaceC6304fS1.a aVar2 = InterfaceC6304fS1.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f = aVar2;
                        this.d.i();
                    }
                }
                if (this.g) {
                    InterfaceC6304fS1.a aVar3 = this.e;
                    InterfaceC6304fS1.a aVar4 = InterfaceC6304fS1.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.e = aVar4;
                        this.c.i();
                    }
                }
                this.g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC5334bS1
    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            if (this.e == InterfaceC6304fS1.a.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // o.InterfaceC6304fS1
    public boolean j(InterfaceC5334bS1 interfaceC5334bS1) {
        boolean z;
        synchronized (this.b) {
            try {
                if (l() && interfaceC5334bS1.equals(this.c) && !a()) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    public void n(InterfaceC5334bS1 interfaceC5334bS1, InterfaceC5334bS1 interfaceC5334bS12) {
        this.c = interfaceC5334bS1;
        this.d = interfaceC5334bS12;
    }

    @Override // o.InterfaceC5334bS1
    public void pause() {
        synchronized (this.b) {
            try {
                if (!this.f.g()) {
                    this.f = InterfaceC6304fS1.a.PAUSED;
                    this.d.pause();
                }
                if (!this.e.g()) {
                    this.e = InterfaceC6304fS1.a.PAUSED;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
