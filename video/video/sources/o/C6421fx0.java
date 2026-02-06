package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: o.fx0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6421fx0 implements InterfaceC8948qE, Serializable {
    public static /* synthetic */ Class Z = null;
    private static final long serialVersionUID = -1190120533393621674L;
    public final int X;
    public final InterfaceC8948qE Y;

    public C6421fx0(int i, InterfaceC8948qE interfaceC8948qE) {
        this.X = i;
        this.Y = interfaceC8948qE;
    }

    public static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static InterfaceC8948qE e(int i, InterfaceC8948qE interfaceC8948qE) {
        if (i > 0 && interfaceC8948qE != null) {
            if (i == 1) {
                return interfaceC8948qE;
            }
            return new C6421fx0(i, interfaceC8948qE);
        }
        return C8358no1.X;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Class cls = Z;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.ForClosure");
            Z = cls;
        }
        SB0.a(cls);
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Class cls = Z;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.ForClosure");
            Z = cls;
        }
        SB0.a(cls);
        objectOutputStream.defaultWriteObject();
    }

    @Override // o.InterfaceC8948qE
    public void a(Object obj) {
        for (int i = 0; i < this.X; i++) {
            this.Y.a(obj);
        }
    }

    public InterfaceC8948qE c() {
        return this.Y;
    }

    public int d() {
        return this.X;
    }
}
