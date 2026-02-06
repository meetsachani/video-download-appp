package o;

import o.AbstractC9451sG2;
import o.InterfaceC2426Ac0;

/* renamed from: o.Gj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3052Gj extends AbstractC9451sG2 {
    public final String a;
    public final int b;
    public final InterfaceC2426Ac0.c c;

    /* renamed from: o.Gj$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC9451sG2.a {
        public String a;
        public Integer b;
        public InterfaceC2426Ac0.c c;

        @Override // o.AbstractC9451sG2.a, o.AbstractC3934Pj1.a
        /* renamed from: d */
        public AbstractC9451sG2 a() {
            String str = "";
            if (this.a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C3052Gj(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC9451sG2.a
        public AbstractC9451sG2.a e(InterfaceC2426Ac0.c cVar) {
            this.c = cVar;
            return this;
        }

        @Override // o.AbstractC3934Pj1.a
        /* renamed from: f */
        public AbstractC9451sG2.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // o.AbstractC3934Pj1.a
        /* renamed from: g */
        public AbstractC9451sG2.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    @Override // o.AbstractC3934Pj1
    public String a() {
        return this.a;
    }

    @Override // o.AbstractC3934Pj1
    public int b() {
        return this.b;
    }

    @Override // o.AbstractC9451sG2
    public InterfaceC2426Ac0.c d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        InterfaceC2426Ac0.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9451sG2) {
            AbstractC9451sG2 abstractC9451sG2 = (AbstractC9451sG2) obj;
            if (this.a.equals(abstractC9451sG2.a()) && this.b == abstractC9451sG2.b() && ((cVar = this.c) != null ? cVar.equals(abstractC9451sG2.d()) : abstractC9451sG2.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        InterfaceC2426Ac0.c cVar = this.c;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }

    public C3052Gj(String str, int i, InterfaceC2426Ac0.c cVar) {
        this.a = str;
        this.b = i;
        this.c = cVar;
    }
}
