package o;

import java.util.Collection;
import java.util.Set;

/* renamed from: o.x22  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC10613x22<K, V> extends InterfaceC7846lm1<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return get((InterfaceC10613x22<K, V>) obj);
    }

    @Override // o.InterfaceC7846lm1, o.InterfaceC10613x22
    Set<V> get(K k);

    @Override // 
    Set<V> remove(Object obj);
}
