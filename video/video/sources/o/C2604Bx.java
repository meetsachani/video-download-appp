package o;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import o.C3679Mt;

/* renamed from: o.Bx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2604Bx {
    public static final String f = "CameraRepository";
    public final Object a = new Object();
    public final Map<String, InterfaceC7402jx> b = new LinkedHashMap();
    public final Set<InterfaceC7402jx> c = new HashSet();
    public InterfaceFutureC8411o11<Void> d;
    public C3679Mt.a<Void> e;

    public static /* synthetic */ void a(C2604Bx c2604Bx, InterfaceC7402jx interfaceC7402jx) {
        synchronized (c2604Bx.a) {
            try {
                c2604Bx.c.remove(interfaceC7402jx);
                if (c2604Bx.c.isEmpty()) {
                    C10907yF1.l(c2604Bx.e);
                    c2604Bx.e.c(null);
                    c2604Bx.e = null;
                    c2604Bx.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object b(C2604Bx c2604Bx, C3679Mt.a aVar) {
        synchronized (c2604Bx.a) {
            c2604Bx.e = aVar;
        }
        return "CameraRepository-deinit";
    }

    public InterfaceFutureC8411o11<Void> c() {
        synchronized (this.a) {
            try {
                if (this.b.isEmpty()) {
                    InterfaceFutureC8411o11<Void> interfaceFutureC8411o11 = this.d;
                    if (interfaceFutureC8411o11 == null) {
                        interfaceFutureC8411o11 = C7221jC0.h(null);
                    }
                    return interfaceFutureC8411o11;
                }
                InterfaceFutureC8411o11<Void> interfaceFutureC8411o112 = this.d;
                if (interfaceFutureC8411o112 == null) {
                    interfaceFutureC8411o112 = C3679Mt.a(new C3679Mt.c() { // from class: o.zx
                        @Override // o.C3679Mt.c
                        public final Object a(C3679Mt.a aVar) {
                            return C2604Bx.b(C2604Bx.this, aVar);
                        }
                    });
                    this.d = interfaceFutureC8411o112;
                }
                this.c.addAll(this.b.values());
                for (final InterfaceC7402jx interfaceC7402jx : this.b.values()) {
                    interfaceC7402jx.g().h4(new Runnable() { // from class: o.Ax
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2604Bx.a(C2604Bx.this, interfaceC7402jx);
                        }
                    }, C5211ay.b());
                }
                this.b.clear();
                return interfaceFutureC8411o112;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC7402jx d(String str) {
        InterfaceC7402jx interfaceC7402jx;
        synchronized (this.a) {
            try {
                interfaceC7402jx = this.b.get(str);
                if (interfaceC7402jx == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC7402jx;
    }

    public Set<String> e() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(this.b.keySet());
        }
        return linkedHashSet;
    }

    public LinkedHashSet<InterfaceC7402jx> f() {
        LinkedHashSet<InterfaceC7402jx> linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet<>(this.b.values());
        }
        return linkedHashSet;
    }

    public void g(InterfaceC5207ax interfaceC5207ax) throws FP0 {
        synchronized (this.a) {
            try {
                for (String str : interfaceC5207ax.c()) {
                    C7433k41.a(f, "Added camera: " + str);
                    this.b.put(str, interfaceC5207ax.b(str));
                }
            } catch (C3594Lx e) {
                throw new FP0(e);
            }
        }
    }
}
