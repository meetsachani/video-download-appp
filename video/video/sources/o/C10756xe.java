package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.xe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10756xe<K, V> extends AbstractC10999ye<K, V> {
    public static final int d1 = 3;
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    @InterfaceC5299bJ2
    public transient int c1;

    public C10756xe() {
        this(12, 3);
    }

    public static <K, V> C10756xe<K, V> I() {
        return new C10756xe<>();
    }

    public static <K, V> C10756xe<K, V> J(int i, int i2) {
        return new C10756xe<>(i, i2);
    }

    public static <K, V> C10756xe<K, V> K(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        return new C10756xe<>(interfaceC10058um1);
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c1 = 3;
        int h = C9634t12.h(objectInputStream);
        B(PG.v());
        C9634t12.e(this, objectInputStream, h);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C9634t12.j(this, objectOutputStream);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean B0(InterfaceC10058um1 interfaceC10058um1) {
        return super.B0(interfaceC10058um1);
    }

    @Override // o.AbstractC10117v1, o.F1
    /* renamed from: F */
    public List<V> t() {
        return new ArrayList(this.c1);
    }

    @Deprecated
    public void L() {
        Iterator<Collection<V>> it = s().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ InterfaceC2467Am1 Q() {
        return super.Q();
    }

    @Override // o.F1, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // o.F1, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean containsKey(@MB Object obj) {
        return super.containsKey(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean containsValue(@MB Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean e0(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return super.e0(obj, iterable);
    }

    @Override // o.AbstractC10117v1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10117v1, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ List get(@InterfaceC7894ly1 Object obj) {
        return super.get((C10756xe<K, V>) obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.AbstractC10117v1, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ List i(@MB Object obj) {
        return super.i(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10117v1, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ List j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return super.j((C10756xe<K, V>) obj, iterable);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // o.AbstractC10117v1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Map l() {
        return super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC10117v1, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean put(@InterfaceC7894ly1 Object obj, @InterfaceC7894ly1 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean q5(@MB Object obj, @MB Object obj2) {
        return super.q5(obj, obj2);
    }

    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Collection r() {
        return super.r();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean remove(@MB Object obj, @MB Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // o.F1, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // o.AbstractC6939i2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.F1, o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public C10756xe(int i, int i2) {
        super(C7469kD1.d(i));
        C5037aF.b(i2, "expectedValuesPerKey");
        this.c1 = i2;
    }

    public C10756xe(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        this(interfaceC10058um1.keySet().size(), interfaceC10058um1 instanceof C10756xe ? ((C10756xe) interfaceC10058um1).c1 : 3);
        B0(interfaceC10058um1);
    }
}
