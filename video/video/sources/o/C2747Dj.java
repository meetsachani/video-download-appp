package o;

import java.util.Arrays;
import o.HT1;
import o.Nt2;

/* renamed from: o.Dj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2747Dj extends Nt2 {
    public final String a;
    public final byte[] b;
    public final EnumC10429wH1 c;

    /* renamed from: o.Dj$b */
    /* loaded from: classes2.dex */
    public static final class b extends Nt2.a {
        public String a;
        public byte[] b;
        public EnumC10429wH1 c;

        @Override // o.Nt2.a
        public Nt2 a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C2747Dj(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.Nt2.a
        public Nt2.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // o.Nt2.a
        public Nt2.a c(@InterfaceC11300zs1 byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // o.Nt2.a
        public Nt2.a d(EnumC10429wH1 enumC10429wH1) {
            if (enumC10429wH1 != null) {
                this.c = enumC10429wH1;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // o.Nt2
    public String b() {
        return this.a;
    }

    @Override // o.Nt2
    @InterfaceC11300zs1
    public byte[] c() {
        return this.b;
    }

    @Override // o.Nt2
    @HT1({HT1.a.Y})
    public EnumC10429wH1 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        byte[] c;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Nt2) {
            Nt2 nt2 = (Nt2) obj;
            if (this.a.equals(nt2.b())) {
                byte[] bArr = this.b;
                if (nt2 instanceof C2747Dj) {
                    c = ((C2747Dj) nt2).b;
                } else {
                    c = nt2.c();
                }
                if (Arrays.equals(bArr, c) && this.c.equals(nt2.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public C2747Dj(String str, @InterfaceC11300zs1 byte[] bArr, EnumC10429wH1 enumC10429wH1) {
        this.a = str;
        this.b = bArr;
        this.c = enumC10429wH1;
    }
}
