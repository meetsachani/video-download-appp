package o;

import o.AbstractC3242Ih1;

/* renamed from: o.Xi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4707Xi extends AbstractC3242Ih1 {
    public final QG2 i;
    public final AbstractC3044Gh j;
    public final int k;

    /* renamed from: o.Xi$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3242Ih1.a {
        public QG2 a;
        public AbstractC3044Gh b;
        public Integer c;

        @Override // o.AbstractC3242Ih1.a
        public AbstractC3242Ih1 a() {
            String str = "";
            if (this.a == null) {
                str = " videoSpec";
            }
            if (this.b == null) {
                str = str + " audioSpec";
            }
            if (this.c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C4707Xi(this.a, this.b, this.c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC3242Ih1.a
        public AbstractC3044Gh d() {
            AbstractC3044Gh abstractC3044Gh = this.b;
            if (abstractC3044Gh != null) {
                return abstractC3044Gh;
            }
            throw new IllegalStateException("Property \"audioSpec\" has not been set");
        }

        @Override // o.AbstractC3242Ih1.a
        public QG2 e() {
            QG2 qg2 = this.a;
            if (qg2 != null) {
                return qg2;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // o.AbstractC3242Ih1.a
        public AbstractC3242Ih1.a f(AbstractC3044Gh abstractC3044Gh) {
            if (abstractC3044Gh != null) {
                this.b = abstractC3044Gh;
                return this;
            }
            throw new NullPointerException("Null audioSpec");
        }

        @Override // o.AbstractC3242Ih1.a
        public AbstractC3242Ih1.a g(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC3242Ih1.a
        public AbstractC3242Ih1.a h(QG2 qg2) {
            if (qg2 != null) {
                this.a = qg2;
                return this;
            }
            throw new NullPointerException("Null videoSpec");
        }

        public b() {
        }

        public b(AbstractC3242Ih1 abstractC3242Ih1) {
            this.a = abstractC3242Ih1.d();
            this.b = abstractC3242Ih1.b();
            this.c = Integer.valueOf(abstractC3242Ih1.c());
        }
    }

    @Override // o.AbstractC3242Ih1
    public AbstractC3044Gh b() {
        return this.j;
    }

    @Override // o.AbstractC3242Ih1
    public int c() {
        return this.k;
    }

    @Override // o.AbstractC3242Ih1
    public QG2 d() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3242Ih1) {
            AbstractC3242Ih1 abstractC3242Ih1 = (AbstractC3242Ih1) obj;
            if (this.i.equals(abstractC3242Ih1.d()) && this.j.equals(abstractC3242Ih1.b()) && this.k == abstractC3242Ih1.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.i.hashCode() ^ 1000003) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k;
    }

    @Override // o.AbstractC3242Ih1
    public AbstractC3242Ih1.a i() {
        return new b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.i + ", audioSpec=" + this.j + ", outputFormat=" + this.k + "}";
    }

    public C4707Xi(QG2 qg2, AbstractC3044Gh abstractC3044Gh, int i) {
        this.i = qg2;
        this.j = abstractC3044Gh;
        this.k = i;
    }
}
