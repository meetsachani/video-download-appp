package o;

import o.AbstractC4796Yg;
import o.InterfaceC2426Ac0;

/* renamed from: o.ki  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7585ki extends AbstractC4796Yg {
    public final String a;
    public final int b;
    public final InterfaceC2426Ac0.a c;

    /* renamed from: o.ki$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4796Yg.a {
        public String a;
        public Integer b;
        public InterfaceC2426Ac0.a c;

        @Override // o.AbstractC4796Yg.a, o.AbstractC3934Pj1.a
        /* renamed from: d */
        public AbstractC4796Yg a() {
            String str = "";
            if (this.a == null) {
                str = " mimeType";
            }
            if (this.b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C7585ki(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.AbstractC4796Yg.a
        public AbstractC4796Yg.a e(InterfaceC2426Ac0.a aVar) {
            this.c = aVar;
            return this;
        }

        @Override // o.AbstractC3934Pj1.a
        /* renamed from: f */
        public AbstractC4796Yg.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }

        @Override // o.AbstractC3934Pj1.a
        /* renamed from: g */
        public AbstractC4796Yg.a c(int i) {
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

    @Override // o.AbstractC4796Yg
    public InterfaceC2426Ac0.a d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        InterfaceC2426Ac0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4796Yg) {
            AbstractC4796Yg abstractC4796Yg = (AbstractC4796Yg) obj;
            if (this.a.equals(abstractC4796Yg.a()) && this.b == abstractC4796Yg.b() && ((aVar = this.c) != null ? aVar.equals(abstractC4796Yg.d()) : abstractC4796Yg.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        InterfaceC2426Ac0.a aVar = this.c;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleAudioProfile=" + this.c + "}";
    }

    public C7585ki(String str, int i, InterfaceC2426Ac0.a aVar) {
        this.a = str;
        this.b = i;
        this.c = aVar;
    }
}
