package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import o.InterfaceC2467Am1;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.t12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9634t12 {

    /* renamed from: o.t12$b */
    /* loaded from: classes3.dex */
    public static final class b<T> {
        public final Field a;

        public void a(T t, int i) {
            try {
                this.a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public void b(T t, Object obj) {
            try {
                this.a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public b(Field field) {
            this.a = field;
            field.setAccessible(true);
        }
    }

    public static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static <K, V> void b(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        c(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void c(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static <K, V> void d(InterfaceC10058um1<K, V> interfaceC10058um1, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        e(interfaceC10058um1, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void e(InterfaceC10058um1<K, V> interfaceC10058um1, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = interfaceC10058um1.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static <E> void f(InterfaceC2467Am1<E> interfaceC2467Am1, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        g(interfaceC2467Am1, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void g(InterfaceC2467Am1<E> interfaceC2467Am1, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2467Am1.x(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static int h(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    public static <K, V> void i(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static <K, V> void j(InterfaceC10058um1<K, V> interfaceC10058um1, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC10058um1.l().size());
        for (Map.Entry<K, Collection<V>> entry : interfaceC10058um1.l().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }

    public static <E> void k(InterfaceC2467Am1<E> interfaceC2467Am1, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC2467Am1.entrySet().size());
        for (InterfaceC2467Am1.a<E> aVar : interfaceC2467Am1.entrySet()) {
            objectOutputStream.writeObject(aVar.a());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}
