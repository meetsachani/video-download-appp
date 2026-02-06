package o;

import o.AbstractC10605x02;

/* renamed from: o.pj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8823pj extends AbstractC10605x02 {
    public final Nt2 a;
    public final String b;
    public final AbstractC2434Ae0<?> c;
    public final InterfaceC3385Js2<?, byte[]> d;
    public final C3123Hc0 e;

    /* renamed from: o.pj$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC10605x02.a {
        public Nt2 a;
        public String b;
        public AbstractC2434Ae0<?> c;
        public InterfaceC3385Js2<?, byte[]> d;
        public C3123Hc0 e;

        @Override // o.AbstractC10605x02.a
        public AbstractC10605x02 a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C8823pj(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC10605x02.a
        public AbstractC10605x02.a b(C3123Hc0 c3123Hc0) {
            if (c3123Hc0 != null) {
                this.e = c3123Hc0;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // o.AbstractC10605x02.a
        public AbstractC10605x02.a c(AbstractC2434Ae0<?> abstractC2434Ae0) {
            if (abstractC2434Ae0 != null) {
                this.c = abstractC2434Ae0;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // o.AbstractC10605x02.a
        public AbstractC10605x02.a e(InterfaceC3385Js2<?, byte[]> interfaceC3385Js2) {
            if (interfaceC3385Js2 != null) {
                this.d = interfaceC3385Js2;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // o.AbstractC10605x02.a
        public AbstractC10605x02.a f(Nt2 nt2) {
            if (nt2 != null) {
                this.a = nt2;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // o.AbstractC10605x02.a
        public AbstractC10605x02.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // o.AbstractC10605x02
    public C3123Hc0 b() {
        return this.e;
    }

    @Override // o.AbstractC10605x02
    public AbstractC2434Ae0<?> c() {
        return this.c;
    }

    @Override // o.AbstractC10605x02
    public InterfaceC3385Js2<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10605x02) {
            AbstractC10605x02 abstractC10605x02 = (AbstractC10605x02) obj;
            if (this.a.equals(abstractC10605x02.f()) && this.b.equals(abstractC10605x02.g()) && this.c.equals(abstractC10605x02.c()) && this.d.equals(abstractC10605x02.e()) && this.e.equals(abstractC10605x02.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC10605x02
    public Nt2 f() {
        return this.a;
    }

    @Override // o.AbstractC10605x02
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }

    public C8823pj(Nt2 nt2, String str, AbstractC2434Ae0<?> abstractC2434Ae0, InterfaceC3385Js2<?, byte[]> interfaceC3385Js2, C3123Hc0 c3123Hc0) {
        this.a = nt2;
        this.b = str;
        this.c = abstractC2434Ae0;
        this.d = interfaceC3385Js2;
        this.e = c3123Hc0;
    }
}
