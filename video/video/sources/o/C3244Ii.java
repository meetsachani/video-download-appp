package o;

/* renamed from: o.Ii  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3244Ii<T> extends AbstractC2434Ae0<T> {
    public final Integer a;
    public final T b;
    public final EnumC10429wH1 c;
    public final BI1 d;

    public C3244Ii(@InterfaceC11300zs1 Integer num, T t, EnumC10429wH1 enumC10429wH1, @InterfaceC11300zs1 BI1 bi1) {
        this.a = num;
        if (t != null) {
            this.b = t;
            if (enumC10429wH1 != null) {
                this.c = enumC10429wH1;
                this.d = bi1;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // o.AbstractC2434Ae0
    @InterfaceC11300zs1
    public Integer a() {
        return this.a;
    }

    @Override // o.AbstractC2434Ae0
    public T b() {
        return this.b;
    }

    @Override // o.AbstractC2434Ae0
    public EnumC10429wH1 c() {
        return this.c;
    }

    @Override // o.AbstractC2434Ae0
    @InterfaceC11300zs1
    public BI1 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        BI1 bi1;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2434Ae0) {
            AbstractC2434Ae0 abstractC2434Ae0 = (AbstractC2434Ae0) obj;
            Integer num = this.a;
            if (num != null ? num.equals(abstractC2434Ae0.a()) : abstractC2434Ae0.a() == null) {
                if (this.b.equals(abstractC2434Ae0.b()) && this.c.equals(abstractC2434Ae0.c()) && ((bi1 = this.d) != null ? bi1.equals(abstractC2434Ae0.d()) : abstractC2434Ae0.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        BI1 bi1 = this.d;
        if (bi1 != null) {
            i = bi1.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + "}";
    }
}
