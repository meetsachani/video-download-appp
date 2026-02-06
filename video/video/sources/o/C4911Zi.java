package o;

import o.AbstractC2675Cp1;

/* renamed from: o.Zi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4911Zi extends AbstractC2675Cp1 {
    public final AbstractC2675Cp1.c a;
    public final AbstractC2675Cp1.b b;

    /* renamed from: o.Zi$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC2675Cp1.a {
        public AbstractC2675Cp1.c a;
        public AbstractC2675Cp1.b b;

        @Override // o.AbstractC2675Cp1.a
        public AbstractC2675Cp1 a() {
            return new C4911Zi(this.a, this.b);
        }

        @Override // o.AbstractC2675Cp1.a
        public AbstractC2675Cp1.a b(@InterfaceC11300zs1 AbstractC2675Cp1.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // o.AbstractC2675Cp1.a
        public AbstractC2675Cp1.a c(@InterfaceC11300zs1 AbstractC2675Cp1.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // o.AbstractC2675Cp1
    @InterfaceC11300zs1
    public AbstractC2675Cp1.b b() {
        return this.b;
    }

    @Override // o.AbstractC2675Cp1
    @InterfaceC11300zs1
    public AbstractC2675Cp1.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2675Cp1) {
            AbstractC2675Cp1 abstractC2675Cp1 = (AbstractC2675Cp1) obj;
            AbstractC2675Cp1.c cVar = this.a;
            if (cVar != null ? cVar.equals(abstractC2675Cp1.c()) : abstractC2675Cp1.c() == null) {
                AbstractC2675Cp1.b bVar = this.b;
                if (bVar != null ? bVar.equals(abstractC2675Cp1.b()) : abstractC2675Cp1.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC2675Cp1.c cVar = this.a;
        int i = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AbstractC2675Cp1.b bVar = this.b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }

    public C4911Zi(@InterfaceC11300zs1 AbstractC2675Cp1.c cVar, @InterfaceC11300zs1 AbstractC2675Cp1.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
