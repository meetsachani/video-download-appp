package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* renamed from: o.Xe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4691Xe extends C4594We {
    @InterfaceC8046mW0(name = "contentDeepEquals")
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final <T> boolean g(@Nullable T[] tArr, @Nullable T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            T t = tArr[i];
            T t2 = tArr2[i];
            if (t != t2) {
                if (t == null || t2 == null) {
                    return false;
                }
                if ((t instanceof Object[]) && (t2 instanceof Object[])) {
                    if (!g((Object[]) t, (Object[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof byte[]) && (t2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) t, (byte[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof short[]) && (t2 instanceof short[])) {
                    if (!Arrays.equals((short[]) t, (short[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof int[]) && (t2 instanceof int[])) {
                    if (!Arrays.equals((int[]) t, (int[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof long[]) && (t2 instanceof long[])) {
                    if (!Arrays.equals((long[]) t, (long[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof float[]) && (t2 instanceof float[])) {
                    if (!Arrays.equals((float[]) t, (float[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof double[]) && (t2 instanceof double[])) {
                    if (!Arrays.equals((double[]) t, (double[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof char[]) && (t2 instanceof char[])) {
                    if (!Arrays.equals((char[]) t, (char[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof boolean[]) && (t2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) t, (boolean[]) t2)) {
                        return false;
                    }
                } else if ((t instanceof Ww2) && (t2 instanceof Ww2)) {
                    if (!Pw2.Y0(((Ww2) t).L(), ((Ww2) t2).L())) {
                        return false;
                    }
                } else if ((t instanceof Yx2) && (t2 instanceof Yx2)) {
                    if (!Pw2.W0(((Yx2) t).L(), ((Yx2) t2).L())) {
                        return false;
                    }
                } else if ((t instanceof C8395nx2) && (t2 instanceof C8395nx2)) {
                    if (!Pw2.X0(((C8395nx2) t).L(), ((C8395nx2) t2).L())) {
                        return false;
                    }
                } else if ((t instanceof C10103ux2) && (t2 instanceof C10103ux2)) {
                    if (!Pw2.Z0(((C10103ux2) t).L(), ((C10103ux2) t2).L())) {
                        return false;
                    }
                } else if (!C6562gT0.g(t, t2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @HK1
    @NotNull
    @InterfaceC8046mW0(name = "contentDeepToString")
    @InterfaceC6480g82(version = "1.3")
    public static final <T> String h(@Nullable T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((C5075aO1.B(tArr.length, 429496729) * 5) + 2);
        i(tArr, sb, new ArrayList());
        return sb.toString();
    }

    public static final <T> void i(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(C6566gU0.h);
            }
            T t = tArr[i];
            if (t == null) {
                sb.append("null");
            } else if (t instanceof Object[]) {
                i((Object[]) t, sb, list);
                C7458kA2 c7458kA2 = C7458kA2.a;
            } else if (t instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) t);
                C6562gT0.o(arrays, "toString(...)");
                sb.append(arrays);
            } else if (t instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) t);
                C6562gT0.o(arrays2, "toString(...)");
                sb.append(arrays2);
            } else if (t instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) t);
                C6562gT0.o(arrays3, "toString(...)");
                sb.append(arrays3);
            } else if (t instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) t);
                C6562gT0.o(arrays4, "toString(...)");
                sb.append(arrays4);
            } else if (t instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) t);
                C6562gT0.o(arrays5, "toString(...)");
                sb.append(arrays5);
            } else if (t instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) t);
                C6562gT0.o(arrays6, "toString(...)");
                sb.append(arrays6);
            } else if (t instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) t);
                C6562gT0.o(arrays7, "toString(...)");
                sb.append(arrays7);
            } else if (t instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) t);
                C6562gT0.o(arrays8, "toString(...)");
                sb.append(arrays8);
            } else if (t instanceof Ww2) {
                sb.append(Pw2.e1(((Ww2) t).L()));
            } else if (t instanceof Yx2) {
                sb.append(Pw2.g1(((Yx2) t).L()));
            } else if (t instanceof C8395nx2) {
                sb.append(Pw2.f1(((C8395nx2) t).L()));
            } else if (t instanceof C10103ux2) {
                sb.append(Pw2.h1(((C10103ux2) t).L()));
            } else {
                sb.append(t.toString());
            }
        }
        sb.append(']');
        list.remove(C8222nF.J(list));
    }

    @NotNull
    public static final <T> List<T> j(@NotNull T[][] tArr) {
        C6562gT0.p(tArr, "<this>");
        int i = 0;
        for (T[] tArr2 : tArr) {
            i += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i);
        for (T[] tArr3 : tArr) {
            C9444sF.s0(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lo/FA0<+TR;>;)TR; */
    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final Object k(Object[] objArr, FA0 fa0) {
        C6562gT0.p(fa0, "defaultValue");
        if (objArr.length == 0) {
            return fa0.invoke();
        }
        return objArr;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final boolean l(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final <T, R> C4180Rx1<List<T>, List<R>> m(@NotNull C4180Rx1<? extends T, ? extends R>[] c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "<this>");
        ArrayList arrayList = new ArrayList(c4180Rx1Arr.length);
        ArrayList arrayList2 = new ArrayList(c4180Rx1Arr.length);
        for (C4180Rx1<? extends T, ? extends R> c4180Rx1 : c4180Rx1Arr) {
            arrayList.add(c4180Rx1.e());
            arrayList2.add(c4180Rx1.f());
        }
        return C6670gv2.a(arrayList, arrayList2);
    }
}
