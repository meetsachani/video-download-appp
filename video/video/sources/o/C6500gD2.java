package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C6500gD2;
import o.T12;

/* renamed from: o.gD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6500gD2 {
    public static final String c = "UseCaseAttachState";
    public final String a;
    public final Map<String, b> b = new LinkedHashMap();

    /* renamed from: o.gD2$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar);
    }

    /* renamed from: o.gD2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final T12 a;
        public final InterfaceC6743hD2<?> b;
        public boolean c = false;
        public boolean d = false;

        public b(T12 t12, InterfaceC6743hD2<?> interfaceC6743hD2) {
            this.a = t12;
            this.b = interfaceC6743hD2;
        }

        public boolean a() {
            return this.d;
        }

        public boolean b() {
            return this.c;
        }

        public T12 c() {
            return this.a;
        }

        public InterfaceC6743hD2<?> d() {
            return this.b;
        }

        public void e(boolean z) {
            this.d = z;
        }

        public void f(boolean z) {
            this.c = z;
        }
    }

    public C6500gD2(String str) {
        this.a = str;
    }

    public static /* synthetic */ boolean c(b bVar) {
        if (bVar.a() && bVar.b()) {
            return true;
        }
        return false;
    }

    public T12.g d() {
        T12.g gVar = new T12.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                gVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        C7433k41.a(c, "Active and attached use case: " + arrayList + " for camera: " + this.a);
        return gVar;
    }

    public Collection<T12> e() {
        return Collections.unmodifiableCollection(j(new a() { // from class: o.fD2
            @Override // o.C6500gD2.a
            public final boolean a(C6500gD2.b bVar) {
                return C6500gD2.c(bVar);
            }
        }));
    }

    public T12.g f() {
        T12.g gVar = new T12.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                gVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        C7433k41.a(c, "All use case: " + arrayList + " for camera: " + this.a);
        return gVar;
    }

    public Collection<T12> g() {
        return Collections.unmodifiableCollection(j(new a() { // from class: o.dD2
            @Override // o.C6500gD2.a
            public final boolean a(C6500gD2.b bVar) {
                boolean b2;
                b2 = bVar.b();
                return b2;
            }
        }));
    }

    public Collection<InterfaceC6743hD2<?>> h() {
        return Collections.unmodifiableCollection(k(new a() { // from class: o.eD2
            @Override // o.C6500gD2.a
            public final boolean a(C6500gD2.b bVar) {
                boolean b2;
                b2 = bVar.b();
                return b2;
            }
        }));
    }

    public final b i(String str, T12 t12, InterfaceC6743hD2<?> interfaceC6743hD2) {
        b bVar = this.b.get(str);
        if (bVar == null) {
            b bVar2 = new b(t12, interfaceC6743hD2);
            this.b.put(str, bVar2);
            return bVar2;
        }
        return bVar;
    }

    public final Collection<T12> j(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().c());
            }
        }
        return arrayList;
    }

    public final Collection<InterfaceC6743hD2<?>> k(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().d());
            }
        }
        return arrayList;
    }

    public boolean l(String str) {
        if (!this.b.containsKey(str)) {
            return false;
        }
        return this.b.get(str).b();
    }

    public void m(String str) {
        this.b.remove(str);
    }

    public void n(String str, T12 t12, InterfaceC6743hD2<?> interfaceC6743hD2) {
        i(str, t12, interfaceC6743hD2).e(true);
    }

    public void o(String str, T12 t12, InterfaceC6743hD2<?> interfaceC6743hD2) {
        i(str, t12, interfaceC6743hD2).f(true);
    }

    public void p(String str) {
        if (this.b.containsKey(str)) {
            b bVar = this.b.get(str);
            bVar.f(false);
            if (!bVar.a()) {
                this.b.remove(str);
            }
        }
    }

    public void q(String str) {
        if (this.b.containsKey(str)) {
            b bVar = this.b.get(str);
            bVar.e(false);
            if (!bVar.b()) {
                this.b.remove(str);
            }
        }
    }

    public void r(String str, T12 t12, InterfaceC6743hD2<?> interfaceC6743hD2) {
        if (!this.b.containsKey(str)) {
            return;
        }
        b bVar = new b(t12, interfaceC6743hD2);
        b bVar2 = this.b.get(str);
        bVar.f(bVar2.b());
        bVar.e(bVar2.a());
        this.b.put(str, bVar);
    }
}
