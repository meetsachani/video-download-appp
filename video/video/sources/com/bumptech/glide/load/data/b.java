package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.C10175vF1;

/* loaded from: classes.dex */
public class b {
    public static final a.InterfaceC0063a<?> b = new a();
    public final Map<Class<?>, a.InterfaceC0063a<?>> a = new HashMap();

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0063a<Object> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0063a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0063a
        public com.bumptech.glide.load.data.a<Object> b(Object obj) {
            return new C0064b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0064b implements com.bumptech.glide.load.data.a<Object> {
        public final Object a;

        public C0064b(Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.a
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.a
        public Object c() {
            return this.a;
        }
    }

    public synchronized <T> com.bumptech.glide.load.data.a<T> a(T t) {
        a.InterfaceC0063a<?> interfaceC0063a;
        try {
            C10175vF1.e(t);
            interfaceC0063a = this.a.get(t.getClass());
            if (interfaceC0063a == null) {
                Iterator<a.InterfaceC0063a<?>> it = this.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a.InterfaceC0063a<?> next = it.next();
                    if (next.a().isAssignableFrom(t.getClass())) {
                        interfaceC0063a = next;
                        break;
                    }
                }
            }
            if (interfaceC0063a == null) {
                interfaceC0063a = b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (com.bumptech.glide.load.data.a<T>) interfaceC0063a.b(t);
    }

    public synchronized void b(a.InterfaceC0063a<?> interfaceC0063a) {
        this.a.put(interfaceC0063a.a(), interfaceC0063a);
    }
}
