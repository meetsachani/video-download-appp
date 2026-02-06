package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.kT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7533kT1 {
    public final List<String> a = new ArrayList();
    public final Map<String, List<a<?, ?>>> b = new HashMap();

    /* renamed from: o.kT1$a */
    /* loaded from: classes.dex */
    public static class a<T, R> {
        public final Class<T> a;
        public final Class<R> b;
        public final InterfaceC7290jT1<T, R> c;

        public a(Class<T> cls, Class<R> cls2, InterfaceC7290jT1<T, R> interfaceC7290jT1) {
            this.a = cls;
            this.b = cls2;
            this.c = interfaceC7290jT1;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            if (this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b)) {
                return true;
            }
            return false;
        }
    }

    public synchronized <T, R> void a(String str, InterfaceC7290jT1<T, R> interfaceC7290jT1, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, interfaceC7290jT1));
    }

    public synchronized <T, R> List<InterfaceC7290jT1<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> list;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            list = this.b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(String str, InterfaceC7290jT1<T, R> interfaceC7290jT1, Class<T> cls, Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, interfaceC7290jT1));
    }

    public synchronized void f(List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.a);
            this.a.clear();
            for (String str : list) {
                this.a.add(str);
            }
            for (String str2 : arrayList) {
                if (!list.contains(str2)) {
                    this.a.add(str2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
