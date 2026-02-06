package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* loaded from: classes4.dex */
public enum VM {
    GENERAL("bBhHsS", null),
    CHAR("cC", Character.class, Byte.class, Short.class, Integer.class),
    INT("doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", Long.class, Calendar.class, Date.class),
    CHAR_AND_INT(null, Byte.class, Short.class, Integer.class),
    INT_AND_TIME(null, Long.class),
    NULL(null, new Class[0]),
    UNUSED(null, null);
    
    public final Class<?>[] X;
    public final String Y;

    VM(String str, Class... clsArr) {
        this.Y = str;
        if (clsArr == null) {
            this.X = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(cls);
            Class<? extends Object> m = m(cls);
            if (m != null) {
                arrayList.add(m);
            }
        }
        this.X = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    public static <E> Set<E> e(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static VM g(char c) {
        VM[] vmArr = {GENERAL, CHAR, INT, FLOAT, TIME};
        for (int i = 0; i < 5; i++) {
            VM vm = vmArr[i];
            if (vm.Y.contains(String.valueOf(c))) {
                return vm;
            }
        }
        throw new IllegalArgumentException("Bad conversion character " + c);
    }

    public static VM h(VM vm, VM vm2) {
        VM vm3 = UNUSED;
        if (vm != vm3) {
            if (vm2 != vm3) {
                VM vm4 = GENERAL;
                if (vm != vm4) {
                    if (vm2 != vm4) {
                        Set e = e(vm.X);
                        e.retainAll(e(vm2.X));
                        VM[] vmArr = {CHAR, INT, FLOAT, TIME, CHAR_AND_INT, INT_AND_TIME, NULL};
                        for (int i = 0; i < 7; i++) {
                            VM vm5 = vmArr[i];
                            if (e(vm5.X).equals(e)) {
                                return vm5;
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
            return vm;
        }
        return vm2;
    }

    public static boolean j(VM vm, VM vm2) {
        if (h(vm, vm2) == vm) {
            return true;
        }
        return false;
    }

    public static VM l(VM vm, VM vm2) {
        VM vm3;
        VM vm4 = UNUSED;
        if (vm != vm4 && vm2 != vm4 && vm != (vm4 = GENERAL) && vm2 != vm4) {
            VM vm5 = CHAR_AND_INT;
            if ((vm == vm5 && vm2 == INT_AND_TIME) || (vm == (vm3 = INT_AND_TIME) && vm2 == vm5)) {
                return INT;
            }
            Set e = e(vm.X);
            e.addAll(e(vm2.X));
            VM[] vmArr = {NULL, vm5, vm3, CHAR, INT, FLOAT, TIME};
            for (int i = 0; i < 7; i++) {
                VM vm6 = vmArr[i];
                if (e(vm6.X).equals(e)) {
                    return vm6;
                }
            }
            return GENERAL;
        }
        return vm4;
    }

    public static Class<? extends Object> m(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return null;
    }

    public boolean i(Class<?> cls) {
        Class<?>[] clsArr = this.X;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    @JK1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class<?>[] clsArr = this.X;
        if (clsArr != null && clsArr.length != 0) {
            StringJoiner stringJoiner = new StringJoiner(C6566gU0.h, "(one of: ", C9811tl1.d);
            for (Class<?> cls : this.X) {
                stringJoiner.add(cls.getSimpleName());
            }
            sb.append(C4500Ve2.b);
            sb.append(stringJoiner);
            return sb.toString();
        }
        return sb.toString();
    }
}
