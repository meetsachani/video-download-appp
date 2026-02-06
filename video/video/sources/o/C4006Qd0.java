package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.Qd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4006Qd0 {
    public static final String a = "null elements not permitted";
    public static final String b = "Cannot store %s %s values in %s bits";
    public static final String c = "%s does not seem to be an Enum type";
    public static final String d = "EnumClass must be defined.";

    public static <E extends Enum<E>> Class<E> a(Class<E> cls) {
        C11147zE2.V(cls, d, new Object[0]);
        C11147zE2.B(cls.isEnum(), c, cls);
        return cls;
    }

    public static <E extends Enum<E>> Class<E> b(Class<E> cls) {
        boolean z;
        Enum[] enumArr = (Enum[]) a(cls).getEnumConstants();
        if (enumArr.length <= 64) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, b, Integer.valueOf(enumArr.length), cls.getSimpleName(), 64);
        return cls;
    }

    public static <E extends Enum<E>> long c(Class<E> cls, Iterable<? extends E> iterable) {
        b(cls);
        C11147zE2.U(iterable);
        long j = 0;
        for (E e : iterable) {
            C11147zE2.V(e, a, new Object[0]);
            j |= 1 << e.ordinal();
        }
        return j;
    }

    @SafeVarargs
    public static <E extends Enum<E>> long d(Class<E> cls, E... eArr) {
        C11147zE2.G(eArr);
        return c(cls, Arrays.asList(eArr));
    }

    public static <E extends Enum<E>> long[] e(Class<E> cls, Iterable<? extends E> iterable) {
        a(cls);
        C11147zE2.U(iterable);
        EnumSet noneOf = EnumSet.noneOf(cls);
        for (E e : iterable) {
            C11147zE2.V(e, a, new Object[0]);
            noneOf.add(e);
        }
        long[] jArr = new long[((cls.getEnumConstants().length - 1) / 64) + 1];
        Iterator it = noneOf.iterator();
        while (it.hasNext()) {
            Enum r0 = (Enum) it.next();
            int ordinal = r0.ordinal() / 64;
            jArr[ordinal] = jArr[ordinal] | (1 << (r0.ordinal() % 64));
        }
        C4206Se.Y3(jArr);
        return jArr;
    }

    @SafeVarargs
    public static <E extends Enum<E>> long[] f(Class<E> cls, E... eArr) {
        a(cls);
        C11147zE2.G(eArr);
        EnumSet noneOf = EnumSet.noneOf(cls);
        Collections.addAll(noneOf, eArr);
        long[] jArr = new long[((cls.getEnumConstants().length - 1) / 64) + 1];
        Iterator it = noneOf.iterator();
        while (it.hasNext()) {
            Enum r0 = (Enum) it.next();
            int ordinal = r0.ordinal() / 64;
            jArr[ordinal] = jArr[ordinal] | (1 << (r0.ordinal() % 64));
        }
        C4206Se.Y3(jArr);
        return jArr;
    }

    public static <E extends Enum<E>> E g(Class<E> cls, String str) {
        return (E) h(cls, str, null);
    }

    public static <E extends Enum<E>> E h(Class<E> cls, String str, E e) {
        if (str == null) {
            return e;
        }
        try {
            return (E) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            return e;
        }
    }

    public static <E extends Enum<E>> E i(Class<E> cls, String str) {
        return (E) j(cls, str, null);
    }

    public static <E extends Enum<E>> E j(Class<E> cls, String str, E e) {
        E[] enumConstants;
        if (str != null && cls.isEnum()) {
            for (E e2 : cls.getEnumConstants()) {
                if (e2.name().equalsIgnoreCase(str)) {
                    return e2;
                }
            }
        }
        return e;
    }

    public static <E extends Enum<E>> List<E> k(Class<E> cls) {
        return new ArrayList(Arrays.asList(cls.getEnumConstants()));
    }

    public static <E extends Enum<E>> Map<String, E> l(Class<E> cls) {
        E[] enumConstants;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (E e : cls.getEnumConstants()) {
            linkedHashMap.put(e.name(), e);
        }
        return linkedHashMap;
    }

    public static <E extends Enum<E>> boolean m(Class<E> cls, String str) {
        if (g(cls, str) != null) {
            return true;
        }
        return false;
    }

    public static <E extends Enum<E>> boolean n(Class<E> cls, String str) {
        if (i(cls, str) != null) {
            return true;
        }
        return false;
    }

    public static <E extends Enum<E>> EnumSet<E> o(Class<E> cls, long j) {
        b(cls).getEnumConstants();
        return p(cls, j);
    }

    public static <E extends Enum<E>> EnumSet<E> p(Class<E> cls, long... jArr) {
        E[] enumConstants;
        EnumSet<E> noneOf = EnumSet.noneOf(a(cls));
        long[] Q = C4206Se.Q((long[]) C11147zE2.U(jArr));
        C4206Se.Y3(Q);
        for (E e : cls.getEnumConstants()) {
            int ordinal = e.ordinal() / 64;
            if (ordinal < Q.length && (Q[ordinal] & (1 << (e.ordinal() % 64))) != 0) {
                noneOf.add(e);
            }
        }
        return noneOf;
    }
}
