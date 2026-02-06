package o;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.b6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5244b6 {
    public static final b h = new b(null);
    public static final String i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    public static final String j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    public static final String k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    public static final String l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    public static final String m = "ActivityResultRegistry";
    public static final int n = 65536;
    public final Map<Integer, String> a = new LinkedHashMap();
    public final Map<String, Integer> b = new LinkedHashMap();
    public final Map<String, c> c = new LinkedHashMap();
    public final List<String> d = new ArrayList();
    public final transient Map<String, a<?>> e = new LinkedHashMap();
    public final Map<String, Object> f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    /* renamed from: o.b6$a */
    /* loaded from: classes.dex */
    public static final class a<O> {
        public final H5<O> a;
        public final O5<?, O> b;

        public a(H5<O> h5, O5<?, O> o5) {
            C6562gT0.p(h5, "callback");
            C6562gT0.p(o5, "contract");
            this.a = h5;
            this.b = o5;
        }

        public final H5<O> a() {
            return this.a;
        }

        public final O5<?, O> b() {
            return this.b;
        }
    }

    /* renamed from: o.b6$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: o.b6$c */
    /* loaded from: classes.dex */
    public static final class c {
        public final androidx.lifecycle.f a;
        public final List<androidx.lifecycle.i> b;

        public c(androidx.lifecycle.f fVar) {
            C6562gT0.p(fVar, "lifecycle");
            this.a = fVar;
            this.b = new ArrayList();
        }

        public final void a(androidx.lifecycle.i iVar) {
            C6562gT0.p(iVar, "observer");
            this.a.a(iVar);
            this.b.add(iVar);
        }

        public final void b() {
            for (androidx.lifecycle.i iVar : this.b) {
                this.a.d(iVar);
            }
            this.b.clear();
        }

        public final androidx.lifecycle.f c() {
            return this.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: o.b6$d */
    /* loaded from: classes.dex */
    public static final class d<I> extends X5<I> {
        public final /* synthetic */ String b;
        public final /* synthetic */ O5<I, O> c;

        public d(String str, O5<I, O> o5) {
            this.b = str;
            this.c = o5;
        }

        @Override // o.X5
        public O5<I, ?> a() {
            return (O5<I, ?>) this.c;
        }

        @Override // o.X5
        public void c(I i, A5 a5) {
            Object obj = AbstractC5244b6.this.b.get(this.b);
            Object obj2 = this.c;
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                AbstractC5244b6.this.d.add(this.b);
                try {
                    AbstractC5244b6.this.k(intValue, this.c, i, a5);
                    return;
                } catch (Exception e) {
                    AbstractC5244b6.this.d.remove(this.b);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // o.X5
        public void d() {
            AbstractC5244b6.this.r(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: o.b6$e */
    /* loaded from: classes.dex */
    public static final class e<I> extends X5<I> {
        public final /* synthetic */ String b;
        public final /* synthetic */ O5<I, O> c;

        public e(String str, O5<I, O> o5) {
            this.b = str;
            this.c = o5;
        }

        @Override // o.X5
        public O5<I, ?> a() {
            return (O5<I, ?>) this.c;
        }

        @Override // o.X5
        public void c(I i, A5 a5) {
            Object obj = AbstractC5244b6.this.b.get(this.b);
            Object obj2 = this.c;
            if (obj != null) {
                int intValue = ((Number) obj).intValue();
                AbstractC5244b6.this.d.add(this.b);
                try {
                    AbstractC5244b6.this.k(intValue, this.c, i, a5);
                    return;
                } catch (Exception e) {
                    AbstractC5244b6.this.d.remove(this.b);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // o.X5
        public void d() {
            AbstractC5244b6.this.r(this.b);
        }
    }

    public static final Integer j() {
        return Integer.valueOf(AbstractC10696xN1.X.m(2147418112) + 65536);
    }

    public static final void p(AbstractC5244b6 abstractC5244b6, String str, H5 h5, O5 o5, KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "<unused var>");
        C6562gT0.p(aVar, "event");
        if (f.a.ON_START == aVar) {
            abstractC5244b6.e.put(str, new a<>(h5, o5));
            if (abstractC5244b6.f.containsKey(str)) {
                Object obj = abstractC5244b6.f.get(str);
                abstractC5244b6.f.remove(str);
                h5.a(obj);
            }
            G5 g5 = (G5) C6894hr.b(abstractC5244b6.g, str, G5.class);
            if (g5 != null) {
                abstractC5244b6.g.remove(str);
                h5.a(o5.c(g5.b(), g5.a()));
            }
        } else if (f.a.ON_STOP == aVar) {
            abstractC5244b6.e.remove(str);
        } else if (f.a.ON_DESTROY == aVar) {
            abstractC5244b6.r(str);
        }
    }

    public final void e(int i2, String str) {
        this.a.put(Integer.valueOf(i2), str);
        this.b.put(str, Integer.valueOf(i2));
    }

    public final boolean f(int i2, int i3, Intent intent) {
        String str = this.a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        h(str, i3, intent, this.e.get(str));
        return true;
    }

    public final <O> boolean g(int i2, O o2) {
        H5<?> h5;
        String str = this.a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.e.get(str);
        if (aVar != null) {
            h5 = aVar.a();
        } else {
            h5 = null;
        }
        if (h5 == null) {
            this.g.remove(str);
            this.f.put(str, o2);
            return true;
        }
        H5<?> a2 = aVar.a();
        C6562gT0.n(a2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (this.d.remove(str)) {
            a2.a(o2);
            return true;
        }
        return true;
    }

    public final <O> void h(String str, int i2, Intent intent, a<O> aVar) {
        H5<O> h5;
        if (aVar != null) {
            h5 = aVar.a();
        } else {
            h5 = null;
        }
        if (h5 != null && this.d.contains(str)) {
            aVar.a().a(aVar.b().c(i2, intent));
            this.d.remove(str);
            return;
        }
        this.f.remove(str);
        this.g.putParcelable(str, new G5(i2, intent));
    }

    public final int i() {
        for (Number number : U02.u(new FA0() { // from class: o.a6
            @Override // o.FA0
            public final Object invoke() {
                Integer j2;
                j2 = AbstractC5244b6.j();
                return j2;
            }
        })) {
            if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public abstract <I, O> void k(int i2, O5<I, O> o5, I i3, A5 a5);

    public final void l(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(i);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(j);
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(k);
                if (stringArrayList2 != null) {
                    this.d.addAll(stringArrayList2);
                }
                Bundle bundle2 = bundle.getBundle(l);
                if (bundle2 != null) {
                    this.g.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = stringArrayList.get(i2);
                    if (this.b.containsKey(str)) {
                        Integer remove = this.b.remove(str);
                        if (!this.g.containsKey(str)) {
                            C11313zv2.k(this.a).remove(remove);
                        }
                    }
                    Integer num = integerArrayList.get(i2);
                    C6562gT0.o(num, "get(...)");
                    int intValue = num.intValue();
                    String str2 = stringArrayList.get(i2);
                    C6562gT0.o(str2, "get(...)");
                    e(intValue, str2);
                }
            }
        }
    }

    public final void m(Bundle bundle) {
        C6562gT0.p(bundle, "outState");
        bundle.putIntegerArrayList(i, new ArrayList<>(this.b.values()));
        bundle.putStringArrayList(j, new ArrayList<>(this.b.keySet()));
        bundle.putStringArrayList(k, new ArrayList<>(this.d));
        bundle.putBundle(l, new Bundle(this.g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> X5<I> n(String str, O5<I, O> o5, H5<O> h5) {
        C6562gT0.p(str, "key");
        C6562gT0.p(o5, "contract");
        C6562gT0.p(h5, "callback");
        q(str);
        this.e.put(str, new a<>(h5, o5));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            h5.a(obj);
        }
        G5 g5 = (G5) C6894hr.b(this.g, str, G5.class);
        if (g5 != null) {
            this.g.remove(str);
            h5.a(o5.c(g5.b(), g5.a()));
        }
        return new e(str, o5);
    }

    public final <I, O> X5<I> o(final String str, KZ0 kz0, final O5<I, O> o5, final H5<O> h5) {
        C6562gT0.p(str, "key");
        C6562gT0.p(kz0, "lifecycleOwner");
        C6562gT0.p(o5, "contract");
        C6562gT0.p(h5, "callback");
        androidx.lifecycle.f b2 = kz0.b();
        if (!b2.b().g(f.b.STARTED)) {
            q(str);
            c cVar = this.c.get(str);
            if (cVar == null) {
                cVar = new c(b2);
            }
            cVar.a(new androidx.lifecycle.i() { // from class: o.Z5
                @Override // androidx.lifecycle.i
                public final void i(KZ0 kz02, f.a aVar) {
                    AbstractC5244b6.p(AbstractC5244b6.this, str, h5, o5, kz02, aVar);
                }
            });
            this.c.put(str, cVar);
            return new d(str, o5);
        }
        throw new IllegalStateException(("LifecycleOwner " + kz0 + " is attempting to register while current state is " + b2.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final void q(String str) {
        if (this.b.get(str) != null) {
            return;
        }
        e(i(), str);
    }

    public final void r(String str) {
        Integer remove;
        C6562gT0.p(str, "key");
        if (!this.d.contains(str) && (remove = this.b.remove(str)) != null) {
            this.a.remove(remove);
        }
        this.e.remove(str);
        if (this.f.containsKey(str)) {
            Log.w(m, "Dropping pending result for request " + str + ": " + this.f.get(str));
            this.f.remove(str);
        }
        if (this.g.containsKey(str)) {
            Log.w(m, "Dropping pending result for request " + str + ": " + ((G5) C6894hr.b(this.g, str, G5.class)));
            this.g.remove(str);
        }
        c cVar = this.c.get(str);
        if (cVar != null) {
            cVar.b();
            this.c.remove(str);
        }
    }
}
