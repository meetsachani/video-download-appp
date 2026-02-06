package o;

import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC10668xG1;
import o.TD0;

/* renamed from: o.Fn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2972Fn1 extends AbstractC10668xG1 {
    public final Map<AbstractC10668xG1.a<?>, Object> a;
    public final AtomicBoolean b;

    /* renamed from: o.Fn1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<Map.Entry<AbstractC10668xG1.a<?>, Object>, CharSequence> {
        public static final a X = new a();

        public a() {
            super(1);
        }

        @Override // o.HA0
        /* renamed from: c */
        public final CharSequence invoke(Map.Entry<AbstractC10668xG1.a<?>, Object> entry) {
            C6562gT0.p(entry, DefaultsXmlParser.a);
            return TD0.a.Y0 + entry.getKey().a() + " = " + entry.getValue();
        }
    }

    public C2972Fn1() {
        this(null, false, 3, null);
    }

    @Override // o.AbstractC10668xG1
    public Map<AbstractC10668xG1.a<?>, Object> a() {
        Map<AbstractC10668xG1.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.a);
        C6562gT0.o(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // o.AbstractC10668xG1
    public <T> boolean b(AbstractC10668xG1.a<T> aVar) {
        C6562gT0.p(aVar, "key");
        return this.a.containsKey(aVar);
    }

    @Override // o.AbstractC10668xG1
    public <T> T c(AbstractC10668xG1.a<T> aVar) {
        C6562gT0.p(aVar, "key");
        return (T) this.a.get(aVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2972Fn1) {
            return C6562gT0.g(this.a, ((C2972Fn1) obj).a);
        }
        return false;
    }

    public final void f() {
        if (!this.b.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public final void g() {
        f();
        this.a.clear();
    }

    public final void h() {
        this.b.set(true);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final Map<AbstractC10668xG1.a<?>, Object> i() {
        return this.a;
    }

    public final void j(AbstractC10668xG1.a<?> aVar) {
        C6562gT0.p(aVar, "key");
        f();
        n(aVar);
    }

    public final void k(AbstractC10668xG1.b<?> bVar) {
        C6562gT0.p(bVar, "pair");
        f();
        m(bVar);
    }

    public final void l(AbstractC10668xG1 abstractC10668xG1) {
        C6562gT0.p(abstractC10668xG1, "prefs");
        f();
        this.a.putAll(abstractC10668xG1.a());
    }

    public final void m(AbstractC10668xG1.b<?>... bVarArr) {
        C6562gT0.p(bVarArr, "pairs");
        f();
        for (AbstractC10668xG1.b<?> bVar : bVarArr) {
            p(bVar.a(), bVar.b());
        }
    }

    public final <T> T n(AbstractC10668xG1.a<T> aVar) {
        C6562gT0.p(aVar, "key");
        f();
        return (T) this.a.remove(aVar);
    }

    public final <T> void o(AbstractC10668xG1.a<T> aVar, T t) {
        C6562gT0.p(aVar, "key");
        p(aVar, t);
    }

    public final void p(AbstractC10668xG1.a<?> aVar, Object obj) {
        C6562gT0.p(aVar, "key");
        f();
        if (obj == null) {
            n(aVar);
        } else if (obj instanceof Set) {
            Map<AbstractC10668xG1.a<?>, Object> map = this.a;
            Set unmodifiableSet = Collections.unmodifiableSet(C10662xF.d6((Iterable) obj));
            C6562gT0.o(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.a.put(aVar, obj);
        }
    }

    public String toString() {
        return C10662xF.p3(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.X, 24, null);
    }

    public /* synthetic */ C2972Fn1(Map map, boolean z, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    public C2972Fn1(Map<AbstractC10668xG1.a<?>, Object> map, boolean z) {
        C6562gT0.p(map, "preferencesMap");
        this.a = map;
        this.b = new AtomicBoolean(z);
    }
}
