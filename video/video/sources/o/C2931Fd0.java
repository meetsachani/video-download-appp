package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.Fd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2931Fd0<K extends Enum<K>, V extends Enum<V>> extends W<K, V> {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    public transient Class<K> a1;
    public transient Class<V> b1;

    public C2931Fd0(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.a1 = cls;
        this.b1 = cls2;
    }

    public static <K extends Enum<K>, V extends Enum<V>> C2931Fd0<K, V> m6(Class<K> cls, Class<V> cls2) {
        return new C2931Fd0<>(cls, cls2);
    }

    public static <K extends Enum<K>, V extends Enum<V>> C2931Fd0<K, V> n6(Map<K, V> map) {
        C2931Fd0<K, V> m6 = m6(o6(map), p6(map));
        m6.putAll(map);
        return m6;
    }

    public static <K extends Enum<K>> Class<K> o6(Map<K, ?> map) {
        if (map instanceof C2931Fd0) {
            return ((C2931Fd0) map).q6();
        }
        if (map instanceof C3616Md0) {
            return ((C3616Md0) map).o6();
        }
        C10664xF1.d(!map.isEmpty());
        return map.keySet().iterator().next().getDeclaringClass();
    }

    public static <V extends Enum<V>> Class<V> p6(Map<?, V> map) {
        if (map instanceof C2931Fd0) {
            return ((C2931Fd0) map).b1;
        }
        C10664xF1.d(!map.isEmpty());
        return map.values().iterator().next().getDeclaringClass();
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a1 = (Class) objectInputStream.readObject();
        this.b1 = (Class) objectInputStream.readObject();
        h6(new EnumMap(this.a1), new EnumMap(this.b1));
        C9634t12.b(this, objectInputStream);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a1);
        objectOutputStream.writeObject(this.b1);
        C9634t12.i(this, objectOutputStream);
    }

    @Override // o.W, o.InterfaceC4626Wm
    @InterfaceC6181ey
    @MB
    public /* bridge */ /* synthetic */ Object J3(@InterfaceC7894ly1 Object obj, @InterfaceC7894ly1 Object obj2) {
        return super.J3(obj, obj2);
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@MB Object obj) {
        return super.containsValue(obj);
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // o.W
    /* renamed from: k6 */
    public K a6(K k) {
        return (K) C10664xF1.E(k);
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // o.W
    /* renamed from: l6 */
    public V b6(V v) {
        return (V) C10664xF1.E(v);
    }

    @Override // o.W, o.InterfaceC4626Wm
    public /* bridge */ /* synthetic */ InterfaceC4626Wm m5() {
        return super.m5();
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    @InterfaceC6181ey
    @MB
    public /* bridge */ /* synthetic */ Object put(@InterfaceC7894ly1 Object obj, @InterfaceC7894ly1 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public Class<K> q6() {
        return this.a1;
    }

    public Class<V> r6() {
        return this.b1;
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    @InterfaceC6181ey
    @MB
    public /* bridge */ /* synthetic */ Object remove(@MB Object obj) {
        return super.remove(obj);
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map, o.InterfaceC4626Wm
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }
}
