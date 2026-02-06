package o;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.InterfaceC2426Ac0;

/* renamed from: o.Ak  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2457Ak implements InterfaceC11235zc0 {
    public static final String f = "BackupHdrProfileEncoderProfilesProvider";
    public final InterfaceC11235zc0 b;
    public final InterfaceC6490gB0<InterfaceC2426Ac0.c, InterfaceC2426Ac0.c> c;
    public final Map<Integer, InterfaceC2426Ac0> d = new HashMap();
    public static final InterfaceC6490gB0<InterfaceC2426Ac0.c, InterfaceC2426Ac0.c> e = new InterfaceC6490gB0() { // from class: o.zk
        @Override // o.InterfaceC6490gB0
        public final Object apply(Object obj) {
            InterfaceC2426Ac0.c m;
            m = C2457Ak.m((InterfaceC2426Ac0.c) obj);
            return m;
        }
    };
    public static final EnumC5905dp2 g = EnumC5905dp2.UPTIME;

    public C2457Ak(InterfaceC11235zc0 interfaceC11235zc0, InterfaceC6490gB0<InterfaceC2426Ac0.c, InterfaceC2426Ac0.c> interfaceC6490gB0) {
        this.b = interfaceC11235zc0;
        this.c = interfaceC6490gB0;
    }

    public static int e(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException("Unexpected HDR format: " + i);
        }
        return 5;
    }

    public static String f(int i) {
        return InterfaceC2426Ac0.d(i);
    }

    public static int g(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return -1;
                }
                throw new IllegalArgumentException("Unexpected HDR format: " + i);
            }
            return 8192;
        }
        return 4096;
    }

    public static InterfaceC2426Ac0.c h(InterfaceC2426Ac0.c cVar, int i, int i2) {
        if (cVar == null) {
            return null;
        }
        int e2 = cVar.e();
        String i3 = cVar.i();
        int j = cVar.j();
        if (i != cVar.g()) {
            e2 = e(i);
            i3 = f(e2);
            j = g(i);
        }
        return InterfaceC2426Ac0.c.a(e2, i3, k(cVar.c(), i2, cVar.b()), cVar.f(), cVar.k(), cVar.h(), j, i2, cVar.d(), i);
    }

    private InterfaceC2426Ac0 i(int i) {
        if (this.d.containsKey(Integer.valueOf(i))) {
            return this.d.get(Integer.valueOf(i));
        }
        if (this.b.a(i)) {
            InterfaceC2426Ac0 d = d(this.b.b(i), 1, 10);
            this.d.put(Integer.valueOf(i), d);
            return d;
        }
        return null;
    }

    public static InterfaceC2426Ac0.c j(InterfaceC2426Ac0.c cVar, int i) {
        return InterfaceC2426Ac0.c.a(cVar.e(), cVar.i(), i, cVar.f(), cVar.k(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static int k(int i, int i2, int i3) {
        if (i2 == i3) {
            return i;
        }
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue());
        if (C7433k41.h(f)) {
            C7433k41.a(f, String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(doubleValue)));
        }
        return doubleValue;
    }

    public static IF2 l(InterfaceC2426Ac0.c cVar) {
        return IF2.d().h(cVar.i()).i(cVar.j()).j(new Size(cVar.k(), cVar.h())).e(cVar.f()).b(cVar.c()).g(g).a();
    }

    public static InterfaceC2426Ac0.c m(InterfaceC2426Ac0.c cVar) {
        if (cVar == null) {
            return null;
        }
        IF2 l = l(cVar);
        try {
            OF2 k = OF2.k(l);
            int e2 = l.e();
            int intValue = k.f().clamp(Integer.valueOf(e2)).intValue();
            if (intValue == e2) {
                return cVar;
            }
            return j(cVar, intValue);
        } catch (C8279nT0 unused) {
            return null;
        }
    }

    @Override // o.InterfaceC11235zc0
    public boolean a(int i) {
        if (!this.b.a(i) || i(i) == null) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC11235zc0
    public InterfaceC2426Ac0 b(int i) {
        return i(i);
    }

    public final InterfaceC2426Ac0 d(InterfaceC2426Ac0 interfaceC2426Ac0, int i, int i2) {
        InterfaceC2426Ac0.c cVar;
        if (interfaceC2426Ac0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(interfaceC2426Ac0.b());
        Iterator<InterfaceC2426Ac0.c> it = interfaceC2426Ac0.b().iterator();
        while (true) {
            if (it.hasNext()) {
                cVar = it.next();
                if (cVar.g() == 0) {
                    break;
                }
            } else {
                cVar = null;
                break;
            }
        }
        InterfaceC2426Ac0.c apply = this.c.apply(h(cVar, i, i2));
        if (apply != null) {
            arrayList.add(apply);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC2426Ac0.b.h(interfaceC2426Ac0.a(), interfaceC2426Ac0.e(), interfaceC2426Ac0.f(), arrayList);
    }
}
