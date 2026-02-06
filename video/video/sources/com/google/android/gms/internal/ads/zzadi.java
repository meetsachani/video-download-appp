package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C4128Rj1;
import o.C4940Zp0;
import o.C5179aq;
import o.C5588cW;
import o.InterfaceC11300zs1;
import o.VN2;
import o.Xu2;

/* loaded from: classes2.dex */
public final class zzadi implements zzads {
    public static final int[] c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final zzadh d = new zzadh(new zzadg() { // from class: com.google.android.gms.internal.ads.zzade
        @Override // com.google.android.gms.internal.ads.zzadg
        public final Constructor a() {
            int i = zzadi.f;
            if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return null;
            }
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzadn.class).getConstructor(Integer.TYPE);
        }
    });
    public static final zzadh e = new zzadh(new zzadg() { // from class: com.google.android.gms.internal.ads.zzadf
        @Override // com.google.android.gms.internal.ads.zzadg
        public final Constructor a() {
            int i = zzadi.f;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzadn.class).getConstructor(null);
        }
    });
    public static final /* synthetic */ int f = 0;
    @InterfaceC11300zs1
    public zzfyc a;
    public final zzakj b = new zzake();

    /* JADX WARN: Removed duplicated region for block: B:139:0x01fb A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001f, B:139:0x01fb, B:140:0x01fe, B:247:0x03b1, B:248:0x03b4, B:250:0x03b9, B:253:0x03bf, B:254:0x03c2, B:255:0x03c5, B:143:0x0207, B:145:0x020f, B:148:0x021a, B:151:0x0226, B:153:0x022e, B:156:0x0239, B:159:0x0244, B:162:0x024f, B:165:0x025a, B:167:0x0262, B:169:0x026a, B:172:0x0276, B:174:0x0284, B:177:0x028f, B:180:0x029a, B:182:0x02a2, B:184:0x02b0, B:186:0x02be, B:189:0x02d0, B:191:0x02de, B:194:0x02ea, B:196:0x02f2, B:198:0x02fa, B:200:0x0302, B:203:0x030e, B:205:0x0316, B:208:0x0327, B:210:0x032f, B:213:0x033a, B:215:0x0342, B:218:0x034e, B:220:0x0356, B:223:0x0360, B:226:0x036a, B:229:0x0374, B:232:0x037f, B:234:0x0387, B:237:0x0392, B:239:0x039a, B:242:0x03a4, B:15:0x004c, B:16:0x0054, B:115:0x01c3, B:18:0x0059, B:21:0x0065, B:24:0x0071, B:27:0x007d, B:30:0x0089, B:33:0x0094, B:36:0x00a0, B:39:0x00ab, B:42:0x00b6, B:45:0x00c2, B:48:0x00ce, B:51:0x00d9, B:54:0x00e4, B:57:0x00ef, B:60:0x00fa, B:63:0x0106, B:66:0x0111, B:69:0x011c, B:72:0x0128, B:75:0x0134, B:78:0x0140, B:81:0x014c, B:84:0x0158, B:87:0x0164, B:90:0x016f, B:93:0x017a, B:96:0x0185, B:99:0x0190, B:102:0x019a, B:105:0x01a4, B:108:0x01ae, B:111:0x01b8), top: B:260:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0207 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001f, B:139:0x01fb, B:140:0x01fe, B:247:0x03b1, B:248:0x03b4, B:250:0x03b9, B:253:0x03bf, B:254:0x03c2, B:255:0x03c5, B:143:0x0207, B:145:0x020f, B:148:0x021a, B:151:0x0226, B:153:0x022e, B:156:0x0239, B:159:0x0244, B:162:0x024f, B:165:0x025a, B:167:0x0262, B:169:0x026a, B:172:0x0276, B:174:0x0284, B:177:0x028f, B:180:0x029a, B:182:0x02a2, B:184:0x02b0, B:186:0x02be, B:189:0x02d0, B:191:0x02de, B:194:0x02ea, B:196:0x02f2, B:198:0x02fa, B:200:0x0302, B:203:0x030e, B:205:0x0316, B:208:0x0327, B:210:0x032f, B:213:0x033a, B:215:0x0342, B:218:0x034e, B:220:0x0356, B:223:0x0360, B:226:0x036a, B:229:0x0374, B:232:0x037f, B:234:0x0387, B:237:0x0392, B:239:0x039a, B:242:0x03a4, B:15:0x004c, B:16:0x0054, B:115:0x01c3, B:18:0x0059, B:21:0x0065, B:24:0x0071, B:27:0x007d, B:30:0x0089, B:33:0x0094, B:36:0x00a0, B:39:0x00ab, B:42:0x00b6, B:45:0x00c2, B:48:0x00ce, B:51:0x00d9, B:54:0x00e4, B:57:0x00ef, B:60:0x00fa, B:63:0x0106, B:66:0x0111, B:69:0x011c, B:72:0x0128, B:75:0x0134, B:78:0x0140, B:81:0x014c, B:84:0x0158, B:87:0x0164, B:90:0x016f, B:93:0x017a, B:96:0x0185, B:99:0x0190, B:102:0x019a, B:105:0x01a4, B:108:0x01ae, B:111:0x01b8), top: B:260:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03b9 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001f, B:139:0x01fb, B:140:0x01fe, B:247:0x03b1, B:248:0x03b4, B:250:0x03b9, B:253:0x03bf, B:254:0x03c2, B:255:0x03c5, B:143:0x0207, B:145:0x020f, B:148:0x021a, B:151:0x0226, B:153:0x022e, B:156:0x0239, B:159:0x0244, B:162:0x024f, B:165:0x025a, B:167:0x0262, B:169:0x026a, B:172:0x0276, B:174:0x0284, B:177:0x028f, B:180:0x029a, B:182:0x02a2, B:184:0x02b0, B:186:0x02be, B:189:0x02d0, B:191:0x02de, B:194:0x02ea, B:196:0x02f2, B:198:0x02fa, B:200:0x0302, B:203:0x030e, B:205:0x0316, B:208:0x0327, B:210:0x032f, B:213:0x033a, B:215:0x0342, B:218:0x034e, B:220:0x0356, B:223:0x0360, B:226:0x036a, B:229:0x0374, B:232:0x037f, B:234:0x0387, B:237:0x0392, B:239:0x039a, B:242:0x03a4, B:15:0x004c, B:16:0x0054, B:115:0x01c3, B:18:0x0059, B:21:0x0065, B:24:0x0071, B:27:0x007d, B:30:0x0089, B:33:0x0094, B:36:0x00a0, B:39:0x00ab, B:42:0x00b6, B:45:0x00c2, B:48:0x00ce, B:51:0x00d9, B:54:0x00e4, B:57:0x00ef, B:60:0x00fa, B:63:0x0106, B:66:0x0111, B:69:0x011c, B:72:0x0128, B:75:0x0134, B:78:0x0140, B:81:0x014c, B:84:0x0158, B:87:0x0164, B:90:0x016f, B:93:0x017a, B:96:0x0185, B:99:0x0190, B:102:0x019a, B:105:0x01a4, B:108:0x01ae, B:111:0x01b8), top: B:260:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzadn[] a(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        char c2;
        int i;
        String lastPathSegment;
        int i2;
        int i3;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list == null || list.isEmpty()) {
                str = null;
            } else {
                str = (String) list.get(0);
            }
            if (str != null) {
                String e2 = zzay.e(str);
                switch (e2.hashCode()) {
                    case -2123537834:
                        if (e2.equals(C4128Rj1.S)) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1662384011:
                        if (e2.equals(C4128Rj1.r)) {
                            c2 = 20;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1662384007:
                        if (e2.equals(C4128Rj1.f601o)) {
                            c2 = 21;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1662095187:
                        if (e2.equals("video/webm")) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1606874997:
                        if (e2.equals(C4128Rj1.d0)) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1487656890:
                        if (e2.equals("image/avif")) {
                            c2 = VN2.b;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1487464693:
                        if (e2.equals(C4128Rj1.S0)) {
                            c2 = C5588cW.p;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1487464690:
                        if (e2.equals(C4128Rj1.T0)) {
                            c2 = C5588cW.f706o;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1487394660:
                        if (e2.equals(C4128Rj1.R0)) {
                            c2 = 24;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1487018032:
                        if (e2.equals(C4128Rj1.Q0)) {
                            c2 = 27;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1248337486:
                        if (e2.equals(C4128Rj1.q0)) {
                            c2 = 18;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1079884372:
                        if (e2.equals(C4128Rj1.y)) {
                            c2 = 25;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1004728940:
                        if (e2.equals(C4128Rj1.m0)) {
                            c2 = 23;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -879272239:
                        if (e2.equals("image/bmp")) {
                            c2 = C5588cW.n;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -879258763:
                        if (e2.equals(C4128Rj1.P0)) {
                            c2 = 26;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -387023398:
                        if (e2.equals(C4128Rj1.G)) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -43467528:
                        if (e2.equals(C4128Rj1.r0)) {
                            c2 = 14;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 13915911:
                        if (e2.equals(C4128Rj1.v)) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 187078296:
                        if (e2.equals(C4128Rj1.Q)) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 187078297:
                        if (e2.equals(C4128Rj1.T)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 187078669:
                        if (e2.equals(C4128Rj1.b0)) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 187090232:
                        if (e2.equals(C4128Rj1.E)) {
                            c2 = 17;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 187091926:
                        if (e2.equals(C4128Rj1.h0)) {
                            c2 = 19;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 187099443:
                        if (e2.equals(C4128Rj1.i0)) {
                            c2 = 22;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1331848029:
                        if (e2.equals(C4128Rj1.f)) {
                            c2 = 16;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1503095341:
                        if (e2.equals(C4128Rj1.c0)) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1504578661:
                        if (e2.equals(C4128Rj1.R)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1504619009:
                        if (e2.equals(C4128Rj1.e0)) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1504824762:
                        if (e2.equals(C4128Rj1.j0)) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1504831518:
                        if (e2.equals(C4128Rj1.I)) {
                            c2 = 15;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1505118770:
                        if (e2.equals(C4128Rj1.H)) {
                            c2 = '\r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2039520277:
                        if (e2.equals(C4128Rj1.g)) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                    case 1:
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 3;
                        break;
                    case 7:
                        i = 4;
                        break;
                    case '\b':
                        i = 5;
                        break;
                    case '\t':
                        i = 15;
                        break;
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                        i = 6;
                        break;
                    case 15:
                        i = 7;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i = 8;
                        break;
                    case 19:
                        i = 9;
                        break;
                    case 20:
                        i = 10;
                        break;
                    case 21:
                        i = 11;
                        break;
                    case 22:
                        i = 12;
                        break;
                    case 23:
                        i = 13;
                        break;
                    case 24:
                        i = 14;
                        break;
                    case 25:
                        i = 16;
                        break;
                    case 26:
                        i = 17;
                        break;
                    case 27:
                        i = 18;
                        break;
                    case 28:
                        i = 19;
                        break;
                    case 29:
                    case 30:
                        i = 20;
                        break;
                    case 31:
                        i = 21;
                        break;
                }
                if (i != -1) {
                    b(i, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(C4940Zp0.t) || lastPathSegment.endsWith(C4940Zp0.u)) {
                        i2 = 0;
                    } else if (lastPathSegment.endsWith(C4940Zp0.v)) {
                        i2 = 1;
                    } else if (lastPathSegment.endsWith(C4940Zp0.w) || lastPathSegment.endsWith(C4940Zp0.x)) {
                        i2 = 2;
                    } else if (lastPathSegment.endsWith(C4940Zp0.y)) {
                        i2 = 3;
                    } else if (lastPathSegment.endsWith(C4940Zp0.z)) {
                        i2 = 4;
                    } else if (lastPathSegment.endsWith(C4940Zp0.A)) {
                        i2 = 5;
                    } else if (lastPathSegment.endsWith(C4940Zp0.B) || lastPathSegment.endsWith(C4940Zp0.C) || lastPathSegment.endsWith(C4940Zp0.D)) {
                        i2 = 15;
                    } else if (lastPathSegment.startsWith(C4940Zp0.E, lastPathSegment.length() - 4) || lastPathSegment.endsWith(C4940Zp0.F)) {
                        i2 = 6;
                    } else if (lastPathSegment.endsWith(C4940Zp0.I)) {
                        i2 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(C4940Zp0.K, lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(C4940Zp0.M, lastPathSegment.length() - 5)) {
                        i2 = 8;
                    } else if (lastPathSegment.startsWith(C4940Zp0.G, lastPathSegment.length() - 4) || lastPathSegment.endsWith(C4940Zp0.H)) {
                        i2 = 9;
                    } else if (lastPathSegment.endsWith(C4940Zp0.N) || lastPathSegment.endsWith(C4940Zp0.O) || lastPathSegment.endsWith(C4940Zp0.P) || lastPathSegment.endsWith(C4940Zp0.Q)) {
                        i2 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i2 = 11;
                    } else if (lastPathSegment.endsWith(C4940Zp0.T) || lastPathSegment.endsWith(C4940Zp0.U)) {
                        i2 = 12;
                    } else if (lastPathSegment.endsWith(C4940Zp0.V) || lastPathSegment.endsWith(C4940Zp0.W)) {
                        i2 = 13;
                    } else if (lastPathSegment.endsWith(C4940Zp0.X) || lastPathSegment.endsWith(C4940Zp0.Y)) {
                        i2 = 14;
                    } else if (lastPathSegment.endsWith(C4940Zp0.Z)) {
                        i2 = 16;
                    } else if (lastPathSegment.endsWith(C5179aq.s1)) {
                        i2 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i2 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i2 = 19;
                    } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                        i2 = 20;
                    } else if (lastPathSegment.endsWith(".avif")) {
                        i2 = 21;
                    }
                    if (i2 != -1 && i2 != i) {
                        b(i2, arrayList);
                    }
                    int[] iArr = c;
                    for (i3 = 0; i3 < 21; i3++) {
                        int i4 = iArr[i3];
                        if (i4 != i && i4 != i2) {
                            b(i4, arrayList);
                        }
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                    b(i2, arrayList);
                }
                int[] iArr2 = c;
                while (i3 < 21) {
                }
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i2 = -1;
            if (i2 != -1) {
            }
            int[] iArr22 = c;
            while (i3 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzadn[]) arrayList.toArray(new zzadn[arrayList.size()]);
    }

    public final void b(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzami());
                return;
            case 1:
                list.add(new zzamk());
                return;
            case 2:
                list.add(new zzamm(0));
                return;
            case 3:
                list.add(new zzafa(0));
                return;
            case 4:
                zzadn a = d.a(0);
                if (a != null) {
                    list.add(a);
                    return;
                } else {
                    list.add(new zzafs(0));
                    return;
                }
            case 5:
                list.add(new zzafu());
                return;
            case 6:
                list.add(new zzahq(this.b, 0));
                return;
            case 7:
                list.add(new zzahw(0));
                return;
            case 8:
                zzakj zzakjVar = this.b;
                list.add(new zzaiv(zzakjVar, 0, null, null, zzfyc.F(), null));
                list.add(new zzajb(zzakjVar, 0));
                return;
            case 9:
                list.add(new zzajr());
                return;
            case 10:
                list.add(new zzanr());
                return;
            case 11:
                if (this.a == null) {
                    this.a = zzfyc.F();
                }
                list.add(new zzaob(1, 0, this.b, new zzer(0L), new zzamo(0, this.a), Xu2.B));
                return;
            case 12:
                list.add(new zzaom());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new zzaga(0));
                return;
            case 15:
                zzadn a2 = e.a(new Object[0]);
                if (a2 != null) {
                    list.add(a2);
                    return;
                }
                return;
            case 16:
                list.add(new zzaff(0, this.b));
                return;
            case 17:
                list.add(new zzakc());
                return;
            case 18:
                list.add(new zzaor());
                return;
            case 19:
                list.add(new zzafn());
                return;
            case 20:
                list.add(new zzafz());
                return;
            case 21:
                list.add(new zzafm());
                return;
        }
    }
}
