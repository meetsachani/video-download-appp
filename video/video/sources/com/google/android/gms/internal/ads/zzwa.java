package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import o.HL0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzwa implements zzzp, zzuq {
    public final Uri b;
    public final zzhf c;
    public final zzvu d;
    public final zzadq e;
    public final zzdj f;
    public volatile boolean h;
    public long j;
    @InterfaceC11300zs1
    public zzaet l;
    public boolean m;
    public final /* synthetic */ zzwf n;
    public final zzaej g = new zzaej();
    public boolean i = true;
    public final long a = zzus.a();
    public zzgl k = i(0);

    public zzwa(zzwf zzwfVar, Uri uri, zzgg zzggVar, zzvu zzvuVar, zzadq zzadqVar, zzdj zzdjVar) {
        this.n = zzwfVar;
        this.b = uri;
        this.c = new zzhf(zzggVar);
        this.d = zzvuVar;
        this.e = zzadqVar;
        this.f = zzdjVar;
    }

    public static /* bridge */ /* synthetic */ void f(zzwa zzwaVar, long j, long j2) {
        zzwaVar.g.a = j;
        zzwaVar.j = j2;
        zzwaVar.i = true;
        zzwaVar.m = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuq
    public final void b(zzek zzekVar) {
        long D;
        long max;
        if (this.m) {
            D = this.n.D(true);
            max = Math.max(D, this.j);
        } else {
            max = this.j;
        }
        long j = max;
        int u = zzekVar.u();
        zzaet zzaetVar = this.l;
        zzaetVar.getClass();
        zzaetVar.d(zzekVar, u);
        zzaetVar.c(j, 1, u, 0, null);
        this.m = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final void g() {
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x00ad A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c3 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00d9 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00ef A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x010b A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x013f A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0153 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0189 A[Catch: all -> 0x008a, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0190 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #4 {all -> 0x008a, blocks: (B:172:0x00a2, B:174:0x00ad, B:176:0x00b9, B:178:0x00c3, B:180:0x00cf, B:182:0x00d9, B:184:0x00e5, B:186:0x00ef, B:188:0x0101, B:190:0x010b, B:191:0x0111, B:200:0x013f, B:201:0x0146, B:203:0x0153, B:205:0x015b, B:207:0x0176, B:209:0x0189, B:210:0x018c, B:212:0x0190, B:195:0x011b, B:198:0x0131, B:165:0x0072, B:170:0x0090), top: B:252:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01d0 A[EDGE_INSN: B:264:0x01d0->B:226:0x01d0 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzzp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() throws IOException {
        long j;
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i2;
        zzagn zzagnVar;
        zzgg zzggVar;
        zzagn zzagnVar2;
        int i3;
        long j2;
        Handler handler;
        Runnable runnable;
        zzagn zzagnVar3;
        zzagn zzagnVar4;
        zzz zzzVar;
        int i4;
        int i5;
        while (!this.h) {
            int i6 = 0;
            try {
                long j3 = this.g.a;
                zzgl i7 = i(j3);
                this.k = i7;
                zzhf zzhfVar = this.c;
                long a = zzhfVar.a(i7);
                if (this.h) {
                    zzvu zzvuVar = this.d;
                    if (zzvuVar.b() != -1) {
                        this.g.a = zzvuVar.b();
                    }
                    zzgi.a(this.c);
                    return;
                }
                if (a != -1) {
                    a += j3;
                    r6.i1.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzwf.this.A1 = true;
                        }
                    });
                }
                long j4 = a;
                zzwf zzwfVar = this.n;
                Map d = zzhfVar.d();
                List list6 = (List) d.get(HL0.e1);
                try {
                    if (list6 != null) {
                        String str4 = (String) list6.get(0);
                        try {
                            i5 = Integer.parseInt(str4) * 1000;
                        } catch (NumberFormatException unused) {
                            j = -1;
                            i5 = -1;
                        }
                        if (i5 > 0) {
                            j = -1;
                            z = true;
                            i = i5;
                            list = (List) d.get(HL0.f1);
                            zzagn zzagnVar5 = null;
                            if (list != null) {
                                str = (String) list.get(0);
                                z = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) d.get(HL0.g1);
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) d.get(HL0.h1);
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) d.get(HL0.i1);
                            if (list4 != null) {
                                z2 = ((String) list4.get(0)).equals("1");
                                z = true;
                            } else {
                                z2 = false;
                            }
                            list5 = (List) d.get(HL0.j1);
                            if (list5 != null) {
                                String str5 = (String) list5.get(0);
                                try {
                                    i4 = Integer.parseInt(str5);
                                } catch (NumberFormatException unused2) {
                                    i4 = -1;
                                }
                                if (i4 > 0) {
                                    z = true;
                                    i2 = i4;
                                    if (z) {
                                        zzagnVar5 = new zzagn(i, str, str2, str3, z2, i2);
                                    }
                                    zzwfVar.k1 = zzagnVar5;
                                    zzgg zzggVar2 = this.c;
                                    zzwf zzwfVar2 = this.n;
                                    zzagnVar = zzwfVar2.k1;
                                    if (zzagnVar != null) {
                                        zzagnVar3 = zzwfVar2.k1;
                                        if (zzagnVar3.f != -1) {
                                            zzagnVar4 = zzwfVar2.k1;
                                            zzgg zzurVar = new zzur(zzggVar2, zzagnVar4.f, this);
                                            zzaet X = zzwfVar2.X();
                                            this.l = X;
                                            zzzVar = zzwf.J1;
                                            X.e(zzzVar);
                                            zzggVar = zzurVar;
                                            zzvu zzvuVar2 = this.d;
                                            zzvuVar2.a(zzggVar, this.b, zzggVar2.d(), j3, j4, this.e);
                                            zzagnVar2 = zzwfVar2.k1;
                                            if (zzagnVar2 != null) {
                                                zzvuVar2.c();
                                            }
                                            if (this.i) {
                                                zzvuVar2.e(j3, this.j);
                                                this.i = false;
                                            }
                                            i3 = 0;
                                            while (true) {
                                                if (i3 == 0) {
                                                    break;
                                                }
                                                try {
                                                    if (!this.h) {
                                                        try {
                                                            zzdj zzdjVar = this.f;
                                                            zzdjVar.a();
                                                            i3 = zzvuVar2.f(this.g);
                                                            long b = zzvuVar2.b();
                                                            j2 = zzwfVar2.b1;
                                                            if (b > j2 + j3) {
                                                                zzdjVar.d();
                                                                handler = zzwfVar2.i1;
                                                                runnable = zzwfVar2.h1;
                                                                handler.post(runnable);
                                                                j3 = b;
                                                            }
                                                        } catch (InterruptedException unused3) {
                                                            throw new InterruptedIOException();
                                                        }
                                                    } else {
                                                        i3 = 0;
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    i6 = i3;
                                                    if (i6 != 1) {
                                                        zzvu zzvuVar3 = this.d;
                                                        if (zzvuVar3.b() != j) {
                                                            this.g.a = zzvuVar3.b();
                                                        }
                                                    }
                                                    zzgi.a(this.c);
                                                    throw th;
                                                }
                                            }
                                            if (i3 != 1) {
                                                if (zzvuVar2.b() != j) {
                                                    this.g.a = zzvuVar2.b();
                                                }
                                                i6 = i3;
                                            }
                                            zzgi.a(zzggVar2);
                                            if (i6 != 0) {
                                                return;
                                            }
                                        }
                                    }
                                    zzggVar = zzggVar2;
                                    zzvu zzvuVar22 = this.d;
                                    zzvuVar22.a(zzggVar, this.b, zzggVar2.d(), j3, j4, this.e);
                                    zzagnVar2 = zzwfVar2.k1;
                                    if (zzagnVar2 != null) {
                                    }
                                    if (this.i) {
                                    }
                                    i3 = 0;
                                    while (true) {
                                        if (i3 == 0) {
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                    zzgi.a(zzggVar2);
                                    if (i6 != 0) {
                                    }
                                } else {
                                    try {
                                        zzdx.f(HL0.d1, "Invalid metadata interval: " + str5);
                                    } catch (NumberFormatException unused4) {
                                        zzdx.f(HL0.d1, "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                        i2 = i4;
                                        if (z) {
                                        }
                                        zzwfVar.k1 = zzagnVar5;
                                        zzgg zzggVar22 = this.c;
                                        zzwf zzwfVar22 = this.n;
                                        zzagnVar = zzwfVar22.k1;
                                        if (zzagnVar != null) {
                                        }
                                        zzggVar = zzggVar22;
                                        zzvu zzvuVar222 = this.d;
                                        zzvuVar222.a(zzggVar, this.b, zzggVar22.d(), j3, j4, this.e);
                                        zzagnVar2 = zzwfVar22.k1;
                                        if (zzagnVar2 != null) {
                                        }
                                        if (this.i) {
                                        }
                                        i3 = 0;
                                        while (true) {
                                            if (i3 == 0) {
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                        zzgi.a(zzggVar22);
                                        if (i6 != 0) {
                                        }
                                    }
                                }
                            }
                            i2 = -1;
                            if (z) {
                            }
                            zzwfVar.k1 = zzagnVar5;
                            zzgg zzggVar222 = this.c;
                            zzwf zzwfVar222 = this.n;
                            zzagnVar = zzwfVar222.k1;
                            if (zzagnVar != null) {
                            }
                            zzggVar = zzggVar222;
                            zzvu zzvuVar2222 = this.d;
                            zzvuVar2222.a(zzggVar, this.b, zzggVar222.d(), j3, j4, this.e);
                            zzagnVar2 = zzwfVar222.k1;
                            if (zzagnVar2 != null) {
                            }
                            if (this.i) {
                            }
                            i3 = 0;
                            while (true) {
                                if (i3 == 0) {
                                }
                            }
                            if (i3 != 1) {
                            }
                            zzgi.a(zzggVar222);
                            if (i6 != 0) {
                            }
                        } else {
                            j = -1;
                            try {
                                zzdx.f(HL0.d1, "Invalid bitrate: " + str4);
                            } catch (NumberFormatException unused5) {
                                zzdx.f(HL0.d1, "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                z = false;
                                i = i5;
                                list = (List) d.get(HL0.f1);
                                zzagn zzagnVar52 = null;
                                if (list != null) {
                                }
                                list2 = (List) d.get(HL0.g1);
                                if (list2 != null) {
                                }
                                list3 = (List) d.get(HL0.h1);
                                if (list3 != null) {
                                }
                                list4 = (List) d.get(HL0.i1);
                                if (list4 != null) {
                                }
                                list5 = (List) d.get(HL0.j1);
                                if (list5 != null) {
                                }
                                i2 = -1;
                                if (z) {
                                }
                                zzwfVar.k1 = zzagnVar52;
                                zzgg zzggVar2222 = this.c;
                                zzwf zzwfVar2222 = this.n;
                                zzagnVar = zzwfVar2222.k1;
                                if (zzagnVar != null) {
                                }
                                zzggVar = zzggVar2222;
                                zzvu zzvuVar22222 = this.d;
                                zzvuVar22222.a(zzggVar, this.b, zzggVar2222.d(), j3, j4, this.e);
                                zzagnVar2 = zzwfVar2222.k1;
                                if (zzagnVar2 != null) {
                                }
                                if (this.i) {
                                }
                                i3 = 0;
                                while (true) {
                                    if (i3 == 0) {
                                    }
                                }
                                if (i3 != 1) {
                                }
                                zzgi.a(zzggVar2222);
                                if (i6 != 0) {
                                }
                            }
                        }
                    } else {
                        j = -1;
                    }
                    list = (List) d.get(HL0.f1);
                    zzagn zzagnVar522 = null;
                    if (list != null) {
                    }
                    list2 = (List) d.get(HL0.g1);
                    if (list2 != null) {
                    }
                    list3 = (List) d.get(HL0.h1);
                    if (list3 != null) {
                    }
                    list4 = (List) d.get(HL0.i1);
                    if (list4 != null) {
                    }
                    list5 = (List) d.get(HL0.j1);
                    if (list5 != null) {
                    }
                    i2 = -1;
                    if (z) {
                    }
                    zzwfVar.k1 = zzagnVar522;
                    zzgg zzggVar22222 = this.c;
                    zzwf zzwfVar22222 = this.n;
                    zzagnVar = zzwfVar22222.k1;
                    if (zzagnVar != null) {
                    }
                    zzggVar = zzggVar22222;
                    zzvu zzvuVar222222 = this.d;
                    zzvuVar222222.a(zzggVar, this.b, zzggVar22222.d(), j3, j4, this.e);
                    zzagnVar2 = zzwfVar22222.k1;
                    if (zzagnVar2 != null) {
                    }
                    if (this.i) {
                    }
                    i3 = 0;
                    while (true) {
                        if (i3 == 0) {
                        }
                    }
                    if (i3 != 1) {
                    }
                    zzgi.a(zzggVar22222);
                    if (i6 != 0) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                z = false;
                i = -1;
            } catch (Throwable th3) {
                th = th3;
                j = -1;
            }
        }
    }

    public final zzgl i(long j) {
        Map map;
        zzgj zzgjVar = new zzgj();
        zzgjVar.d(this.b);
        zzgjVar.c(j);
        zzgjVar.a(6);
        map = zzwf.I1;
        zzgjVar.b(map);
        return zzgjVar.e();
    }
}
