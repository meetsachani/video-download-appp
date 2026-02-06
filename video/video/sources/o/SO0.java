package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class SO0 {
    public static final SharedPreferences A;
    public static final SharedPreferences B;
    @NotNull
    public static final SO0 a = new SO0();
    @NotNull
    public static final HashMap<String, Method> b = new HashMap<>();
    @NotNull
    public static final HashMap<String, Class<?>> c = new HashMap<>();
    public static final int d = 604800;
    public static final int e = 43200;
    @NotNull
    public static final String f = "subs";
    @NotNull
    public static final String g = "inapp";
    public static final int h = 86400;
    public static final int i = 1200;
    public static final int j = 30;
    @NotNull
    public static final String k = "com.android.vending.billing.IInAppBillingService$Stub";
    @NotNull
    public static final String l = "com.android.vending.billing.IInAppBillingService";
    @NotNull
    public static final String m = "asInterface";
    @NotNull
    public static final String n = "getSkuDetails";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f610o = "getPurchases";
    @NotNull
    public static final String p = "getPurchaseHistory";
    @NotNull
    public static final String q = "isBillingSupported";
    @NotNull
    public static final String r = "ITEM_ID_LIST";
    @NotNull
    public static final String s = "RESPONSE_CODE";
    @NotNull
    public static final String t = "DETAILS_LIST";
    @NotNull
    public static final String u = "INAPP_PURCHASE_DATA_LIST";
    @NotNull
    public static final String v = "INAPP_CONTINUATION_TOKEN";
    @NotNull
    public static final String w = "LAST_CLEARED_TIME";
    public static final String x;
    @NotNull
    public static final String y = "com.facebook.internal.SKU_DETAILS";
    @NotNull
    public static final String z = "com.facebook.internal.PURCHASE";

    static {
        com.facebook.M m2 = com.facebook.M.a;
        x = com.facebook.M.n().getPackageName();
        A = com.facebook.M.n().getSharedPreferences(y, 0);
        B = com.facebook.M.n().getSharedPreferences(z, 0);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Object a(@NotNull Context context, @Nullable IBinder iBinder) {
        if (SQ.e(SO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            return a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", m, null, new Object[]{iBinder});
        } catch (Throwable th) {
            SQ.c(th, SO0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void b() {
        if (!SQ.e(SO0.class)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = A;
                long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                if (j2 == 0) {
                    sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                } else if (currentTimeMillis - j2 > 604800) {
                    sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                }
            } catch (Throwable th) {
                SQ.c(th, SO0.class);
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final ArrayList<String> g(@NotNull Context context, @Nullable Object obj) {
        SO0 so0;
        Class<?> d2;
        if (SQ.e(SO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && (d2 = (so0 = a).d(context, l)) != null && so0.e(d2, p) != null) {
                return so0.c(so0.f(context, obj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, SO0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final ArrayList<String> i(@NotNull Context context, @Nullable Object obj) {
        if (SQ.e(SO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            SO0 so0 = a;
            return so0.c(so0.h(context, obj, "inapp"));
        } catch (Throwable th) {
            SQ.c(th, SO0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final ArrayList<String> j(@NotNull Context context, @Nullable Object obj) {
        if (SQ.e(SO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            SO0 so0 = a;
            return so0.c(so0.h(context, obj, f));
        } catch (Throwable th) {
            SQ.c(th, SO0.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Map<String, String> k(@NotNull Context context, @NotNull ArrayList<String> arrayList, @Nullable Object obj, boolean z2) {
        if (SQ.e(SO0.class)) {
            return null;
        }
        try {
            C6562gT0.p(context, "context");
            C6562gT0.p(arrayList, "skuList");
            Map<String, String> p2 = a.p(arrayList);
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!p2.containsKey(next)) {
                    arrayList2.add(next);
                }
            }
            p2.putAll(a.l(context, arrayList2, obj, z2));
            return p2;
        } catch (Throwable th) {
            SQ.c(th, SO0.class);
            return null;
        }
    }

    public final ArrayList<String> c(ArrayList<String> arrayList) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = B.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString(RO0.z);
                    long j2 = jSONObject.getLong(UO0.e);
                    String string2 = jSONObject.getString(C9998uW1.j);
                    if (currentTimeMillis - (j2 / 1000) <= 86400 && !C6562gT0.g(B.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final Class<?> d(Context context, String str) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = c;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            XO0 xo0 = XO0.a;
            Class<?> b2 = XO0.b(context, str);
            if (b2 != null) {
                hashMap.put(str, b2);
                return b2;
            }
            return b2;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method e(Class<?> cls, String str) {
        Class[] clsArr;
        Method c2;
        if (SQ.e(this)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = b;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            int hashCode = str.hashCode();
            Class cls2 = Integer.TYPE;
            switch (hashCode) {
                case -1801122596:
                    if (str.equals(f610o)) {
                        C6562gT0.o(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (str.equals(q)) {
                        C6562gT0.o(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -1123215065:
                    if (str.equals(m)) {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -594356707:
                    if (str.equals(p)) {
                        C6562gT0.o(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                case -573310373:
                    if (str.equals(n)) {
                        C6562gT0.o(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, Bundle.class};
                        break;
                    } else {
                        clsArr = null;
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                XO0 xo0 = XO0.a;
                c2 = XO0.c(cls, str, null);
            } else {
                XO0 xo02 = XO0.a;
                c2 = XO0.c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (c2 != null) {
                hashMap.put(str, c2);
            }
            return c2;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final ArrayList<String> f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (SQ.e(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (o(context, obj, str)) {
                int i2 = 0;
                String str2 = null;
                boolean z2 = false;
                do {
                    Object n2 = n(context, l, p, obj, new Object[]{6, x, str, str2, new Bundle()});
                    if (n2 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) n2;
                        if (bundle.getInt(s) == 0 && (stringArrayList = bundle.getStringArrayList(u)) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong(UO0.e) / 1000) > 1200) {
                                    z2 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i2++;
                            }
                            str2 = bundle.getString(v);
                            if (i2 < 30 || str2 == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i2 < 30) {
                        break;
                    }
                } while (!z2);
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final ArrayList<String> h(Context context, Object obj, String str) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && o(context, obj, str)) {
                int i2 = 0;
                String str2 = null;
                while (true) {
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object n2 = n(context2, l, f610o, obj2, new Object[]{3, x, str, str2});
                        if (n2 != null) {
                            Bundle bundle = (Bundle) n2;
                            if (bundle.getInt(s) == 0) {
                                ArrayList<String> stringArrayList = bundle.getStringArrayList(u);
                                if (stringArrayList == null) {
                                    break;
                                }
                                i2 += stringArrayList.size();
                                arrayList.addAll(stringArrayList);
                                str2 = bundle.getString(v);
                                if (i2 < 30 || str2 == null) {
                                    break;
                                    break;
                                }
                                context = context2;
                                obj = obj2;
                            }
                        }
                        str2 = null;
                        if (i2 < 30) {
                            break;
                        }
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th) {
                        th = th;
                        SQ.c(th, this);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:14:0x002e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.util.Map<java.lang.String, java.lang.String> l(android.content.Context r12, java.util.ArrayList<java.lang.String> r13, java.lang.Object r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = o.SQ.e(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L8d
            r0.<init>()     // Catch: java.lang.Throwable -> L8d
            if (r14 == 0) goto L15
            boolean r2 = r13.isEmpty()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L18
        L15:
            r5 = r11
            goto L90
        L18:
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "ITEM_ID_LIST"
            r2.putStringArrayList(r3, r13)     // Catch: java.lang.Throwable -> L8d
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = o.SO0.x     // Catch: java.lang.Throwable -> L8d
            if (r15 == 0) goto L32
            java.lang.String r15 = "subs"
            goto L34
        L2e:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L91
        L32:
            java.lang.String r15 = "inapp"
        L34:
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r4, r15, r2}     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r8 = "getSkuDetails"
            r5 = r11
            r6 = r12
            r9 = r14
            java.lang.Object r12 = r5.n(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L86
            if (r12 == 0) goto L90
            android.os.Bundle r12 = (android.os.Bundle) r12     // Catch: java.lang.Throwable -> L86
            java.lang.String r14 = "RESPONSE_CODE"
            int r14 = r12.getInt(r14)     // Catch: java.lang.Throwable -> L86
            if (r14 != 0) goto L90
            java.lang.String r14 = "DETAILS_LIST"
            java.util.ArrayList r12 = r12.getStringArrayList(r14)     // Catch: java.lang.Throwable -> L86
            if (r12 == 0) goto L89
            int r14 = r13.size()     // Catch: java.lang.Throwable -> L86
            int r15 = r12.size()     // Catch: java.lang.Throwable -> L86
            if (r14 != r15) goto L89
            int r14 = r13.size()     // Catch: java.lang.Throwable -> L86
            int r14 = r14 + (-1)
            if (r14 < 0) goto L89
            r15 = 0
        L6a:
            int r2 = r15 + 1
            java.lang.Object r3 = r13.get(r15)     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "skuList[i]"
            o.C6562gT0.o(r3, r4)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r15 = r12.get(r15)     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "skuDetailsList[i]"
            o.C6562gT0.o(r15, r4)     // Catch: java.lang.Throwable -> L86
            r0.put(r3, r15)     // Catch: java.lang.Throwable -> L86
            if (r2 <= r14) goto L84
            goto L89
        L84:
            r15 = r2
            goto L6a
        L86:
            r0 = move-exception
        L87:
            r12 = r0
            goto L91
        L89:
            r11.q(r0)     // Catch: java.lang.Throwable -> L86
            return r0
        L8d:
            r0 = move-exception
            r5 = r11
            goto L87
        L90:
            return r0
        L91:
            o.SQ.c(r12, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SO0.l(android.content.Context, java.util.ArrayList, java.lang.Object, boolean):java.util.Map");
    }

    public final boolean m(@NotNull String str) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            C6562gT0.p(str, "skuDetail");
            try {
                String optString = new JSONObject(str).optString("freeTrialPeriod");
                if (optString != null) {
                    if (optString.length() > 0) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e2;
        if (SQ.e(this)) {
            return null;
        }
        try {
            Class<?> d2 = d(context, str);
            if (d2 == null || (e2 = e(d2, str2)) == null) {
                return null;
            }
            XO0 xo0 = XO0.a;
            return XO0.e(d2, e2, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean o(Context context, Object obj, String str) {
        if (SQ.e(this) || obj == null) {
            return false;
        }
        try {
            try {
                Object n2 = n(context, l, q, obj, new Object[]{3, x, str});
                if (n2 != null) {
                    if (((Integer) n2).intValue() == 0) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                SQ.c(th, this);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Map<String, String> p(ArrayList<String> arrayList) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String string = A.getString(next, null);
                if (string != null) {
                    List o5 = C10763xf2.o5(string, new String[]{";"}, false, 2, 2, null);
                    if (currentTimeMillis - Long.parseLong((String) o5.get(0)) < 43200) {
                        C6562gT0.o(next, "sku");
                        linkedHashMap.put(next, o5.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void q(Map<String, String> map) {
        if (SQ.e(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = A.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + C10928yK2.l + entry.getValue());
            }
            edit.apply();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
