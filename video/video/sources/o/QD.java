package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class QD implements InterfaceC3189Hs2, Serializable {
    public static final InterfaceC3189Hs2 X = new QD();
    public static /* synthetic */ Class Y = null;
    private static final long serialVersionUID = -8188742709499652567L;

    public static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static InterfaceC3189Hs2 c() {
        return X;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Class cls = Y;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.CloneTransformer");
            Y = cls;
        }
        SB0.a(cls);
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Class cls = Y;
        if (cls == null) {
            cls = b("org.apache.commons.collections.functors.CloneTransformer");
            Y = cls;
        }
        SB0.a(cls);
        objectOutputStream.defaultWriteObject();
    }

    @Override // o.InterfaceC3189Hs2
    public Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        return C5787dK1.b(obj).a();
    }
}
