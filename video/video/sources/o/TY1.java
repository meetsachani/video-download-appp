package o;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class TY1 extends AbstractC4233Sk2 {
    public static final String e = "onMetaData";
    public static final String f = "duration";
    public static final String g = "keyframes";
    public static final String h = "filepositions";
    public static final String i = "times";
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 8;

    /* renamed from: o  reason: collision with root package name */
    public static final int f620o = 9;
    public static final int p = 10;
    public static final int q = 11;
    public long b;
    public long[] c;
    public long[] d;

    public TY1() {
        super(new W70());
        this.b = C10323vs.b;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static Boolean h(C3012Fy1 c3012Fy1) {
        boolean z = true;
        if (c3012Fy1.L() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @InterfaceC11300zs1
    public static Object i(C3012Fy1 c3012Fy1, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 8) {
                            if (i2 != 10) {
                                if (i2 != 11) {
                                    return null;
                                }
                                return j(c3012Fy1);
                            }
                            return n(c3012Fy1);
                        }
                        return l(c3012Fy1);
                    }
                    return m(c3012Fy1);
                }
                return o(c3012Fy1);
            }
            return h(c3012Fy1);
        }
        return k(c3012Fy1);
    }

    public static Date j(C3012Fy1 c3012Fy1) {
        Date date = new Date((long) k(c3012Fy1).doubleValue());
        c3012Fy1.Z(2);
        return date;
    }

    public static Double k(C3012Fy1 c3012Fy1) {
        return Double.valueOf(Double.longBitsToDouble(c3012Fy1.E()));
    }

    public static HashMap<String, Object> l(C3012Fy1 c3012Fy1) {
        int P = c3012Fy1.P();
        HashMap<String, Object> hashMap = new HashMap<>(P);
        for (int i2 = 0; i2 < P; i2++) {
            String o2 = o(c3012Fy1);
            Object i3 = i(c3012Fy1, p(c3012Fy1));
            if (i3 != null) {
                hashMap.put(o2, i3);
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> m(C3012Fy1 c3012Fy1) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String o2 = o(c3012Fy1);
            int p2 = p(c3012Fy1);
            if (p2 == 9) {
                return hashMap;
            }
            Object i2 = i(c3012Fy1, p2);
            if (i2 != null) {
                hashMap.put(o2, i2);
            }
        }
    }

    public static ArrayList<Object> n(C3012Fy1 c3012Fy1) {
        int P = c3012Fy1.P();
        ArrayList<Object> arrayList = new ArrayList<>(P);
        for (int i2 = 0; i2 < P; i2++) {
            Object i3 = i(c3012Fy1, p(c3012Fy1));
            if (i3 != null) {
                arrayList.add(i3);
            }
        }
        return arrayList;
    }

    public static String o(C3012Fy1 c3012Fy1) {
        int R = c3012Fy1.R();
        int f2 = c3012Fy1.f();
        c3012Fy1.Z(R);
        return new String(c3012Fy1.e(), f2, R);
    }

    public static int p(C3012Fy1 c3012Fy1) {
        return c3012Fy1.L();
    }

    @Override // o.AbstractC4233Sk2
    public boolean b(C3012Fy1 c3012Fy1) {
        return true;
    }

    @Override // o.AbstractC4233Sk2
    public boolean c(C3012Fy1 c3012Fy1, long j2) {
        if (p(c3012Fy1) != 2 || !e.equals(o(c3012Fy1)) || c3012Fy1.a() == 0 || p(c3012Fy1) != 8) {
            return false;
        }
        HashMap<String, Object> l2 = l(c3012Fy1);
        Object obj = l2.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = l2.get(g);
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get(h);
            Object obj4 = map.get(i);
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i2] = ((Double) obj5).longValue();
                    } else {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    public long e() {
        return this.b;
    }

    public long[] f() {
        return this.d;
    }

    public long[] g() {
        return this.c;
    }

    @Override // o.AbstractC4233Sk2
    public void d() {
    }
}
