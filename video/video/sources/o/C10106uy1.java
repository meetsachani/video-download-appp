package o;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.uy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10106uy1 {

    /* renamed from: o.uy1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static <T extends Parcelable> List<T> a(Parcel parcel, List<T> list, ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }

        public static void b(Parcel parcel, boolean z) {
            parcel.writeBoolean(z);
        }
    }

    /* renamed from: o.uy1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static Parcelable.Creator<?> a(Parcel parcel, ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    /* renamed from: o.uy1$c */
    /* loaded from: classes.dex */
    public static class c {
        public static <T> T[] a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        public static <T> ArrayList<T> b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        public static <V, K> HashMap<K, V> c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        public static <T> void d(Parcel parcel, List<? super T> list, ClassLoader classLoader, Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        public static <K, V> void e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        public static <T extends Parcelable> T f(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        public static <T> T[] g(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        public static <T> Parcelable.Creator<T> h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        public static <T> List<T> i(Parcel parcel, List<T> list, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        public static <T extends Serializable> T j(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        public static <T> SparseArray<T> k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    public static <T> Object[] a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(parcel, classLoader, cls);
        }
        return parcel.readArray(classLoader);
    }

    public static <T> ArrayList<T> b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(parcel, classLoader, cls);
        }
        return parcel.readArrayList(classLoader);
    }

    public static boolean c(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static <K, V> HashMap<K, V> d(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.c(parcel, classLoader, cls, cls2);
        }
        return parcel.readHashMap(classLoader);
    }

    public static <T> void e(Parcel parcel, List<? super T> list, ClassLoader classLoader, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    public static <K, V> void f(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    public static <T extends Parcelable> T g(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) c.f(parcel, classLoader, cls);
        }
        T t = (T) parcel.readParcelable(classLoader);
        if (t != null && !cls.isInstance(t)) {
            throw new BadParcelableException("Parcelable " + t.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
        }
        return t;
    }

    @Deprecated
    public static <T> T[] h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T[]) c.g(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i = 0; i < tArr.length; i++) {
            try {
                tArr2[i] = cls.cast(tArr[i]);
            } catch (ClassCastException unused) {
                throw new BadParcelableException("Parcelable at index " + i + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
            }
        }
        return tArr2;
    }

    public static <T> Parcelable[] i(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) c.g(parcel, classLoader, cls);
        }
        return parcel.readParcelableArray(classLoader);
    }

    public static <T> Parcelable.Creator<T> j(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.h(parcel, classLoader, cls);
        }
        return (Parcelable.Creator<T>) b.a(parcel, classLoader);
    }

    public static <T> List<T> k(Parcel parcel, List<T> list, ClassLoader classLoader, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.i(parcel, list, classLoader, cls);
        }
        return a.a(parcel, list, classLoader);
    }

    public static <T extends Serializable> T l(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (T) c.j(parcel, classLoader, cls);
        }
        return (T) parcel.readSerializable();
    }

    public static <T> SparseArray<T> m(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.k(parcel, classLoader, cls);
        }
        return parcel.readSparseArray(classLoader);
    }

    public static void n(Parcel parcel, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(parcel, z);
        } else {
            parcel.writeInt(z ? 1 : 0);
        }
    }
}
