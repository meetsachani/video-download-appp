package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C8704pD2;

/* renamed from: o.qD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8947qD2 {
    public static final String a = "MOBILE";
    public static final String b = "BRAND_VERSION_LIST";
    public static final String c = "FULL_VERSION";
    public static final String d = "PLATFORM";
    public static final String e = "PLATFORM_VERSION";
    public static final String f = "ARCHITECTURE";
    public static final String g = "MODEL";
    public static final String h = "BITNESS";
    public static final String i = "WOW64";
    public static final int j = 3;

    public static Map<String, Object> a(C8704pD2 c8704pD2) {
        HashMap hashMap = new HashMap();
        hashMap.put(b, b(c8704pD2.c()));
        hashMap.put(c, c8704pD2.d());
        hashMap.put(d, c8704pD2.f());
        hashMap.put(e, c8704pD2.g());
        hashMap.put(f, c8704pD2.a());
        hashMap.put(g, c8704pD2.e());
        hashMap.put(a, Boolean.valueOf(c8704pD2.h()));
        hashMap.put(h, Integer.valueOf(c8704pD2.b()));
        hashMap.put(i, Boolean.valueOf(c8704pD2.i()));
        return hashMap;
    }

    public static String[][] b(List<C8704pD2.b> list) {
        if (list != null && !list.isEmpty()) {
            String[][] strArr = (String[][]) Array.newInstance(String.class, list.size(), 3);
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2][0] = list.get(i2).a();
                strArr[i2][1] = list.get(i2).c();
                strArr[i2][2] = list.get(i2).b();
            }
            return strArr;
        }
        return null;
    }

    public static C8704pD2 c(Map<String, Object> map) {
        String[][] strArr;
        C8704pD2.c cVar = new C8704pD2.c();
        Object obj = map.get(b);
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            for (String[] strArr2 : (String[][]) obj) {
                arrayList.add(new C8704pD2.b.a().b(strArr2[0]).d(strArr2[1]).c(strArr2[2]).a());
            }
            cVar.d(arrayList);
        }
        String str = (String) map.get(c);
        if (str != null) {
            cVar.e(str);
        }
        String str2 = (String) map.get(d);
        if (str2 != null) {
            cVar.h(str2);
        }
        String str3 = (String) map.get(e);
        if (str3 != null) {
            cVar.i(str3);
        }
        String str4 = (String) map.get(f);
        if (str4 != null) {
            cVar.b(str4);
        }
        String str5 = (String) map.get(g);
        if (str5 != null) {
            cVar.g(str5);
        }
        Boolean bool = (Boolean) map.get(a);
        if (bool != null) {
            cVar.f(bool.booleanValue());
        }
        Integer num = (Integer) map.get(h);
        if (num != null) {
            cVar.c(num.intValue());
        }
        Boolean bool2 = (Boolean) map.get(i);
        if (bool2 != null) {
            cVar.j(bool2.booleanValue());
        }
        return cVar.a();
    }
}
