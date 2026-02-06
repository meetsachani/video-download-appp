package o;

import com.facebook.appevents.C2326p;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.EnumC4887Zc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ed  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6097ed {
    @NotNull
    public static final C6097ed a = new C6097ed();
    @NotNull
    public static final String b = "AppEventsConversionsAPITransformer";
    @NotNull
    public static final Map<EnumC5127ad, c> c;
    @InterfaceC7058iW0
    @NotNull
    public static final Map<EnumC7531kT, b> d;
    @InterfaceC7058iW0
    @NotNull
    public static final Map<String, YM> e;

    /* renamed from: o.ed$a */
    /* loaded from: classes2.dex */
    public enum a {
        OPTIONS(com.facebook.M.I),
        COUNTRY(com.facebook.M.J),
        STATE(com.facebook.M.K);
        
        @NotNull
        public static final C0274a Y = new C0274a(null);
        @NotNull
        public final String X;

        /* renamed from: o.ed$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0274a {
            public /* synthetic */ C0274a(C9516sY c9516sY) {
                this();
            }

            @Nullable
            public final a a(@NotNull String str) {
                a[] valuesCustom;
                C6562gT0.p(str, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (C6562gT0.g(aVar.g(), str)) {
                        return aVar;
                    }
                }
                return null;
            }

            public C0274a() {
            }
        }

        a(String str) {
            this.X = str;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @NotNull
        public final String g() {
            return this.X;
        }
    }

    /* renamed from: o.ed$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @Nullable
        public ZM a;
        @NotNull
        public XM b;

        public b(@Nullable ZM zm, @NotNull XM xm) {
            C6562gT0.p(xm, "field");
            this.a = zm;
            this.b = xm;
        }

        public static /* synthetic */ b d(b bVar, ZM zm, XM xm, int i, Object obj) {
            if ((i & 1) != 0) {
                zm = bVar.a;
            }
            if ((i & 2) != 0) {
                xm = bVar.b;
            }
            return bVar.c(zm, xm);
        }

        @Nullable
        public final ZM a() {
            return this.a;
        }

        @NotNull
        public final XM b() {
            return this.b;
        }

        @NotNull
        public final b c(@Nullable ZM zm, @NotNull XM xm) {
            C6562gT0.p(xm, "field");
            return new b(zm, xm);
        }

        @NotNull
        public final XM e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        @Nullable
        public final ZM f() {
            return this.a;
        }

        public final void g(@NotNull XM xm) {
            C6562gT0.p(xm, "<set-?>");
            this.b = xm;
        }

        public final void h(@Nullable ZM zm) {
            this.a = zm;
        }

        public int hashCode() {
            int hashCode;
            ZM zm = this.a;
            if (zm == null) {
                hashCode = 0;
            } else {
                hashCode = zm.hashCode();
            }
            return (hashCode * 31) + this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.a + ", field=" + this.b + ')';
        }
    }

    /* renamed from: o.ed$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @NotNull
        public ZM a;
        @Nullable
        public EnumC5069aN b;

        public c(@NotNull ZM zm, @Nullable EnumC5069aN enumC5069aN) {
            C6562gT0.p(zm, "section");
            this.a = zm;
            this.b = enumC5069aN;
        }

        public static /* synthetic */ c d(c cVar, ZM zm, EnumC5069aN enumC5069aN, int i, Object obj) {
            if ((i & 1) != 0) {
                zm = cVar.a;
            }
            if ((i & 2) != 0) {
                enumC5069aN = cVar.b;
            }
            return cVar.c(zm, enumC5069aN);
        }

        @NotNull
        public final ZM a() {
            return this.a;
        }

        @Nullable
        public final EnumC5069aN b() {
            return this.b;
        }

        @NotNull
        public final c c(@NotNull ZM zm, @Nullable EnumC5069aN enumC5069aN) {
            C6562gT0.p(zm, "section");
            return new c(zm, enumC5069aN);
        }

        @Nullable
        public final EnumC5069aN e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == cVar.a && this.b == cVar.b) {
                return true;
            }
            return false;
        }

        @NotNull
        public final ZM f() {
            return this.a;
        }

        public final void g(@Nullable EnumC5069aN enumC5069aN) {
            this.b = enumC5069aN;
        }

        public final void h(@NotNull ZM zm) {
            C6562gT0.p(zm, "<set-?>");
            this.a = zm;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            EnumC5069aN enumC5069aN = this.b;
            if (enumC5069aN == null) {
                hashCode = 0;
            } else {
                hashCode = enumC5069aN.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @NotNull
        public String toString() {
            return "SectionFieldMapping(section=" + this.a + ", field=" + this.b + ')';
        }
    }

    /* renamed from: o.ed$d */
    /* loaded from: classes2.dex */
    public enum d {
        ARRAY,
        BOOL,
        INT;
        
        @NotNull
        public static final a X = new a(null);

        /* renamed from: o.ed$d$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @Nullable
            public final d a(@NotNull String str) {
                C6562gT0.p(str, "rawValue");
                if (C6562gT0.g(str, EnumC5127ad.EXT_INFO.g())) {
                    return d.ARRAY;
                }
                if (C6562gT0.g(str, EnumC5127ad.URL_SCHEMES.g())) {
                    return d.ARRAY;
                }
                if (C6562gT0.g(str, EnumC7531kT.CONTENT_IDS.g())) {
                    return d.ARRAY;
                }
                if (C6562gT0.g(str, EnumC7531kT.CONTENTS.g())) {
                    return d.ARRAY;
                }
                if (C6562gT0.g(str, a.OPTIONS.g())) {
                    return d.ARRAY;
                }
                if (C6562gT0.g(str, EnumC5127ad.ADV_TE.g())) {
                    return d.BOOL;
                }
                if (C6562gT0.g(str, EnumC5127ad.APP_TE.g())) {
                    return d.BOOL;
                }
                if (C6562gT0.g(str, EnumC7531kT.EVENT_TIME.g())) {
                    return d.INT;
                }
                return null;
            }

            public a() {
            }
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: o.ed$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            a = iArr;
            int[] iArr2 = new int[ZM.valuesCustom().length];
            iArr2[ZM.APP_DATA.ordinal()] = 1;
            iArr2[ZM.USER_DATA.ordinal()] = 2;
            b = iArr2;
            int[] iArr3 = new int[EnumC4887Zc.valuesCustom().length];
            iArr3[EnumC4887Zc.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[EnumC4887Zc.CUSTOM.ordinal()] = 2;
            c = iArr3;
        }
    }

    static {
        EnumC5127ad enumC5127ad = EnumC5127ad.ANON_ID;
        ZM zm = ZM.USER_DATA;
        C4180Rx1 a2 = C6670gv2.a(enumC5127ad, new c(zm, EnumC5069aN.ANON_ID));
        C4180Rx1 a3 = C6670gv2.a(EnumC5127ad.APP_USER_ID, new c(zm, EnumC5069aN.FB_LOGIN_ID));
        C4180Rx1 a4 = C6670gv2.a(EnumC5127ad.ADVERTISER_ID, new c(zm, EnumC5069aN.MAD_ID));
        C4180Rx1 a5 = C6670gv2.a(EnumC5127ad.PAGE_ID, new c(zm, EnumC5069aN.PAGE_ID));
        C4180Rx1 a6 = C6670gv2.a(EnumC5127ad.PAGE_SCOPED_USER_ID, new c(zm, EnumC5069aN.PAGE_SCOPED_USER_ID));
        EnumC5127ad enumC5127ad2 = EnumC5127ad.ADV_TE;
        ZM zm2 = ZM.APP_DATA;
        c = C8926q81.W(a2, a3, a4, a5, a6, C6670gv2.a(enumC5127ad2, new c(zm2, EnumC5069aN.ADV_TE)), C6670gv2.a(EnumC5127ad.APP_TE, new c(zm2, EnumC5069aN.APP_TE)), C6670gv2.a(EnumC5127ad.CONSIDER_VIEWS, new c(zm2, EnumC5069aN.CONSIDER_VIEWS)), C6670gv2.a(EnumC5127ad.DEVICE_TOKEN, new c(zm2, EnumC5069aN.DEVICE_TOKEN)), C6670gv2.a(EnumC5127ad.EXT_INFO, new c(zm2, EnumC5069aN.EXT_INFO)), C6670gv2.a(EnumC5127ad.INCLUDE_DWELL_DATA, new c(zm2, EnumC5069aN.INCLUDE_DWELL_DATA)), C6670gv2.a(EnumC5127ad.INCLUDE_VIDEO_DATA, new c(zm2, EnumC5069aN.INCLUDE_VIDEO_DATA)), C6670gv2.a(EnumC5127ad.INSTALL_REFERRER, new c(zm2, EnumC5069aN.INSTALL_REFERRER)), C6670gv2.a(EnumC5127ad.INSTALLER_PACKAGE, new c(zm2, EnumC5069aN.INSTALLER_PACKAGE)), C6670gv2.a(EnumC5127ad.RECEIPT_DATA, new c(zm2, EnumC5069aN.RECEIPT_DATA)), C6670gv2.a(EnumC5127ad.URL_SCHEMES, new c(zm2, EnumC5069aN.URL_SCHEMES)), C6670gv2.a(EnumC5127ad.USER_DATA, new c(zm, null)));
        C4180Rx1 a7 = C6670gv2.a(EnumC7531kT.EVENT_TIME, new b(null, XM.EVENT_TIME));
        C4180Rx1 a8 = C6670gv2.a(EnumC7531kT.EVENT_NAME, new b(null, XM.EVENT_NAME));
        EnumC7531kT enumC7531kT = EnumC7531kT.VALUE_TO_SUM;
        ZM zm3 = ZM.CUSTOM_DATA;
        d = C8926q81.W(a7, a8, C6670gv2.a(enumC7531kT, new b(zm3, XM.VALUE_TO_SUM)), C6670gv2.a(EnumC7531kT.CONTENT_IDS, new b(zm3, XM.CONTENT_IDS)), C6670gv2.a(EnumC7531kT.CONTENTS, new b(zm3, XM.CONTENTS)), C6670gv2.a(EnumC7531kT.CONTENT_TYPE, new b(zm3, XM.CONTENT_TYPE)), C6670gv2.a(EnumC7531kT.CURRENCY, new b(zm3, XM.CURRENCY)), C6670gv2.a(EnumC7531kT.DESCRIPTION, new b(zm3, XM.DESCRIPTION)), C6670gv2.a(EnumC7531kT.LEVEL, new b(zm3, XM.LEVEL)), C6670gv2.a(EnumC7531kT.MAX_RATING_VALUE, new b(zm3, XM.MAX_RATING_VALUE)), C6670gv2.a(EnumC7531kT.NUM_ITEMS, new b(zm3, XM.NUM_ITEMS)), C6670gv2.a(EnumC7531kT.PAYMENT_INFO_AVAILABLE, new b(zm3, XM.PAYMENT_INFO_AVAILABLE)), C6670gv2.a(EnumC7531kT.REGISTRATION_METHOD, new b(zm3, XM.REGISTRATION_METHOD)), C6670gv2.a(EnumC7531kT.SEARCH_STRING, new b(zm3, XM.SEARCH_STRING)), C6670gv2.a(EnumC7531kT.SUCCESS, new b(zm3, XM.SUCCESS)), C6670gv2.a(EnumC7531kT.ORDER_ID, new b(zm3, XM.ORDER_ID)), C6670gv2.a(EnumC7531kT.AD_TYPE, new b(zm3, XM.AD_TYPE)));
        e = C8926q81.W(C6670gv2.a(C2326p.r, YM.UNLOCKED_ACHIEVEMENT), C6670gv2.a(C2326p.b, YM.ACTIVATED_APP), C6670gv2.a(C2326p.f75o, YM.ADDED_PAYMENT_INFO), C6670gv2.a(C2326p.l, YM.ADDED_TO_CART), C6670gv2.a(C2326p.m, YM.ADDED_TO_WISHLIST), C6670gv2.a(C2326p.f, YM.COMPLETED_REGISTRATION), C6670gv2.a(C2326p.g, YM.VIEWED_CONTENT), C6670gv2.a(C2326p.n, YM.INITIATED_CHECKOUT), C6670gv2.a(C2326p.q, YM.ACHIEVED_LEVEL), C6670gv2.a(C2326p.p, YM.PURCHASED), C6670gv2.a(C2326p.i, YM.RATED), C6670gv2.a(C2326p.h, YM.SEARCHED), C6670gv2.a(C2326p.s, YM.SPENT_CREDITS), C6670gv2.a(C2326p.j, YM.COMPLETED_TUTORIAL));
    }

    @InterfaceC9511sW0
    @Nullable
    public static final ArrayList<Map<String, Object>> k(@NotNull String str) {
        C6562gT0.p(str, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            for (String str2 : com.facebook.internal.l0.n(new JSONArray(str))) {
                com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                arrayList.add(com.facebook.internal.l0.o(new JSONObject(str2)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str3 : map.keySet()) {
                    EnumC7531kT a2 = EnumC7531kT.Y.a(str3);
                    b bVar = d.get(a2);
                    if (a2 != null && bVar != null) {
                        ZM f = bVar.f();
                        if (f != null) {
                            if (f == ZM.CUSTOM_DATA) {
                                String g = bVar.e().g();
                                Object obj = map.get(str3);
                                if (obj != null) {
                                    Object l = l(str3, obj);
                                    if (l != null) {
                                        linkedHashMap.put(g, l);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                }
                            } else {
                                continue;
                            }
                        } else {
                            try {
                                String g2 = bVar.e().g();
                                if (a2 == EnumC7531kT.EVENT_NAME && ((String) map.get(str3)) != null) {
                                    C6097ed c6097ed = a;
                                    Object obj2 = map.get(str3);
                                    if (obj2 != null) {
                                        linkedHashMap2.put(g2, c6097ed.j((String) obj2));
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                } else if (a2 == EnumC7531kT.EVENT_TIME && ((Integer) map.get(str3)) != null) {
                                    Object obj3 = map.get(str3);
                                    if (obj3 != null) {
                                        Object l2 = l(str3, obj3);
                                        if (l2 != null) {
                                            linkedHashMap2.put(g2, l2);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                            } catch (ClassCastException e2) {
                                com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, "\n transformEvents ClassCastException: \n %s ", C3917Pf0.i(e2));
                            }
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(ZM.CUSTOM_DATA.g(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e3) {
            com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, "\n transformEvents JSONException: \n%s\n%s", str, e3);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Object l(@NotNull String str, @NotNull Object obj) {
        String str2;
        String str3;
        Object n;
        C6562gT0.p(str, "field");
        C6562gT0.p(obj, "value");
        d a2 = d.X.a(str);
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (a2 != null && str2 != null) {
            int i = e.a[a2.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return C9302rf2.p1(obj.toString());
                    }
                    throw new C3865Oq1();
                }
                Integer p1 = C9302rf2.p1(str2.toString());
                if (p1 == null) {
                    return null;
                }
                if (p1.intValue() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            try {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                List<String> n2 = com.facebook.internal.l0.n(new JSONArray(str2));
                ArrayList arrayList = new ArrayList();
                for (String str4 : n2) {
                    try {
                        try {
                            com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                            n = com.facebook.internal.l0.o(new JSONObject(str4));
                        } catch (JSONException unused) {
                            com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                            n = com.facebook.internal.l0.n(new JSONArray(str3));
                        }
                    } catch (JSONException unused2) {
                    }
                    arrayList.add(n);
                }
                return arrayList;
            } catch (JSONException e2) {
                com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, "\n transformEvents JSONException: \n%s\n%s", obj, e2);
                return C7458kA2.a;
            }
        }
        return obj;
    }

    @Nullable
    public final List<Map<String, Object>> a(@NotNull EnumC4887Zc enumC4887Zc, @NotNull Map<String, Object> map, @NotNull Map<String, Object> map2, @NotNull Map<String, Object> map3, @NotNull List<? extends Map<String, ? extends Object>> list, @Nullable Object obj) {
        C6562gT0.p(enumC4887Zc, "eventType");
        C6562gT0.p(map, "userData");
        C6562gT0.p(map2, "appData");
        C6562gT0.p(map3, "restOfData");
        C6562gT0.p(list, "customEvents");
        Map<String, Object> d2 = d(map, map2, map3);
        int i = e.c[enumC4887Zc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return b(d2, list);
        }
        return c(d2, obj);
    }

    public final List<Map<String, Object>> b(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll((Map) it.next());
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    public final List<Map<String, Object>> c(Map<String, ? extends Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(XM.EVENT_NAME.g(), EnumC11316zw1.MOBILE_APP_INSTALL.g());
        linkedHashMap.put(XM.EVENT_TIME.g(), obj);
        return C7979mF.k(linkedHashMap);
    }

    @NotNull
    public final Map<String, Object> d(@NotNull Map<String, ? extends Object> map, @NotNull Map<String, ? extends Object> map2, @NotNull Map<String, ? extends Object> map3) {
        C6562gT0.p(map, "userData");
        C6562gT0.p(map2, "appData");
        C6562gT0.p(map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC11316zw1.ACTION_SOURCE.g(), EnumC11316zw1.APP.g());
        linkedHashMap.put(ZM.USER_DATA.g(), map);
        linkedHashMap.put(ZM.APP_DATA.g(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    @Nullable
    public final List<Map<String, Object>> e(@NotNull Map<String, ? extends Object> map) {
        C6562gT0.p(map, BreadcrumbAnalyticsEventReceiver.c);
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        Map<String, Object> linkedHashMap2 = new LinkedHashMap<>();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        Map<String, Object> linkedHashMap3 = new LinkedHashMap<>();
        EnumC4887Zc f = f(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (f == EnumC4887Zc.OTHER) {
            return null;
        }
        return a(f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(EnumC11316zw1.INSTALL_EVENT_TIME.g()));
    }

    public final EnumC4887Zc f(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(EnumC11316zw1.EVENT.g());
        EnumC4887Zc.a aVar = EnumC4887Zc.X;
        if (obj != null) {
            EnumC4887Zc a2 = aVar.a((String) obj);
            if (a2 != EnumC4887Zc.OTHER) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    EnumC5127ad a3 = EnumC5127ad.Y.a(key);
                    if (a3 != null) {
                        a.g(map2, map3, a3, value);
                    } else {
                        boolean g = C6562gT0.g(key, ZM.CUSTOM_EVENTS.g());
                        boolean z = value instanceof String;
                        if (a2 == EnumC4887Zc.CUSTOM && g && z) {
                            ArrayList<Map<String, Object>> k = k((String) value);
                            if (k != null) {
                                arrayList.addAll(k);
                            }
                        } else if (a.Y.a(key) != null) {
                            map4.put(key, value);
                        }
                    }
                }
            }
            return a2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final void g(@NotNull Map<String, Object> map, @NotNull Map<String, Object> map2, @NotNull EnumC5127ad enumC5127ad, @NotNull Object obj) {
        C6562gT0.p(map, "userData");
        C6562gT0.p(map2, "appData");
        C6562gT0.p(enumC5127ad, "field");
        C6562gT0.p(obj, "value");
        c cVar = c.get(enumC5127ad);
        if (cVar != null) {
            int i = e.b[cVar.f().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                i(map, enumC5127ad, obj);
                return;
            }
            h(map2, enumC5127ad, obj);
        }
    }

    public final void h(Map<String, Object> map, EnumC5127ad enumC5127ad, Object obj) {
        EnumC5069aN e2;
        c cVar = c.get(enumC5127ad);
        if (cVar == null) {
            e2 = null;
        } else {
            e2 = cVar.e();
        }
        if (e2 == null) {
            return;
        }
        map.put(e2.g(), obj);
    }

    public final void i(Map<String, Object> map, EnumC5127ad enumC5127ad, Object obj) {
        EnumC5069aN e2;
        if (enumC5127ad == EnumC5127ad.USER_DATA) {
            try {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                map.putAll(com.facebook.internal.l0.o(new JSONObject((String) obj)));
                return;
            } catch (JSONException e3) {
                com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, "\n transformEvents JSONException: \n%s\n%s", obj, e3);
                return;
            }
        }
        c cVar = c.get(enumC5127ad);
        if (cVar == null) {
            e2 = null;
        } else {
            e2 = cVar.e();
        }
        if (e2 == null) {
            return;
        }
        map.put(e2.g(), obj);
    }

    public final String j(String str) {
        Map<String, YM> map = e;
        if (map.containsKey(str)) {
            YM ym = map.get(str);
            if (ym == null) {
                return "";
            }
            return ym.g();
        }
        return str;
    }
}
