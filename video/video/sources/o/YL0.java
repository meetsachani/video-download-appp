package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class YL0 implements InterfaceC8948qE, Serializable {
    private static final long serialVersionUID = 3518477308466486130L;
    public final JF1 X;
    public final InterfaceC8948qE Y;
    public final InterfaceC8948qE Z;

    public YL0(JF1 jf1, InterfaceC8948qE interfaceC8948qE) {
        this(jf1, interfaceC8948qE, C8358no1.X);
    }

    public static InterfaceC8948qE c(JF1 jf1, InterfaceC8948qE interfaceC8948qE) {
        return d(jf1, interfaceC8948qE, C8358no1.X);
    }

    public static InterfaceC8948qE d(JF1 jf1, InterfaceC8948qE interfaceC8948qE, InterfaceC8948qE interfaceC8948qE2) {
        if (jf1 != null) {
            if (interfaceC8948qE != null && interfaceC8948qE2 != null) {
                return new YL0(jf1, interfaceC8948qE, interfaceC8948qE2);
            }
            throw new IllegalArgumentException("Closures must not be null");
        }
        throw new IllegalArgumentException("Predicate must not be null");
    }

    @Override // o.InterfaceC8948qE
    public void a(Object obj) {
        if (this.X.evaluate(obj)) {
            this.Y.a(obj);
        } else {
            this.Z.a(obj);
        }
    }

    public InterfaceC8948qE b() {
        return this.Z;
    }

    public JF1 e() {
        return this.X;
    }

    public InterfaceC8948qE f() {
        return this.Y;
    }

    public YL0(JF1 jf1, InterfaceC8948qE interfaceC8948qE, InterfaceC8948qE interfaceC8948qE2) {
        this.X = jf1;
        this.Y = interfaceC8948qE;
        this.Z = interfaceC8948qE2;
    }
}
