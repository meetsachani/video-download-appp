package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: o.Hl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3160Hl1 extends AbstractC10780xk<b> {
    public final Map<String, AbstractC10780xk<?>> d;

    /* renamed from: o.Hl1$b */
    /* loaded from: classes4.dex */
    public static class b {
        public final Map<String, AbstractC10780xk<?>> a;
        public final Map<String, Object> b;
        public final Map<String, C8725pJ> c;

        public final AbstractC10780xk<?> a(String str) {
            AbstractC10780xk<?> abstractC10780xk = this.a.get(str);
            if (abstractC10780xk != null) {
                return abstractC10780xk;
            }
            throw new NoSuchElementException("No child initializer with name " + str);
        }

        public C8725pJ b(String str) {
            a(str);
            return this.c.get(str);
        }

        public AbstractC10780xk<?> c(String str) {
            return a(str);
        }

        public Object d(String str) {
            a(str);
            return this.b.get(str);
        }

        public Set<String> e() {
            return Collections.unmodifiableSet(this.a.keySet());
        }

        public boolean f(String str) {
            a(str);
            return this.c.containsKey(str);
        }

        public boolean g() {
            return this.c.isEmpty();
        }

        public b(Map<String, AbstractC10780xk<?>> map, Map<String, Object> map2, Map<String, C8725pJ> map3) {
            this.a = map;
            this.b = map2;
            this.c = map3;
        }
    }

    public C3160Hl1() {
        this.d = new HashMap();
    }

    @Override // o.AbstractC10780xk
    public int f() {
        int i = 1;
        for (AbstractC10780xk<?> abstractC10780xk : this.d.values()) {
            i += abstractC10780xk.f();
        }
        return i;
    }

    public void k(String str, AbstractC10780xk<?> abstractC10780xk) {
        C11147zE2.V(str, "name", new Object[0]);
        C11147zE2.V(abstractC10780xk, "backgroundInitializer", new Object[0]);
        synchronized (this) {
            try {
                if (!h()) {
                    this.d.put(str, abstractC10780xk);
                } else {
                    throw new IllegalStateException("addInitializer() must not be called after start()!");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.AbstractC10780xk
    /* renamed from: l */
    public b g() throws Exception {
        HashMap hashMap;
        synchronized (this) {
            hashMap = new HashMap(this.d);
        }
        ExecutorService c = c();
        for (AbstractC10780xk abstractC10780xk : hashMap.values()) {
            if (abstractC10780xk.d() == null) {
                abstractC10780xk.i(c);
            }
            abstractC10780xk.j();
        }
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                hashMap2.put(entry.getKey(), ((AbstractC10780xk) entry.getValue()).get());
            } catch (C8725pJ e) {
                hashMap3.put(entry.getKey(), e);
            }
        }
        return new b(hashMap, hashMap2, hashMap3);
    }

    public C3160Hl1(ExecutorService executorService) {
        super(executorService);
        this.d = new HashMap();
    }
}
