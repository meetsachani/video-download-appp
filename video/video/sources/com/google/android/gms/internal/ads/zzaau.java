package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.facebook.internal.q0;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import o.C10323vs;
import o.C10928yK2;
import o.C11304zt1;
import o.C3503Kz;
import o.C3599Ly1;
import o.C4128Rj1;
import o.C5588cW;
import o.C5865df1;
import o.C8077mf;
import o.C8206nB;
import o.HS1;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.KH0;
import o.VN2;

/* loaded from: classes2.dex */
public final class zzaau extends zztj implements zzabk {
    public static final int[] i3 = {1920, 1600, 1440, q0.q1, 960, 854, 640, 540, q0.n1};
    public static boolean j3;
    public static boolean k3;
    public final zzabl A2;
    public final zzabj B2;
    public final long C2;
    public final PriorityQueue D2;
    public zzaat E2;
    public boolean F2;
    public boolean G2;
    public zzach H2;
    public boolean I2;
    public int J2;
    public List K2;
    @InterfaceC11300zs1
    public Surface L2;
    @InterfaceC11300zs1
    public zzaax M2;
    public zzel N2;
    public boolean O2;
    public int P2;
    public int Q2;
    public long R2;
    public int S2;
    public int T2;
    public int U2;
    public long V2;
    public int W2;
    public long X2;
    public zzcd Y2;
    @InterfaceC11300zs1
    public zzcd Z2;
    public int a3;
    public int b3;
    @InterfaceC11300zs1
    public zzabi c3;
    public long d3;
    public long e3;
    public boolean f3;
    public boolean g3;
    public int h3;
    public final Context w2;
    public final boolean x2;
    public final zzacb y2;
    public final boolean z2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaau(zzaas zzaasVar) {
        super(2, r2, r3, false, 30.0f);
        zzsx zzsxVar;
        zztl zztlVar;
        Context context;
        Handler handler;
        zzacc zzaccVar;
        boolean z;
        zzsxVar = zzaasVar.d;
        zztlVar = zzaasVar.c;
        context = zzaasVar.a;
        Context applicationContext = context.getApplicationContext();
        this.w2 = applicationContext;
        this.H2 = null;
        handler = zzaasVar.e;
        zzaccVar = zzaasVar.f;
        this.y2 = new zzacb(handler, zzaccVar);
        if (this.H2 == null) {
            z = true;
        } else {
            z = false;
        }
        this.x2 = z;
        this.A2 = new zzabl(applicationContext, this, 0L);
        this.B2 = new zzabj();
        this.z2 = "NVIDIA".equals(Build.MANUFACTURER);
        this.N2 = zzel.c;
        this.P2 = 1;
        this.Q2 = 0;
        this.Y2 = zzcd.d;
        this.b3 = 0;
        this.Z2 = null;
        this.a3 = -1000;
        this.d3 = C10323vs.b;
        this.e3 = C10323vs.b;
        this.D2 = new PriorityQueue();
        this.C2 = C10323vs.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04c2, code lost:
        if (r0.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x079d, code lost:
        if (r13.equals("JSN-L21") == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean k1(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzaau.class) {
            if (!j3) {
                int i = Build.VERSION.SDK_INT;
                char c = C5588cW.n;
                if (i <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z2 = false;
                                break;
                            }
                            z2 = true;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        default:
                            z2 = true;
                            break;
                    }
                    switch (z2) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z3 = true;
                            break;
                    }
                    k3 = z3;
                    j3 = true;
                }
                if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        default:
                            z = true;
                            break;
                    }
                    switch (z) {
                        default:
                            if (i <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c = '6';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c = '7';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c = '8';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c = 'J';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c = 22;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c = 'Y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c = 'Z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c = 'e';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c = 'f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c = 'g';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c = C8206nB.d;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c = 't';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c = 137;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c = 21;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c = 'h';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c = '_';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c = 130;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c = 'a';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c = 'b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c = 'c';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c = '4';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c = 18;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c = 'F';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c = 'v';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c = 'W';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c = 'x';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c = '\"';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c = '~';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c = 'X';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c = '\t';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c = 'w';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c = 131;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c = 132;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c = '[';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c = '3';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c = '5';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c = 'i';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c = 'y';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c = 17;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c = 138;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c = VN2.b;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c = 134;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c = 20;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c = 'q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c = C8077mf.N;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c = KH0.a;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c = 16;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c = 'T';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c = 'I';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c = 'O';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c = 'P';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c = 'V';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c = '^';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c = 'k';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c = 's';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c = 139;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c = 26;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c = 27;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c = '1';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c = '$';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c = '%';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c = '&';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c = '\'';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c = '(';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c = ')';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c = ']';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c = 'm';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c = 'o';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c = 136;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c = '2';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c = 'K';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c = 'U';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c = '\\';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c = 'S';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c = 15;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c = C5588cW.p;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c = '*';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c = '+';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c = ',';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c = '-';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c = '.';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c = '/';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c = C3599Ly1.j;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c = 'l';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c = 'n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c = 'p';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c = 128;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c = 135;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c = 'C';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c = 'L';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c = 'M';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c = 25;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c = 'R';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c = '<';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c = 11;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c = '\f';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c = 'z';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c = '{';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c = '|';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c = '}';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c = 'j';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c = 'r';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c = '9';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c = ':';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c = C10928yK2.l;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c = 'Q';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c = '\n';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c = 'H';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c = '`';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c = 'N';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c = 'G';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c = '>';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c = '#';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c = '=';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c = 133;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c = 23;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c = 24;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c = 'D';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c = 'u';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c = 'd';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c = C3599Ly1.i;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c = 19;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c = C5588cW.f706o;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c = '?';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c = C11304zt1.a;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c = 14;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c = ' ';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c = '!';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c = 'A';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c = 'B';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    default:
                                        if (str3.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case ' ':
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case '-':
                                    case '.':
                                    case '/':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case C3503Kz.V /* 132 */:
                                    case C3503Kz.W /* 133 */:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case C3503Kz.a0 /* 137 */:
                                    case 138:
                                    case C3503Kz.c0 /* 139 */:
                                        break;
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    k3 = z3;
                    j3 = true;
                }
                z3 = true;
                k3 = z3;
                j3 = true;
            }
        }
        return k3;
    }

    public static final boolean l1(zztc zztcVar) {
        return Build.VERSION.SDK_INT >= 35 && zztcVar.h;
    }

    public static List n1(Context context, zztl zztlVar, zzz zzzVar, boolean z, boolean z2) throws zztq {
        String str = zzzVar.f301o;
        if (str == null) {
            return zzfyc.F();
        }
        if (Build.VERSION.SDK_INT >= 26 && C4128Rj1.w.equals(str) && !zzaar.a(context)) {
            List c = zztw.c(zztlVar, zzzVar, z, z2);
            if (!c.isEmpty()) {
                return c;
            }
        }
        return zztw.e(zztlVar, zzzVar, z, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
        if (r3.equals(o.C4128Rj1.n) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int o1(zztc zztcVar, zzz zzzVar) {
        int i = zzzVar.v;
        int i2 = zzzVar.w;
        if (i != -1 && i2 != -1) {
            String str = zzzVar.f301o;
            str.getClass();
            char c = 2;
            if (C4128Rj1.w.equals(str)) {
                int i4 = zztw.b;
                Pair a = zzdh.a(zzzVar);
                if (a != null) {
                    int intValue = ((Integer) a.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = C4128Rj1.n;
                    }
                }
                str = C4128Rj1.k;
            }
            int i5 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals(C4128Rj1.i)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals(C4128Rj1.k)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals(C4128Rj1.p)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals(C4128Rj1.m)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i * i2) * 3) / i5;
                case 4:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zztcVar.f)))) {
                        String str3 = zzeu.a;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i5 = 8;
                    return ((i * i2) * 3) / i5;
            }
        }
        return -1;
    }

    public static int p1(zztc zztcVar, zzz zzzVar) {
        int i = zzzVar.p;
        if (i != -1) {
            List list = zzzVar.r;
            int size = list.size();
            int i2 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i2 += ((byte[]) list.get(i4)).length;
            }
            return i + i2;
        }
        return o1(zztcVar, zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void C() {
        try {
            super.C();
        } finally {
            this.I2 = false;
            this.d3 = C10323vs.b;
            w1();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void E() {
        this.S2 = 0;
        this.R2 = U().b();
        this.V2 = 0L;
        this.W2 = 0;
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            zzachVar.y();
        } else {
            this.A2.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void F() {
        if (this.S2 > 0) {
            long b = U().b();
            this.y2.n(this.S2, b - this.R2);
            this.S2 = 0;
            this.R2 = b;
        }
        int i = this.W2;
        if (i != 0) {
            this.y2.r(this.V2, i);
            this.V2 = 0L;
            this.W2 = 0;
        }
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            zzachVar.w();
        } else {
            this.A2.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final int G0(zztl zztlVar, zzz zzzVar) throws zztq {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i4;
        String str = zzzVar.f301o;
        int i5 = 128;
        if (!zzay.j(str)) {
            return 128;
        }
        Context context = this.w2;
        int i6 = 0;
        if (zzzVar.s != null) {
            z = true;
        } else {
            z = false;
        }
        List n1 = n1(context, zztlVar, zzzVar, z, false);
        if (z && n1.isEmpty()) {
            n1 = n1(context, zztlVar, zzzVar, false, false);
        }
        if (n1.isEmpty()) {
            return 129;
        }
        if (!zztj.v0(zzzVar)) {
            return 130;
        }
        zztc zztcVar = (zztc) n1.get(0);
        boolean e = zztcVar.e(zzzVar);
        if (!e) {
            for (int i7 = 1; i7 < n1.size(); i7++) {
                zztc zztcVar2 = (zztc) n1.get(i7);
                if (zztcVar2.e(zzzVar)) {
                    e = true;
                    z2 = false;
                    zztcVar = zztcVar2;
                    break;
                }
            }
        }
        z2 = true;
        if (true != e) {
            i = 3;
        } else {
            i = 4;
        }
        if (true != zztcVar.f(zzzVar)) {
            i2 = 8;
        } else {
            i2 = 16;
        }
        if (true != zztcVar.g) {
            i4 = 0;
        } else {
            i4 = 64;
        }
        if (true != z2) {
            i5 = 0;
        }
        if (Build.VERSION.SDK_INT >= 26 && C4128Rj1.w.equals(str) && !zzaar.a(context)) {
            i5 = 256;
        }
        if (e) {
            List n12 = n1(context, zztlVar, zzzVar, z, true);
            if (!n12.isEmpty()) {
                zztc zztcVar3 = (zztc) zztw.f(n12, zzzVar).get(0);
                if (zztcVar3.e(zzzVar) && zztcVar3.f(zzzVar)) {
                    i6 = 32;
                }
            }
        }
        return i | i2 | i6 | i4 | i5;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zzib H0(zztc zztcVar, zzz zzzVar, zzz zzzVar2) {
        int i;
        int i2;
        zzib b = zztcVar.b(zzzVar, zzzVar2);
        int i4 = b.e;
        zzaat zzaatVar = this.E2;
        zzaatVar.getClass();
        if (zzzVar2.v > zzaatVar.a || zzzVar2.w > zzaatVar.b) {
            i4 |= 256;
        }
        if (p1(zztcVar, zzzVar2) > zzaatVar.c) {
            i4 |= 64;
        }
        String str = zztcVar.a;
        if (i4 != 0) {
            i2 = 0;
            i = i4;
        } else {
            i = 0;
            i2 = b.d;
        }
        return new zzib(str, zzzVar, zzzVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    @InterfaceC11300zs1
    public final zzib I0(zzkq zzkqVar) throws zzik {
        zzib I0 = super.I0(zzkqVar);
        zzz zzzVar = zzkqVar.a;
        zzzVar.getClass();
        this.y2.p(zzzVar, I0);
        return I0;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void J(zzz[] zzzVarArr, long j, long j2, zzvb zzvbVar) throws zzik {
        super.J(zzzVarArr, j, j2, zzvbVar);
        zzbl S = S();
        if (S.o()) {
            this.e3 = C10323vs.b;
        } else {
            this.e3 = S.n(zzvbVar.a, new zzbj()).d;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zzsw L0(zztc zztcVar, zzz zzzVar, @InterfaceC11300zs1 MediaCrypto mediaCrypto, float f) {
        zzaat zzaatVar;
        boolean z;
        int i;
        int i2;
        Point point;
        int i4;
        int i5;
        int i6;
        boolean z2;
        zzz[] zzzVarArr;
        char c;
        boolean z3;
        int o1;
        zzz[] L = L();
        int length = L.length;
        int p1 = p1(zztcVar, zzzVar);
        int i7 = zzzVar.w;
        int i8 = zzzVar.v;
        if (length == 1) {
            if (p1 != -1 && (o1 = o1(zztcVar, zzzVar)) != -1) {
                p1 = Math.min((int) (p1 * 1.5f), o1);
            }
            zzaatVar = new zzaat(i8, i7, p1);
        } else {
            int i9 = i7;
            int i10 = i8;
            int i11 = 0;
            boolean z4 = false;
            while (i11 < length) {
                zzz zzzVar2 = L[i11];
                zzk zzkVar = zzzVar.C;
                if (zzkVar != null && zzzVar2.C == null) {
                    zzx b = zzzVar2.b();
                    b.d(zzkVar);
                    zzzVar2 = b.K();
                }
                if (zztcVar.b(zzzVar, zzzVar2).d != 0) {
                    int i12 = zzzVar2.v;
                    c = 65535;
                    if (i12 != -1) {
                        zzzVarArr = L;
                        if (zzzVar2.w != -1) {
                            z3 = false;
                            z4 |= z3;
                            i10 = Math.max(i10, i12);
                            i9 = Math.max(i9, zzzVar2.w);
                            p1 = Math.max(p1, p1(zztcVar, zzzVar2));
                        }
                    } else {
                        zzzVarArr = L;
                    }
                    z3 = true;
                    z4 |= z3;
                    i10 = Math.max(i10, i12);
                    i9 = Math.max(i9, zzzVar2.w);
                    p1 = Math.max(p1, p1(zztcVar, zzzVar2));
                } else {
                    zzzVarArr = L;
                    c = 65535;
                }
                i11++;
                L = zzzVarArr;
            }
            if (z4) {
                zzdx.f(C5865df1.A3, "Resolutions unknown. Codec max resolution: " + i10 + "x" + i9);
                if (i7 > i8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = i7;
                } else {
                    i = i8;
                }
                if (true != z) {
                    i2 = i7;
                } else {
                    i2 = i8;
                }
                int[] iArr = i3;
                int i13 = 0;
                while (i13 < 9) {
                    float f2 = i2;
                    float f3 = i;
                    int i14 = iArr[i13];
                    int i15 = i13;
                    float f4 = i14;
                    if (i14 <= i || (i4 = (int) (f4 * (f2 / f3))) <= i2) {
                        break;
                    }
                    int i16 = i;
                    if (true != z) {
                        i5 = i2;
                        i6 = i14;
                    } else {
                        i5 = i2;
                        i6 = i4;
                    }
                    if (true != z) {
                        i14 = i4;
                    }
                    point = zztcVar.a(i6, i14);
                    float f5 = zzzVar.x;
                    if (point != null) {
                        z2 = z;
                        if (zztcVar.g(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z2 = z;
                    }
                    i13 = i15 + 1;
                    i = i16;
                    i2 = i5;
                    z = z2;
                }
                point = null;
                if (point != null) {
                    i10 = Math.max(i10, point.x);
                    i9 = Math.max(i9, point.y);
                    zzx b2 = zzzVar.b();
                    b2.J(i10);
                    b2.m(i9);
                    p1 = Math.max(p1, o1(zztcVar, b2.K()));
                    zzdx.f(C5865df1.A3, "Codec max resolution adjusted to: " + i10 + "x" + i9);
                }
            }
            zzaatVar = new zzaat(i10, i9, p1);
        }
        String str = zztcVar.c;
        this.E2 = zzaatVar;
        boolean z5 = this.z2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i8);
        mediaFormat.setInteger("height", i7);
        zzea.b(mediaFormat, zzzVar.r);
        float f6 = zzzVar.x;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        zzea.a(mediaFormat, "rotation-degrees", zzzVar.y);
        zzk zzkVar2 = zzzVar.C;
        if (zzkVar2 != null) {
            zzea.a(mediaFormat, "color-transfer", zzkVar2.c);
            zzea.a(mediaFormat, "color-standard", zzkVar2.a);
            zzea.a(mediaFormat, "color-range", zzkVar2.b);
            byte[] bArr = zzkVar2.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if (C4128Rj1.w.equals(zzzVar.f301o)) {
            int i17 = zztw.b;
            Pair a = zzdh.a(zzzVar);
            if (a != null) {
                zzea.a(mediaFormat, Scopes.a, ((Integer) a.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaatVar.a);
        mediaFormat.setInteger("max-height", zzaatVar.b);
        zzea.a(mediaFormat, "max-input-size", zzaatVar.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.a3));
        }
        Surface m1 = m1(zztcVar);
        if (this.H2 != null && !zzeu.l(this.w2)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsw.b(zztcVar, mediaFormat, zzzVar, m1, null);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final List M0(zztl zztlVar, zzz zzzVar, boolean z) throws zztq {
        return zztw.f(n1(this.w2, zztlVar, zzzVar, false, false), zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    @TargetApi(29)
    public final void P0(zzhp zzhpVar) throws zzik {
        if (this.G2) {
            ByteBuffer byteBuffer = zzhpVar.g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsz f1 = f1();
                        f1.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        f1.Z(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void Q0(Exception exc) {
        zzdx.d(C5865df1.A3, "Video codec error", exc);
        this.y2.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void R0(String str, zzsw zzswVar, long j, long j2) {
        this.y2.k(str, j, j2);
        this.F2 = k1(str);
        zztc g0 = g0();
        g0.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && C4128Rj1.m.equals(g0.b)) {
            MediaCodecInfo.CodecProfileLevel[] h = g0.h();
            int length = h.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (h[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.G2 = z;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void S0(String str) {
        this.y2.l(str);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void T0(zzz zzzVar, @InterfaceC11300zs1 MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        zzsz f1 = f1();
        if (f1 != null) {
            f1.h(this.P2);
        }
        mediaFormat.getClass();
        if (mediaFormat.containsKey(C5865df1.C3) && mediaFormat.containsKey(C5865df1.B3) && mediaFormat.containsKey(C5865df1.D3) && mediaFormat.containsKey(C5865df1.E3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            integer = (mediaFormat.getInteger(C5865df1.C3) - mediaFormat.getInteger(C5865df1.B3)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z) {
            integer2 = (mediaFormat.getInteger(C5865df1.D3) - mediaFormat.getInteger(C5865df1.E3)) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f = zzzVar.z;
        int i = zzzVar.y;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.Y2 = new zzcd(integer, integer2, f);
        zzach zzachVar = this.H2;
        if (zzachVar != null && this.f3) {
            zzx b = zzzVar.b();
            b.J(integer);
            b.m(integer2);
            b.z(f);
            zzz K = b.K();
            int i4 = this.J2;
            List list = this.K2;
            if (list == null) {
                list = zzfyc.F();
            }
            zzachVar.b0(1, K, b1(), i4, list);
            this.J2 = 2;
        } else {
            this.A2.j(zzzVar.x);
        }
        this.f3 = false;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzlv
    public final boolean V() {
        boolean V = super.V();
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            return zzachVar.U(V);
        }
        if (V && f1() == null) {
            return true;
        }
        return this.A2.m(V);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void V0() {
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            zzachVar.B();
            long j = this.d3;
            if (j == C10323vs.b) {
                j = b1();
                this.d3 = j;
            }
            this.H2.e0(-j);
        } else {
            this.A2.f(2);
        }
        this.f3 = true;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void W0() {
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            zzachVar.B();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv, com.google.android.gms.internal.ads.zzly
    public final String X() {
        return C5865df1.A3;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final boolean X0(long j, long j2, @InterfaceC11300zs1 zzsz zzszVar, @InterfaceC11300zs1 ByteBuffer byteBuffer, int i, int i2, int i4, long j4, boolean z, boolean z2, zzz zzzVar) throws zzik {
        long j5;
        zzszVar.getClass();
        long a1 = j4 - a1();
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.D2;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j4) {
                break;
            }
            priorityQueue.poll();
            i5++;
        }
        h1(i5, 0);
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            if (z && !z2) {
                g1(zzszVar, i, a1);
                return true;
            }
            return zzachVar.X(j4 + (-this.d3), new zzaaq(this, zzszVar, i, a1));
        }
        zzabl zzablVar = this.A2;
        long b1 = b1();
        zzabj zzabjVar = this.B2;
        int a = zzablVar.a(j4, j, j2, b1, z, z2, zzabjVar);
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        return false;
                    }
                    g1(zzszVar, i, a1);
                    i1(zzabjVar.c());
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                zzszVar.k(i, false);
                Trace.endSection();
                h1(0, 1);
                i1(zzabjVar.c());
                return true;
            }
            long d = zzabjVar.d();
            long c = zzabjVar.c();
            if (d == this.X2) {
                g1(zzszVar, i, a1);
                j5 = d;
            } else {
                u1(a1, d, zzzVar);
                s1(zzszVar, i, a1, d);
                j5 = d;
            }
            i1(c);
            this.X2 = j5;
            return true;
        }
        long c2 = U().c();
        u1(a1, c2, zzzVar);
        s1(zzszVar, i, a1, c2);
        i1(zzabjVar.c());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void a0() {
        this.Z2 = null;
        this.e3 = C10323vs.b;
        this.O2 = false;
        try {
            super.a0();
        } finally {
            zzacb zzacbVar = this.y2;
            zzacbVar.m(this.o2);
            zzacbVar.t(zzcd.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void b0(boolean z, boolean z2) throws zzik {
        super.b0(z, z2);
        Y();
        this.y2.o(this.o2);
        if (!this.I2) {
            if (this.K2 != null && this.H2 == null) {
                zzaba zzabaVar = new zzaba(this.w2, this.A2);
                zzabaVar.f(true);
                zzabaVar.e(U());
                zzabh g = zzabaVar.g();
                g.w(1);
                this.H2 = g.g(0);
            }
            this.I2 = true;
        }
        int i = !z2 ? 1 : 0;
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            zzachVar.Z(new zzaap(this), zzgdq.c());
            zzabi zzabiVar = this.c3;
            if (zzabiVar != null) {
                this.H2.Y(zzabiVar);
            }
            if (this.L2 != null && !this.N2.equals(zzel.c)) {
                this.H2.V(this.L2, this.N2);
            }
            this.H2.d0(this.Q2);
            this.H2.S(Z0());
            List list = this.K2;
            if (list != null) {
                this.H2.a0(list);
            }
            this.J2 = i;
            h0();
            return;
        }
        zzabl zzablVar = this.A2;
        zzablVar.i(U());
        zzablVar.f(i);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz
    public final void c0(long j, boolean z) throws zzik {
        zzach zzachVar = this.H2;
        if (zzachVar != null && !z) {
            zzachVar.n0(true);
        }
        super.c0(j, z);
        if (this.H2 == null) {
            this.A2.g();
        }
        if (z) {
            zzach zzachVar2 = this.H2;
            if (zzachVar2 != null) {
                zzachVar2.c0(false);
            } else {
                this.A2.c(false);
            }
        }
        this.T2 = 0;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final float e0(float f, zzz zzzVar, zzz[] zzzVarArr) {
        float f2 = -1.0f;
        for (zzz zzzVar2 : zzzVarArr) {
            float f3 = zzzVar2.x;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zztb f0(Throwable th, @InterfaceC11300zs1 zztc zztcVar) {
        return new zzaao(th, zztcVar, this.L2);
    }

    public final void g1(zzsz zzszVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzszVar.k(i, false);
        Trace.endSection();
        this.o2.f++;
    }

    public final void h1(int i, int i2) {
        zzia zziaVar = this.o2;
        zziaVar.h += i;
        int i4 = i + i2;
        zziaVar.g += i4;
        this.S2 += i4;
        int i5 = this.T2 + i4;
        this.T2 = i5;
        zziaVar.i = Math.max(i5, zziaVar.i);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final boolean i(long j, long j2, long j4, boolean z, boolean z2) throws zzik {
        int Q;
        boolean z3;
        long j5 = this.C2;
        if (j5 != C10323vs.b) {
            if (j2 > R() + 200000 && j < j5) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.g3 = z3;
        }
        if (j >= -500000 || z || (Q = Q(j2)) == 0) {
            return false;
        }
        if (z2) {
            zzia zziaVar = this.o2;
            int i = zziaVar.d + Q;
            zziaVar.d = i;
            zziaVar.f += this.U2;
            zziaVar.d = i + this.D2.size();
        } else {
            this.o2.j++;
            h1(Q + this.D2.size(), this.U2);
        }
        o0();
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            zzachVar.n0(false);
        }
        return true;
    }

    public final void i1(long j) {
        zzia zziaVar = this.o2;
        zziaVar.k += j;
        zziaVar.l++;
        this.V2 += j;
        this.W2++;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    @InterfaceC2591Bt
    public final void j0(long j) {
        super.j0(j);
        this.U2--;
    }

    public final boolean j1(zztc zztcVar) {
        if (k1(zztcVar.a)) {
            return false;
        }
        if (zztcVar.f && !zzaax.b(this.w2)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    @InterfaceC2591Bt
    public final void k0(zzhp zzhpVar) throws zzik {
        this.h3 = 0;
        this.U2++;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    @InterfaceC2591Bt
    public final void m0() {
        super.m0();
        this.D2.clear();
        this.g3 = false;
        this.U2 = 0;
        this.h3 = 0;
    }

    @InterfaceC11300zs1
    public final Surface m1(zztc zztcVar) {
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            return zzachVar.b();
        }
        Surface surface = this.L2;
        if (surface != null) {
            return surface;
        }
        if (l1(zztcVar)) {
            return null;
        }
        zzdc.f(j1(zztcVar));
        zzaax zzaaxVar = this.M2;
        if (zzaaxVar != null) {
            if (zzaaxVar.X != zztcVar.f) {
                w1();
            }
        }
        if (this.M2 == null) {
            this.M2 = zzaax.a(this.w2, zztcVar.f);
        }
        return this.M2;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzlv
    @InterfaceC2591Bt
    public final void p(long j, long j2) throws zzik {
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            try {
                zzachVar.W(j, j2);
            } catch (zzacg e) {
                throw P(e, e.X, false, 7001);
            }
        }
        super.p(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final boolean p0() {
        zztc g0 = g0();
        if (this.H2 != null && g0 != null) {
            String str = g0.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                l0();
                return true;
            }
        }
        return super.p0();
    }

    @Override // com.google.android.gms.internal.ads.zztj
    @InterfaceC2591Bt
    public final boolean s0(zzz zzzVar) throws zzik {
        zzach zzachVar = this.H2;
        if (zzachVar != null && !zzachVar.Q()) {
            try {
                zzachVar.T(zzzVar);
                return true;
            } catch (zzacg e) {
                throw P(e, zzzVar, false, 7000);
            }
        }
        return true;
    }

    public final void s1(zzsz zzszVar, int i, long j, long j2) {
        Trace.beginSection("releaseOutputBuffer");
        zzszVar.f(i, j2);
        Trace.endSection();
        this.o2.e++;
        this.T2 = 0;
        if (this.H2 == null) {
            zzcd zzcdVar = this.Y2;
            if (!zzcdVar.equals(zzcd.d) && !zzcdVar.equals(this.Z2)) {
                this.Z2 = zzcdVar;
                this.y2.t(zzcdVar);
            }
            if (this.A2.n() && this.L2 != null) {
                v1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final boolean t0(zzhp zzhpVar) {
        boolean z;
        if (!d0() && !zzhpVar.h() && this.e3 != C10323vs.b) {
            if (this.e3 - (zzhpVar.f - a1()) > 100000 && !zzhpVar.l()) {
                if (zzhpVar.f < R()) {
                    z = true;
                } else {
                    z = false;
                }
                if ((z || this.g3) && !zzhpVar.e() && zzhpVar.i()) {
                    zzhpVar.b();
                    if (z) {
                        this.o2.d++;
                    } else if (this.g3) {
                        this.D2.add(Long.valueOf(zzhpVar.f));
                        this.h3++;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void t1() {
        zzcd zzcdVar = this.Z2;
        if (zzcdVar != null) {
            this.y2.t(zzcdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlv
    public final void u(float f, float f2) throws zzik {
        super.u(f, f2);
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            zzachVar.S(f);
        } else {
            this.A2.l(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final boolean u0(zztc zztcVar) {
        return y1(zztcVar);
    }

    public final void u1(long j, long j2, zzz zzzVar) {
        zzabi zzabiVar = this.c3;
        if (zzabiVar != null) {
            zzabiVar.c(j, j2, zzzVar, c1());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlv
    public final void v() {
        zzach zzachVar = this.H2;
        if (zzachVar != null) {
            int i = this.J2;
            if (i != 0 && i != 1) {
                zzachVar.h();
                return;
            } else {
                this.J2 = 0;
                return;
            }
        }
        this.A2.b();
    }

    @HS1({"displaySurface"})
    public final void v1() {
        this.y2.q(this.L2);
        this.O2 = true;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzhz, com.google.android.gms.internal.ads.zzlq
    public final void w(int i, @InterfaceC11300zs1 Object obj) throws zzik {
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i != 14) {
                                    if (i != 16) {
                                        if (i != 17) {
                                            super.w(i, obj);
                                            return;
                                        }
                                        Surface surface = this.L2;
                                        x1(null);
                                        obj.getClass();
                                        ((zzaau) obj).w(1, surface);
                                        return;
                                    }
                                    obj.getClass();
                                    this.a3 = ((Integer) obj).intValue();
                                    zzsz f1 = f1();
                                    if (f1 != null && Build.VERSION.SDK_INT >= 35) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("importance", Math.max(0, -this.a3));
                                        f1.Z(bundle);
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                zzel zzelVar = (zzel) obj;
                                if (zzelVar.b() != 0 && zzelVar.a() != 0) {
                                    this.N2 = zzelVar;
                                    zzach zzachVar = this.H2;
                                    if (zzachVar != null) {
                                        Surface surface2 = this.L2;
                                        zzdc.b(surface2);
                                        zzachVar.V(surface2, zzelVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            if (list.equals(zzbz.a)) {
                                zzach zzachVar2 = this.H2;
                                if (zzachVar2 != null && zzachVar2.Q()) {
                                    zzachVar2.m();
                                    return;
                                }
                                return;
                            }
                            this.K2 = list;
                            zzach zzachVar3 = this.H2;
                            if (zzachVar3 != null) {
                                zzachVar3.a0(list);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.Q2 = intValue;
                        zzach zzachVar4 = this.H2;
                        if (zzachVar4 != null) {
                            zzachVar4.d0(intValue);
                            return;
                        } else {
                            this.A2.h(intValue);
                            return;
                        }
                    }
                    obj.getClass();
                    int intValue2 = ((Integer) obj).intValue();
                    this.P2 = intValue2;
                    zzsz f12 = f1();
                    if (f12 != null) {
                        f12.h(intValue2);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.b3 != intValue3) {
                    this.b3 = intValue3;
                    return;
                }
                return;
            }
            obj.getClass();
            zzabi zzabiVar = (zzabi) obj;
            this.c3 = zzabiVar;
            zzach zzachVar5 = this.H2;
            if (zzachVar5 != null) {
                zzachVar5.Y(zzabiVar);
                return;
            }
            return;
        }
        x1(obj);
    }

    public final void w1() {
        zzaax zzaaxVar = this.M2;
        if (zzaaxVar != null) {
            zzaaxVar.release();
            this.M2 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzlv
    public final boolean x0() {
        if (!super.x0()) {
            return false;
        }
        zzach zzachVar = this.H2;
        if (zzachVar != null && !zzachVar.R()) {
            return false;
        }
        return true;
    }

    public final void x1(@InterfaceC11300zs1 Object obj) throws zzik {
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            surface = null;
        }
        if (this.L2 != surface) {
            this.L2 = surface;
            if (this.H2 == null) {
                this.A2.k(surface);
            }
            this.O2 = false;
            int n = n();
            zzsz f1 = f1();
            if (f1 != null && this.H2 == null) {
                zztc g0 = g0();
                g0.getClass();
                if (y1(g0) && !this.F2) {
                    Surface m1 = m1(g0);
                    if (m1 != null) {
                        f1.e(m1);
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        f1.i();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    l0();
                    i0();
                }
            }
            if (surface != null) {
                t1();
            } else {
                this.Z2 = null;
                zzach zzachVar = this.H2;
                if (zzachVar != null) {
                    zzachVar.i();
                }
            }
            if (n == 2) {
                zzach zzachVar2 = this.H2;
                if (zzachVar2 != null) {
                    zzachVar2.c0(true);
                } else {
                    this.A2.c(true);
                }
            }
        } else if (surface != null) {
            t1();
            Surface surface2 = this.L2;
            if (surface2 != null && this.O2) {
                this.y2.q(surface2);
            }
        }
    }

    public final boolean y1(zztc zztcVar) {
        if (this.H2 == null) {
            Surface surface = this.L2;
            if ((surface == null || !surface.isValid()) && !l1(zztcVar) && !j1(zztcVar)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void z() {
        zzach zzachVar = this.H2;
        if (zzachVar != null && this.x2) {
            zzachVar.n();
        }
    }
}
