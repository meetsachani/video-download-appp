package o;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: o.Zp0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4940Zp0 {
    public static final String A = ".flv";
    public static final String B = ".mid";
    public static final String C = ".midi";
    public static final String D = ".smf";
    public static final String E = ".mk";
    public static final String F = ".webm";
    public static final String G = ".og";
    public static final String H = ".opus";
    public static final String I = ".mp3";
    public static final String J = ".mp4";
    public static final String K = ".m4";
    public static final String L = ".mp4";
    public static final String M = ".cmf";
    public static final String N = ".ps";
    public static final String O = ".mpeg";
    public static final String P = ".mpg";
    public static final String Q = ".m2p";
    public static final String R = ".ts";
    public static final String S = ".ts";
    public static final String T = ".wav";
    public static final String U = ".wave";
    public static final String V = ".vtt";
    public static final String W = ".webvtt";
    public static final String X = ".jpg";
    public static final String Y = ".jpeg";
    public static final String Z = ".avi";
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;

    /* renamed from: o  reason: collision with root package name */
    public static final int f688o = 13;
    public static final int p = 14;
    public static final int q = 15;
    public static final int r = 16;
    @InterfaceC5056aJ2
    public static final String s = "Content-Type";
    public static final String t = ".ac3";
    public static final String u = ".ec3";
    public static final String v = ".ac4";
    public static final String w = ".adts";
    public static final String x = ".aac";
    public static final String y = ".amr";
    public static final String z = ".flac";

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Zp0$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(@InterfaceC11300zs1 String str) {
        char c2;
        if (str == null) {
            return -1;
        }
        String u2 = C4128Rj1.u(str);
        u2.getClass();
        switch (u2.hashCode()) {
            case -2123537834:
                if (u2.equals(C4128Rj1.S)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384011:
                if (u2.equals(C4128Rj1.r)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384007:
                if (u2.equals(C4128Rj1.f601o)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1662095187:
                if (u2.equals("video/webm")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1606874997:
                if (u2.equals(C4128Rj1.d0)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (u2.equals(C4128Rj1.R0)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1248337486:
                if (u2.equals(C4128Rj1.q0)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1079884372:
                if (u2.equals(C4128Rj1.y)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (u2.equals(C4128Rj1.m0)) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -387023398:
                if (u2.equals(C4128Rj1.G)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -43467528:
                if (u2.equals(C4128Rj1.r0)) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 13915911:
                if (u2.equals(C4128Rj1.v)) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (u2.equals(C4128Rj1.Q)) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (u2.equals(C4128Rj1.T)) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 187078669:
                if (u2.equals(C4128Rj1.b0)) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 187090232:
                if (u2.equals(C4128Rj1.E)) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 187091926:
                if (u2.equals(C4128Rj1.h0)) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 187099443:
                if (u2.equals(C4128Rj1.i0)) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 1331848029:
                if (u2.equals(C4128Rj1.f)) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 1503095341:
                if (u2.equals(C4128Rj1.c0)) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (u2.equals(C4128Rj1.R)) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (u2.equals(C4128Rj1.e0)) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1504824762:
                if (u2.equals(C4128Rj1.j0)) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (u2.equals(C4128Rj1.I)) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 1505118770:
                if (u2.equals(C4128Rj1.H)) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 2039520277:
                if (u2.equals(C4128Rj1.g)) {
                    c2 = 25;
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
            case '\f':
            case 20:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\t':
            case '\n':
            case 24:
            case 25:
                return 6;
            case 4:
            case 14:
            case 19:
                return 3;
            case 5:
                return 14;
            case 6:
            case 15:
            case 18:
                return 8;
            case 7:
                return 16;
            case '\b':
                return 13;
            case 11:
                return 5;
            case '\r':
                return 1;
            case 16:
                return 9;
            case 17:
                return 12;
            case 21:
                return 4;
            case 22:
                return 15;
            case 23:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Map<String, List<String>> map) {
        String str;
        List<String> list = map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = list.get(0);
        } else {
            str = null;
        }
        return a(str);
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(t) && !lastPathSegment.endsWith(u)) {
            if (lastPathSegment.endsWith(v)) {
                return 1;
            }
            if (!lastPathSegment.endsWith(w) && !lastPathSegment.endsWith(x)) {
                if (lastPathSegment.endsWith(y)) {
                    return 3;
                }
                if (lastPathSegment.endsWith(z)) {
                    return 4;
                }
                if (lastPathSegment.endsWith(A)) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(B) && !lastPathSegment.endsWith(C) && !lastPathSegment.endsWith(D)) {
                    if (!lastPathSegment.startsWith(E, lastPathSegment.length() - 4) && !lastPathSegment.endsWith(F)) {
                        if (lastPathSegment.endsWith(I)) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(K, lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(M, lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(G, lastPathSegment.length() - 4) && !lastPathSegment.endsWith(H)) {
                                if (!lastPathSegment.endsWith(N) && !lastPathSegment.endsWith(O) && !lastPathSegment.endsWith(P) && !lastPathSegment.endsWith(Q)) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(T) && !lastPathSegment.endsWith(U)) {
                                            if (!lastPathSegment.endsWith(V) && !lastPathSegment.endsWith(W)) {
                                                if (!lastPathSegment.endsWith(X) && !lastPathSegment.endsWith(Y)) {
                                                    if (!lastPathSegment.endsWith(Z)) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}
