package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class OK2 implements InterfaceC8948qE, Serializable {
    public static /* synthetic */ Class Y0 = null;
    private static final long serialVersionUID = -3110538116913760108L;
    public final JF1 X;
    public final InterfaceC8948qE Y;
    public final boolean Z;

    public OK2(JF1 jf1, InterfaceC8948qE interfaceC8948qE, boolean z) {
        this.X = jf1;
        this.Y = interfaceC8948qE;
        this.Z = z;
    }

    public static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static InterfaceC8948qE d(JF1 jf1, InterfaceC8948qE interfaceC8948qE, boolean z) {
        if (jf1 != null) {
            if (interfaceC8948qE != null) {
                return new OK2(jf1, interfaceC8948qE, z);
            }
            throw new IllegalArgumentException("Closure must not be null");
        }
        throw new IllegalArgumentException("Predicate must not be null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Class cls = Y0;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.WhileClosure");
            Y0 = cls;
        }
        SB0.a(cls);
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Class cls = Y0;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.WhileClosure");
            Y0 = cls;
        }
        SB0.a(cls);
        objectOutputStream.defaultWriteObject();
    }

    @Override // o.InterfaceC8948qE
    public void a(Object obj) {
        if (this.Z) {
            this.Y.a(obj);
        }
        while (this.X.evaluate(obj)) {
            this.Y.a(obj);
        }
    }

    public InterfaceC8948qE c() {
        return this.Y;
    }

    public JF1 e() {
        return this.X;
    }

    public boolean f() {
        return this.Z;
    }
}
