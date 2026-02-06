package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.uG0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9935uG0<K, V> extends AbstractC10178vG0<K, V> {
    public static final int d1 = 2;
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    @InterfaceC5299bJ2
    public transient int c1;

    public C9935uG0() {
        this(12, 2);
    }

    public static <K, V> C9935uG0<K, V> I() {
        return new C9935uG0<>();
    }

    public static <K, V> C9935uG0<K, V> J(int i, int i2) {
        return new C9935uG0<>(i, i2);
    }

    public static <K, V> C9935uG0<K, V> K(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        return new C9935uG0<>(interfaceC10058um1);
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c1 = 2;
        int h = C9634t12.h(objectInputStream);
        B(C7469kD1.d(12));
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

    @Override // o.AbstractC5232b3, o.F1
    /* renamed from: F */
    public Set<V> t() {
        return C7469kD1.e(this.c1);
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

    @Override // o.AbstractC5232b3, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Set get(@InterfaceC7894ly1 Object obj) {
        return super.get((C9935uG0<K, V>) obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Set i(@MB Object obj) {
        return super.i(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ Set j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return super.j((C9935uG0<K, V>) obj, iterable);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // o.AbstractC5232b3, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Map l() {
        return super.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean put(@InterfaceC7894ly1 Object obj, @InterfaceC7894ly1 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean q5(@MB Object obj, @MB Object obj2) {
        return super.q5(obj, obj2);
    }

    @Override // o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ Set r() {
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

    public C9935uG0(int i, int i2) {
        super(C7469kD1.d(i));
        this.c1 = 2;
        C10664xF1.d(i2 >= 0);
        this.c1 = i2;
    }

    public C9935uG0(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        super(C7469kD1.d(interfaceC10058um1.keySet().size()));
        this.c1 = 2;
        B0(interfaceC10058um1);
    }
}
