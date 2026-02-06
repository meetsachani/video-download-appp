package o;

import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

@InterfaceC7311ja0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class UB0 {

    /* loaded from: classes3.dex */
    public enum a implements TB0<byte[]> {
        INSTANCE;

        @Override // o.TB0
        /* renamed from: g */
        public void s5(byte[] bArr, InterfaceC8232nH1 interfaceC8232nH1) {
            interfaceC8232nH1.g(bArr);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements TB0<Integer> {
        INSTANCE;

        @Override // o.TB0
        /* renamed from: g */
        public void s5(Integer num, InterfaceC8232nH1 interfaceC8232nH1) {
            interfaceC8232nH1.e(num.intValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    /* loaded from: classes3.dex */
    public enum c implements TB0<Long> {
        INSTANCE;

        @Override // o.TB0
        /* renamed from: g */
        public void s5(Long l, InterfaceC8232nH1 interfaceC8232nH1) {
            interfaceC8232nH1.f(l.longValue());
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    /* loaded from: classes3.dex */
    public static class d<E> implements TB0<Iterable<? extends E>>, Serializable {
        public final TB0<E> X;

        public d(TB0<E> tb0) {
            this.X = (TB0) C10664xF1.E(tb0);
        }

        @Override // o.TB0
        /* renamed from: a */
        public void s5(Iterable<? extends E> iterable, InterfaceC8232nH1 interfaceC8232nH1) {
            for (E e : iterable) {
                this.X.s5(e, interfaceC8232nH1);
            }
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof d) {
                return this.X.equals(((d) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return d.class.hashCode() ^ this.X.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("Funnels.sequentialFunnel(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends OutputStream {
        public final InterfaceC8232nH1 X;

        public e(InterfaceC8232nH1 interfaceC8232nH1) {
            this.X = (InterfaceC8232nH1) C10664xF1.E(interfaceC8232nH1);
        }

        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Funnels.asOutputStream(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.X.i((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.X.g(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.X.k(bArr, i, i2);
        }
    }

    /* loaded from: classes3.dex */
    public static class f implements TB0<CharSequence>, Serializable {
        public final Charset X;

        /* loaded from: classes3.dex */
        public static class a implements Serializable {
            private static final long serialVersionUID = 0;
            public final String X;

            public a(Charset charset) {
                this.X = charset.name();
            }

            private Object readResolve() {
                return UB0.f(Charset.forName(this.X));
            }
        }

        public f(Charset charset) {
            this.X = (Charset) C10664xF1.E(charset);
        }

        @Override // o.TB0
        /* renamed from: a */
        public void s5(CharSequence charSequence, InterfaceC8232nH1 interfaceC8232nH1) {
            interfaceC8232nH1.m(charSequence, this.X);
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof f) {
                return this.X.equals(((f) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return f.class.hashCode() ^ this.X.hashCode();
        }

        public String toString() {
            String name = this.X.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 22);
            sb.append("Funnels.stringFunnel(");
            sb.append(name);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public Object writeReplace() {
            return new a(this.X);
        }
    }

    /* loaded from: classes3.dex */
    public enum g implements TB0<CharSequence> {
        INSTANCE;

        @Override // o.TB0
        /* renamed from: g */
        public void s5(CharSequence charSequence, InterfaceC8232nH1 interfaceC8232nH1) {
            interfaceC8232nH1.j(charSequence);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    public static OutputStream a(InterfaceC8232nH1 interfaceC8232nH1) {
        return new e(interfaceC8232nH1);
    }

    public static TB0<byte[]> b() {
        return a.INSTANCE;
    }

    public static TB0<Integer> c() {
        return b.INSTANCE;
    }

    public static TB0<Long> d() {
        return c.INSTANCE;
    }

    public static <E> TB0<Iterable<? extends E>> e(TB0<E> tb0) {
        return new d(tb0);
    }

    public static TB0<CharSequence> f(Charset charset) {
        return new f(charset);
    }

    public static TB0<CharSequence> g() {
        return g.INSTANCE;
    }
}
