package o;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import o.P81;
import o.Q81;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Q81 implements P81 {
    @NotNull
    public final Matcher a;
    @NotNull
    public final CharSequence b;
    @NotNull
    public final N81 c;
    @Nullable
    public List<String> d;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC8896q1<String> {
        public a() {
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return h((String) obj);
        }

        @Override // o.AbstractC8896q1, o.AbstractC7901m0
        public int e() {
            return Q81.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean h(String str) {
            return super.contains(str);
        }

        @Override // o.AbstractC8896q1, java.util.List
        /* renamed from: i */
        public String get(int i) {
            String group = Q81.this.f().group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return j((String) obj);
        }

        public /* bridge */ int j(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int k(String str) {
            return super.lastIndexOf(str);
        }

        @Override // o.AbstractC8896q1, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return k((String) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AbstractC7901m0<M81> implements O81 {
        public b() {
        }

        public static final M81 j(b bVar, int i) {
            return bVar.get(i);
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            boolean z;
            if (obj == null) {
                z = true;
            } else {
                z = obj instanceof M81;
            }
            if (!z) {
                return false;
            }
            return i((M81) obj);
        }

        @Override // o.AbstractC7901m0
        public int e() {
            return Q81.this.f().groupCount() + 1;
        }

        @Override // o.N81
        public M81 get(int i) {
            C11197zR0 j;
            j = CQ1.j(Q81.this.f(), i);
            if (j.d().intValue() >= 0) {
                String group = Q81.this.f().group(i);
                C6562gT0.o(group, "group(...)");
                return new M81(group, j);
            }
            return null;
        }

        public /* bridge */ boolean i(M81 m81) {
            return super.contains(m81);
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // o.AbstractC7901m0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<M81> iterator() {
            return C6695h12.L1(C10662xF.C1(C8222nF.I(this)), new HA0() { // from class: o.R81
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    M81 j;
                    j = Q81.b.j(Q81.b.this, ((Integer) obj).intValue());
                    return j;
                }
            }).iterator();
        }

        @Override // o.O81
        public M81 m(String str) {
            C6562gT0.p(str, "name");
            return C9195rD1.a.c(Q81.this.f(), str);
        }
    }

    public Q81(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        C6562gT0.p(matcher, "matcher");
        C6562gT0.p(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new b();
    }

    @Override // o.P81
    @NotNull
    public P81.b a() {
        return P81.a.a(this);
    }

    @Override // o.P81
    @NotNull
    public List<String> b() {
        if (this.d == null) {
            this.d = new a();
        }
        List<String> list = this.d;
        C6562gT0.m(list);
        return list;
    }

    @Override // o.P81
    @NotNull
    public C11197zR0 c() {
        C11197zR0 i;
        i = CQ1.i(f());
        return i;
    }

    @Override // o.P81
    @NotNull
    public N81 d() {
        return this.c;
    }

    public final MatchResult f() {
        return this.a;
    }

    @Override // o.P81
    @NotNull
    public String getValue() {
        String group = f().group();
        C6562gT0.o(group, "group(...)");
        return group;
    }

    @Override // o.P81
    @Nullable
    public P81 next() {
        int i;
        P81 f;
        int end = f().end();
        if (f().end() == f().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 <= this.b.length()) {
            Matcher matcher = this.a.pattern().matcher(this.b);
            C6562gT0.o(matcher, "matcher(...)");
            f = CQ1.f(matcher, i2, this.b);
            return f;
        }
        return null;
    }
}
