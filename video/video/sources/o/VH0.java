package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C10833xx0;

@Deprecated
/* loaded from: classes2.dex */
public final class VH0 extends WH0 {
    public static final VH0 n;

    /* renamed from: o  reason: collision with root package name */
    public static final int f633o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public final List<Uri> d;
    public final List<b> e;
    public final List<a> f;
    public final List<a> g;
    public final List<a> h;
    public final List<a> i;
    @InterfaceC11300zs1
    public final C10833xx0 j;
    @InterfaceC11300zs1
    public final List<C10833xx0> k;
    public final Map<String, String> l;
    public final List<C6960i70> m;

    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC11300zs1
        public final Uri a;
        public final C10833xx0 b;
        public final String c;
        public final String d;

        public a(@InterfaceC11300zs1 Uri uri, C10833xx0 c10833xx0, String str, String str2) {
            this.a = uri;
            this.b = c10833xx0;
            this.c = str;
            this.d = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final Uri a;
        public final C10833xx0 b;
        @InterfaceC11300zs1
        public final String c;
        @InterfaceC11300zs1
        public final String d;
        @InterfaceC11300zs1
        public final String e;
        @InterfaceC11300zs1
        public final String f;

        public b(Uri uri, C10833xx0 c10833xx0, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4) {
            this.a = uri;
            this.b = c10833xx0;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new C10833xx0.b().U("0").M(C4128Rj1.u0).G(), null, null, null, null);
        }

        public b a(C10833xx0 c10833xx0) {
            return new b(this.a, c10833xx0, this.c, this.d, this.e, this.f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        n = new VH0("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public VH0(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @InterfaceC11300zs1 C10833xx0 c10833xx0, @InterfaceC11300zs1 List<C10833xx0> list7, boolean z, Map<String, String> map, List<C6960i70> list8) {
        super(str, list, z);
        List<C10833xx0> list9;
        this.d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = c10833xx0;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.k = list9;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void b(List<a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static <T> List<T> d(List<T> list, int i, List<C3031Gd2> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    C3031Gd2 c3031Gd2 = list2.get(i3);
                    if (c3031Gd2.Y == i && c3031Gd2.Z == i2) {
                        arrayList.add(t);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    public static VH0 e(String str) {
        List singletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new VH0("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    public static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // o.InterfaceC4651Ws0
    /* renamed from: c */
    public VH0 a(List<C3031Gd2> list) {
        String str = this.a;
        List<String> list2 = this.b;
        List d = d(this.e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new VH0(str, list2, d, list3, d(this.g, 1, list), d(this.h, 2, list), list3, this.j, this.k, this.c, this.l, this.m);
    }
}
