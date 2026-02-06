package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.kB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7459kB {

    /* renamed from: o.kB$a */
    /* loaded from: classes3.dex */
    public final class a extends AbstractC7625ks {
        public final Charset a;

        public a(Charset charset) {
            this.a = (Charset) C10664xF1.E(charset);
        }

        @Override // o.AbstractC7625ks
        public AbstractC7459kB a(Charset charset) {
            if (charset.equals(this.a)) {
                return AbstractC7459kB.this;
            }
            return super.a(charset);
        }

        @Override // o.AbstractC7625ks
        public InputStream m() throws IOException {
            return new IO1(AbstractC7459kB.this.m(), this.a, 8192);
        }

        public String toString() {
            String obj = AbstractC7459kB.this.toString();
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + valueOf.length());
            sb.append(obj);
            sb.append(".asByteSource(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.kB$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC7459kB {
        public static final C5365bb2 b = C5365bb2.m("\r\n|\n|\r");
        public final CharSequence a;

        /* renamed from: o.kB$b$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<String> {
            public Iterator<String> Z;

            public a() {
                this.Z = b.b.n(b.this.a).iterator();
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public String b() {
                if (this.Z.hasNext()) {
                    String next = this.Z.next();
                    if (this.Z.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return c();
            }
        }

        public b(CharSequence charSequence) {
            this.a = (CharSequence) C10664xF1.E(charSequence);
        }

        @Override // o.AbstractC7459kB
        public boolean i() {
            if (this.a.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC7459kB
        public long j() {
            return this.a.length();
        }

        @Override // o.AbstractC7459kB
        public AbstractC4468Uv1<Long> k() {
            return AbstractC4468Uv1.f(Long.valueOf(this.a.length()));
        }

        @Override // o.AbstractC7459kB
        public Reader m() {
            return new C5749dB(this.a);
        }

        @Override // o.AbstractC7459kB
        public String n() {
            return this.a.toString();
        }

        @Override // o.AbstractC7459kB
        @MB
        public String o() {
            Iterator<String> t = t();
            if (t.hasNext()) {
                return t.next();
            }
            return null;
        }

        @Override // o.AbstractC7459kB
        @InterfaceC9377ry1
        public <T> T p(WZ0<T> wz0) throws IOException {
            Iterator<String> t = t();
            while (t.hasNext() && wz0.a(t.next())) {
            }
            return wz0.getResult();
        }

        @Override // o.AbstractC7459kB
        public AbstractC5317bO0<String> q() {
            return AbstractC5317bO0.G(t());
        }

        public final Iterator<String> t() {
            return new a();
        }

        public String toString() {
            String k = C8077mf.k(this.a, 30, "...");
            StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 17);
            sb.append("CharSource.wrap(");
            sb.append(k);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.kB$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC7459kB {
        public final Iterable<? extends AbstractC7459kB> a;

        public c(Iterable<? extends AbstractC7459kB> iterable) {
            this.a = (Iterable) C10664xF1.E(iterable);
        }

        @Override // o.AbstractC7459kB
        public boolean i() throws IOException {
            for (AbstractC7459kB abstractC7459kB : this.a) {
                if (!abstractC7459kB.i()) {
                    return false;
                }
            }
            return true;
        }

        @Override // o.AbstractC7459kB
        public long j() throws IOException {
            long j = 0;
            for (AbstractC7459kB abstractC7459kB : this.a) {
                j += abstractC7459kB.j();
            }
            return j;
        }

        @Override // o.AbstractC7459kB
        public AbstractC4468Uv1<Long> k() {
            long j = 0;
            for (AbstractC7459kB abstractC7459kB : this.a) {
                AbstractC4468Uv1<Long> k = abstractC7459kB.k();
                if (!k.e()) {
                    return AbstractC4468Uv1.a();
                }
                j += k.d().longValue();
            }
            return AbstractC4468Uv1.f(Long.valueOf(j));
        }

        @Override // o.AbstractC7459kB
        public Reader m() throws IOException {
            return new C5893dm1(this.a.iterator());
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("CharSource.concat(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.kB$d */
    /* loaded from: classes3.dex */
    public static final class d extends e {
        public static final d c = new d();

        public d() {
            super("");
        }

        @Override // o.AbstractC7459kB.b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    /* renamed from: o.kB$e */
    /* loaded from: classes3.dex */
    public static class e extends b {
        public e(String str) {
            super(str);
        }

        @Override // o.AbstractC7459kB
        public long e(Appendable appendable) throws IOException {
            appendable.append(this.a);
            return this.a.length();
        }

        @Override // o.AbstractC7459kB
        public long f(AbstractC7216jB abstractC7216jB) throws IOException {
            C8218nE a;
            C10664xF1.E(abstractC7216jB);
            try {
                ((Writer) C8218nE.a().d(abstractC7216jB.b())).write((String) this.a);
                return this.a.length();
            } finally {
            }
        }

        @Override // o.AbstractC7459kB.b, o.AbstractC7459kB
        public Reader m() {
            return new StringReader((String) this.a);
        }
    }

    public static AbstractC7459kB b(Iterable<? extends AbstractC7459kB> iterable) {
        return new c(iterable);
    }

    public static AbstractC7459kB c(Iterator<? extends AbstractC7459kB> it) {
        return b(AbstractC5317bO0.G(it));
    }

    public static AbstractC7459kB d(AbstractC7459kB... abstractC7459kBArr) {
        return b(AbstractC5317bO0.H(abstractC7459kBArr));
    }

    public static AbstractC7459kB h() {
        return d.c;
    }

    public static AbstractC7459kB r(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return new e((String) charSequence);
        }
        return new b(charSequence);
    }

    @InterfaceC4238Sm
    public AbstractC7625ks a(Charset charset) {
        return new a(charset);
    }

    @InterfaceC6181ey
    public long e(Appendable appendable) throws IOException {
        C10664xF1.E(appendable);
        try {
            return C7963mB.b((Reader) C8218nE.a().d(m()), appendable);
        } finally {
        }
    }

    @InterfaceC6181ey
    public long f(AbstractC7216jB abstractC7216jB) throws IOException {
        C10664xF1.E(abstractC7216jB);
        C8218nE a2 = C8218nE.a();
        try {
            return C7963mB.b((Reader) a2.d(m()), (Writer) a2.d(abstractC7216jB.b()));
        } finally {
        }
    }

    public final long g(Reader reader) throws IOException {
        long j = 0;
        while (true) {
            long skip = reader.skip(Long.MAX_VALUE);
            if (skip != 0) {
                j += skip;
            } else {
                return j;
            }
        }
    }

    public boolean i() throws IOException {
        AbstractC4468Uv1<Long> k = k();
        boolean z = false;
        if (k.e()) {
            if (k.d().longValue() != 0) {
                return false;
            }
            return true;
        }
        try {
            if (((Reader) C8218nE.a().d(m())).read() == -1) {
                z = true;
            }
            return z;
        } finally {
        }
    }

    @InterfaceC4238Sm
    public long j() throws IOException {
        AbstractC4468Uv1<Long> k = k();
        if (k.e()) {
            return k.d().longValue();
        }
        try {
            return g((Reader) C8218nE.a().d(m()));
        } finally {
        }
    }

    @InterfaceC4238Sm
    public AbstractC4468Uv1<Long> k() {
        return AbstractC4468Uv1.a();
    }

    public BufferedReader l() throws IOException {
        Reader m = m();
        if (m instanceof BufferedReader) {
            return (BufferedReader) m;
        }
        return new BufferedReader(m);
    }

    public abstract Reader m() throws IOException;

    public String n() throws IOException {
        try {
            return C7963mB.k((Reader) C8218nE.a().d(m()));
        } finally {
        }
    }

    @MB
    public String o() throws IOException {
        try {
            return ((BufferedReader) C8218nE.a().d(l())).readLine();
        } finally {
        }
    }

    @InterfaceC6181ey
    @InterfaceC9377ry1
    @InterfaceC4238Sm
    public <T> T p(WZ0<T> wz0) throws IOException {
        C10664xF1.E(wz0);
        try {
            return (T) C7963mB.h((Reader) C8218nE.a().d(m()), wz0);
        } finally {
        }
    }

    public AbstractC5317bO0<String> q() throws IOException {
        try {
            BufferedReader bufferedReader = (BufferedReader) C8218nE.a().d(l());
            ArrayList q = C10608x11.q();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    q.add(readLine);
                } else {
                    return AbstractC5317bO0.F(q);
                }
            }
        } finally {
        }
    }
}
