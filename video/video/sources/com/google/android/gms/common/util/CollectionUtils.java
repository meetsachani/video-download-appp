package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C2531Be;
import o.C3228Ie;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.VP0;

@KeepForSdk
/* loaded from: classes2.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean a(@InterfaceC11300zs1 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @Deprecated
    @VP0(imports = {"java.util.Collections"}, replacement = "Collections.emptyList()")
    @InterfaceC5670cr1
    @KeepForSdk
    public static <T> List<T> b() {
        return Collections.EMPTY_LIST;
    }

    @Deprecated
    @VP0(imports = {"java.util.Collections"}, replacement = "Collections.singletonList(item)")
    @InterfaceC5670cr1
    @KeepForSdk
    public static <T> List<T> c(@InterfaceC5670cr1 T t) {
        return Collections.singletonList(t);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static <T> List<T> d(@InterfaceC5670cr1 T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(tArr));
            }
            return Collections.singletonList(tArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <K, V> Map<K, V> e(@InterfaceC5670cr1 K k, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 K k2, @InterfaceC5670cr1 V v2, @InterfaceC5670cr1 K k3, @InterfaceC5670cr1 V v3) {
        Map k4 = k(3, false);
        k4.put(k, v);
        k4.put(k2, v2);
        k4.put(k3, v3);
        return Collections.unmodifiableMap(k4);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <K, V> Map<K, V> f(@InterfaceC5670cr1 K k, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 K k2, @InterfaceC5670cr1 V v2, @InterfaceC5670cr1 K k3, @InterfaceC5670cr1 V v3, @InterfaceC5670cr1 K k4, @InterfaceC5670cr1 V v4, @InterfaceC5670cr1 K k5, @InterfaceC5670cr1 V v5, @InterfaceC5670cr1 K k6, @InterfaceC5670cr1 V v6) {
        Map k7 = k(6, false);
        k7.put(k, v);
        k7.put(k2, v2);
        k7.put(k3, v3);
        k7.put(k4, v4);
        k7.put(k5, v5);
        k7.put(k6, v6);
        return Collections.unmodifiableMap(k7);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <K, V> Map<K, V> g(@InterfaceC5670cr1 K[] kArr, @InterfaceC5670cr1 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length == length2) {
            if (length != 0) {
                if (length != 1) {
                    Map k = k(length, false);
                    for (int i = 0; i < kArr.length; i++) {
                        k.put(kArr[i], vArr[i]);
                    }
                    return Collections.unmodifiableMap(k);
                }
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            return Collections.EMPTY_MAP;
        }
        throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <T> Set<T> h(int i) {
        if (i == 0) {
            return new C3228Ie();
        }
        return l(i, true);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> i(@InterfaceC5670cr1 T t, @InterfaceC5670cr1 T t2, @InterfaceC5670cr1 T t3) {
        Set l = l(3, false);
        l.add(t);
        l.add(t2);
        l.add(t3);
        return Collections.unmodifiableSet(l);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> j(@InterfaceC5670cr1 T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            Set l = l(length, false);
                            Collections.addAll(l, tArr);
                            return Collections.unmodifiableSet(l);
                        }
                        T t = tArr[0];
                        T t2 = tArr[1];
                        T t3 = tArr[2];
                        T t4 = tArr[3];
                        Set l2 = l(4, false);
                        l2.add(t);
                        l2.add(t2);
                        l2.add(t3);
                        l2.add(t4);
                        return Collections.unmodifiableSet(l2);
                    }
                    return i(tArr[0], tArr[1], tArr[2]);
                }
                T t5 = tArr[0];
                T t6 = tArr[1];
                Set l3 = l(2, false);
                l3.add(t5);
                l3.add(t6);
                return Collections.unmodifiableSet(l3);
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.EMPTY_SET;
    }

    public static Map k(int i, boolean z) {
        if (i <= 256) {
            return new C2531Be(i);
        }
        return new HashMap(i, 1.0f);
    }

    public static Set l(int i, boolean z) {
        int i2;
        float f;
        if (true != z) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        if (i <= i2) {
            return new C3228Ie(i);
        }
        if (true != z) {
            f = 1.0f;
        } else {
            f = 0.75f;
        }
        return new HashSet(i, f);
    }
}
