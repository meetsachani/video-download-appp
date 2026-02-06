package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.C22;
import o.C4467Uv0;
import o.C6562gT0;
import o.C6670gv2;
import o.C7364jn1;
import o.C7378jr;
import o.C8926q81;
import o.C9516sY;
import o.C9533sc2;
import o.InterfaceC4144Rn1;
import o.InterfaceC9041qc2;
import o.InterfaceC9511sW0;

/* loaded from: classes.dex */
public final class p {
    public static final String g = "values";
    public static final String h = "keys";
    public final Map<String, Object> a;
    public final Map<String, a.c> b;
    public final Map<String, b<?>> c;
    public final Map<String, InterfaceC4144Rn1<Object>> d;
    public final a.c e;
    public static final a f = new a(null);
    public static final Class<? extends Object>[] i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final p a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new p();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    C6562gT0.o(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new p(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(p.g);
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    C6562gT0.n(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new p(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }

        public final boolean b(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : p.i) {
                C6562gT0.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public p(Map<String, ? extends Object> map) {
        C6562gT0.p(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.c() { // from class: o.JX1
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle p;
                p = androidx.lifecycle.p.p(androidx.lifecycle.p.this);
                return p;
            }
        };
        linkedHashMap.putAll(map);
    }

    @InterfaceC9511sW0
    public static final p g(Bundle bundle, Bundle bundle2) {
        return f.a(bundle, bundle2);
    }

    public static final Bundle p(p pVar) {
        C6562gT0.p(pVar, "this$0");
        for (Map.Entry entry : C8926q81.D0(pVar.b).entrySet()) {
            pVar.q((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = pVar.a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(pVar.a.get(str));
        }
        return C7378jr.b(C6670gv2.a("keys", arrayList), C6670gv2.a(g, arrayList2));
    }

    public final void e(String str) {
        C6562gT0.p(str, "key");
        this.b.remove(str);
    }

    public final boolean f(String str) {
        C6562gT0.p(str, "key");
        return this.a.containsKey(str);
    }

    public final <T> T h(String str) {
        C6562gT0.p(str, "key");
        try {
            return (T) this.a.get(str);
        } catch (ClassCastException unused) {
            n(str);
            return null;
        }
    }

    public final <T> C7364jn1<T> i(String str) {
        C6562gT0.p(str, "key");
        C7364jn1<T> k = k(str, false, null);
        C6562gT0.n(k, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return k;
    }

    public final <T> C7364jn1<T> j(String str, T t) {
        C6562gT0.p(str, "key");
        return k(str, true, t);
    }

    public final <T> C7364jn1<T> k(String str, boolean z, T t) {
        b<?> bVar;
        b<?> bVar2;
        b<?> bVar3 = this.c.get(str);
        if (bVar3 instanceof C7364jn1) {
            bVar = bVar3;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        if (this.a.containsKey(str)) {
            bVar2 = new b<>(this, str, this.a.get(str));
        } else if (z) {
            this.a.put(str, t);
            bVar2 = new b<>(this, str, t);
        } else {
            bVar2 = new b<>(this, str);
        }
        this.c.put(str, bVar2);
        return bVar2;
    }

    public final <T> InterfaceC9041qc2<T> l(String str, T t) {
        C6562gT0.p(str, "key");
        Map<String, InterfaceC4144Rn1<Object>> map = this.d;
        InterfaceC4144Rn1<Object> interfaceC4144Rn1 = map.get(str);
        if (interfaceC4144Rn1 == null) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, t);
            }
            interfaceC4144Rn1 = C9533sc2.a(this.a.get(str));
            this.d.put(str, interfaceC4144Rn1);
            map.put(str, interfaceC4144Rn1);
        }
        InterfaceC9041qc2<T> l = C4467Uv0.l(interfaceC4144Rn1);
        C6562gT0.n(l, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return l;
    }

    public final Set<String> m() {
        return C22.C(C22.C(this.a.keySet(), this.b.keySet()), this.c.keySet());
    }

    public final <T> T n(String str) {
        C6562gT0.p(str, "key");
        T t = (T) this.a.remove(str);
        b<?> remove = this.c.remove(str);
        if (remove != null) {
            remove.s();
        }
        this.d.remove(str);
        return t;
    }

    public final a.c o() {
        return this.e;
    }

    public final <T> void q(String str, T t) {
        b<?> bVar;
        C6562gT0.p(str, "key");
        if (f.b(t)) {
            b<?> bVar2 = this.c.get(str);
            if (bVar2 instanceof C7364jn1) {
                bVar = bVar2;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.r(t);
            } else {
                this.a.put(str, t);
            }
            InterfaceC4144Rn1<Object> interfaceC4144Rn1 = this.d.get(str);
            if (interfaceC4144Rn1 == null) {
                return;
            }
            interfaceC4144Rn1.setValue(t);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        C6562gT0.m(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void r(String str, a.c cVar) {
        C6562gT0.p(str, "key");
        C6562gT0.p(cVar, "provider");
        this.b.put(str, cVar);
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends C7364jn1<T> {
        public String m;
        public p n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, String str, T t) {
            super(t);
            C6562gT0.p(str, "key");
            this.m = str;
            this.n = pVar;
        }

        @Override // o.C7364jn1, androidx.lifecycle.LiveData
        public void r(T t) {
            p pVar = this.n;
            if (pVar != null) {
                pVar.a.put(this.m, t);
                InterfaceC4144Rn1 interfaceC4144Rn1 = (InterfaceC4144Rn1) pVar.d.get(this.m);
                if (interfaceC4144Rn1 != null) {
                    interfaceC4144Rn1.setValue(t);
                }
            }
            super.r(t);
        }

        public final void s() {
            this.n = null;
        }

        public b(p pVar, String str) {
            C6562gT0.p(str, "key");
            this.m = str;
            this.n = pVar;
        }
    }

    public p() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.c() { // from class: o.JX1
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle p;
                p = androidx.lifecycle.p.p(androidx.lifecycle.p.this);
                return p;
            }
        };
    }
}
