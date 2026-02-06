package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8301na0
/* renamed from: o.bb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5365bb2 {
    public final SA a;
    public final boolean b;
    public final h c;
    public final int d;

    /* renamed from: o.bb2$a */
    /* loaded from: classes3.dex */
    public class a implements h {
        public final /* synthetic */ SA a;

        /* renamed from: o.bb2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0262a extends g {
            public C0262a(C5365bb2 c5365bb2, CharSequence charSequence) {
                super(c5365bb2, charSequence);
            }

            @Override // o.C5365bb2.g
            public int f(int i) {
                return i + 1;
            }

            @Override // o.C5365bb2.g
            public int g(int i) {
                return a.this.a.o(this.Z, i);
            }
        }

        public a(SA sa) {
            this.a = sa;
        }

        @Override // o.C5365bb2.h
        /* renamed from: b */
        public g a(C5365bb2 c5365bb2, CharSequence charSequence) {
            return new C0262a(c5365bb2, charSequence);
        }
    }

    /* renamed from: o.bb2$b */
    /* loaded from: classes3.dex */
    public class b implements h {
        public final /* synthetic */ String a;

        /* renamed from: o.bb2$b$a */
        /* loaded from: classes3.dex */
        public class a extends g {
            public a(C5365bb2 c5365bb2, CharSequence charSequence) {
                super(c5365bb2, charSequence);
            }

            @Override // o.C5365bb2.g
            public int f(int i) {
                return i + b.this.a.length();
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                r6 = r6 + 1;
             */
            @Override // o.C5365bb2.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int g(int i) {
                int length = b.this.a.length();
                int length2 = this.Z.length() - length;
                while (i <= length2) {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.Z.charAt(i2 + i) != b.this.a.charAt(i2)) {
                            break;
                        }
                    }
                    return i;
                }
                return -1;
            }
        }

        public b(String str) {
            this.a = str;
        }

        @Override // o.C5365bb2.h
        /* renamed from: b */
        public g a(C5365bb2 c5365bb2, CharSequence charSequence) {
            return new a(c5365bb2, charSequence);
        }
    }

    /* renamed from: o.bb2$c */
    /* loaded from: classes3.dex */
    public class c implements h {
        public final /* synthetic */ OG a;

        /* renamed from: o.bb2$c$a */
        /* loaded from: classes3.dex */
        public class a extends g {
            public final /* synthetic */ MG c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, C5365bb2 c5365bb2, CharSequence charSequence, MG mg) {
                super(c5365bb2, charSequence);
                this.c1 = mg;
            }

            @Override // o.C5365bb2.g
            public int f(int i) {
                return this.c1.a();
            }

            @Override // o.C5365bb2.g
            public int g(int i) {
                if (this.c1.c(i)) {
                    return this.c1.f();
                }
                return -1;
            }
        }

        public c(OG og) {
            this.a = og;
        }

        @Override // o.C5365bb2.h
        /* renamed from: b */
        public g a(C5365bb2 c5365bb2, CharSequence charSequence) {
            return new a(this, c5365bb2, charSequence, this.a.d(charSequence));
        }
    }

    /* renamed from: o.bb2$e */
    /* loaded from: classes3.dex */
    public class e implements Iterable<String> {
        public final /* synthetic */ CharSequence X;

        public e(CharSequence charSequence) {
            this.X = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return C5365bb2.this.p(this.X);
        }

        public String toString() {
            C7782lV0 p = C7782lV0.p(C6566gU0.h);
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder f = p.f(sb, this);
            f.append(']');
            return f.toString();
        }
    }

    @InterfaceC4238Sm
    /* renamed from: o.bb2$f */
    /* loaded from: classes3.dex */
    public static final class f {
        public static final String c = "Chunk [%s] is not a valid entry";
        public final C5365bb2 a;
        public final C5365bb2 b;

        public /* synthetic */ f(C5365bb2 c5365bb2, C5365bb2 c5365bb22, a aVar) {
            this(c5365bb2, c5365bb22);
        }

        public Map<String, String> a(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.a.n(charSequence)) {
                Iterator p = this.b.p(str);
                C10664xF1.u(p.hasNext(), c, str);
                String str2 = (String) p.next();
                C10664xF1.u(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                C10664xF1.u(p.hasNext(), c, str);
                linkedHashMap.put(str2, (String) p.next());
                C10664xF1.u(!p.hasNext(), c, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        public f(C5365bb2 c5365bb2, C5365bb2 c5365bb22) {
            this.a = c5365bb2;
            this.b = (C5365bb2) C10664xF1.E(c5365bb22);
        }
    }

    /* renamed from: o.bb2$g */
    /* loaded from: classes3.dex */
    public static abstract class g extends AbstractC6194f1<String> {
        public final SA Y0;
        public final CharSequence Z;
        public final boolean Z0;
        public int a1 = 0;
        public int b1;

        public g(C5365bb2 c5365bb2, CharSequence charSequence) {
            this.Y0 = c5365bb2.a;
            this.Z0 = c5365bb2.b;
            this.b1 = c5365bb2.d;
            this.Z = charSequence;
        }

        @Override // o.AbstractC6194f1
        @MB
        /* renamed from: e */
        public String b() {
            int g;
            int i = this.a1;
            while (true) {
                int i2 = this.a1;
                if (i2 != -1) {
                    g = g(i2);
                    if (g == -1) {
                        g = this.Z.length();
                        this.a1 = -1;
                    } else {
                        this.a1 = f(g);
                    }
                    int i3 = this.a1;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.a1 = i4;
                        if (i4 > this.Z.length()) {
                            this.a1 = -1;
                        }
                    } else {
                        while (i < g && this.Y0.B(this.Z.charAt(i))) {
                            i++;
                        }
                        while (g > i && this.Y0.B(this.Z.charAt(g - 1))) {
                            g--;
                        }
                        if (!this.Z0 || i != g) {
                            break;
                        }
                        i = this.a1;
                    }
                } else {
                    return c();
                }
            }
            int i5 = this.b1;
            if (i5 == 1) {
                g = this.Z.length();
                this.a1 = -1;
                while (g > i && this.Y0.B(this.Z.charAt(g - 1))) {
                    g--;
                }
            } else {
                this.b1 = i5 - 1;
            }
            return this.Z.subSequence(i, g).toString();
        }

        public abstract int f(int i);

        public abstract int g(int i);
    }

    /* renamed from: o.bb2$h */
    /* loaded from: classes3.dex */
    public interface h {
        Iterator<String> a(C5365bb2 c5365bb2, CharSequence charSequence);
    }

    public C5365bb2(h hVar) {
        this(hVar, false, SA.G(), Integer.MAX_VALUE);
    }

    public static C5365bb2 e(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "The length may not be less than 1");
        return new C5365bb2(new d(i));
    }

    public static C5365bb2 h(char c2) {
        return k(SA.q(c2));
    }

    public static C5365bb2 i(String str) {
        boolean z;
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return h(str.charAt(0));
        }
        return new C5365bb2(new b(str));
    }

    @InterfaceC11149zF0
    public static C5365bb2 j(Pattern pattern) {
        return l(new QU0(pattern));
    }

    public static C5365bb2 k(SA sa) {
        C10664xF1.E(sa);
        return new C5365bb2(new a(sa));
    }

    public static C5365bb2 l(OG og) {
        C10664xF1.u(!og.d("").d(), "The pattern may not match the empty string: %s", og);
        return new C5365bb2(new c(og));
    }

    @InterfaceC11149zF0
    public static C5365bb2 m(String str) {
        return l(C7226jD1.b(str));
    }

    public C5365bb2 f(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "must be greater than zero: %s", i);
        return new C5365bb2(this.c, this.b, this.a, i);
    }

    public C5365bb2 g() {
        return new C5365bb2(this.c, true, this.a, this.d);
    }

    public Iterable<String> n(CharSequence charSequence) {
        C10664xF1.E(charSequence);
        return new e(charSequence);
    }

    public List<String> o(CharSequence charSequence) {
        C10664xF1.E(charSequence);
        Iterator<String> p = p(charSequence);
        ArrayList arrayList = new ArrayList();
        while (p.hasNext()) {
            arrayList.add(p.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> p(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public C5365bb2 q() {
        return r(SA.X());
    }

    public C5365bb2 r(SA sa) {
        C10664xF1.E(sa);
        return new C5365bb2(this.c, this.b, sa, this.d);
    }

    @InterfaceC4238Sm
    public f s(char c2) {
        return u(h(c2));
    }

    @InterfaceC4238Sm
    public f t(String str) {
        return u(i(str));
    }

    @InterfaceC4238Sm
    public f u(C5365bb2 c5365bb2) {
        return new f(this, c5365bb2, null);
    }

    public C5365bb2(h hVar, boolean z, SA sa, int i) {
        this.c = hVar;
        this.b = z;
        this.a = sa;
        this.d = i;
    }

    /* renamed from: o.bb2$d */
    /* loaded from: classes3.dex */
    public class d implements h {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        @Override // o.C5365bb2.h
        /* renamed from: b */
        public g a(C5365bb2 c5365bb2, CharSequence charSequence) {
            return new a(c5365bb2, charSequence);
        }

        /* renamed from: o.bb2$d$a */
        /* loaded from: classes3.dex */
        public class a extends g {
            public a(C5365bb2 c5365bb2, CharSequence charSequence) {
                super(c5365bb2, charSequence);
            }

            @Override // o.C5365bb2.g
            public int g(int i) {
                int i2 = i + d.this.a;
                if (i2 < this.Z.length()) {
                    return i2;
                }
                return -1;
            }

            @Override // o.C5365bb2.g
            public int f(int i) {
                return i;
            }
        }
    }
}
