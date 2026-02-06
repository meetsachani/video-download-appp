package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class C80 implements Serializable {
    public static final int Y0 = 1;
    public static final int Z0 = 2;
    public static final int a1 = 3;
    public static final int b1 = 4;
    public static final int c1 = 5;
    public static final int d1 = 6;
    public static final int e1 = 7;
    public static final int f1 = 8;
    public String X;
    public transient Class<?> Y;
    public transient Class<?> Z;

    public C80(String str) {
        this(str, Object.class);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.Y = f(objectInputStream);
        if (e() || d()) {
            this.Z = f(objectInputStream);
        }
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        g(this.Y, objectOutputStream);
        if (e() || d()) {
            g(this.Z, objectOutputStream);
        }
        objectOutputStream.defaultWriteObject();
    }

    public Class<?> a() {
        return this.Z;
    }

    public String b() {
        return this.X;
    }

    public Class<?> c() {
        return this.Y;
    }

    public boolean d() {
        Class<?> cls = this.Y;
        if (cls == null) {
            return false;
        }
        if (!cls.isArray() && !List.class.isAssignableFrom(this.Y)) {
            return false;
        }
        return true;
    }

    public boolean e() {
        Class<?> cls = this.Y;
        if (cls == null) {
            return false;
        }
        return Map.class.isAssignableFrom(cls);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (obj instanceof C80)) {
            C80 c80 = (C80) obj;
            String str = this.X;
            if (str != null ? str.equals(c80.X) : c80.X == null) {
                Class<?> cls = this.Y;
                if (cls != null ? cls.equals(c80.Y) : c80.Y == null) {
                    Class<?> cls2 = this.Z;
                    Class<?> cls3 = c80.Z;
                    if (cls2 != null ? cls2.equals(cls3) : cls3 == null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final Class<?> f(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        if (objectInputStream.readBoolean()) {
            switch (objectInputStream.readInt()) {
                case 1:
                    return Boolean.TYPE;
                case 2:
                    return Byte.TYPE;
                case 3:
                    return Character.TYPE;
                case 4:
                    return Double.TYPE;
                case 5:
                    return Float.TYPE;
                case 6:
                    return Integer.TYPE;
                case 7:
                    return Long.TYPE;
                case 8:
                    return Short.TYPE;
                default:
                    throw new StreamCorruptedException("Invalid primitive type. Check version of beanutils used to serialize is compatible.");
            }
        }
        return (Class) objectInputStream.readObject();
    }

    public final void g(Class<?> cls, ObjectOutputStream objectOutputStream) throws IOException {
        int i;
        if (Boolean.TYPE.equals(cls)) {
            i = 1;
        } else if (Byte.TYPE.equals(cls)) {
            i = 2;
        } else if (Character.TYPE.equals(cls)) {
            i = 3;
        } else if (Double.TYPE.equals(cls)) {
            i = 4;
        } else if (Float.TYPE.equals(cls)) {
            i = 5;
        } else if (Integer.TYPE.equals(cls)) {
            i = 6;
        } else if (Long.TYPE.equals(cls)) {
            i = 7;
        } else if (Short.TYPE.equals(cls)) {
            i = 8;
        } else {
            i = 0;
        }
        if (i == 0) {
            objectOutputStream.writeBoolean(false);
            objectOutputStream.writeObject(cls);
            return;
        }
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeInt(i);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.X;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        Class<?> cls = this.Y;
        if (cls == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cls.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Class<?> cls2 = this.Z;
        if (cls2 != null) {
            i = cls2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynaProperty[name=");
        sb.append(this.X);
        sb.append(",type=");
        sb.append(this.Y);
        if (e() || d()) {
            sb.append(" <");
            sb.append(this.Z);
            sb.append(">");
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public C80(String str, Class<?> cls) {
        this.X = str;
        this.Y = cls;
        if (cls == null || !cls.isArray()) {
            return;
        }
        this.Z = cls.getComponentType();
    }

    public C80(String str, Class<?> cls, Class<?> cls2) {
        this.X = str;
        this.Y = cls;
        this.Z = cls2;
    }
}
