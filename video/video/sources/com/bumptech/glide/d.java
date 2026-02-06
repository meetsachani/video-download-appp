package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    public final Map<Class<?>, b> a;

    /* loaded from: classes.dex */
    public static final class a {
        public final Map<Class<?>, b> a = new HashMap();

        public a b(b bVar) {
            this.a.put(bVar.getClass(), bVar);
            return this;
        }

        public d c() {
            return new d(this);
        }

        public a d(b bVar, boolean z) {
            if (z) {
                b(bVar);
                return this;
            }
            this.a.remove(bVar.getClass());
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public d(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }

    public <T extends b> T a(Class<T> cls) {
        return (T) this.a.get(cls);
    }

    public boolean b(Class<? extends b> cls) {
        return this.a.containsKey(cls);
    }
}
