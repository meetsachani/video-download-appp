package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10997yd1;
import o.C4128Rj1;
import o.C5137af1;
import o.C7193j50;
import o.C7834lj1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.Xu2;

/* loaded from: classes2.dex */
public final class zzay {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, @InterfaceC11300zs1 String str2) {
        char c2;
        zzax c3;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(C4128Rj1.S)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1365340241:
                if (str.equals(C4128Rj1.X)) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1095064472:
                if (str.equals(C4128Rj1.V)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals(C4128Rj1.Q)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (str.equals(C4128Rj1.T)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 550520934:
                if (str.equals(C4128Rj1.Y)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals(C4128Rj1.R)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (str.equals(C4128Rj1.I)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1504891608:
                if (str.equals(C4128Rj1.a0)) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1505942594:
                if (str.equals(C4128Rj1.W)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1556697186:
                if (str.equals(C4128Rj1.U)) {
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
                return 9;
            case 1:
                if (str2 == null || (c3 = c(str2)) == null) {
                    return 0;
                }
                return c3.a();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    public static int b(@InterfaceC11300zs1 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (!j(str)) {
            if (!"text".equals(k(str)) && !"application/x-media3-cues".equals(str) && !C4128Rj1.x0.equals(str) && !C4128Rj1.y0.equals(str) && !C4128Rj1.D0.equals(str) && !C4128Rj1.z0.equals(str) && !C4128Rj1.A0.equals(str) && !C4128Rj1.B0.equals(str) && !C4128Rj1.C0.equals(str) && !C4128Rj1.E0.equals(str) && !C4128Rj1.F0.equals(str) && !C4128Rj1.G0.equals(str) && !C4128Rj1.K0.equals(str)) {
                if (i(str)) {
                    return 4;
                }
                if (!C4128Rj1.w0.equals(str) && !C4128Rj1.J0.equals(str) && !C4128Rj1.H0.equals(str) && !C4128Rj1.M0.equals(str) && !C4128Rj1.N0.equals(str)) {
                    if (!C4128Rj1.I0.equals(str)) {
                        ArrayList arrayList = a;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str2 = ((zzaw) arrayList.get(i)).a;
                            if (str.equals(null)) {
                                return 0;
                            }
                        }
                        return -1;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static zzax c(String str) {
        int i;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                int parseInt = Integer.parseInt(group, 16);
                if (group2 != null) {
                    i = Integer.parseInt(group2);
                } else {
                    i = 0;
                }
                return new zzax(parseInt, i);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static String d(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 221) {
                                    if (i != 165) {
                                        if (i != 166) {
                                            switch (i) {
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                    return C4128Rj1.s;
                                                case 102:
                                                case 103:
                                                case 104:
                                                    return "audio/mp4a-latm";
                                                case 105:
                                                case 107:
                                                    return C4128Rj1.I;
                                                case 106:
                                                    return C4128Rj1.q;
                                                case 108:
                                                    return C4128Rj1.R0;
                                                default:
                                                    switch (i) {
                                                        case C7834lj1.G /* 169 */:
                                                        case Xu2.K /* 172 */:
                                                            return C4128Rj1.V;
                                                        case C7193j50.f /* 170 */:
                                                        case 171:
                                                            return C4128Rj1.W;
                                                        case 173:
                                                            return C4128Rj1.a0;
                                                        case C10997yd1.y1 /* 174 */:
                                                            return C4128Rj1.T;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return C4128Rj1.R;
                                    }
                                    return C4128Rj1.Q;
                                }
                                return "audio/vorbis";
                            }
                            return C4128Rj1.m;
                        }
                        return C4128Rj1.t;
                    }
                    return "audio/mp4a-latm";
                }
                return C4128Rj1.k;
            }
            return "video/avc";
        }
        return C4128Rj1.p;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String e(String str) {
        char c2;
        if (str == null) {
            return null;
        }
        String a2 = zzfui.a(str);
        switch (a2.hashCode()) {
            case -1833600100:
                if (a2.equals("video/x-mvhevc")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1007807498:
                if (a2.equals("audio/x-flac")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -979095690:
                if (a2.equals("application/x-mpegurl")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -586683234:
                if (a2.equals("audio/x-wav")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -432836268:
                if (a2.equals("audio/mpeg-l1")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -432836267:
                if (a2.equals("audio/mpeg-l2")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 187090231:
                if (a2.equals("audio/mp3")) {
                    c2 = 2;
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
                return "video/mv-hevc";
            case 1:
                return C4128Rj1.e0;
            case 2:
                return C4128Rj1.I;
            case 3:
                return C4128Rj1.i0;
            case 4:
                return C4128Rj1.u0;
            case 5:
                return C4128Rj1.J;
            case 6:
                return C4128Rj1.K;
            default:
                return a2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean f(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        char c2;
        zzax c3;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(C4128Rj1.S)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -432837260:
                if (str.equals(C4128Rj1.J)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -432837259:
                if (str.equals(C4128Rj1.K)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals(C4128Rj1.Q)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 187094639:
                if (str.equals(C4128Rj1.N)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals(C4128Rj1.R)) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (str.equals(C4128Rj1.e0)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (str.equals(C4128Rj1.I)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1903231877:
                if (str.equals(C4128Rj1.O)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1903589369:
                if (str.equals(C4128Rj1.P)) {
                    c2 = 5;
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
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (c3 = c(str2)) == null || (a2 = c3.a()) == 0 || a2 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:285:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0200 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(@InterfaceC11300zs1 String str, String str2) {
        String[] split;
        String str3;
        zzax c2;
        String str4 = null;
        if (str != null) {
            String str5 = zzeu.a;
            if (TextUtils.isEmpty(str)) {
                split = new String[0];
            } else {
                split = str.trim().split("(\\s*,\\s*)", -1);
            }
            StringBuilder sb = new StringBuilder();
            for (String str6 : split) {
                if (str6 != null) {
                    String a2 = zzfui.a(str6.trim());
                    if (!a2.startsWith(C5137af1.d) && !a2.startsWith("avc3")) {
                        if (!a2.startsWith(C5137af1.g) && !a2.startsWith(C5137af1.h)) {
                            if (!a2.startsWith("dvav") && !a2.startsWith("dva1") && !a2.startsWith("dvhe") && !a2.startsWith("dvh1")) {
                                if (a2.startsWith(C5137af1.i)) {
                                    str3 = C4128Rj1.n;
                                } else if (!a2.startsWith("vp9") && !a2.startsWith(C5137af1.f)) {
                                    if (!a2.startsWith("vp8") && !a2.startsWith("vp08")) {
                                        if (a2.startsWith(C5137af1.j)) {
                                            if (a2.startsWith("mp4a.") && (c2 = c(a2)) != null) {
                                                str3 = d(c2.a);
                                            } else {
                                                str3 = null;
                                            }
                                            if (str3 == null) {
                                                str3 = "audio/mp4a-latm";
                                            }
                                        } else if (a2.startsWith("mha1")) {
                                            str3 = C4128Rj1.L;
                                        } else if (a2.startsWith("mhm1")) {
                                            str3 = C4128Rj1.M;
                                        } else if (!a2.startsWith("ac-3") && !a2.startsWith("dac3")) {
                                            if (!a2.startsWith("ec-3") && !a2.startsWith("dec3")) {
                                                if (a2.startsWith(C4128Rj1.U0)) {
                                                    str3 = C4128Rj1.S;
                                                } else if (!a2.startsWith("ac-4") && !a2.startsWith("dac4")) {
                                                    if (a2.startsWith("dtsc")) {
                                                        str3 = C4128Rj1.V;
                                                    } else if (a2.startsWith("dtse")) {
                                                        str3 = C4128Rj1.X;
                                                    } else if (!a2.startsWith("dtsh") && !a2.startsWith("dtsl")) {
                                                        if (a2.startsWith("dtsx")) {
                                                            str3 = C4128Rj1.Y;
                                                        } else if (a2.startsWith("opus")) {
                                                            str3 = C4128Rj1.a0;
                                                        } else if (a2.startsWith("vorbis")) {
                                                            str3 = "audio/vorbis";
                                                        } else if (a2.startsWith("flac")) {
                                                            str3 = C4128Rj1.e0;
                                                        } else if (a2.startsWith("stpp")) {
                                                            str3 = C4128Rj1.A0;
                                                        } else if (a2.startsWith("wvtt")) {
                                                            str3 = C4128Rj1.m0;
                                                        } else if (a2.contains("cea708")) {
                                                            str3 = C4128Rj1.y0;
                                                        } else if (!a2.contains("eia608") && !a2.contains("cea608")) {
                                                            ArrayList arrayList = a;
                                                            int size = arrayList.size();
                                                            for (int i = 0; i < size; i++) {
                                                                String str7 = ((zzaw) arrayList.get(i)).b;
                                                                if (a2.startsWith(null)) {
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            str3 = C4128Rj1.x0;
                                                        }
                                                    } else {
                                                        str3 = C4128Rj1.W;
                                                    }
                                                } else {
                                                    str3 = C4128Rj1.T;
                                                }
                                            } else {
                                                str3 = C4128Rj1.R;
                                            }
                                        } else {
                                            str3 = C4128Rj1.Q;
                                        }
                                    } else {
                                        str3 = "video/x-vnd.on2.vp8";
                                    }
                                } else {
                                    str3 = C4128Rj1.m;
                                }
                            } else {
                                str3 = C4128Rj1.w;
                            }
                        } else {
                            str3 = C4128Rj1.k;
                        }
                    } else {
                        str3 = "video/avc";
                    }
                    if (str2.equals(str3)) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str6);
                    }
                }
                str3 = null;
                if (str2.equals(str3)) {
                }
            }
            if (sb.length() > 0) {
                str4 = sb.toString();
            }
        }
        if (str4 == null) {
            return false;
        }
        return true;
    }

    public static boolean h(@InterfaceC11300zs1 String str) {
        return "audio".equals(k(str));
    }

    public static boolean i(@InterfaceC11300zs1 String str) {
        if (!"image".equals(k(str)) && !"application/x-image-uri".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean j(@InterfaceC11300zs1 String str) {
        return "video".equals(k(str));
    }

    @InterfaceC11300zs1
    public static String k(@InterfaceC11300zs1 String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(47)) != -1) {
            return str.substring(0, indexOf);
        }
        return null;
    }
}
