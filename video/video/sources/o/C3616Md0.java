package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.Md0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3616Md0<K extends Enum<K>, V> extends W<K, V> {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    public transient Class<K> a1;

    public C3616Md0(Class<K> cls) {
        super(new EnumMap(cls), C7935m81.a0(cls.getEnumConstants().length));
        this.a1 = cls;
    }

    public static <K extends Enum<K>, V> C3616Md0<K, V> l6(Class<K> cls) {
        return new C3616Md0<>(cls);
    }

    public static <K extends Enum<K>, V> C3616Md0<K, V> m6(Map<K, ? extends V> map) {
        C3616Md0<K, V> l6 = l6(C2931Fd0.o6(map));
        l6.putAll(map);
        return l6;
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a1 = (Class) objectInputStream.readObject();
        h6(new EnumMap(this.a1), new HashMap((this.a1.getEnumConstants().length * 3) / 2));
        C9634t12.b(this, objectInputStream);
    }

    @InterfaceC11149zF0
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a1);
        C9634t12.i(this, objectOutputStream);
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

    @Override // o.W, o.InterfaceC4626Wm
    public /* bridge */ /* synthetic */ InterfaceC4626Wm m5() {
        return super.m5();
    }

    @Override // o.W, o.InterfaceC4626Wm
    @InterfaceC6181ey
    @MB
    /* renamed from: n6 */
    public V J3(K k, @InterfaceC7894ly1 V v) {
        return (V) super.J3(k, v);
    }

    public Class<K> o6() {
        return this.a1;
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    @InterfaceC6181ey
    @MB
    /* renamed from: p6 */
    public V put(K k, @InterfaceC7894ly1 V v) {
        return (V) super.put(k, v);
    }

    @Override // o.W, o.AbstractC9862ty0, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
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
