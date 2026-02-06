package o;

import java.util.Arrays;
import o.AbstractC10048uk;

/* renamed from: o.pi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8819pi extends AbstractC10048uk {
    public final Iterable<AbstractC3033Ge0> a;
    public final byte[] b;

    /* renamed from: o.pi$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC10048uk.a {
        public Iterable<AbstractC3033Ge0> a;
        public byte[] b;

        @Override // o.AbstractC10048uk.a
        public AbstractC10048uk a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C8819pi(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC10048uk.a
        public AbstractC10048uk.a b(Iterable<AbstractC3033Ge0> iterable) {
            if (iterable != null) {
                this.a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // o.AbstractC10048uk.a
        public AbstractC10048uk.a c(@InterfaceC11300zs1 byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // o.AbstractC10048uk
    public Iterable<AbstractC3033Ge0> c() {
        return this.a;
    }

    @Override // o.AbstractC10048uk
    @InterfaceC11300zs1
    public byte[] d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        byte[] d;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10048uk) {
            AbstractC10048uk abstractC10048uk = (AbstractC10048uk) obj;
            if (this.a.equals(abstractC10048uk.c())) {
                byte[] bArr = this.b;
                if (abstractC10048uk instanceof C8819pi) {
                    d = ((C8819pi) abstractC10048uk).b;
                } else {
                    d = abstractC10048uk.d();
                }
                if (Arrays.equals(bArr, d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    public C8819pi(Iterable<AbstractC3033Ge0> iterable, @InterfaceC11300zs1 byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
