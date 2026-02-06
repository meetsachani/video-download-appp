package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.C3771Nr1;

/* renamed from: o.Sr1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4260Sr1 {
    public static final String a = "NotificationCompat";
    public static final String b = "android.support.dataRemoteInputs";
    public static final String c = "android.support.allowGeneratedReplies";
    public static final String d = "icon";
    public static final String e = "title";
    public static final String f = "actionIntent";
    public static final String g = "extras";
    public static final String h = "remoteInputs";
    public static final String i = "dataOnlyRemoteInputs";
    public static final String j = "resultKey";
    public static final String k = "label";
    public static final String l = "choices";
    public static final String m = "allowFreeFormInput";
    public static final String n = "allowedDataTypes";

    /* renamed from: o  reason: collision with root package name */
    public static final String f613o = "semanticAction";
    public static final String p = "showsUserInterface";
    public static Field r;
    public static boolean s;
    public static Field u;
    public static Field v;
    public static Field w;
    public static Field x;
    public static boolean y;
    public static final Object q = new Object();
    public static final Object t = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    public static boolean b() {
        if (y) {
            return false;
        }
        try {
            if (u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                v = cls.getDeclaredField("icon");
                w = cls.getDeclaredField("title");
                x = cls.getDeclaredField(f);
                Field declaredField = Notification.class.getDeclaredField(C3771Nr1.A.y);
                u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e2) {
            Log.e(a, "Unable to access notification actions", e2);
            y = true;
        } catch (NoSuchFieldException e3) {
            Log.e(a, "Unable to access notification actions", e3);
            y = true;
        }
        return !y;
    }

    public static C7282jR1 c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new C7282jR1(bundle.getString(j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(l), bundle.getBoolean(m), 0, bundle.getBundle("extras"), hashSet);
    }

    public static C7282jR1[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        C7282jR1[] c7282jR1Arr = new C7282jR1[bundleArr.length];
        for (int i2 = 0; i2 < bundleArr.length; i2++) {
            c7282jR1Arr[i2] = c(bundleArr[i2]);
        }
        return c7282jR1Arr;
    }

    public static C3771Nr1.b e(Notification notification, int i2) {
        Bundle bundle;
        SparseArray sparseParcelableArray;
        synchronized (t) {
            try {
                try {
                    Object[] h2 = h(notification);
                    if (h2 != null) {
                        Object obj = h2[i2];
                        Bundle k2 = k(notification);
                        if (k2 != null && (sparseParcelableArray = k2.getSparseParcelableArray(C4160Rr1.e)) != null) {
                            bundle = (Bundle) sparseParcelableArray.get(i2);
                        } else {
                            bundle = null;
                        }
                        return l(v.getInt(obj), (CharSequence) w.get(obj), (PendingIntent) x.get(obj), bundle);
                    }
                } catch (IllegalAccessException e2) {
                    Log.e(a, "Unable to access notification actions", e2);
                    y = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(Notification notification) {
        int i2;
        synchronized (t) {
            try {
                Object[] h2 = h(notification);
                if (h2 != null) {
                    i2 = h2.length;
                } else {
                    i2 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public static C3771Nr1.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean(c, false);
        }
        return new C3771Nr1.b(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f), bundle.getBundle("extras"), d(i(bundle, h)), d(i(bundle, i)), z, bundle.getInt(f613o), bundle.getBoolean(p), false, false);
    }

    public static Object[] h(Notification notification) {
        synchronized (t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[]) u.get(notification);
            } catch (IllegalAccessException e2) {
                Log.e(a, "Unable to access notification actions", e2);
                y = true;
                return null;
            }
        }
    }

    public static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
            Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
            bundle.putParcelableArray(str, bundleArr);
            return bundleArr;
        }
        return (Bundle[]) parcelableArray;
    }

    public static Bundle j(C3771Nr1.b bVar) {
        int i2;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat f2 = bVar.f();
        if (f2 != null) {
            i2 = f2.y();
        } else {
            i2 = 0;
        }
        bundle2.putInt("icon", i2);
        bundle2.putCharSequence("title", bVar.j());
        bundle2.putParcelable(f, bVar.a());
        if (bVar.d() != null) {
            bundle = new Bundle(bVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(c, bVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray(h, n(bVar.g()));
        bundle2.putBoolean(p, bVar.i());
        bundle2.putInt(f613o, bVar.h());
        return bundle2;
    }

    public static Bundle k(Notification notification) {
        synchronized (q) {
            if (s) {
                return null;
            }
            try {
                if (r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(a, "Notification.extras field is not of type Bundle");
                        s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    r = declaredField;
                }
                Bundle bundle = (Bundle) r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                Log.e(a, "Unable to access notification extras", e2);
                s = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e(a, "Unable to access notification extras", e3);
                s = true;
                return null;
            }
        }
    }

    public static C3771Nr1.b l(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z;
        C7282jR1[] c7282jR1Arr;
        C7282jR1[] c7282jR1Arr2;
        if (bundle != null) {
            C7282jR1[] d2 = d(i(bundle, C4160Rr1.f));
            C7282jR1[] d3 = d(i(bundle, b));
            z = bundle.getBoolean(c);
            c7282jR1Arr = d2;
            c7282jR1Arr2 = d3;
        } else {
            z = false;
            c7282jR1Arr = null;
            c7282jR1Arr2 = null;
        }
        return new C3771Nr1.b(i2, charSequence, pendingIntent, bundle, c7282jR1Arr, c7282jR1Arr2, z, 0, true, false, false);
    }

    public static Bundle m(C7282jR1 c7282jR1) {
        Bundle bundle = new Bundle();
        bundle.putString(j, c7282jR1.o());
        bundle.putCharSequence("label", c7282jR1.n());
        bundle.putCharSequenceArray(l, c7282jR1.h());
        bundle.putBoolean(m, c7282jR1.f());
        bundle.putBundle("extras", c7282jR1.m());
        Set<String> g2 = c7282jR1.g();
        if (g2 != null && !g2.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(g2.size());
            for (String str : g2) {
                arrayList.add(str);
            }
            bundle.putStringArrayList(n, arrayList);
        }
        return bundle;
    }

    public static Bundle[] n(C7282jR1[] c7282jR1Arr) {
        if (c7282jR1Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c7282jR1Arr.length];
        for (int i2 = 0; i2 < c7282jR1Arr.length; i2++) {
            bundleArr[i2] = m(c7282jR1Arr[i2]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, C3771Nr1.b bVar) {
        int i2;
        IconCompat f2 = bVar.f();
        if (f2 != null) {
            i2 = f2.y();
        } else {
            i2 = 0;
        }
        builder.addAction(i2, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray(C4160Rr1.f, n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray(b, n(bVar.c()));
        }
        bundle.putBoolean(c, bVar.b());
        return bundle;
    }
}
