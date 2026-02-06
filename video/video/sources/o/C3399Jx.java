package o;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import o.C3399Jx;
import o.InterfaceC2797Dw;
import o.InterfaceC7402jx;

/* renamed from: o.Jx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3399Jx implements InterfaceC2797Dw.b {
    public static final String g = "CameraStateRegistry";
    public static final int h = 1;
    public static final int i = 2;
    public final StringBuilder a = new StringBuilder();
    public final Object b;
    public int c;
    public final InterfaceC2797Dw d;
    public final Map<InterfaceC3099Gv, a> e;
    public int f;

    /* renamed from: o.Jx$a */
    /* loaded from: classes.dex */
    public static class a {
        public InterfaceC7402jx.a a;
        public final Executor b;
        public final b c;
        public final c d;

        public a(InterfaceC7402jx.a aVar, Executor executor, b bVar, c cVar) {
            this.a = aVar;
            this.b = executor;
            this.c = bVar;
            this.d = cVar;
        }

        public InterfaceC7402jx.a a() {
            return this.a;
        }

        public void b() {
            try {
                Executor executor = this.b;
                final b bVar = this.c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: o.Ix
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3399Jx.b.this.a();
                    }
                });
            } catch (RejectedExecutionException e) {
                C7433k41.d(C3399Jx.g, "Unable to notify camera to configure.", e);
            }
        }

        public void c() {
            try {
                Executor executor = this.b;
                final c cVar = this.d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: o.Hx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3399Jx.c.this.a();
                    }
                });
            } catch (RejectedExecutionException e) {
                C7433k41.d(C3399Jx.g, "Unable to notify camera to open.", e);
            }
        }

        public InterfaceC7402jx.a d(InterfaceC7402jx.a aVar) {
            InterfaceC7402jx.a aVar2 = this.a;
            this.a = aVar;
            return aVar2;
        }
    }

    /* renamed from: o.Jx$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* renamed from: o.Jx$c */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public C3399Jx(InterfaceC2797Dw interfaceC2797Dw, int i2) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = i2;
        synchronized (obj) {
            this.d = interfaceC2797Dw;
            this.f = this.c;
        }
    }

    public static boolean d(InterfaceC7402jx.a aVar) {
        if (aVar != null && aVar.g()) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC2797Dw.b
    public void a(int i2, int i3) {
        int i4;
        boolean z;
        synchronized (this.b) {
            boolean z2 = true;
            if (i3 == 2) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            this.c = i4;
            if (i2 != 2 && i3 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2 || i3 == 2) {
                z2 = false;
            }
            if (z || z2) {
                g();
            }
        }
    }

    public final a b(String str) {
        for (InterfaceC3099Gv interfaceC3099Gv : this.e.keySet()) {
            if (str.equals(((InterfaceC6918hx) interfaceC3099Gv.c()).c())) {
                return this.e.get(interfaceC3099Gv);
            }
        }
        return null;
    }

    public boolean c() {
        synchronized (this.b) {
            try {
                for (Map.Entry<InterfaceC3099Gv, a> entry : this.e.entrySet()) {
                    if (entry.getValue().a() == InterfaceC7402jx.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(InterfaceC3099Gv interfaceC3099Gv, InterfaceC7402jx.a aVar) {
        f(interfaceC3099Gv, aVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(InterfaceC3099Gv interfaceC3099Gv, InterfaceC7402jx.a aVar, boolean z) {
        InterfaceC7402jx.a l;
        a aVar2;
        synchronized (this.b) {
            try {
                int i2 = this.f;
                if (aVar == InterfaceC7402jx.a.RELEASED) {
                    l = k(interfaceC3099Gv);
                } else {
                    l = l(interfaceC3099Gv, aVar);
                }
                if (l == aVar) {
                    return;
                }
                HashMap hashMap = null;
                if (this.d.e() == 2 && aVar == InterfaceC7402jx.a.CONFIGURED) {
                    String d = this.d.d(((InterfaceC6918hx) interfaceC3099Gv.c()).c());
                    if (d != null) {
                        aVar2 = b(d);
                        if (i2 >= 1 && this.f > 0) {
                            hashMap = new HashMap();
                            for (Map.Entry<InterfaceC3099Gv, a> entry : this.e.entrySet()) {
                                if (entry.getValue().a() == InterfaceC7402jx.a.PENDING_OPEN) {
                                    hashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else if (aVar == InterfaceC7402jx.a.PENDING_OPEN && this.f > 0) {
                            hashMap = new HashMap();
                            hashMap.put(interfaceC3099Gv, this.e.get(interfaceC3099Gv));
                        }
                        if (hashMap != null && !z) {
                            hashMap.remove(interfaceC3099Gv);
                        }
                        if (hashMap != null) {
                            for (a aVar3 : hashMap.values()) {
                                aVar3.c();
                            }
                        }
                        if (aVar2 == null) {
                            aVar2.b();
                            return;
                        }
                        return;
                    }
                }
                aVar2 = null;
                if (i2 >= 1) {
                }
                if (aVar == InterfaceC7402jx.a.PENDING_OPEN) {
                    hashMap = new HashMap();
                    hashMap.put(interfaceC3099Gv, this.e.get(interfaceC3099Gv));
                }
                if (hashMap != null) {
                    hashMap.remove(interfaceC3099Gv);
                }
                if (hashMap != null) {
                }
                if (aVar2 == null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        String str;
        if (C7433k41.h(g)) {
            this.a.setLength(0);
            this.a.append("Recalculating open cameras:\n");
            this.a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.a.append("-------------------------------------------------------------------\n");
        }
        int i2 = 0;
        for (Map.Entry<InterfaceC3099Gv, a> entry : this.e.entrySet()) {
            if (C7433k41.h(g)) {
                if (entry.getValue().a() != null) {
                    str = entry.getValue().a().toString();
                } else {
                    str = "UNKNOWN";
                }
                this.a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), str));
            }
            if (d(entry.getValue().a())) {
                i2++;
            }
        }
        if (C7433k41.h(g)) {
            this.a.append("-------------------------------------------------------------------\n");
            this.a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i2), Integer.valueOf(this.c)));
            C7433k41.a(g, this.a.toString());
        }
        this.f = Math.max(this.c - i2, 0);
    }

    public void h(InterfaceC3099Gv interfaceC3099Gv, Executor executor, b bVar, c cVar) {
        synchronized (this.b) {
            C10907yF1.o(!this.e.containsKey(interfaceC3099Gv), "Camera is already registered: " + interfaceC3099Gv);
            this.e.put(interfaceC3099Gv, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(InterfaceC3099Gv interfaceC3099Gv) {
        boolean z;
        String str;
        synchronized (this.b) {
            try {
                a aVar = (a) C10907yF1.m(this.e.get(interfaceC3099Gv), "Camera must first be registered with registerCamera()");
                z = false;
                if (C7433k41.h(g)) {
                    this.a.setLength(0);
                    this.a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC3099Gv, Integer.valueOf(this.f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f > 0 || d(aVar.a())) {
                    aVar.d(InterfaceC7402jx.a.OPENING);
                    z = true;
                }
                if (C7433k41.h(g)) {
                    StringBuilder sb = this.a;
                    Locale locale = Locale.US;
                    if (z) {
                        str = "SUCCESS";
                    } else {
                        str = "FAIL";
                    }
                    sb.append(String.format(locale, " --> %s", str));
                    C7433k41.a(g, this.a.toString());
                }
                if (z) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(String str, String str2) {
        InterfaceC7402jx.a aVar;
        boolean z;
        boolean z2;
        synchronized (this.b) {
            try {
                boolean z3 = true;
                if (this.d.e() != 2) {
                    return true;
                }
                InterfaceC7402jx.a aVar2 = null;
                if (b(str) != null) {
                    aVar = b(str).a();
                } else {
                    aVar = null;
                }
                if (str2 != null && b(str2) != null) {
                    aVar2 = b(str2).a();
                }
                InterfaceC7402jx.a aVar3 = InterfaceC7402jx.a.OPEN;
                if (!aVar3.equals(aVar) && !InterfaceC7402jx.a.CONFIGURED.equals(aVar)) {
                    z = false;
                    if (!aVar3.equals(aVar2) && !InterfaceC7402jx.a.CONFIGURED.equals(aVar2)) {
                        z2 = false;
                        if (z || !z2) {
                            z3 = false;
                        }
                        return z3;
                    }
                    z2 = true;
                    if (z) {
                    }
                    z3 = false;
                    return z3;
                }
                z = true;
                if (!aVar3.equals(aVar2)) {
                    z2 = false;
                    if (z) {
                    }
                    z3 = false;
                    return z3;
                }
                z2 = true;
                if (z) {
                }
                z3 = false;
                return z3;
            } finally {
            }
        }
    }

    public final InterfaceC7402jx.a k(InterfaceC3099Gv interfaceC3099Gv) {
        a remove = this.e.remove(interfaceC3099Gv);
        if (remove != null) {
            g();
            return remove.a();
        }
        return null;
    }

    public final InterfaceC7402jx.a l(InterfaceC3099Gv interfaceC3099Gv, InterfaceC7402jx.a aVar) {
        boolean z;
        InterfaceC7402jx.a d = ((a) C10907yF1.m(this.e.get(interfaceC3099Gv), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        InterfaceC7402jx.a aVar2 = InterfaceC7402jx.a.OPENING;
        if (aVar == aVar2) {
            if (!d(aVar) && d != aVar2) {
                z = false;
            } else {
                z = true;
            }
            C10907yF1.o(z, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (d != aVar) {
            g();
        }
        return d;
    }
}
