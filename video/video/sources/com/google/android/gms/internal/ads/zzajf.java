package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class zzajf {
    public static final zzfvr d = zzfvr.b(zzfun.c(':'));
    public static final zzfvr e = zzfvr.b(zzfun.c('*'));
    public final List a = new ArrayList();
    public int b = 0;
    public int c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a(zzado zzadoVar, zzaej zzaejVar, List list) throws IOException {
        int i;
        boolean z;
        char c;
        int i2 = this.b;
        if (i2 != 0) {
            int i3 = 2;
            if (i2 != 1) {
                short s = 2817;
                short s2 = 2816;
                short s3 = 2192;
                if (i2 != 2) {
                    long e2 = zzadoVar.e();
                    int f = (int) ((zzadoVar.f() - zzadoVar.e()) - this.c);
                    zzek zzekVar = new zzek(f);
                    zzadoVar.I(zzekVar.n(), 0, f);
                    int i4 = 0;
                    while (true) {
                        List list2 = this.a;
                        if (i4 < list2.size()) {
                            zzaje zzajeVar = (zzaje) list2.get(i4);
                            zzekVar.l((int) (zzajeVar.a - e2));
                            zzekVar.m(4);
                            int C = zzekVar.C();
                            Charset charset = StandardCharsets.UTF_8;
                            String b = zzekVar.b(C, charset);
                            switch (b.hashCode()) {
                                case -1711564334:
                                    if (b.equals("SlowMotion_Data")) {
                                        z = false;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case -1332107749:
                                    if (b.equals("Super_SlowMotion_Edit_Data")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case -1251387154:
                                    if (b.equals("Super_SlowMotion_Data")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case -830665521:
                                    if (b.equals("Super_SlowMotion_Deflickering_On")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                case 1760745220:
                                    if (b.equals("Super_SlowMotion_BGM")) {
                                        z = true;
                                        break;
                                    }
                                    z = true;
                                    break;
                                default:
                                    z = true;
                                    break;
                            }
                            if (z) {
                                if (!z) {
                                    if (!z) {
                                        if (!z) {
                                            if (z) {
                                                c = 2820;
                                            } else {
                                                throw zzaz.a("Invalid SEF name", null);
                                            }
                                        } else {
                                            c = 2819;
                                        }
                                    } else {
                                        c = 2817;
                                    }
                                } else {
                                    c = 2816;
                                }
                            } else {
                                c = 2192;
                            }
                            int i5 = zzajeVar.b - (C + 8);
                            if (c != 2192) {
                                if (c != 2816 && c != 2817 && c != 2819 && c != 2820) {
                                    throw new IllegalStateException();
                                }
                            } else {
                                ArrayList arrayList = new ArrayList();
                                List f2 = e.f(zzekVar.b(i5, charset));
                                for (int i6 = 0; i6 < f2.size(); i6++) {
                                    List f3 = d.f((CharSequence) f2.get(i6));
                                    if (f3.size() == 3) {
                                        try {
                                            arrayList.add(new zzahf(Long.parseLong((String) f3.get(0)), Long.parseLong((String) f3.get(1)), 1 << (Integer.parseInt((String) f3.get(2)) - 1)));
                                        } catch (NumberFormatException e3) {
                                            throw zzaz.a(null, e3);
                                        }
                                    } else {
                                        throw zzaz.a(null, null);
                                    }
                                }
                                list.add(new zzahg(arrayList));
                            }
                            i4++;
                        } else {
                            zzaejVar.a = 0L;
                            return 1;
                        }
                    }
                } else {
                    long f4 = zzadoVar.f();
                    int i7 = this.c - 20;
                    zzek zzekVar2 = new zzek(i7);
                    zzadoVar.I(zzekVar2.n(), 0, i7);
                    int i8 = 0;
                    while (i8 < i7 / 12) {
                        zzekVar2.m(i3);
                        short d2 = zzekVar2.d();
                        if (d2 != s3 && d2 != s2 && d2 != s && d2 != 2819 && d2 != 2820) {
                            zzekVar2.m(8);
                            i = i7;
                        } else {
                            i = i7;
                            this.a.add(new zzaje(d2, (f4 - this.c) - zzekVar2.C(), zzekVar2.C()));
                        }
                        i8++;
                        i7 = i;
                        i3 = 2;
                        s = 2817;
                        s2 = 2816;
                        s3 = 2192;
                    }
                    List list3 = this.a;
                    if (list3.isEmpty()) {
                        zzaejVar.a = 0L;
                    } else {
                        this.b = 3;
                        zzaejVar.a = ((zzaje) list3.get(0)).a;
                    }
                }
            } else {
                zzek zzekVar3 = new zzek(8);
                zzadoVar.I(zzekVar3.n(), 0, 8);
                this.c = zzekVar3.C() + 8;
                if (zzekVar3.A() != 1397048916) {
                    zzaejVar.a = 0L;
                } else {
                    zzaejVar.a = zzadoVar.e() - (this.c - 12);
                    this.b = 2;
                }
            }
            return 1;
        }
        long f5 = zzadoVar.f();
        zzaejVar.a = (f5 == -1 || f5 < 8) ? 0L : f5 - 8;
        this.b = 1;
        return 1;
    }

    public final void b() {
        this.a.clear();
        this.b = 0;
    }
}
