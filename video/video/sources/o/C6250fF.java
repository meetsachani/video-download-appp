package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "CollectionToArray")
@InterfaceC8303na2({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n*E\n"})
/* renamed from: o.fF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6250fF {
    @NotNull
    public static final Object[] a = new Object[0];
    public static final int b = 2147483645;

    @InterfaceC9150r20(message = "This function will be made internal in a future release")
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.9")
    @NotNull
    @InterfaceC8046mW0(name = "toArray")
    public static final Object[] a(@NotNull Collection<?> collection) {
        C6562gT0.p(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return a;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return a;
        }
        Object[] objArr = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr[i] = it.next();
            if (i2 >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = b;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i3);
                C6562gT0.o(objArr, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr, i2);
                C6562gT0.o(copyOf, "copyOf(...)");
                return copyOf;
            }
            i = i2;
        }
    }

    @InterfaceC9150r20(message = "This function will be made internal in a future release")
    @InterfaceC9636t20(errorSince = "2.1", warningSince = "1.9")
    @NotNull
    @InterfaceC8046mW0(name = "toArray")
    public static final Object[] b(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArr2;
        C6562gT0.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator<?> it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    C6562gT0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = b;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        C6562gT0.o(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        C6562gT0.o(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return objArr;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final Object[] c(Collection<?> collection, FA0<Object[]> fa0, HA0<? super Integer, Object[]> ha0, VA0<? super Object[], ? super Integer, Object[]> va0) {
        int size = collection.size();
        if (size == 0) {
            return fa0.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return fa0.invoke();
        }
        int i = 0;
        ?? r3 = ha0.invoke(Integer.valueOf(size));
        while (true) {
            int i2 = i + 1;
            r3[i] = it.next();
            if (i2 >= r3.length) {
                if (!it.hasNext()) {
                    return r3;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = b;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                r3 = Arrays.copyOf((Object[]) r3, i3);
                C6562gT0.o(r3, "copyOf(...)");
            } else if (!it.hasNext()) {
                return va0.i(r3, Integer.valueOf(i2));
            }
            i = i2;
            r3 = r3;
        }
    }
}
