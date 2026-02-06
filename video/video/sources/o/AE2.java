package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class AE2 extends ObjectInputStream {
    public final C10332vt1 X;

    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<AE2, b> {
        public C10332vt1 l = new C10332vt1();

        public b j0(Pattern pattern) {
            this.l.c(pattern);
            return this;
        }

        public b k0(InterfaceC5999eD interfaceC5999eD) {
            this.l.d(interfaceC5999eD);
            return this;
        }

        public b l0(Class<?>... clsArr) {
            this.l.e(clsArr);
            return this;
        }

        public b m0(String... strArr) {
            this.l.f(strArr);
            return this;
        }

        @Override // o.XK0
        /* renamed from: o0 */
        public AE2 get() throws IOException {
            return new AE2(this);
        }

        public C10332vt1 p0() {
            return this.l;
        }

        public b q0(Pattern pattern) {
            this.l.g(pattern);
            return this;
        }

        public b r0(InterfaceC5999eD interfaceC5999eD) {
            this.l.h(interfaceC5999eD);
            return this;
        }

        public b s0(Class<?>... clsArr) {
            this.l.i(clsArr);
            return this;
        }

        public b t0(String... strArr) {
            this.l.j(strArr);
            return this;
        }

        public b u0(C10332vt1 c10332vt1) {
            if (c10332vt1 == null) {
                c10332vt1 = new C10332vt1();
            }
            this.l = c10332vt1;
            return this;
        }
    }

    public static b i() {
        return new b();
    }

    public AE2 a(Pattern pattern) {
        this.X.c(pattern);
        return this;
    }

    public AE2 d(InterfaceC5999eD interfaceC5999eD) {
        this.X.d(interfaceC5999eD);
        return this;
    }

    public AE2 f(Class<?>... clsArr) {
        this.X.e(clsArr);
        return this;
    }

    public AE2 h(String... strArr) {
        this.X.f(strArr);
        return this;
    }

    public final void j(String str) throws InvalidClassException {
        if (!this.X.l(str)) {
            k(str);
        }
    }

    public void k(String str) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    public <T> T l() throws ClassNotFoundException, IOException {
        return (T) super.readObject();
    }

    public AE2 m(Pattern pattern) {
        this.X.g(pattern);
        return this;
    }

    public AE2 n(InterfaceC5999eD interfaceC5999eD) {
        this.X.h(interfaceC5999eD);
        return this;
    }

    public AE2 o(Class<?>... clsArr) {
        this.X.i(clsArr);
        return this;
    }

    public AE2 p(String... strArr) {
        this.X.j(strArr);
        return this;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        j(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveProxyClass(String[] strArr) throws IOException, ClassNotFoundException {
        for (String str : strArr) {
            j(str);
        }
        return super.resolveProxyClass(strArr);
    }

    public AE2(b bVar) throws IOException {
        this(bVar.S(), bVar.l);
    }

    @Deprecated
    public AE2(InputStream inputStream) throws IOException {
        this(inputStream, new C10332vt1());
    }

    public AE2(InputStream inputStream, C10332vt1 c10332vt1) throws IOException {
        super(inputStream);
        this.X = c10332vt1;
    }
}
