package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.x51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10624x51 {
    public Map<String, List<C9760tY0>> c;
    public Map<String, C9653t61> d;
    public float e;
    public Map<String, C3982Pw0> f;
    public List<C10636x81> g;
    public C10986ya2<C4276Sw0> h;
    public C5484c51<C9760tY0> i;
    public List<C9760tY0> j;
    public Rect k;
    public float l;
    public float m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f908o;
    public int q;
    public int r;
    public final BC1 a = new BC1();
    public final HashSet<String> b = new HashSet<>();
    public int p = 0;

    @Deprecated
    /* renamed from: o.x51$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: o.x51$b$a */
        /* loaded from: classes.dex */
        public static final class a implements InterfaceC10871y61<C10624x51>, InterfaceC8153my {
            public final InterfaceC3490Ku1 a;
            public boolean b;

            @Override // o.InterfaceC10871y61
            /* renamed from: a */
            public void onResult(C10624x51 c10624x51) {
                if (this.b) {
                    return;
                }
                this.a.a(c10624x51);
            }

            @Override // o.InterfaceC8153my
            public void cancel() {
                this.b = true;
            }

            public a(InterfaceC3490Ku1 interfaceC3490Ku1) {
                this.b = false;
                this.a = interfaceC3490Ku1;
            }
        }

        @Deprecated
        public static InterfaceC8153my a(Context context, String str, InterfaceC3490Ku1 interfaceC3490Ku1) {
            a aVar = new a(interfaceC3490Ku1);
            T51.y(context, str).d(aVar);
            return aVar;
        }

        @Deprecated
        public static C10624x51 b(Context context, String str) {
            return T51.A(context, str).b();
        }

        @Deprecated
        public static InterfaceC8153my c(InputStream inputStream, InterfaceC3490Ku1 interfaceC3490Ku1) {
            a aVar = new a(interfaceC3490Ku1);
            T51.F(inputStream, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static C10624x51 d(InputStream inputStream) {
            return T51.H(inputStream, null).b();
        }

        @Deprecated
        public static C10624x51 e(InputStream inputStream, boolean z) {
            if (z) {
                C7190j41.e("Lottie now auto-closes input stream!");
            }
            return T51.H(inputStream, null).b();
        }

        @Deprecated
        public static InterfaceC8153my f(NV0 nv0, InterfaceC3490Ku1 interfaceC3490Ku1) {
            a aVar = new a(interfaceC3490Ku1);
            T51.J(nv0, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static InterfaceC8153my g(String str, InterfaceC3490Ku1 interfaceC3490Ku1) {
            a aVar = new a(interfaceC3490Ku1);
            T51.Q(str, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static C10624x51 h(Resources resources, JSONObject jSONObject) {
            return T51.S(jSONObject, null).b();
        }

        @Deprecated
        public static C10624x51 i(String str) {
            return T51.R(str, null).b();
        }

        @Deprecated
        public static C10624x51 j(NV0 nv0) {
            return T51.K(nv0, null).b();
        }

        @Deprecated
        public static InterfaceC8153my k(Context context, int i, InterfaceC3490Ku1 interfaceC3490Ku1) {
            a aVar = new a(interfaceC3490Ku1);
            T51.T(context, i).d(aVar);
            return aVar;
        }
    }

    public void A(boolean z) {
        this.f908o = z;
    }

    public void B(boolean z) {
        this.a.g(z);
    }

    public void a(String str) {
        C7190j41.e(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.k;
    }

    public C10986ya2<C4276Sw0> c() {
        return this.h;
    }

    public float d() {
        return (e() / this.n) * 1000.0f;
    }

    public float e() {
        return this.m - this.l;
    }

    public float f() {
        return this.m;
    }

    public Map<String, C3982Pw0> g() {
        return this.f;
    }

    public float h(float f) {
        return C4713Xj1.k(this.l, this.m, f);
    }

    public float i() {
        return this.n;
    }

    public Map<String, C9653t61> j() {
        float e = C6006eE2.e();
        if (e != this.e) {
            for (Map.Entry<String, C9653t61> entry : this.d.entrySet()) {
                this.d.put(entry.getKey(), entry.getValue().a(this.e / e));
            }
        }
        this.e = e;
        return this.d;
    }

    public List<C9760tY0> k() {
        return this.j;
    }

    public C10636x81 l(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            C10636x81 c10636x81 = this.g.get(i);
            if (c10636x81.d(str)) {
                return c10636x81;
            }
        }
        return null;
    }

    public List<C10636x81> m() {
        return this.g;
    }

    public int n() {
        return this.p;
    }

    public BC1 o() {
        return this.a;
    }

    public List<C9760tY0> p(String str) {
        return this.c.get(str);
    }

    public float q(float f) {
        float f2 = this.l;
        return (f - f2) / (this.m - f2);
    }

    public float r() {
        return this.l;
    }

    public int s() {
        return this.r;
    }

    public int t() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C9760tY0 c9760tY0 : this.j) {
            sb.append(c9760tY0.z("\t"));
        }
        return sb.toString();
    }

    public ArrayList<String> u() {
        HashSet<String> hashSet = this.b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    public boolean v() {
        return this.f908o;
    }

    public boolean w() {
        return !this.d.isEmpty();
    }

    public void x(int i) {
        this.p += i;
    }

    public void y(Rect rect, float f, float f2, float f3, List<C9760tY0> list, C5484c51<C9760tY0> c5484c51, Map<String, List<C9760tY0>> map, Map<String, C9653t61> map2, float f4, C10986ya2<C4276Sw0> c10986ya2, Map<String, C3982Pw0> map3, List<C10636x81> list2, int i, int i2) {
        this.k = rect;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.j = list;
        this.i = c5484c51;
        this.c = map;
        this.d = map2;
        this.e = f4;
        this.h = c10986ya2;
        this.f = map3;
        this.g = list2;
        this.q = i;
        this.r = i2;
    }

    public C9760tY0 z(long j) {
        return this.i.h(j);
    }
}
