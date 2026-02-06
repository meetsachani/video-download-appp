package o;

import java.util.ArrayList;
import java.util.Iterator;
import o.UK;

/* renamed from: o.Wz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4672Wz extends WK2 {
    public ArrayList<WK2> k;
    public int l;

    public C4672Wz(UK uk, int i) {
        super(uk);
        this.k = new ArrayList<>();
        this.f = i;
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x03f6, code lost:
        r1 = r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
        if (r3.j != false) goto L69;
     */
    @Override // o.WK2, o.InterfaceC7910m20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(InterfaceC7910m20 interfaceC7910m20) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        float f4;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        if (this.h.j && this.i.j) {
            UK U = this.b.U();
            boolean P2 = U instanceof VK ? ((VK) U).P2() : false;
            int i14 = this.i.g - this.h.g;
            int size = this.k.size();
            int i15 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i15 >= size) {
                    i15 = -1;
                    break;
                } else if (this.k.get(i15).b.l0() != 8) {
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = size - 1;
            int i17 = i16;
            while (true) {
                if (i17 < 0) {
                    break;
                }
                if (this.k.get(i17).b.l0() != 8) {
                    i = i17;
                    break;
                }
                i17--;
            }
            int i18 = 0;
            while (i18 < 2) {
                int i19 = 0;
                i4 = 0;
                i5 = 0;
                int i20 = 0;
                f2 = 0.0f;
                while (i19 < size) {
                    WK2 wk2 = this.k.get(i19);
                    if (wk2.b.l0() == i2) {
                        z2 = P2;
                    } else {
                        i20++;
                        if (i19 > 0 && i19 >= i15) {
                            i4 += wk2.h.f;
                        }
                        C10126v30 c10126v30 = wk2.e;
                        int i21 = c10126v30.g;
                        boolean z3 = wk2.d != UK.b.MATCH_CONSTRAINT;
                        if (z3) {
                            int i22 = this.f;
                            if (i22 == 0 && !wk2.b.e.e.j) {
                                return;
                            }
                            if (i22 == 1 && !wk2.b.f.e.j) {
                                return;
                            }
                            z2 = P2;
                        } else {
                            z2 = P2;
                            if (wk2.a == 1 && i18 == 0) {
                                i21 = c10126v30.m;
                                i5++;
                            }
                            z3 = true;
                        }
                        if (z3) {
                            i4 += i21;
                        } else {
                            i5++;
                            float f5 = wk2.b.N0[this.f];
                            if (f5 >= 0.0f) {
                                f2 += f5;
                            }
                        }
                        if (i19 < i16 && i19 < i) {
                            i4 += -wk2.i.f;
                        }
                    }
                    i19++;
                    P2 = z2;
                    i2 = 8;
                }
                z = P2;
                f = 0.0f;
                if (i4 < i14 || i5 == 0) {
                    i3 = i20;
                    break;
                }
                i18++;
                P2 = z;
                i2 = 8;
            }
            z = P2;
            f = 0.0f;
            f2 = 0.0f;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            int i23 = this.h.g;
            if (z) {
                i23 = this.i.g;
            }
            float f6 = 0.5f;
            if (i4 > i14) {
                i23 = z ? i23 + ((int) (((i4 - i14) / 2.0f) + 0.5f)) : i23 - ((int) (((i4 - i14) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f7 = i14 - i4;
                int i24 = (int) ((f7 / i5) + 0.5f);
                int i25 = 0;
                int i26 = 0;
                while (i25 < size) {
                    WK2 wk22 = this.k.get(i25);
                    float f8 = f6;
                    int i27 = i23;
                    if (wk22.b.l0() != 8 && wk22.d == UK.b.MATCH_CONSTRAINT) {
                        C10126v30 c10126v302 = wk22.e;
                        if (!c10126v302.j) {
                            int i28 = f2 > f ? (int) (((wk22.b.N0[this.f] * f7) / f2) + f8) : i24;
                            f4 = f7;
                            if (this.f == 0) {
                                UK uk = wk22.b;
                                i10 = i24;
                                i11 = uk.A;
                                i12 = uk.z;
                            } else {
                                i10 = i24;
                                UK uk2 = wk22.b;
                                i11 = uk2.D;
                                i12 = uk2.C;
                            }
                            i13 = i25;
                            int i29 = i26;
                            int max = Math.max(i12, wk22.a == 1 ? Math.min(i28, c10126v302.m) : i28);
                            if (i11 > 0) {
                                max = Math.min(i11, max);
                            }
                            if (max != i28) {
                                i26 = i29 + 1;
                                i28 = max;
                            } else {
                                i26 = i29;
                            }
                            wk22.e.e(i28);
                            i25 = i13 + 1;
                            f6 = f8;
                            i23 = i27;
                            f7 = f4;
                            i24 = i10;
                        }
                    }
                    f4 = f7;
                    i10 = i24;
                    i13 = i25;
                    i26 = i26;
                    i25 = i13 + 1;
                    f6 = f8;
                    i23 = i27;
                    f7 = f4;
                    i24 = i10;
                }
                i6 = i23;
                f3 = f6;
                int i30 = i26;
                if (i30 > 0) {
                    i5 -= i30;
                    i4 = 0;
                    for (int i31 = 0; i31 < size; i31++) {
                        WK2 wk23 = this.k.get(i31);
                        if (wk23.b.l0() != 8) {
                            if (i31 > 0 && i31 >= i15) {
                                i4 += wk23.h.f;
                            }
                            i4 += wk23.e.g;
                            if (i31 < i16 && i31 < i) {
                                i4 += -wk23.i.f;
                            }
                        }
                    }
                }
                i8 = 2;
                if (this.l == 2 && i30 == 0) {
                    i7 = 0;
                    this.l = 0;
                } else {
                    i7 = 0;
                }
            } else {
                i6 = i23;
                f3 = 0.5f;
                i7 = 0;
                i8 = 2;
            }
            if (i4 > i14) {
                this.l = i8;
            }
            if (i3 > 0 && i5 == 0 && i15 == i) {
                this.l = i8;
            }
            int i32 = this.l;
            if (i32 == 1) {
                if (i3 > 1) {
                    i9 = (i14 - i4) / (i3 - 1);
                } else {
                    i9 = i3 == 1 ? (i14 - i4) / 2 : i7;
                }
                if (i5 > 0) {
                    i9 = i7;
                }
                int i33 = i6;
                while (i7 < size) {
                    WK2 wk24 = this.k.get(z ? size - (i7 + 1) : i7);
                    if (wk24.b.l0() == 8) {
                        wk24.h.e(i33);
                        wk24.i.e(i33);
                    } else {
                        if (i7 > 0) {
                            i33 = z ? i33 - i9 : i33 + i9;
                        }
                        if (i7 > 0 && i7 >= i15) {
                            if (z) {
                                i33 -= wk24.h.f;
                            } else {
                                i33 += wk24.h.f;
                            }
                        }
                        if (z) {
                            wk24.i.e(i33);
                        } else {
                            wk24.h.e(i33);
                        }
                        C10126v30 c10126v303 = wk24.e;
                        int i34 = c10126v303.g;
                        if (wk24.d == UK.b.MATCH_CONSTRAINT && wk24.a == 1) {
                            i34 = c10126v303.m;
                        }
                        i33 = z ? i33 - i34 : i33 + i34;
                        if (z) {
                            wk24.h.e(i33);
                        } else {
                            wk24.i.e(i33);
                        }
                        wk24.g = true;
                        if (i7 < i16 && i7 < i) {
                            if (z) {
                                i33 -= -wk24.i.f;
                            } else {
                                i33 += -wk24.i.f;
                            }
                        }
                    }
                    i7++;
                }
            } else if (i32 == 0) {
                int i35 = (i14 - i4) / (i3 + 1);
                if (i5 > 0) {
                    i35 = i7;
                }
                int i36 = i6;
                while (i7 < size) {
                    WK2 wk25 = this.k.get(z ? size - (i7 + 1) : i7);
                    if (wk25.b.l0() == 8) {
                        wk25.h.e(i36);
                        wk25.i.e(i36);
                    } else {
                        int i37 = z ? i36 - i35 : i36 + i35;
                        if (i7 > 0 && i7 >= i15) {
                            if (z) {
                                i37 -= wk25.h.f;
                            } else {
                                i37 += wk25.h.f;
                            }
                        }
                        if (z) {
                            wk25.i.e(i37);
                        } else {
                            wk25.h.e(i37);
                        }
                        C10126v30 c10126v304 = wk25.e;
                        int i38 = c10126v304.g;
                        if (wk25.d == UK.b.MATCH_CONSTRAINT && wk25.a == 1) {
                            i38 = Math.min(i38, c10126v304.m);
                        }
                        i36 = z ? i37 - i38 : i37 + i38;
                        if (z) {
                            wk25.h.e(i36);
                        } else {
                            wk25.i.e(i36);
                        }
                        if (i7 < i16 && i7 < i) {
                            if (z) {
                                i36 -= -wk25.i.f;
                            } else {
                                i36 += -wk25.i.f;
                            }
                        }
                    }
                    i7++;
                }
            } else if (i32 == 2) {
                float E = this.f == 0 ? this.b.E() : this.b.g0();
                if (z) {
                    E = 1.0f - E;
                }
                int i39 = (int) (((i14 - i4) * E) + f3);
                if (i39 < 0 || i5 > 0) {
                    i39 = i7;
                }
                int i40 = z ? i6 - i39 : i6 + i39;
                while (i7 < size) {
                    WK2 wk26 = this.k.get(z ? size - (i7 + 1) : i7);
                    if (wk26.b.l0() == 8) {
                        wk26.h.e(i40);
                        wk26.i.e(i40);
                    } else {
                        if (i7 > 0 && i7 >= i15) {
                            if (z) {
                                i40 -= wk26.h.f;
                            } else {
                                i40 += wk26.h.f;
                            }
                        }
                        if (z) {
                            wk26.i.e(i40);
                        } else {
                            wk26.h.e(i40);
                        }
                        C10126v30 c10126v305 = wk26.e;
                        int i41 = c10126v305.g;
                        if (wk26.d == UK.b.MATCH_CONSTRAINT && wk26.a == 1) {
                            i41 = c10126v305.m;
                        }
                        i40 += i41;
                        if (z) {
                            wk26.h.e(i40);
                        } else {
                            wk26.i.e(i40);
                        }
                        if (i7 < i16 && i7 < i) {
                            if (z) {
                                i40 -= -wk26.i.f;
                            } else {
                                i40 += -wk26.i.f;
                            }
                        }
                    }
                    i7++;
                }
            }
        }
    }

    @Override // o.WK2
    public void d() {
        Iterator<WK2> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        UK uk = this.k.get(0).b;
        UK uk2 = this.k.get(size - 1).b;
        if (this.f == 0) {
            MK mk = uk.Q;
            MK mk2 = uk2.S;
            C8901q20 i = i(mk, 0);
            int g = mk.g();
            UK v = v();
            if (v != null) {
                g = v.Q.g();
            }
            if (i != null) {
                b(this.h, i, g);
            }
            C8901q20 i2 = i(mk2, 0);
            int g2 = mk2.g();
            UK w = w();
            if (w != null) {
                g2 = w.S.g();
            }
            if (i2 != null) {
                b(this.i, i2, -g2);
            }
        } else {
            MK mk3 = uk.R;
            MK mk4 = uk2.T;
            C8901q20 i3 = i(mk3, 1);
            int g3 = mk3.g();
            UK v2 = v();
            if (v2 != null) {
                g3 = v2.R.g();
            }
            if (i3 != null) {
                b(this.h, i3, g3);
            }
            C8901q20 i4 = i(mk4, 1);
            int g4 = mk4.g();
            UK w2 = w();
            if (w2 != null) {
                g4 = w2.T.g();
            }
            if (i4 != null) {
                b(this.i, i4, -g4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // o.WK2
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // o.WK2
    public void f() {
        this.c = null;
        Iterator<WK2> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // o.WK2
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WK2 wk2 = this.k.get(i);
            j = j + wk2.h.f + wk2.j() + wk2.i.f;
        }
        return j;
    }

    @Override // o.WK2
    public void n() {
        this.h.j = false;
        this.i.j = false;
    }

    @Override // o.WK2
    public boolean p() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator<WK2> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    public final void u() {
        UK uk;
        int i0;
        UK uk2 = this.b;
        UK V = uk2.V(this.f);
        while (true) {
            UK uk3 = V;
            uk = uk2;
            uk2 = uk3;
            if (uk2 == null) {
                break;
            }
            V = uk2.V(this.f);
        }
        this.b = uk;
        this.k.add(uk.a0(this.f));
        UK R = uk.R(this.f);
        while (R != null) {
            this.k.add(R.a0(this.f));
            R = R.R(this.f);
        }
        Iterator<WK2> it = this.k.iterator();
        while (it.hasNext()) {
            WK2 next = it.next();
            int i = this.f;
            if (i == 0) {
                next.b.c = this;
            } else if (i == 1) {
                next.b.d = this;
            }
        }
        if (this.f == 0 && ((VK) this.b.U()).P2() && this.k.size() > 1) {
            ArrayList<WK2> arrayList = this.k;
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        if (this.f == 0) {
            i0 = this.b.G();
        } else {
            i0 = this.b.i0();
        }
        this.l = i0;
    }

    public final UK v() {
        for (int i = 0; i < this.k.size(); i++) {
            WK2 wk2 = this.k.get(i);
            if (wk2.b.l0() != 8) {
                return wk2.b;
            }
        }
        return null;
    }

    public final UK w() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            WK2 wk2 = this.k.get(size);
            if (wk2.b.l0() != 8) {
                return wk2.b;
            }
        }
        return null;
    }
}
