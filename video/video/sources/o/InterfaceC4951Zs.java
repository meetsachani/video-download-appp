package o;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@L40("Use CacheBuilder.newBuilder().build()")
@InterfaceC6086ea0
@InterfaceC10420wF0
/* renamed from: o.Zs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4951Zs<K, V> {
    @MB
    V B3(@DH("K") Object obj);

    V G0(K k, Callable<? extends V> callable) throws ExecutionException;

    void J();

    @QB
    C8620ot J5();

    void K5();

    void P3(Iterable<? extends Object> iterable);

    @QB
    ConcurrentMap<K, V> l();

    void l2(@DH("K") Object obj);

    void put(K k, V v);

    void putAll(Map<? extends K, ? extends V> map);

    @QB
    long size();

    AbstractC6044eO0<K, V> y5(Iterable<? extends Object> iterable);
}
