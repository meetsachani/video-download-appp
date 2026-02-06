package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.lu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7879lu2<K, V> extends AbstractC7427k3<K, V> {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    public transient Comparator<? super K> c1;
    public transient Comparator<? super V> d1;

    public C7879lu2(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.c1 = comparator;
        this.d1 = comparator2;
    }

    public static <K extends Comparable, V extends Comparable> C7879lu2<K, V> P() {
        return new C7879lu2<>(AbstractC10587ww1.z(), AbstractC10587ww1.z());
    }

    public static <K, V> C7879lu2<K, V> R(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        return new C7879lu2<>((Comparator) C10664xF1.E(comparator), (Comparator) C10664xF1.E(comparator2));
    }

    public static <K extends Comparable, V extends Comparable> C7879lu2<K, V> S(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        return new C7879lu2<>(AbstractC10587ww1.z(), AbstractC10587ww1.z(), interfaceC10058um1);
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c1 = (Comparator) C10664xF1.E((Comparator) objectInputStream.readObject());
        this.d1 = (Comparator) C10664xF1.E((Comparator) objectInputStream.readObject());
        B(new TreeMap(this.c1));
        C9634t12.d(this, objectInputStream);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(V());
        objectOutputStream.writeObject(U());
        C9634t12.j(this, objectOutputStream);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ boolean B0(InterfaceC10058um1 interfaceC10058um1) {
        return super.B0(interfaceC10058um1);
    }

    @Override // o.AbstractC8904q3, o.AbstractC5232b3, o.F1
    /* renamed from: I */
    public SortedSet<V> t() {
        return new TreeSet(this.d1);
    }

    @Override // o.AbstractC7427k3, o.AbstractC8904q3, o.AbstractC5232b3, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    /* renamed from: O */
    public NavigableMap<K, Collection<V>> l() {
        return (NavigableMap) super.l();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ InterfaceC2467Am1 Q() {
        return super.Q();
    }

    @Override // o.AbstractC8904q3, o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC11149zF0
    /* renamed from: T */
    public NavigableSet<V> get(@InterfaceC7894ly1 K k) {
        return (NavigableSet) super.get((C7879lu2<K, V>) k);
    }

    @Override // o.InterfaceC6829ha2
    public Comparator<? super V> U() {
        return this.d1;
    }

    @Deprecated
    public Comparator<? super K> V() {
        return this.c1;
    }

    @Override // o.AbstractC7427k3, o.AbstractC6939i2, o.InterfaceC10058um1
    /* renamed from: W */
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // o.F1, o.AbstractC6939i2
    public Map<K, Collection<V>> a() {
        return v();
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

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.AbstractC8904q3, o.AbstractC5232b3, o.F1, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ SortedSet i(@MB Object obj) {
        return super.i(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8904q3, o.AbstractC5232b3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public /* bridge */ /* synthetic */ SortedSet j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
        return super.j((C7879lu2<K, V>) obj, iterable);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.F1
    public Collection<V> u(@InterfaceC7894ly1 K k) {
        if (k == 0) {
            V().compare(k, k);
        }
        return super.u(k);
    }

    @Override // o.AbstractC8904q3, o.F1, o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public C7879lu2(Comparator<? super K> comparator, Comparator<? super V> comparator2, InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        this(comparator, comparator2);
        B0(interfaceC10058um1);
    }
}
