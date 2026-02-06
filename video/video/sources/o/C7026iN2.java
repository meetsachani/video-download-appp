package o;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o.TM2;

/* renamed from: o.iN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7026iN2 {
    public final List<UUID> a;
    public final List<String> b;
    public final List<String> c;
    public final List<TM2.a> d;

    /* renamed from: o.iN2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public List<UUID> a = new ArrayList();
        public List<String> b = new ArrayList();
        public List<String> c = new ArrayList();
        public List<TM2.a> d = new ArrayList();

        public static a f(List<UUID> ids) {
            a aVar = new a();
            aVar.a(ids);
            return aVar;
        }

        public static a g(List<TM2.a> states) {
            a aVar = new a();
            aVar.b(states);
            return aVar;
        }

        public static a h(List<String> tags) {
            a aVar = new a();
            aVar.c(tags);
            return aVar;
        }

        public static a i(List<String> uniqueWorkNames) {
            a aVar = new a();
            aVar.d(uniqueWorkNames);
            return aVar;
        }

        public a a(List<UUID> ids) {
            this.a.addAll(ids);
            return this;
        }

        public a b(List<TM2.a> states) {
            this.d.addAll(states);
            return this;
        }

        public a c(List<String> tags) {
            this.c.addAll(tags);
            return this;
        }

        public a d(List<String> uniqueWorkNames) {
            this.b.addAll(uniqueWorkNames);
            return this;
        }

        public C7026iN2 e() {
            if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new C7026iN2(this);
        }
    }

    public C7026iN2(a builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public List<UUID> a() {
        return this.a;
    }

    public List<TM2.a> b() {
        return this.d;
    }

    public List<String> c() {
        return this.c;
    }

    public List<String> d() {
        return this.b;
    }
}
