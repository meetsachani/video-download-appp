package o;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: o.yT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10963yT1 {
    public static final String a = "ResourcesFlusher";
    public static Field b;
    public static boolean c;
    public static Class<?> d;
    public static boolean e;
    public static Field f;
    public static boolean g;
    public static Field h;
    public static boolean i;

    public static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        d(resources);
    }

    public static void b(Resources resources) {
        Map map;
        if (!c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(a, "Could not retrieve Resources#mDrawableCache field", e2);
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(a, "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Resources resources) {
        Object obj;
        if (!c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(a, "Could not retrieve Resources#mDrawableCache field", e2);
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(a, "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (obj != null) {
                return;
            }
            e(obj);
            return;
        }
        obj = null;
        if (obj != null) {
        }
    }

    public static void d(Resources resources) {
        Object obj;
        if (!i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(a, "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            i = true;
        }
        Field field = h;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(a, "Could not retrieve value from Resources#mResourcesImpl", e3);
                obj = null;
            }
            if (obj != null) {
                if (!c) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        b = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e(a, "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                    }
                    c = true;
                }
                Field field2 = b;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e5) {
                        Log.e(a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                    }
                }
                if (obj2 != null) {
                    e(obj2);
                }
            }
        }
    }

    public static void e(Object obj) {
        LongSparseArray longSparseArray;
        if (!e) {
            try {
                d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e(a, "Could not find ThemedResourceCache class", e2);
            }
            e = true;
        }
        Class<?> cls = d;
        if (cls != null) {
            if (!g) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e(a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                g = true;
            }
            Field field = f;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e(a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
