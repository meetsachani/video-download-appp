package o;

import java.util.AbstractMap;

@InterfaceC6086ea0
@InterfaceC10420wF0
/* renamed from: o.tR1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9737tR1<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    public final EnumC8516oR1 X;

    public C9737tR1(@MB K k, @MB V v, EnumC8516oR1 enumC8516oR1) {
        super(k, v);
        this.X = (EnumC8516oR1) C10664xF1.E(enumC8516oR1);
    }

    public static <K, V> C9737tR1<K, V> a(@MB K k, @MB V v, EnumC8516oR1 enumC8516oR1) {
        return new C9737tR1<>(k, v, enumC8516oR1);
    }

    public EnumC8516oR1 b() {
        return this.X;
    }

    public boolean c() {
        return this.X.g();
    }
}
