package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.l11  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7664l11<K, V> extends InterfaceC7846lm1<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC7846lm1, o.InterfaceC10613x22
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return get((InterfaceC7664l11<K, V>) obj);
    }

    @Override // o.InterfaceC7846lm1, o.InterfaceC10613x22
    List<V> get(K k);

    @Override // o.InterfaceC7846lm1, o.InterfaceC10613x22
    List<V> remove(Object obj);
}
