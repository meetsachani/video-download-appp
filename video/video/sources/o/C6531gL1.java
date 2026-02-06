package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.gL1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6531gL1 implements InterfaceC11235zc0 {
    public static final Map<Integer, C5548cL1> e;
    public final InterfaceC11235zc0 b;
    public final InterfaceC6918hx c;
    public final C10931yL1 d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put(1, C5548cL1.f);
        hashMap.put(8, C5548cL1.d);
        hashMap.put(6, C5548cL1.c);
        hashMap.put(5, C5548cL1.b);
        hashMap.put(4, C5548cL1.a);
        hashMap.put(0, C5548cL1.e);
    }

    public C6531gL1(InterfaceC11235zc0 interfaceC11235zc0, InterfaceC6918hx interfaceC6918hx, C10931yL1 c10931yL1) {
        this.b = interfaceC11235zc0;
        this.c = interfaceC6918hx;
        this.d = c10931yL1;
    }

    @Override // o.InterfaceC11235zc0
    public boolean a(int i) {
        if (this.b.a(i) && c(i)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC11235zc0
    public InterfaceC2426Ac0 b(int i) {
        if (!a(i)) {
            return null;
        }
        return this.b.b(i);
    }

    public final boolean c(int i) {
        C5548cL1 c5548cL1 = e.get(Integer.valueOf(i));
        if (c5548cL1 != null) {
            for (BG2 bg2 : this.d.c(BG2.class)) {
                if (bg2 != null && bg2.b(this.c, c5548cL1) && !bg2.a()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
