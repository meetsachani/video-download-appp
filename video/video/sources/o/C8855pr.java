package o;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC5317bO0;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.pr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8855pr {
    public static HashMap<String, String> a(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    public static AbstractC6044eO0<String, String> b(Bundle bundle) {
        if (bundle == Bundle.EMPTY) {
            return AbstractC6044eO0.u();
        }
        return AbstractC6044eO0.g(a(bundle));
    }

    public static void c(@InterfaceC11300zs1 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) TD2.o(C8855pr.class.getClassLoader()));
        }
    }

    public static <T extends InterfaceC8368nr> AbstractC5317bO0<T> d(InterfaceC8368nr.a<T> aVar, List<Bundle> list) {
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (int i = 0; i < list.size(); i++) {
            r.g(aVar.a((Bundle) C9542sf.g(list.get(i))));
        }
        return r.e();
    }

    public static <T extends InterfaceC8368nr> SparseArray<T> e(InterfaceC8368nr.a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), aVar.a(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static Bundle f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        if (bundle3 != null) {
            return bundle3;
        }
        return bundle2;
    }

    public static ArrayList<Integer> g(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        return arrayList;
    }

    public static Bundle h(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T extends InterfaceC8368nr> ArrayList<Bundle> i(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (T t : collection) {
            arrayList.add(t.e());
        }
        return arrayList;
    }

    public static <T extends InterfaceC8368nr> AbstractC5317bO0<Bundle> j(List<T> list) {
        return k(list, new YA0() { // from class: o.or
            @Override // o.YA0
            public final Object apply(Object obj) {
                return ((InterfaceC8368nr) obj).e();
            }
        });
    }

    public static <T extends InterfaceC8368nr> AbstractC5317bO0<Bundle> k(List<T> list, YA0<T, Bundle> ya0) {
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (int i = 0; i < list.size(); i++) {
            r.g(ya0.apply(list.get(i)));
        }
        return r.e();
    }

    public static <T extends InterfaceC8368nr> SparseArray<Bundle> l(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i).e());
        }
        return sparseArray2;
    }
}
