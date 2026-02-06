package o;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.lV0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7782lV0 {
    public final String a;

    /* renamed from: o.lV0$a */
    /* loaded from: classes3.dex */
    public class a extends C7782lV0 {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7782lV0 c7782lV0, String str) {
            super(c7782lV0, null);
            this.b = str;
        }

        @Override // o.C7782lV0
        public C7782lV0 q() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // o.C7782lV0
        public CharSequence r(@MB Object obj) {
            if (obj == null) {
                return this.b;
            }
            return C7782lV0.this.r(obj);
        }

        @Override // o.C7782lV0
        public C7782lV0 s(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* renamed from: o.lV0$b */
    /* loaded from: classes3.dex */
    public class b extends C7782lV0 {
        public b(C7782lV0 c7782lV0) {
            super(c7782lV0, null);
        }

        @Override // o.C7782lV0
        public <A extends Appendable> A d(A a, Iterator<? extends Object> it) throws IOException {
            C10664xF1.F(a, "appendable");
            C10664xF1.F(it, "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a.append(C7782lV0.this.r(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a.append(C7782lV0.this.a);
                    a.append(C7782lV0.this.r(next2));
                }
            }
            return a;
        }

        @Override // o.C7782lV0
        public C7782lV0 s(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // o.C7782lV0
        public d u(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* renamed from: o.lV0$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractList<Object> {
        public final /* synthetic */ Object[] X;
        public final /* synthetic */ Object Y;
        public final /* synthetic */ Object Z;

        public c(Object[] objArr, Object obj, Object obj2) {
            this.X = objArr;
            this.Y = obj;
            this.Z = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        @MB
        public Object get(int i) {
            if (i != 0) {
                if (i != 1) {
                    return this.X[i - 2];
                }
                return this.Z;
            }
            return this.Y;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.length + 2;
        }
    }

    /* renamed from: o.lV0$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public final C7782lV0 a;
        public final String b;

        public /* synthetic */ d(C7782lV0 c7782lV0, String str, a aVar) {
            this(c7782lV0, str);
        }

        @InterfaceC6181ey
        @InterfaceC4238Sm
        public <A extends Appendable> A a(A a, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) b(a, iterable.iterator());
        }

        @InterfaceC6181ey
        @InterfaceC4238Sm
        public <A extends Appendable> A b(A a, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            C10664xF1.E(a);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a.append(this.a.r(next.getKey()));
                a.append(this.b);
                a.append(this.a.r(next.getValue()));
                while (it.hasNext()) {
                    a.append(this.a.a);
                    Map.Entry<?, ?> next2 = it.next();
                    a.append(this.a.r(next2.getKey()));
                    a.append(this.b);
                    a.append(this.a.r(next2.getValue()));
                }
            }
            return a;
        }

        @InterfaceC6181ey
        public <A extends Appendable> A c(A a, Map<?, ?> map) throws IOException {
            return (A) a(a, map.entrySet());
        }

        @InterfaceC6181ey
        @InterfaceC4238Sm
        public StringBuilder d(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return e(sb, iterable.iterator());
        }

        @InterfaceC6181ey
        @InterfaceC4238Sm
        public StringBuilder e(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                b(sb, it);
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @InterfaceC6181ey
        public StringBuilder f(StringBuilder sb, Map<?, ?> map) {
            return d(sb, map.entrySet());
        }

        @InterfaceC4238Sm
        public String g(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return h(iterable.iterator());
        }

        @InterfaceC4238Sm
        public String h(Iterator<? extends Map.Entry<?, ?>> it) {
            return e(new StringBuilder(), it).toString();
        }

        public String i(Map<?, ?> map) {
            return g(map.entrySet());
        }

        public d j(String str) {
            return new d(this.a.s(str), this.b);
        }

        public d(C7782lV0 c7782lV0, String str) {
            this.a = c7782lV0;
            this.b = (String) C10664xF1.E(str);
        }
    }

    public /* synthetic */ C7782lV0(C7782lV0 c7782lV0, a aVar) {
        this(c7782lV0);
    }

    public static Iterable<Object> j(@MB Object obj, @MB Object obj2, Object[] objArr) {
        C10664xF1.E(objArr);
        return new c(objArr, obj, obj2);
    }

    public static C7782lV0 o(char c2) {
        return new C7782lV0(String.valueOf(c2));
    }

    public static C7782lV0 p(String str) {
        return new C7782lV0(str);
    }

    @InterfaceC6181ey
    public <A extends Appendable> A b(A a2, Iterable<? extends Object> iterable) throws IOException {
        return (A) d(a2, iterable.iterator());
    }

    @InterfaceC6181ey
    public final <A extends Appendable> A c(A a2, @MB Object obj, @MB Object obj2, Object... objArr) throws IOException {
        return (A) b(a2, j(obj, obj2, objArr));
    }

    @InterfaceC6181ey
    public <A extends Appendable> A d(A a2, Iterator<? extends Object> it) throws IOException {
        C10664xF1.E(a2);
        if (it.hasNext()) {
            a2.append(r(it.next()));
            while (it.hasNext()) {
                a2.append(this.a);
                a2.append(r(it.next()));
            }
        }
        return a2;
    }

    @InterfaceC6181ey
    public final <A extends Appendable> A e(A a2, Object[] objArr) throws IOException {
        return (A) b(a2, Arrays.asList(objArr));
    }

    @InterfaceC6181ey
    public final StringBuilder f(StringBuilder sb, Iterable<? extends Object> iterable) {
        return h(sb, iterable.iterator());
    }

    @InterfaceC6181ey
    public final StringBuilder g(StringBuilder sb, @MB Object obj, @MB Object obj2, Object... objArr) {
        return f(sb, j(obj, obj2, objArr));
    }

    @InterfaceC6181ey
    public final StringBuilder h(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            d(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @InterfaceC6181ey
    public final StringBuilder i(StringBuilder sb, Object[] objArr) {
        return f(sb, Arrays.asList(objArr));
    }

    public final String k(Iterable<? extends Object> iterable) {
        return m(iterable.iterator());
    }

    public final String l(@MB Object obj, @MB Object obj2, Object... objArr) {
        return k(j(obj, obj2, objArr));
    }

    public final String m(Iterator<? extends Object> it) {
        return h(new StringBuilder(), it).toString();
    }

    public final String n(Object[] objArr) {
        return k(Arrays.asList(objArr));
    }

    public C7782lV0 q() {
        return new b(this);
    }

    public CharSequence r(@MB Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public C7782lV0 s(String str) {
        C10664xF1.E(str);
        return new a(this, str);
    }

    public d t(char c2) {
        return u(String.valueOf(c2));
    }

    public d u(String str) {
        return new d(this, str, null);
    }

    public C7782lV0(String str) {
        this.a = (String) C10664xF1.E(str);
    }

    public C7782lV0(C7782lV0 c7782lV0) {
        this.a = c7782lV0.a;
    }
}
