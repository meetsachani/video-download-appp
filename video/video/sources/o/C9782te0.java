package o;

import o.InterfaceC6304fS1;

/* renamed from: o.te0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9782te0 implements InterfaceC6304fS1, InterfaceC5334bS1 {
    public final Object a;
    public final InterfaceC6304fS1 b;
    public volatile InterfaceC5334bS1 c;
    public volatile InterfaceC5334bS1 d;
    public InterfaceC6304fS1.a e;
    public InterfaceC6304fS1.a f;

    public C9782te0(Object obj, InterfaceC6304fS1 interfaceC6304fS1) {
        InterfaceC6304fS1.a aVar = InterfaceC6304fS1.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.a = obj;
        this.b = interfaceC6304fS1;
    }

    @Override // o.InterfaceC6304fS1, o.InterfaceC5334bS1
    public boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                if (!this.c.a() && !this.d.a()) {
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
        synchronized (this.a) {
            try {
                if (interfaceC5334bS1.equals(this.c)) {
                    this.e = InterfaceC6304fS1.a.SUCCESS;
                } else if (interfaceC5334bS1.equals(this.d)) {
                    this.f = InterfaceC6304fS1.a.SUCCESS;
                }
                InterfaceC6304fS1 interfaceC6304fS1 = this.b;
                if (interfaceC6304fS1 != null) {
                    interfaceC6304fS1.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC6304fS1
    public boolean c(InterfaceC5334bS1 interfaceC5334bS1) {
        boolean n;
        synchronized (this.a) {
            n = n();
        }
        return n;
    }

    @Override // o.InterfaceC5334bS1
    public void clear() {
        synchronized (this.a) {
            try {
                InterfaceC6304fS1.a aVar = InterfaceC6304fS1.a.CLEARED;
                this.e = aVar;
                this.c.clear();
                if (this.f != aVar) {
                    this.f = aVar;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC6304fS1
    public boolean d(InterfaceC5334bS1 interfaceC5334bS1) {
        boolean z;
        synchronized (this.a) {
            try {
                if (l() && interfaceC5334bS1.equals(this.c)) {
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
        synchronized (this.a) {
            try {
                InterfaceC6304fS1.a aVar = this.e;
                InterfaceC6304fS1.a aVar2 = InterfaceC6304fS1.a.CLEARED;
                if (aVar == aVar2 && this.f == aVar2) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // o.InterfaceC6304fS1
    public void f(InterfaceC5334bS1 interfaceC5334bS1) {
        synchronized (this.a) {
            try {
                if (!interfaceC5334bS1.equals(this.d)) {
                    this.e = InterfaceC6304fS1.a.FAILED;
                    InterfaceC6304fS1.a aVar = this.f;
                    InterfaceC6304fS1.a aVar2 = InterfaceC6304fS1.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f = aVar2;
                        this.d.i();
                    }
                    return;
                }
                this.f = InterfaceC6304fS1.a.FAILED;
                InterfaceC6304fS1 interfaceC6304fS1 = this.b;
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
        synchronized (this.a) {
            try {
                InterfaceC6304fS1.a aVar = this.e;
                InterfaceC6304fS1.a aVar2 = InterfaceC6304fS1.a.SUCCESS;
                if (aVar != aVar2 && this.f != aVar2) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // o.InterfaceC6304fS1
    public InterfaceC6304fS1 getRoot() {
        InterfaceC6304fS1 interfaceC6304fS1;
        synchronized (this.a) {
            try {
                InterfaceC6304fS1 interfaceC6304fS12 = this.b;
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
        if (interfaceC5334bS1 instanceof C9782te0) {
            C9782te0 c9782te0 = (C9782te0) interfaceC5334bS1;
            if (this.c.h(c9782te0.c) && this.d.h(c9782te0.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC5334bS1
    public void i() {
        synchronized (this.a) {
            try {
                InterfaceC6304fS1.a aVar = this.e;
                InterfaceC6304fS1.a aVar2 = InterfaceC6304fS1.a.RUNNING;
                if (aVar != aVar2) {
                    this.e = aVar2;
                    this.c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC5334bS1
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                InterfaceC6304fS1.a aVar = this.e;
                InterfaceC6304fS1.a aVar2 = InterfaceC6304fS1.a.RUNNING;
                if (aVar != aVar2 && this.f != aVar2) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // o.InterfaceC6304fS1
    public boolean j(InterfaceC5334bS1 interfaceC5334bS1) {
        boolean z;
        synchronized (this.a) {
            try {
                if (m() && k(interfaceC5334bS1)) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    public final boolean k(InterfaceC5334bS1 interfaceC5334bS1) {
        InterfaceC6304fS1.a aVar = this.e;
        InterfaceC6304fS1.a aVar2 = InterfaceC6304fS1.a.FAILED;
        if (aVar != aVar2) {
            return interfaceC5334bS1.equals(this.c);
        }
        if (interfaceC5334bS1.equals(this.d)) {
            InterfaceC6304fS1.a aVar3 = this.f;
            if (aVar3 == InterfaceC6304fS1.a.SUCCESS || aVar3 == aVar2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.b;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.d(this)) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.b;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.j(this)) {
            return false;
        }
        return true;
    }

    public final boolean n() {
        InterfaceC6304fS1 interfaceC6304fS1 = this.b;
        if (interfaceC6304fS1 != null && !interfaceC6304fS1.c(this)) {
            return false;
        }
        return true;
    }

    public void o(InterfaceC5334bS1 interfaceC5334bS1, InterfaceC5334bS1 interfaceC5334bS12) {
        this.c = interfaceC5334bS1;
        this.d = interfaceC5334bS12;
    }

    @Override // o.InterfaceC5334bS1
    public void pause() {
        synchronized (this.a) {
            try {
                InterfaceC6304fS1.a aVar = this.e;
                InterfaceC6304fS1.a aVar2 = InterfaceC6304fS1.a.RUNNING;
                if (aVar == aVar2) {
                    this.e = InterfaceC6304fS1.a.PAUSED;
                    this.c.pause();
                }
                if (this.f == aVar2) {
                    this.f = InterfaceC6304fS1.a.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
