package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC7840ll;

/* renamed from: o.nV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8287nV1 implements Z22, AbstractC7840ll.b {
    public static final float e = 0.5519f;
    public final C8431o61 a;
    public final String b;
    public final AbstractC7840ll<Float, Float> c;
    public R22 d;

    public C8287nV1(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, C8044mV1 c8044mV1) {
        this.a = c8431o61;
        this.b = c8044mV1.c();
        AbstractC7840ll<Float, Float> a = c8044mV1.b().a();
        this.c = a;
        abstractC8588ol.j(a);
        a.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i2 * i3 != i) {
            return i3 - 1;
        }
        return i3;
    }

    public static int d(int i, int i2) {
        return i - (c(i, i2) * i2);
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        this.a.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (r7 != (r0.size() - 1)) goto L37;
     */
    @Override // o.Z22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R22 f(R22 r22) {
        PointF c;
        PointF b;
        boolean z;
        List<C6557gS> list;
        List<C6557gS> a = r22.a();
        if (a.size() > 2) {
            float floatValue = this.c.h().floatValue();
            if (floatValue != 0.0f) {
                R22 j = j(r22);
                j.f(r22.b().x, r22.b().y);
                List<C6557gS> a2 = j.a();
                boolean d = r22.d();
                int i = 0;
                int i2 = 0;
                while (i < a.size()) {
                    C6557gS c6557gS = a.get(i);
                    C6557gS c6557gS2 = a.get(d(i - 1, a.size()));
                    C6557gS c6557gS3 = a.get(d(i - 2, a.size()));
                    if (i == 0 && !d) {
                        c = r22.b();
                    } else {
                        c = c6557gS2.c();
                    }
                    if (i == 0 && !d) {
                        b = c;
                    } else {
                        b = c6557gS2.b();
                    }
                    PointF a3 = c6557gS.a();
                    PointF c2 = c6557gS3.c();
                    PointF c3 = c6557gS.c();
                    if (!r22.d()) {
                        z = true;
                        if (i != 0) {
                        }
                        if (!b.equals(c) && a3.equals(c) && !z) {
                            float f = c.x;
                            float f2 = f - c2.x;
                            float f3 = c.y;
                            float f4 = c3.x - f;
                            list = a;
                            float min = Math.min(floatValue / ((float) Math.hypot(f2, f3 - c2.y)), 0.5f);
                            float min2 = Math.min(floatValue / ((float) Math.hypot(f4, c3.y - f3)), 0.5f);
                            float f5 = c.x;
                            float f6 = ((c2.x - f5) * min) + f5;
                            float f7 = c.y;
                            float f8 = ((c2.y - f7) * min) + f7;
                            float f9 = ((c3.x - f5) * min2) + f5;
                            float f10 = ((c3.y - f7) * min2) + f7;
                            float f11 = f6 - ((f6 - f5) * 0.5519f);
                            float f12 = f8 - ((f8 - f7) * 0.5519f);
                            float f13 = f9 - ((f9 - f5) * 0.5519f);
                            float f14 = f10 - ((f10 - f7) * 0.5519f);
                            C6557gS c6557gS4 = a2.get(d(i2 - 1, a2.size()));
                            C6557gS c6557gS5 = a2.get(i2);
                            c6557gS4.e(f6, f8);
                            c6557gS4.g(f6, f8);
                            if (i == 0) {
                                j.f(f6, f8);
                            }
                            c6557gS5.d(f11, f12);
                            c6557gS5.e(f13, f14);
                            c6557gS5.g(f9, f10);
                            a2.get(i2 + 1).d(f9, f10);
                            i2 += 2;
                        } else {
                            list = a;
                            C6557gS c6557gS6 = a2.get(d(i2 - 1, a2.size()));
                            c6557gS6.e(c6557gS2.b().x, c6557gS2.b().y);
                            c6557gS6.g(c6557gS2.c().x, c6557gS2.c().y);
                            a2.get(i2).d(c6557gS.a().x, c6557gS.a().y);
                            i2++;
                        }
                        i++;
                        a = list;
                    }
                    z = false;
                    if (!b.equals(c)) {
                    }
                    list = a;
                    C6557gS c6557gS62 = a2.get(d(i2 - 1, a2.size()));
                    c6557gS62.e(c6557gS2.b().x, c6557gS2.b().y);
                    c6557gS62.g(c6557gS2.c().x, c6557gS2.c().y);
                    a2.get(i2).d(c6557gS.a().x, c6557gS.a().y);
                    i2++;
                    i++;
                    a = list;
                }
                return j;
            }
        }
        return r22;
    }

    @Override // o.Z22
    public void g(AbstractC7840ll.b bVar) {
        this.c.a(bVar);
    }

    @Override // o.DL
    public String getName() {
        return this.b;
    }

    public AbstractC7840ll<Float, Float> i() {
        return this.c;
    }

    public final R22 j(R22 r22) {
        PointF c;
        PointF b;
        boolean z;
        List<C6557gS> a = r22.a();
        boolean d = r22.d();
        int i = 0;
        for (int size = a.size() - 1; size >= 0; size--) {
            C6557gS c6557gS = a.get(size);
            C6557gS c6557gS2 = a.get(d(size - 1, a.size()));
            if (size == 0 && !d) {
                c = r22.b();
            } else {
                c = c6557gS2.c();
            }
            if (size == 0 && !d) {
                b = c;
            } else {
                b = c6557gS2.b();
            }
            PointF a2 = c6557gS.a();
            if (!r22.d() && (size == 0 || size == a.size() - 1)) {
                z = true;
            } else {
                z = false;
            }
            if (b.equals(c) && a2.equals(c) && !z) {
                i += 2;
            } else {
                i++;
            }
        }
        R22 r222 = this.d;
        if (r222 == null || r222.a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C6557gS());
            }
            this.d = new R22(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.d.e(d);
        return this.d;
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
    }
}
