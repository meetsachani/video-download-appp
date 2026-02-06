package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
import o.C8077mf;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.qj */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2265qj {
    public static byte[] A00;
    public static String[] A01 = {"QMNv5OeLi", "JpCyGMjCH0qsxjrywkKfLwsh76HDYAsW", "KBfMQLxtUMBpcerO39v", "kcWpGIrroOmjfPs85a", "Ek92TFQTKr4621X3uMn", "aSOd7mkF1z21DVbAzu", "Gro5DGcboyXTTqFPFEdSQ7qnAhBJScvW", "47M7luGjiBOnZ0iOunZSyxDazaCqRcyy"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(Set<?> s) {
        int i = 0;
        Iterator<?> it = s.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <E> SortedSet<E> A03(SortedSet<E> unfiltered, InterfaceC1913kj<? super E> predicate) {
        if (unfiltered instanceof C0619Av) {
            C0619Av c0619Av = (C0619Av) unfiltered;
            return new AnonymousClass26((SortedSet) c0619Av.A01, AbstractC1915kl.A00(c0619Av.A00, predicate));
        }
        return new AnonymousClass26((SortedSet) AbstractC1912ki.A04(unfiltered), (InterfaceC1913kj) AbstractC1912ki.A04(predicate));
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 125);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <E> Set<E> A07(Set<E> unfiltered, InterfaceC1913kj<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return A03((SortedSet) unfiltered, predicate);
        }
        if (unfiltered instanceof C0619Av) {
            C0619Av c0619Av = (C0619Av) unfiltered;
            return new C0619Av((Set) c0619Av.A01, AbstractC1915kl.A00(c0619Av.A00, predicate));
        }
        return new C0619Av((Set) AbstractC1912ki.A04(unfiltered), (InterfaceC1913kj) AbstractC1912ki.A04(predicate));
    }

    public static void A08() {
        A00 = new byte[]{C8077mf.C, C8077mf.r, C8077mf.C, 17, C8077mf.C, C8077mf.u, 8, 47, C8077mf.C, 8, 121, 111, 126, 59, 19, 5, C8077mf.x, 82};
    }

    static {
        A08();
    }

    public static <E> AbstractC2263qh<E> A01(final Set<? extends E> set1, final Set<? extends E> set2) {
        AbstractC1912ki.A05(set1, A04(10, 4, 119));
        AbstractC1912ki.A05(set2, A04(14, 4, 29));
        return new C0621Ax(set1, set2);
    }

    public static <E> AbstractC2263qh<E> A02(final Set<E> set1, final Set<?> set2) {
        AbstractC1912ki.A05(set1, A04(10, 4, 119));
        AbstractC1912ki.A05(set2, A04(14, 4, 29));
        return new C0620Aw(set1, set2);
    }

    public static <E> HashSet<E> A05() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> A06(int expectedSize) {
        return new HashSet<>(AbstractC2212po.A00(expectedSize));
    }

    public static boolean A09(@CheckForNull Set<?> s, Object object) {
        if (s == object) {
            return true;
        }
        if (object instanceof Set) {
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "mkkUVP7U2mO33UgVMEf";
            strArr[4] = "sZqEaXQqwVxNGw5Qr8W";
            Set set = (Set) object;
            try {
                if (s.size() == set.size()) {
                    if (s.containsAll(set)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean A0A(Set<?> set, Collection<?> collection) {
        AbstractC1912ki.A04(collection);
        if (0 != 0) {
            throw new NullPointerException(A04(0, 10, 1));
        }
        if (collection instanceof Set) {
            int size = collection.size();
            int size2 = set.size();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "1Hjzr9oWssjCwBhAVsj";
            strArr[4] = "95dUReBvqcjLhc0vRoV";
            if (size > size2) {
                return AbstractC2172p9.A0E(set.iterator(), collection);
            }
        }
        Iterator<?> it = collection.iterator();
        String[] strArr2 = A01;
        if (strArr2[2].length() != strArr2[4].length()) {
            A01[1] = "sptQvlXJPhLrnOvdD6zGRYz2Tqrv0eAh";
            return A0B(set, it);
        }
        String[] strArr3 = A01;
        strArr3[2] = "FhrMChMKSM6HFLoTDqL";
        strArr3[4] = "aqz5QQGy23EnDjT9ypo";
        return A0B(set, it);
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0B(Set<?> set, Iterator<?> iterator) {
        boolean z = false;
        while (changed) {
            boolean changed = set.remove(iterator.next());
            z |= changed;
        }
        return z;
    }
}
