package o;

import java.util.Map;

@L40("Use Maps.difference")
@InterfaceC6329fa0
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public interface M71<K, V> {

    @L40("Use Maps.difference")
    /* loaded from: classes3.dex */
    public interface a<V> {
        @InterfaceC7894ly1
        V a();

        @InterfaceC7894ly1
        V b();

        boolean equals(@MB Object obj);

        int hashCode();
    }

    Map<K, V> a();

    Map<K, V> b();

    Map<K, a<V>> c();

    Map<K, V> d();

    boolean e();

    boolean equals(@MB Object obj);

    int hashCode();
}
