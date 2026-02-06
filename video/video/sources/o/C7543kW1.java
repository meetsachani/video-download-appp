package o;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.kW1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7543kW1 {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static int k;
    public WK2 c;
    public WK2 d;
    public int f;
    public int g;
    public int a = 0;
    public boolean b = false;
    public ArrayList<WK2> e = new ArrayList<>();

    public C7543kW1(WK2 wk2, int i2) {
        this.c = null;
        this.d = null;
        int i3 = k;
        this.f = i3;
        k = i3 + 1;
        this.c = wk2;
        this.d = wk2;
        this.g = i2;
    }

    public void a(WK2 wk2) {
        this.e.add(wk2);
        this.d = wk2;
    }

    public long b(VK vk, int i2) {
        WK2 wk2;
        WK2 wk22;
        WK2 wk23;
        long j2;
        int i3;
        C8901q20 c8901q20;
        C8901q20 c8901q202;
        WK2 wk24;
        WK2 wk25 = this.c;
        long j3 = 0;
        if (wk25 instanceof C4672Wz) {
            if (((C4672Wz) wk25).f != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(wk25 instanceof C7731lI0)) {
                return 0L;
            }
        } else if (!(wk25 instanceof C6010eF2)) {
            return 0L;
        }
        if (i2 == 0) {
            wk2 = vk.e;
        } else {
            wk2 = vk.f;
        }
        C8901q20 c8901q203 = wk2.h;
        if (i2 == 0) {
            wk22 = vk.e;
        } else {
            wk22 = vk.f;
        }
        C8901q20 c8901q204 = wk22.i;
        boolean contains = wk25.h.l.contains(c8901q203);
        boolean contains2 = this.c.i.l.contains(c8901q204);
        long j4 = this.c.j();
        if (contains && contains2) {
            long f = f(this.c.h, 0L);
            long e = e(this.c.i, 0L);
            long j5 = f - j4;
            WK2 wk26 = this.c;
            int i4 = wk26.i.f;
            if (j5 >= (-i4)) {
                j5 += i4;
            }
            int i5 = wk26.h.f;
            long j6 = ((-e) - j4) - i5;
            if (j6 >= i5) {
                j6 -= i5;
            }
            float u = wk26.b.u(i2);
            if (u > 0.0f) {
                j3 = (((float) j6) / u) + (((float) j5) / (1.0f - u));
            }
            float f2 = (float) j3;
            long j7 = (f2 * u) + 0.5f + j4 + (f2 * (1.0f - u)) + 0.5f;
            j2 = wk24.h.f + j7;
            i3 = this.c.i.f;
        } else if (contains) {
            return Math.max(f(this.c.h, c8901q202.f), this.c.h.f + j4);
        } else if (contains2) {
            return Math.max(-e(this.c.i, c8901q20.f), (-this.c.i.f) + j4);
        } else {
            j2 = wk23.h.f + this.c.j();
            i3 = this.c.i.f;
        }
        return j2 - i3;
    }

    public final boolean c(WK2 wk2, int i2) {
        C8901q20 c8901q20;
        WK2 wk22;
        C8901q20 c8901q202;
        WK2 wk23;
        if (!wk2.b.g[i2]) {
            return false;
        }
        for (InterfaceC7910m20 interfaceC7910m20 : wk2.h.k) {
            if ((interfaceC7910m20 instanceof C8901q20) && (wk23 = (c8901q202 = (C8901q20) interfaceC7910m20).d) != wk2 && c8901q202 == wk23.h) {
                if (wk2 instanceof C4672Wz) {
                    Iterator<WK2> it = ((C4672Wz) wk2).k.iterator();
                    while (it.hasNext()) {
                        c(it.next(), i2);
                    }
                } else if (!(wk2 instanceof C9453sH0)) {
                    wk2.b.g[i2] = false;
                }
                c(c8901q202.d, i2);
            }
        }
        for (InterfaceC7910m20 interfaceC7910m202 : wk2.i.k) {
            if ((interfaceC7910m202 instanceof C8901q20) && (wk22 = (c8901q20 = (C8901q20) interfaceC7910m202).d) != wk2 && c8901q20 == wk22.h) {
                if (wk2 instanceof C4672Wz) {
                    Iterator<WK2> it2 = ((C4672Wz) wk2).k.iterator();
                    while (it2.hasNext()) {
                        c(it2.next(), i2);
                    }
                } else if (!(wk2 instanceof C9453sH0)) {
                    wk2.b.g[i2] = false;
                }
                c(c8901q20.d, i2);
            }
        }
        return false;
    }

    public void d(boolean z, boolean z2) {
        if (z) {
            WK2 wk2 = this.c;
            if (wk2 instanceof C7731lI0) {
                c(wk2, 0);
            }
        }
        if (z2) {
            WK2 wk22 = this.c;
            if (wk22 instanceof C6010eF2) {
                c(wk22, 1);
            }
        }
    }

    public final long e(C8901q20 c8901q20, long j2) {
        WK2 wk2 = c8901q20.d;
        if (wk2 instanceof C9453sH0) {
            return j2;
        }
        int size = c8901q20.k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC7910m20 interfaceC7910m20 = c8901q20.k.get(i2);
            if (interfaceC7910m20 instanceof C8901q20) {
                C8901q20 c8901q202 = (C8901q20) interfaceC7910m20;
                if (c8901q202.d != wk2) {
                    j3 = Math.min(j3, e(c8901q202, c8901q202.f + j2));
                }
            }
        }
        if (c8901q20 == wk2.i) {
            long j4 = j2 - wk2.j();
            return Math.min(Math.min(j3, e(wk2.h, j4)), j4 - wk2.h.f);
        }
        return j3;
    }

    public final long f(C8901q20 c8901q20, long j2) {
        WK2 wk2 = c8901q20.d;
        if (wk2 instanceof C9453sH0) {
            return j2;
        }
        int size = c8901q20.k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC7910m20 interfaceC7910m20 = c8901q20.k.get(i2);
            if (interfaceC7910m20 instanceof C8901q20) {
                C8901q20 c8901q202 = (C8901q20) interfaceC7910m20;
                if (c8901q202.d != wk2) {
                    j3 = Math.max(j3, f(c8901q202, c8901q202.f + j2));
                }
            }
        }
        if (c8901q20 == wk2.h) {
            long j4 = j2 + wk2.j();
            return Math.max(Math.max(j3, f(wk2.i, j4)), j4 - wk2.i.f);
        }
        return j3;
    }
}
